package com.example.android.historyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void oa (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }

    public void ob (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }

    public void oc (View view)
    {
        Toast.makeText(this, "Well done", Toast.LENGTH_SHORT).show();
    }
    public void od (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }
    ///quiz two

    public void tha (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }

    public void thb (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }

    public void thc (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }
    public void thd (View view)
    {
        Toast.makeText(this, "Well done", Toast.LENGTH_SHORT).show();
    }
    ////quiz three
    public void ta (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }

    public void tb (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }

    public void tc (View view)
    {
        Toast.makeText(this, "Well done", Toast.LENGTH_SHORT).show();
    }
    public void td (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }
    ///quiz four

    public void fa (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }

    public void fb (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }

    public void fc (View view)
    {
        Toast.makeText(this, "Well done", Toast.LENGTH_SHORT).show();
    }
    public void fd (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }
    public void SUBMIT(View view) {
        EditText edit = (EditText)findViewById(R.id.Name);
        TextView tview = (TextView)findViewById(R.id.message);
        String result = edit.getText().toString();
        tview.setText(result);
    }

}
