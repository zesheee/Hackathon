package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAppany, btnLogin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAppany = (Button) findViewById(R.id.Appany); //найти кнопку в лэйоут
        btnAppany.setOnClickListener(this); //присвоить обработчик
        btnLogin = (Button) findViewById(R.id.btnLogin); //найти кнопку в лэйоут
        btnLogin.setOnClickListener(this); //присвоить обработчик
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Appany:
                Intent intent = new Intent(this, ActivityAppany.class);
                startActivity(intent);
                break;
            case R.id.btnLogin:
                Intent intent_2 = new Intent(this, LoginActivity.class);
                startActivity(intent_2);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
