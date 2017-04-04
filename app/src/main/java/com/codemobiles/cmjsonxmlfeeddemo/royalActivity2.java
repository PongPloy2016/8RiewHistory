package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class royalActivity2 extends Activity {
    private Button btnroyback2;
    private Button btnroynext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.royalmonogramrangsarit2);
        initView();
    }

    private void initView() {
        btnroyback2 = (Button) findViewById(R.id.btnroyback2);
        btnroyback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), royalActivity1.class);
                startActivity(q);

            }
        });
        btnroynext1 = (Button) findViewById(R.id.btnroynext1);
        btnroynext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), royalActivity3.class);
                startActivity(q);

            }
        });
    }
}
