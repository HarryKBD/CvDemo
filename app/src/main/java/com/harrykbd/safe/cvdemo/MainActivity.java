package com.harrykbd.safe.cvdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    RecyclerView mEffectList;
    private final static String[] mList = {"Blur", "Gaussian", "Canny", "Contour", "Sobel", "Segmentation"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "called onCreate");
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.main_screen);
        mEffectList = findViewById(R.id.view_effect_list);
        EffectListAdapter adapter = new EffectListAdapter(mList, this);
        mEffectList.setAdapter(adapter);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mEffectList.setLayoutManager(horizontalLayoutManager);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    public void onDestroy() {
        super.onDestroy();

    }
}