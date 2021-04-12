package cl.douc.evaluaciongrupal2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainProgramacionD2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_programacion_d2);

        ImageView imagendia27 = findViewById(R.id.imgAnteriordia27);

        imagendia27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intento1 = new Intent(MainProgramacionD2.this, MainProgramacion.class);
                startActivity(intento1);

            }
        });


    }
}