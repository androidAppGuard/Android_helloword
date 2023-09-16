
package com.example.android_helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {
    public static int count = 0;
    public static String tips = "The current number is : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Button btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountActivity.count = CountActivity.count + 1;
                TextView textView = (TextView)findViewById(R.id.textview_3);
                String str="<b><font color='#000000'>"+tips+"</font><font color='#ff0000'>"+count+"</font></b>";
                textView.setText(Html.fromHtml(str));
            }
        });

        Button btn_reduce = (Button) findViewById(R.id.btn_reduce);
        btn_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountActivity.count = CountActivity.count - 1;
                TextView textView = (TextView)findViewById(R.id.textview_3);
                String str="<b><font color='#000000'>"+tips+"</font><font color='#ff0000'>"+count+"</font></b>";
                textView.setText(Html.fromHtml(str));
            }
        });

        Button btn_clean = (Button) findViewById(R.id.btn_clean);
        btn_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountActivity.count = 0;
                TextView textView = (TextView)findViewById(R.id.textview_3);
                String str="<b><font color='#000000'>"+tips+"</font><font color='#ff0000'>"+count+"</font></b>";
                textView.setText(Html.fromHtml(str));
            }
        });
    }
}