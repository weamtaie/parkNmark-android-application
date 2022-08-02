package com.example.slahly_final;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.slahly_final.ui.home.Home;

public class SignIn extends AppCompatActivity {
    EditText email, password;
    Button btnsignin,btnsignup;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsignin= (Button) findViewById(R.id.buttonSignIn);
        Button btnsignup= (Button) findViewById(R.id.buttonSignUp);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);
        DB = new DBHelper(this);
        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = email.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(SignIn.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass==true){
                        Toast.makeText(SignIn.this, "Sign in successfull", Toast.LENGTH_SHORT).show();
                        Intent intent  = new Intent(getApplicationContext(), Home.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(SignIn.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        btnsignup.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openSignUpActivity();
            }
        });
        btnsignin.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openHomeActivity();
            }
        });
    }
    public void openSignUpActivity() {
        Intent intent2 = new Intent(this, SignUp.class);
        startActivity(intent2);
    }

    public void openHomeActivity() {
        Intent intent3 = new Intent(this, Home.class);
        startActivity(intent3);
    }
}
