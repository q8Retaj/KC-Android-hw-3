package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Items> Items=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Items items1 = new Items("chesse", R.drawable.cheese, 0.640,"Swiss cheese");
        Items items2 = new Items("chocolate", R.drawable.chocolate, 0.250,"Milk chocolate");
        Items items3 = new Items("coffe", R.drawable.coffee, 1.010,"Amricano");
        Items items4 = new Items("donut", R.drawable.donut, 0.950,"Original donut");
        Items items5 = new Items("honey", R.drawable.honey, 4.750,"mujeza");
        Items items6 = new Items("fries", R.drawable.fries, 0.770,"fries with cheese");

        Items.add(items1);
        Items.add(items2);
        Items.add(items3);
        Items.add(items4);
        Items.add(items5);
        Items.add(items6);
        itemsAdapter itemsAdapter=new itemsAdapter(this,0,Items);
        ListView listView=findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);


      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Items currenItems= Items.get(i);
              Intent intent=new Intent(MainActivity.this,Details.class);
              intent.putExtra("Items",currenItems);
            startActivity(intent);
          }
      });


    }
}