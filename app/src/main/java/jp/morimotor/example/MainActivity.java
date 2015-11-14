package jp.morimotor.example;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

import jp.morimotor.endrollview.EndRollView;
import jp.morimotor.endrollview.TextParameter;

public class MainActivity extends AppCompatActivity {

    EndRollView endRollView1;
    EndRollView endRollView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] strs1 = {
                "あああああああああああああ",
                "いいいいいいいいいい",
                "ううううううううううううう",
                "ええええええええええええ",
                "おおおおおお",
                "かかかかかかかかかかかかかか",
                "ききききききききききききき",
                "くくくくくくくくくくくくくくくくく",
                "けけけけけけけけ"
        };


        ArrayList<TextParameter> strs2 = new ArrayList<>();
        // (String text, int color, boolean isfadeout, boolean isfadein, int centerLine, Paint.Align align)
        strs2.add(new TextParameter("aaaaaaaa",     (int) (Math.random() * 50) + 15, Color.WHITE, true, true, (int) (Math.random() * 600) + 200, Paint.Align.LEFT));
        strs2.add(new TextParameter("bbbbbbbbbbbb", (int) (Math.random() * 50) + 15, Color.BLUE, true, true, (int) (Math.random() * 600) + 200, Paint.Align.CENTER));
        strs2.add(new TextParameter("ccccc",        (int) (Math.random() * 50) + 15, Color.RED, false, false, (int) (Math.random() * 600) + 200, Paint.Align.LEFT));
        strs2.add(new TextParameter("dddddddddddd", (int) (Math.random() * 50) + 15, Color.YELLOW, true, false, (int) (Math.random() * 600) + 200, Paint.Align.RIGHT));
        strs2.add(new TextParameter("eeeeee",       (int) (Math.random() * 50) + 15, Color.MAGENTA, true, true, (int) (Math.random() * 600) + 200, Paint.Align.RIGHT));
        strs2.add(new TextParameter("fffffffffff",  (int) (Math.random() * 50) + 15, Color.GRAY, true, false, (int) (Math.random() * 600) + 200, Paint.Align.LEFT));
        strs2.add(new TextParameter("gggggggggggg", (int) (Math.random() * 50) + 15, Color.GREEN, false, false, (int) (Math.random() * 600) + 200, Paint.Align.RIGHT));
        strs2.add(new TextParameter("hhhhh",        (int) (Math.random() * 50) + 15, Color.CYAN, false, true, (int) (Math.random() * 600) + 200, Paint.Align.CENTER));




        endRollView1 = (EndRollView)findViewById(R.id.endrollview1);
        endRollView2 = (EndRollView)findViewById(R.id.endrollview2);

        endRollView1.setBackgroundColor(Color.BLACK);    // 背景色
        endRollView1.setTextColor(Color.WHITE);          // テキスト色
        endRollView1.setInterval(250);                   // 流れる間隔
        endRollView1.setSpeed(5.0f);                     // 流れる速度
        endRollView1.setTextSize(40);                    // テキストサイズ
        endRollView1.setCenterLine(100);                 // テキストの表示場所
        endRollView1.setTextAlign(Paint.Align.LEFT);     // 文字寄せ
        endRollView1.setIsfadeout(true);                 // フェードアウト
        endRollView1.setIsfadein(true);                  // フェードイン
        endRollView1.setText(strs1);                     // 表示する文字


        endRollView2.setBackgroundColor(Color.BLACK);    // 背景色
        endRollView2.setInterval(250);                   // 流れる間隔
        endRollView2.setSpeed(5.0f);                     // 流れる速度
        endRollView2.setText(strs2);


        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endRollView1.startEndRoll();
                endRollView2.startEndRoll();
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endRollView1.endEndRoll();
                endRollView2.endEndRoll();
            }
        });


    }

}
