package com.yus.navigationviewdemo;

import android.app.Activity;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends Activity implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        //获取头布局文件，可通过这个控件获取子控件，设置点击事件
        View headerView = navigationView.getHeaderView(0);
        ImageView iv= (ImageView) headerView.findViewById(R.id.iv);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("alan","iv click");
            }
        });

        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.nav_city:
                Log.d("alan","城市选择");
                break;
            case R.id.nav_multi_cities:
                Log.d("alan","多城市管理");
                break;

        }

        return true;
    }
}
