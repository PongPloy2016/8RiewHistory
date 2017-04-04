package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class shrineActivity1 extends Activity {
    private Button btnshrhome1;
    private Button btnshrnext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shrine);
        initView();
    }

    private void initView() {
        btnshrhome1 = (Button) findViewById(R.id.btnshrhome1);
        btnshrhome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(q);

            }
        });
        btnshrnext1 = (Button) findViewById(R.id.btnshrnext1);
        btnshrnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), shrineActivity2.class);
                startActivity(q);

            }
        });
    }
}
