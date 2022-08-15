package com.example.learningapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Locale;

public class MyAdaptor extends ArrayAdapter
{
    String[] ListText;
    Integer[] Images;
    Activity context;

    public MyAdaptor(Activity context, String[] listT, Integer[] img) {
        super(context, R.layout.row, R.id.listViewImage, img);
        this.ListText = listT;
        this.Images = img;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflator = context.getLayoutInflater();
        View view = inflator.inflate(R.layout.row, parent, false);
        TextView textView =  view.findViewById(R.id.listViewText);
        ImageView imageView =  view.findViewById(R.id.listViewImage);

        textView.setText(ListText[position] + ListText[position].toLowerCase(Locale.ROOT));
        imageView.setImageResource(Images[position]);

        return view;
    }
}
