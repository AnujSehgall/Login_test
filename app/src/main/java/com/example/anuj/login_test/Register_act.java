package com.example.anuj.login_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register_act extends AppCompatActivity {

    EditText use_name,use_surname,usename,use_age,pasword;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_act);
        use_name = (EditText) findViewById(R.id.name);
        use_surname = (EditText) findViewById(R.id.surname);
        use_age = (EditText) findViewById(R.id.age);
        usename = (EditText) findViewById(R.id.username);
        pasword = (EditText) findViewById(R.id.password);
        reg = (Button) findViewById(R.id.register);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = use_name.getText().toString();
                String surname = use_surname.getText().toString();
                String age = use_age.getText().toString();
                String username = usename.getText().toString();
                String password = pasword.getText().toString();
                String type = "register";
                Background background = new Background(Register_act.this);
                background.execute(type,name,surname,age,username,password);
            }
        });
    }
}
