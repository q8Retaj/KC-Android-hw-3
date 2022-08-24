package com.example.cw7;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class itemsAdapter extends ArrayAdapter {
    List<Items> itemslist;

    public itemsAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        itemslist = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.items_row, parent, false);
        Items currentItems=itemslist.get(position);
        TextView textView=view.findViewById(R.id.textView5);
        ImageView imgView=view.findViewById(R.id.hImage);
        textView.setText(currentItems.getItemName());
        imgView.setImageResource(currentItems.getItemImg());

        ImageView delteButton=view.findViewById(R.id.imageView2);
       delteButton.setOnClickListener(new View.OnClickListener() {
           Items removedItem=itemslist.get(position);
           @Override
           public void onClick(View view) {
               AlertDialog.Builder builder=new AlertDialog.Builder(getContext()).setMessage("Are you sure you want to delete that ")
                       .setTitle("Confirmation").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialogInterface, int i) {
                               itemslist.remove(removedItem);
                               notifyDataSetChanged();
                           }
                       }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialogInterface, int i) {
                               dialogInterface.dismiss();
                           }
                       });
               builder.show();

           }
       });





        return view;



      }

}

