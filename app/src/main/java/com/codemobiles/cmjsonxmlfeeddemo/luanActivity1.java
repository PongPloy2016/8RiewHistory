package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class luanActivity1 extends Activity {
    private Button btnluahome1;
    private Button btnluanext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luangporsothon1);
        initView();
    }

    private void initView() {
        btnluahome1 = (Button) findViewById(R.id.btnluahome1);

        btnluahome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(p);
            }
        });

        btnluanext1 = (Button) findViewById(R.id.btnluanext1);

        btnluanext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplicationContext(), luanActivity2.class);
                startActivity(p);
            }
        });
    }
}
