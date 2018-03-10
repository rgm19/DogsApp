package com.example.ruben.dogsapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder {

    TextView nameTxt;
    ImageView img;
    public MyHolder(View itemView) {


        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        img=(ImageView) itemView.findViewById(R.id.dogimage);


    }
}