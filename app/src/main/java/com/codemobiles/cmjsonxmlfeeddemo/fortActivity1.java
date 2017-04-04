package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class fortActivity1 extends Activity {
    private Button btnforhome1;
    private Button btnfornext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fortchachoengsao1);
        initView();
    }

    private void initView() {
        btnforhome1 = (Button) findViewById(R.id.btnforhome1);

        btnforhome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent p = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(p);

            }
        });
        btnfornext1 = (Button) findViewById(R.id.btnfornext1);

        btnfornext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent p = new Intent(getApplicationContext(), fortActivity2.class);
                startActivity(p);

            }
        });
    }
}
