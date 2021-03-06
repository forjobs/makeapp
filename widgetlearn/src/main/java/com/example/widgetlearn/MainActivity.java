package com.example.widgetlearn;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mTextView = (TextView) findViewById(R.id.tvCenter);
        initView();

    }

    private void initView() {
        mToolbar.setTitle("Title");
        setSupportActionBar(mToolbar);
//        mToolbar.inflateMenu(R.menu.menu_toolbar);
//        mToolbar.setSubtitle("Subtitle");
//        mToolbar.setLogo(R.mipmap.ic_star_white_24dp);
//        mToolbar.setBackgroundColor(getColor(R.color.colorPrimaryDark));
//        mToolbar.setTitleTextColor(Color.WHITE);
//        mToolbar.setNavigationIcon(R.mipmap.ic_launcher);
//        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "back", Toast.LENGTH_SHORT).show();
//            }
//        });
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.actionMe:
                        Toast.makeText(App.getContext(), "actionMe", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.actionDownload:
                        Toast.makeText(App.getContext(), "actionDownload", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.actionItem1:
                        Toast.makeText(App.getContext(), "1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.actionItem2:
                        Toast.makeText(App.getContext(), "actionItem2", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

        if (mToolbar != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if (mTextView != null) {
            mTextView.setText("居中");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar, menu);
        return true;
    }
}
