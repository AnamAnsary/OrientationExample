package com.example.orientationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email,contact,pwd,cnfrmpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        contact = (EditText) findViewById(R.id.cntct);
        pwd = (EditText) findViewById(R.id.pwd);
        cnfrmpwd = (EditText) findViewById(R.id.cnfpwd);

    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("name", name.getText().toString());
        savedInstanceState.putString("email", email.getText().toString());
        savedInstanceState.putString("contact", contact.getText().toString());
        savedInstanceState.putString("pwd", pwd.getText().toString());
        savedInstanceState.putString("cnfrmpwd", cnfrmpwd.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
      /*  name = savedInstanceState.getString("name");*/

        name.setText(savedInstanceState.getString("name"));
        email.setText(savedInstanceState.getString("email"));
        contact.setText(savedInstanceState.getString("contact"));
        pwd.setText(savedInstanceState.getString("pwd"));
        cnfrmpwd.setText(savedInstanceState.getString("cnfrmpwd"));

    }
}
