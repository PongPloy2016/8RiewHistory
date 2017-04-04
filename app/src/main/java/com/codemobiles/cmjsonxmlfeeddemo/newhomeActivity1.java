package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class newhomeActivity1 extends Activity {
    private Button btnnewhome;
    private Button btnnewnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newhomemarket1);
        initView();
    }

    private void initView() {
        btnnewhome = (Button) findViewById(R.id.btnnewhome);

        btnnewhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(q);

            }
        });
        btnnewnext = (Button) findViewById(R.id.btnnewnext);

        btnnewnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), newhomeActivity2.class);
                startActivity(q);

            }
        });
    }
}
