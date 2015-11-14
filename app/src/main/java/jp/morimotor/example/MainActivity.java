package jp.morimotor.example;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jp.morimotor.endrollview.EndRollView;

public class MainActivity extends AppCompatActivity {

    EndRollView endRollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] str = {
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



        endRollView = (EndRollView)findViewById(R.id.endrollview);

        endRollView.setBackgroundColor(Color.BLACK);    // 背景色
        endRollView.setTextColor(Color.WHITE);          // テキスト色
        endRollView.setInterval(250);                   // 流れる間隔
        endRollView.setSpeed(5.0f);                     // 流れる速度
        endRollView.setTextSize(40);                    // テキストサイズ
        endRollView.setCenterLine(100);                 // テキストの表示場所
        endRollView.setTextAlign(Paint.Align.LEFT);     // 文字寄せ
        endRollView.setIsfadeout(true);                 // フェードアウト
        endRollView.setIsfadein(true);                  // フェードイン
        endRollView.setText(str);                       // 表示する文字





        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endRollView.startEndRoll();
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endRollView.endEndRoll();
            }
        });


    }

}
