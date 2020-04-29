package com.example.beautyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.beautyfresh.Database.DBHandler;

public class Login extends AppCompatActivity {

    EditText user, password;
    Button login;




    DBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        dbHandler = new DBHandler(getApplicationContext());

        user = findViewById(R.id.etuserNameLG);
        password = findViewById(R.id.etPasswordLG);

        login = findViewById(R.id.btnLoginLG);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Cursor res = dbHandler.addInfo();
                while (res.moveToNext()){
                    String name = res.getString(1);
                    if (name.equals(username)){
                        addr = res.getString(2);
                        mail = res.getString(3);
                        contact = res.getString(4);
                        pwd = res.getString(5);
                        gender = res.getString(6);
                    }
                    else {
                        Toast.makeText(Login.this, "Enter the valid username", Toast.LENGTH_SHORT).show();
                    }
                }*/

                Intent intent = new Intent(Login.this,Home.class);
                startActivity(intent);
            }
        });



    }
}
