package com.example.recycleviewthebasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvVertical, rvHorizontal;
    private String[] interns, descriptions;
    int[] avatars = {
            R.drawable.stagiaire_01,
            R.drawable.stagiaire_02,
            R.drawable.stagiaire_03,
            R.drawable.stagiaire_04,
            R.drawable.stagiaire_05,
            R.drawable.stagiaire_06,
            R.drawable.stagiaire_07,
            R.drawable.stagiaire_08,
            R.drawable.stagiaire_09,
            R.drawable.stagiaire_010,
            R.drawable.stagiaire_011,
            R.drawable.stagiaire_012,
            R.drawable.stagiaire_013,
            R.drawable.stagiaire_014
    };

    private void init(){
        rvVertical = findViewById(R.id.rv_vertical);
        rvHorizontal = findViewById(R.id.rc_horizontal);
        interns = getResources().getStringArray(R.array.interne);
        descriptions = getResources().getStringArray(R.array.description);
    }

    private void fillRecyclerVertical(){
        MyRecycleVerticalAdapter adapter = new MyRecycleVerticalAdapter(this,interns, descriptions, avatars);

        rvVertical.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false
        );

        rvVertical.setLayoutManager(linearLayoutManager);
    }

    public void fillRecycleHorizontal(){
      MyRecycleHorizontalAdapter adapter = new MyRecycleHorizontalAdapter(this, interns, avatars);
      rvHorizontal.setAdapter(adapter);
      LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
        this, LinearLayoutManager.HORIZONTAL, false
      );
      rvHorizontal.setLayoutManager(linearLayoutManager);
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        fillRecycleHorizontal();
        fillRecyclerVertical();

    }

}