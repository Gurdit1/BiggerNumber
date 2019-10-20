package com.example.biggernumber;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public static boolean check(int n1, int n2){
        return false;

    }

    public static int ranGen(){
        //Generates a single integer between 1-100
        //Random generator
        Random r = new Random();
        int number = r.nextInt(100);
        //Stops 0 from being outputted
        while (number == 0) {
            number = r.nextInt(100);}
        return number;
    }

    public static void displayProcessNum(android.widget.TextView nx, android.widget.TextView b1, android.widget.TextView b2, int choice){
        //Disables the guess buttons
        b1.setClickable(false);
        b2.setClickable(false);


        //Generates the numbers and displays them
        int n1 = 0, n2 = 0;
        while(n1==n2){ //Randomly generates the numbers and checks if they are equal
            n1 = ranGen();
            n2 = ranGen();
        }
        b1.setText(Integer.toString(n1));
        b2.setText(Integer.toString(n2));

        nx.setClickable(true);


    }



    public void onClick1(View view){
        android.widget.TextView b1 = this.findViewById(R.id.button);
        android.widget.TextView b2 = this.findViewById(R.id.button2);
        android.widget.TextView nx = this.findViewById(R.id.next);
        displayProcessNum(nx, b1, b2, 0);



    }

    public void onClick2(View view){
        android.widget.TextView b1 = this.findViewById(R.id.button);
        android.widget.TextView b2 = this.findViewById(R.id.button2);
        android.widget.TextView nx = this.findViewById(R.id.next);
        displayProcessNum(nx, b1, b2, 1);

    }

    public void onClickNext(View view){
        android.widget.TextView b1 = this.findViewById(R.id.button);
        android.widget.TextView b2 = this.findViewById(R.id.button2);
        android.widget.TextView nx = this.findViewById(R.id.next);

        nx.setClickable(false);
        b1.setText("Guess");
        b2.setText("Guess");

        b1.setClickable(true);
        b2.setClickable(true);
    }
}
