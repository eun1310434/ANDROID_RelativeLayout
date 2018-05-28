/*=====================================================================
□ INFORMATION
  ○ Data : 28.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ FUNCTION
  ○

□ STUDY
  ○ Relative Layout
     - RelativeLayout is a view group that displays child views in relative positions.
       The position of each view can be specified as relative to sibling elements
       (such as to the left-of or below another view) or
       in positions relative to the parent RelativeLayout area
       (such as aligned to the bottom, left or center).
=====================================================================*/


package com.eun1310434.relativelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
