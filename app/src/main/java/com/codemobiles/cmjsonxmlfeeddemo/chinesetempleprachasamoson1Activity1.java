package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 14/3/2560.
 */

public class chinesetempleprachasamoson1Activity1 extends Activity {
    private Button home2;
    private Button btnnext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinesetempleprachasamoson1);
        initView();
    }



    private void initView() {
        home2 = (Button) findViewById(R.id.home2);

        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent q = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(q);

            }
        });


        btnnext2 = (Button) findViewById(R.id.btnnext2);

        btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), chinesetempleprachasamoson1Activity2.class);
                startActivity(q);

            }
        });
    }
}
