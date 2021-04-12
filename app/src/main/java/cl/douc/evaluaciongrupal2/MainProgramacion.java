package cl.douc.evaluaciongrupal2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainProgramacion extends AppCompatActivity {

    public String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_programacion);

        ImageView imgInicio = findViewById(R.id.imgInicio3);
        ImageView imgLinkEntradas = findViewById(R.id.imgLinkEntradas);
        ImageView imgSiguientedia25 = findViewById(R.id.imgsgtedia25);
        ImageView imgSiguientedia27 = findViewById(R.id.imgsgtedia27);
        url="https://www.puntoticket.com/";

        imgSiguientedia27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento1 = new Intent(MainProgramacion.this, MainProgramacionD2.class);
                startActivity(intento1);
            }
        });

        imgSiguientedia25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento1 = new Intent(MainProgramacion.this, MainDprogramacion.class);
                startActivity(intento1);
            }
        });



        imgLinkEntradas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url);
                Intent intento2 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intento2);

            }
        });


        imgInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento1 = new Intent(MainProgramacion.this,MainActivity.class);
                startActivity(intento1);
            }
        });






    }
}