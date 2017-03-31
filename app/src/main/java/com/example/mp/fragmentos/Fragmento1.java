package com.example.mp.fragmentos;


import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento1 extends Fragment {


    public Fragmento1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // creamos la variable del tipo vista (View)
        View v=inflater.inflate(R.layout.fragment_fragmento1, container, false);
        // recibimos el dato enviado desde activity en una variable del tipo string
        final String datoRecibido=this.getArguments().getString("Dato");
        // enlazo el boton que esta en layout de fragmento
        Button btnf=(Button) v.findViewById(R.id.btnFrag);
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // muestro la informacion
                Toast.makeText(getActivity().getBaseContext(),datoRecibido,Toast.LENGTH_SHORT).show();
            }
        });

        //regreso la vista preparada
        return v;
    }

}
