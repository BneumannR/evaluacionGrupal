package cl.douc.evaluaciongrupal2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imgExpositores = findViewById(R.id.imgExpositores);
        ImageView imgGaleria = findViewById(R.id.imgGaleria);
        ImageView imgDatos = findViewById(R.id.imgDatos);
        ImageView imgProgramacion = findViewById(R.id.imgProgramacion);

        imgProgramacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento1 = new Intent(MainActivity.this, MainProgramacion.class);
                startActivity(intento1);

            }
        });


        imgExpositores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento1 = new Intent(MainActivity.this,MainActivity_Expositores.class);
                startActivity(intento1);
            }
        });

//        imgGaleria.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intento1 = new Intent(MainActivity.this,MainGaleria.class);
//                startActivity(intento1);
//            }
//        });

        imgDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento1 = new Intent(MainActivity.this,MainData.class);
                startActivity(intento1);
            }
        });





    }
}