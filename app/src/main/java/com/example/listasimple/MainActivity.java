package com.example.listasimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.listasimple.databindig.ActivityMainBinding;

public class MainActivity extends Activity {

   Button btnSimple;
   Button btnAvanzado;
 private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        // btnSimple= findViewById(R.id.btnSimple);
        // btnAvanzado= findViewById(R.id.btnAvanzado);
        bingding = ActivityMainBinding.inflete(getLayoutInflater());
        setContentView(binding.getRoot());
        btnAvanzado = bingding.btnAvanzado;
    }

    public void btnSimpleClick(View view) {
        Intent intent = new Intent(this, SimpleListActivity.class);
        startActivity(intent);
    }



    public void btnAvanzadoClick(View view){

        Intent intent = new Intent(this, AvancedListActivity.class);
    }

}