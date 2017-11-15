package com.example.anuj.login_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText uname,psword;
    Button login_btn,reg_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname= (EditText) findViewById(R.id.username);
        psword =(EditText) findViewById(R.id.password);
        login_btn= (Button) findViewById(R.id.login);
        reg_btn= (Button) findViewById(R.id.reg);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = uname.getText().toString();
                String password = psword.getText().toString();
                String type = "login";
                Background background = new Background(MainActivity.this);
                background.execute(type,username,password);
            }
        });

        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Register_act.class);
                startActivity(i);
                finish();
            }
        });

    }
}
