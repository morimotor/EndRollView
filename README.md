# Android EndRollView
![EndRollViewt](https://github.com/morimotor/EndRollView/blob/master/image/sample_s.gif)

#Usage

Add this to your build.gradle:

```groovy
    compile 'com.github.morimotor:endrollview:0.1.0'
```

add xml code in your layout file:

```xml
    <jp.morimotor.endrollview.EndRollView
            android:layout_height="220dp"
            android:layout_width="match_parent"
            android:id="@+id/endrollview"/>
```

and:

```java
  EndRollView endRollView1;
  
          String[] strs = {
                  "aaaaaaaaaa",
                  "bbbbbbbbb",
                  "xxxxxxxxxx",
                  "dddddddddddd",
                  "eeeeeeeeeeeee",
                  "ffffffffffff",
                  "ddddddddd",
                  "hhhhhhhh",
                  "iiiiiiiiii"
          };
          endRollView1 = (EndRollView)findViewById(R.id.endrollview);
          endRollView1.setBackgroundColor(Color.BLACK);
          endRollView1.setTextColor(Color.WHITE);
          endRollView1.setInterval(250);
          endRollView1.setSpeed(5.0f);
          endRollView1.setTextSize(40);
          endRollView1.setCenterLine(100);
          endRollView1.setTextAlign(Paint.Align.LEFT);
          endRollView1.setIsfadeout(true);
          endRollView1.setIsfadein(true);
          endRollView1.setText(strs);
  
  
          endRollView1.startEndRoll();
```

# Licence

Copyright 2015 morimotor

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
