package com.example.administrator.jianzhimao;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2016/11/7.
 */

public class ActivityJobDetail extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobdetail);
        View enrollsubmit =  findViewById(R.id.btn_enroll_submit);
        enrollsubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_enroll_submit:
                Intent intent1 = new Intent(this,enrolljob.class);
                startActivity(intent1);
                break;
        }
    }
}
