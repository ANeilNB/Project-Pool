package com.projectpool.app.projectpool;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainPage extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        View play = this.findViewById(R.id.play);
        play.setOnClickListener(this);

        View bet = this.findViewById(R.id.leaveQueue);
        bet.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.play : TextView tv = (TextView) findViewById(R.id.textView2);
                tv.setText("gr8 b8 m8 i r8 8.8/8.8");
                setContentView(R.layout.activity_play_page);
                View back = this.findViewById(R.id.backButton);
                back.setOnClickListener(this);
                break;
            case R.id.backButton :
                setContentView(R.layout.activity_main_page);
                View play = this.findViewById(R.id.play);
                play.setOnClickListener(this);
                break;
        }
    }
}
