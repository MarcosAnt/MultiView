package com.example.marcos.multiview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
    }

    //Chama a Tela2
    public void onClick(View view) {
        Intent it = new Intent(this, Tela2.class);
        startActivity(it);
    }
}
