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
        View v=inflater.inflate(R.layout.fragment_fragmento1, container, false);

        final String datoRecibido=getArguments().getString("dato");

        Button btn=(Button) v.findViewById(R.id.btnFrag);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getBaseContext(),datoRecibido,Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

}
