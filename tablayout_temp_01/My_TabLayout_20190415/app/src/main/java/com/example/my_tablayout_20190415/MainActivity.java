package com.example.my_tablayout_20190415;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String  MT="MY_TEST";


    private TabLayout mTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout=findViewById(R.id.tab_layout2);

//        mTabLayout.addTab(mTabLayout.newTab().setText("例子一"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("例子2"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("例子3"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("例子4"));

        mTabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.i(MT, "onTabSelected: "+tab.getText());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
