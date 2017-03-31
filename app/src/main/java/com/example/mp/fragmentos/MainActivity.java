package com.example.mp.fragmentos;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.btnprincipal);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Frag1 mifragmento=new Frag1();

                FragmentTransaction fTrans=getFragmentManager().beginTransaction();
                fTrans.replace(R.id.contenedor,mifragmento);
                fTrans.addToBackStack(null);
                fTrans.commit();

            }
        });
    }
}
