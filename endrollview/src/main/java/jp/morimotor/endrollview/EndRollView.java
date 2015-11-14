package jp.morimotor.endrollview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;


public class EndRollView extends View {
    int backgroundColor = Color.BLACK;
    int textColor = Color.WHITE;
    int textSize = 35;
    int width;
    int height;
    float speed = 1.0f;
    int interval = 200;
    boolean isfadeout = false;
    boolean isfadein = false;
    int centerLine;
    int baseLine;
    boolean isChangeLine = false;
    Paint.Align align = Paint.Align.CENTER;

    int count = 0;

    String[] Text;


    private static int START_MESSAGE = 1;
    private static int END_MESSAGE = 0;
    private static int INTERVAL = 30;
    boolean isStart = false;

    private Handler handler = new Handler() {
        @Override
        public void dispatchMessage(Message msg) {
            if (msg.what == START_MESSAGE) {

                if(isStart){

                    // 更新
                    invalidate();

                    handler.sendEmptyMessageDelayed(START_MESSAGE, INTERVAL);
                }
            } else {
                super.dispatchMessage(msg);
            }
        }
    };


    public EndRollView(Context context) {
        super(context);

    }

    public EndRollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    public EndRollView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public void startEndRoll(){
        if(!isStart)handler.sendEmptyMessage(START_MESSAGE);
        isStart = true;
        count = 0;
    }

    public void endEndRoll(){
        handler.sendEmptyMessage(END_MESSAGE);
        isStart = false;

    }

    public void setBackgroundColor(int color){
        this.backgroundColor = color;
        super.setBackgroundColor(color);
    }

    public void setTextColor(int color){
        this.textColor = color;
    }

    public void setTextSize(int size){
        textSize = size;
    }

    public void setText(String[] text){
        Text = text;
    }




    public void setCount(int count){
        this.count = count;
    }

    public void setSpeed(float speed){
        this.speed = speed;
    }

    public void setInterval(int interval){
        this.interval = interval;
    }

    public void setIsfadeout(boolean fadeout)
    {
        this.isfadeout = fadeout;
    }

    public void setIsfadein(boolean fadein){
        this.isfadein = fadein;
    }

    public void setCenterLine(int line){
        this.centerLine = line;
        this.isChangeLine = true;
    }

    public void setTextAlign(Paint.Align align){
        this.align = align;
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        width = this.getWidth();
        height = this.getHeight();
        baseLine = width / 2;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint textPaint = new Paint( Paint.ANTI_ALIAS_FLAG);
        textPaint.setTextSize(textSize);
        textPaint.setTextAlign(align);
        textPaint.setColor(textColor);

        for (int i = 0; i < Text.length; i++) {
            int text_y = height + (int)(textSize - count * speed) + interval * i;
            int text_x;
            if(isChangeLine)text_x = centerLine;
            else  text_x = baseLine;

            if(interval * i < count * speed){

                textPaint.setAlpha(255);

                // フェードアウト
                if(isfadeout && height * 0.2 > text_y){
                    textPaint.setAlpha((int) (255 - (height * 0.2 - text_y)/(height * 0.2) * 255));

                }
                // フェードイン
                else if(isfadein && height * 0.8 < text_y) {
                    int a = (int) ( 255 - (text_y - height * 0.8)/(height - height * 0.8) * 255);
                    if(a < 0)a = 0;
                    if(a > 255)a = 255;
                    textPaint.setAlpha(a);

                }

                canvas.drawText(Text[i], text_x, text_y, textPaint);
            }


        }
        count++;

    }


}