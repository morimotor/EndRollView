package jp.morimotor.endrollview;


import android.graphics.Color;
import android.graphics.Paint;

public class TextParameter {
    private static final String TAG = TextParameter.class.getSimpleName();
    private final TextParameter self = this;

    String Text;
    int color = Color.WHITE;
    boolean isfadeout = false;
    boolean isfadein = false;
    int centerLine;
    boolean isChangeLine = false;
    Paint.Align align = Paint.Align.CENTER;


    public TextParameter(String text, int color, boolean isfadeout, boolean isfadein, int centerLine, Paint.Align align){
        this.Text = text;
        this.color = color;
        this.isfadein = isfadein;
        this.isfadeout = isfadeout;
        this.centerLine = centerLine;
        this.align = align;

    }

    public TextParameter(String text){
        Text = text;
    }

    public TextParameter(String text, int color){
        Text = text;
        color = color;
    }



}