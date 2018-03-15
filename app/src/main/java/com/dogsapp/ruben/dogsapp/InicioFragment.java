package com.dogsapp.ruben.dogsapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import static com.dogsapp.ruben.dogsapp.ActivityDetalles.dogie;


public class InicioFragment extends Fragment {

    final static  String DB_URL= "https://dogsappdam.firebaseio.com/";
    ListView listView;
    FirebaseClient firebaseClient;
    View view;

    public InicioFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_inicio,container,false);


        listView = (ListView) view.findViewById(R.id.listview);
        listView.setClickable(true);
        firebaseClient = new FirebaseClient(getContext(), DB_URL, listView);
        firebaseClient.refreshdata();



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                //Object o = listView.getItemAtPosition(position);
                // Realiza lo que deseas, al recibir clic en el elemento de tu listView determinado por su posicion.
                Intent intent = new Intent(view.getContext(), ActivityDetalles.class);
                dogie = (Dog) listView.getItemAtPosition(position);
                startActivity(intent);

            }
        });

        return view;
    }
}
