package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class royalActivity1 extends Activity {
    private Button btnroyhome1;
    private Button btnroynext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.royalmonogramrangsarit1);
        initView();
    }

    private void initView() {
        btnroyhome1 = (Button) findViewById(R.id.btnroyhome1);
        btnroyhome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(q);
            }
        });
        btnroynext1 = (Button) findViewById(R.id.btnroynext1);
        btnroynext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), royalActivity2.class);
                startActivity(q);

            }
        });
    }
}
