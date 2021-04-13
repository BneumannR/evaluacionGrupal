package cl.douc.evaluaciongrupal2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import cl.douc.evaluaciongrupal2.adaptador.GaleriaFotosAdapter;

public class Main_galeria extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_galeria);


        gridView =(GridView)findViewById(R.id.gv_imagenes);
        gridView.setAdapter(new GaleriaFotosAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),ImagenesCompleta.class);
                intent.putExtra("misImagenes", position);
                startActivity(intent);

            }
        });

    }
}