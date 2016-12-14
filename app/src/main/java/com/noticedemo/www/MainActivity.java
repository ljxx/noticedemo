package com.noticedemo.www;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.noticedemo.www.view.BaseScollTextView;
import com.noticedemo.www.view.ScollTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ScollTextView mScollTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScollTextView = (ScollTextView) findViewById(R.id.mScollTextView);
        List<String> data=new ArrayList<String>();
        data.add("1、第一条公告消息");
        data.add("2、第二条公告消息");
        data.add("3、第三条公告消息");
        data.add("4、第四条公告消息");
        data.add("5、第五天公告消息");
        mScollTextView.setData(data);
        mScollTextView.setOnItemClickListener(new BaseScollTextView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
                /*这里调转具体的某个公告的详情页*/
                Toast.makeText(MainActivity.this,"你点中了第"+(position+1)+"条公告哦",Toast.LENGTH_LONG).show();
            }
        });
    }
}
