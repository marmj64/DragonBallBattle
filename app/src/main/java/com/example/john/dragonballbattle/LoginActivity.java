package com.example.john.dragonballbattle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v){
        //TODO 4. VALIDATE login credentials in DB.
        Intent completeIntent = new Intent( this, FighterSelectionActivity.class);
        this.startActivity( completeIntent );
        //return true;
    }

    public void createNewUser(View v){
        Intent completeIntent = new Intent( this, CreateAccountActivity.class);
        this.startActivity( completeIntent );
       // return true;
    }


}
