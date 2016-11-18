package com.example.administrator.jianzhimao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SelectIdentityActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView studen;
    private ImageView office;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_identity);
        studen = (ImageView) findViewById(R.id.studen);
        office = (ImageView) findViewById(R.id.office);
        studen.setOnClickListener(this);
        office.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        this.finish();


    }
}
