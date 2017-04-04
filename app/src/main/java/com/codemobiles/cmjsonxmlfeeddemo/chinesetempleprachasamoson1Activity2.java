package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 14/3/2560.
 */

public class chinesetempleprachasamoson1Activity2 extends Activity {
    private Button btnch1;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinesetempleprachasamoson2);
        initView();
    }

    public void Backchinesetempleprachasamoson1Activity2(View view) {
        Button btn_back = (Button) findViewById(R.id.button);
        // Intent intent = new Intent(chinesetempleprachasamoson1Activity2.this.MainActivity.class);
        //   startActivity(intent);

    }

    private void initView() {
        btnch1 = (Button) findViewById(R.id.btnch1);

        btnch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent p = new Intent(getApplicationContext(), chinesetempleprachasamoson1Activity1.class);
                startActivity(p);


            }
        });
        btn3 = (Button) findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent o = new Intent(getApplicationContext(), chinesetempleprachasamoson1Activity3.class);
                startActivity(o);


            }
        });
    }
}
