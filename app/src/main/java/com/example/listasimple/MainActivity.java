package com.example.listasimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity<ActivityMainBinding> extends Activity {


    private ActivityMainBinding binding;
    private Button btnAvanzado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btnAvanzado = binding.btnAvanzado;
        // equivale a btnAvanzado = findViewById(R.id.btnAvanzado)
    }

    public void btnAvanzadoClick(View view){
        Intent intent = new Intent(this, AdvancedListActivity.class);
        startActivity(intent);
    }
}







