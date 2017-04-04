package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 14/3/2560.
 */

public class cpb2Activity extends Activity {
    private Button btncpbhome2;
    private Button btncpbnext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpb2);
        initView();
    }

    private void initView() {
        btncpbhome2 = (Button) findViewById(R.id.btncpbhome2);

        btncpbhome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplicationContext(), cpb1Activity.class);
                startActivity(p);
            }
        });
        btncpbnext2 = (Button) findViewById(R.id.btncpbnext2);

        btncpbnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent o = new Intent(getApplicationContext(), cpb3Activity.class);
                startActivity(o);

            }
        });
    }
}
