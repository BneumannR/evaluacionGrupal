package cl.douc.evaluaciongrupal2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import cl.douc.evaluaciongrupal2.adaptador.GaleriaFotosAdapter;

public class ImagenesCompleta extends AppCompatActivity {

    ImageView imageView;
    GaleriaFotosAdapter galeriaFotosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes_completa);

        imageView = (ImageView)findViewById(R.id.iv_foto);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("foto Completa");

        Intent intent = getIntent();
        int posicion = intent.getExtras().getInt("misImagenes");
        galeriaFotosAdapter = new GaleriaFotosAdapter(this);
        imageView.setImageResource(galeriaFotosAdapter.imageArray[posicion]);


    }
}