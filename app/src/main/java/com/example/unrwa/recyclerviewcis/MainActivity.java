package com.example.unrwa.recyclerviewcis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<ModelFood> foodslist;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);

        foodslist =new ArrayList <>();

        foodslist.add(new ModelFood(R.drawable.a1,"برياني","بالميرا","4"));
        foodslist.add(new ModelFood(R.drawable.b2,"شاورما السوري","تايلندي","5"));
        foodslist.add(new ModelFood(R.drawable.c3,"شورما","الشيخ","4"));
        foodslist.add(new ModelFood(R.drawable.d4,"دجاج محشي","بالميرا","3"));
        foodslist.add(new ModelFood(R.drawable.e5,"دجاج مشوي","تايلندي","8"));
        foodslist.add(new ModelFood(R.drawable.f6,"صنية دجاج مع رز","الشوا","9"));
        foodslist.add(new ModelFood(R.drawable.g7,"كباب","الجرجاوي","11"));
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManger=layoutManager;

        recyclerView.setLayoutManager(rvLiLayoutManger);
        FoodAdapter adapter =new FoodAdapter(this,foodslist);
        recyclerView.setAdapter(adapter);
    }
}
