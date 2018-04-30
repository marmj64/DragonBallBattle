package com.example.john.dragonballbattle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v){
        DatabaseManager db = new DatabaseManager(this);
        EditText userName = (EditText) findViewById(R.id.loginUsernameText);
        EditText password = (EditText) findViewById(R.id.loginPasswordText);
        String userNameStr = userName.getText().toString();
        String passwordStr = password.getText().toString();
        if(db.searchUser(userNameStr,passwordStr)) {
            //TODO 4. VALIDATE login credentials in DB.
            Intent completeIntent = new Intent(this, FighterSelectionActivity.class);
            //TODO 5 ADD METHODS TO DB TO IMPLEMENT
            this.startActivity(completeIntent);
        }
        else{
            Log.i("User_check","Incorrect login details");
        }
    }

    public void createNewUser(View v){
        Intent completeIntent = new Intent( this, CreateAccountActivity.class);
        this.startActivity( completeIntent );
       // return true;
    }


}
