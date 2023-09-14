package com.example.android_helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public TextView textView;
    public Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        btn2 = (Button) findViewById(R.id.btn_2);
        textView = (TextView) findViewById(R.id.textview_1);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tmp=textView.getVisibility();
                if(tmp==View.VISIBLE){
                    textView.setVisibility(View.INVISIBLE);
                }else {
                    textView.setVisibility(View.VISIBLE);
                }

                String text = (String) btn2.getText();
                if(text.equals("SHOW")){
                    btn2.setText("HIDE");
                }else {
                    btn2.setText("SHOW");
                }
            }
        });



    }
}