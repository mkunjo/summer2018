package com.example.mk.summer2018;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mk.summer2018.R;
import com.example.mk.summer2018.Fragment.*;
import com.example.mk.summer2018.activity.BaseActivity;

import org.w3c.dom.Text;

import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    private Button orgButton;
    private Button picButton;

    private Button demoButton;
    private Button workButton;

    private WorkFragment workFragment;
    private DemoFragment demoFragment;




    //Alternate onclick listener method, must set to button on activity's xml
    public void onBack(View v){
        Toast.makeText(MainActivity.this, "Orange Button!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setListener();

        Toast.makeText(this, "Welcome to Muhammad's app!", Toast.LENGTH_LONG).show();
    }

    private void setListener() {
        orgButton = findViewById(R.id.main_title_btn_orange);
        picButton = findViewById(R.id.main_title_btn_pic);

        demoButton = findViewById(R.id.demo_btn);
        demoButton.setTextColor(Color.RED);
        workButton = findViewById(R.id.work_btn);

        //Below we define the different fragments
        workFragment = new WorkFragment();
        demoFragment = new DemoFragment();

        //Prefferred onClickListener method
        picButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Picture Button!", Toast.LENGTH_LONG).show();
            }
        });
        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                demoButton.setTextColor(Color.RED);

                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, demoFragment).commit();
                Toast.makeText(MainActivity.this, "You pressed Demo!", Toast.LENGTH_LONG).show();
            }
        });
        workButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                demoButton.setTextColor(Color.BLACK);
                workButton.setTextColor(Color.RED);
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, workFragment).commit();
                Toast.makeText(MainActivity.this, "You pressed Work!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
