package com.example.mp.fragmentos;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText caja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja=(EditText)findViewById(R.id.editText);

        //boton principal
        Button btnp=(Button)findViewById(R.id.btnPrincipal);
        btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // llamo mi clase fragmento creada
                Fragmento1 miFragmento=new Fragmento1();
                //preparo para enviar datos
                Bundle datos=new Bundle();
                //veririfo que no este vacio
                if(!caja.getText().toString().isEmpty()){
                    //ingreso el dato
                    datos.putString("Dato",caja.getText().toString());
                    //guardo datos en mi clase fragmento para que se envie
                    miFragmento.setArguments(datos);

                    //preparo la transaccion de fragmentos
                    FragmentTransaction ftrans=getFragmentManager().beginTransaction();
                    // el id contenedor (que es un layour) lo voy a cambiar por mi fragmento. agregamos una etiqueta para identificarlo de otros
                    ftrans.replace(R.id.contenedor,miFragmento,"Frag1");
                    // por si tenemos otro fragmento y queremos ir a el ponemos su TAG para ir a ese fragmento
                    ftrans.addToBackStack(null);
                    // lo ejecutamos
                    ftrans.commit();
                }else{
                    Toast.makeText(MainActivity.this,"Ingrese un dato en la caja de texto.",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
