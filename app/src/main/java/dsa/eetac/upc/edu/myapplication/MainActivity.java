package dsa.eetac.upc.edu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import dsa.eetac.upc.edu.mylibrary.Pepito;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pepito p = new Pepito();
        Log.d("APP", p.hola() );
    }
}
