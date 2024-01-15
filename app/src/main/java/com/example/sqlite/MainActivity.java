package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton add;
    private RecyclerView recyclerView;
    private Fragment_add fragment_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add_btn);
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        List<Item> items = new ArrayList<Item>();
        items. add (new Item( "John wick","john.wick@email. com" ,"12"));
        items. add (new Item( "John wick","john.wick@email. com" ,"12"));
        items. add (new Item( "John wick","john.wick@email. com" ,"12"));
        items. add (new Item( "John wick","john.wick@email. com" ,"12"));
        recyclerView. setLayoutManager (new LinearLayoutManager( this));
        recyclerView.setAdapter (new MyAdapter (getApplicationContext(),items));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment_add = new Fragment_add();
                loadFragment(fragment_add);
                // En esta parte del codigo ocultamos el botón
                add.setVisibility(View.GONE);
            }
        });
        add.setVisibility(View.VISIBLE);
    }
    // Con esta función cambiamos a otro fragmento de la app
    public void loadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    // Funcion para poder mostrar el boton cuando se vuelva a la pagina principal
    public void showFloatingActionButton() {
        add.setVisibility(View.VISIBLE);
    }

}