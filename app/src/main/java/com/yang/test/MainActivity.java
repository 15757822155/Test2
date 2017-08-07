package com.yang.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    ListView mListView;
    List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("");
        mListView = (ListView) findViewById(R.id.listView);
        for (int i = 0; i < 30; i++) {
            String msg = i + "";
            mList.add(msg);
        }
        mListView.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, mList));
    }
}
