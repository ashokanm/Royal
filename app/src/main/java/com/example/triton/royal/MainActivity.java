package com.example.triton.royal;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     private EditText user_name, password;
     private Button submit;

    public void initialize() {
        user_name = (EditText) findViewById(R.id.et_login_username);
        password = (EditText) findViewById(R.id.et_login_password);
        submit = (Button) findViewById(R.id.et_login_submit);
        submit.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.login_tittle);
        initialize();


    }


    @Override
    public void onClick(View v) {
       if(v.getId()==R.id.et_login_submit)
        {
            System.out.println("<----------------login button clicked-------------->");

                if(user_name.getText().toString().matches("")&& password.getText().toString().matches(""))
                {
                    Toast.makeText(getApplicationContext(),"please Ensure the username & password",Toast.LENGTH_SHORT).show();
                }else
                {

                }

        }
    }
    public  class loginAsyntask extends AsyncTask
    {


        @Override
        protected Object doInBackground(Object[] params) {
            return null;
        }
    }
}