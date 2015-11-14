package jp.morimotor.endrollview;


import android.graphics.Color;
import android.graphics.Paint;

public class TextParameter {
    private static final String TAG = TextParameter.class.getSimpleName();
    private final TextParameter self = this;

    String Text;
    int textSize;
    int color = Color.WHITE;
    boolean isfadeout = false;
    boolean isfadein = false;
    int centerLine;
    boolean isChangeLine = false;
    Paint.Align align = Paint.Align.CENTER;


    public TextParameter(String text, int textSize, int color, boolean isfadeout, boolean isfadein, int centerLine, Paint.Align align){
        this.Text = text;
        this.textSize = textSize;
        this.color = color;
        this.isfadein = isfadein;
        this.isfadeout = isfadeout;
        this.centerLine = centerLine;
        this.align = align;
        this.isChangeLine = true;

    }

    public TextParameter(String text){
        this.Text = text;
    }

    public TextParameter(String text, int textSize, int color){
        this.Text = text;
        this.textSize = textSize;
        this.color = color;
    }

    public String getText(){
        return Text;
    }

    public int getTextSize(){
        return textSize;
    }

    public int getColor(){
        return color;
    }

    public boolean getIsfadeout(){
        return isfadeout;
    }

    public boolean getIsfadein(){
        return isfadein;
    }

    public int getCenterLine(){
        return centerLine;
    }

    public boolean getIsChangeLine(){
        return isChangeLine;
    }

    public Paint.Align getAlign(){
        return align;
    }


}