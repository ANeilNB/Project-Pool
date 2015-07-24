package com.projectpool.app.projectpool;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * Created by llew on 24/07/2015.
 */
public class ButtonListeners extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_main_page);
        View play = this.findViewById(R.id.play);

        play.setOnClickListener(this);

        View bet = this.findViewById(R.id.bet);
        bet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.play : TextView tv = (TextView) findViewById(R.id.textView2);
                             tv.setText("gr8 b8 m8 i r8 8.8/8.8");
        }
    }
}
