package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_details); super.onCreate(savedInstanceState);

        Bundle bundle=getIntent().getExtras();


        TextView textView=findViewById(R.id.textView);
        TextView textView1=findViewById(R.id.textView2);
        TextView textView2=findViewById(R.id.textView3);
        ImageView imageView=findViewById(R.id.imageView);

        Items delieveredItem= (Items)bundle.getSerializable("Items");

        textView.setText(delieveredItem.getItemName());
       textView1.setText(String.valueOf(delieveredItem.getItemPrice()));
       imageView.setImageResource(delieveredItem.getItemImg());
       textView2.setText(delieveredItem.getItemDetails());
     

    }
}