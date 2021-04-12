package cl.douc.evaluaciongrupal2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainDprogramacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dprogramacion);


        ImageView imganterior25 = findViewById(R.id.imgAnteriordia25);

        imganterior25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento1 = new Intent(MainDprogramacion.this, MainProgramacion.class);
                startActivity(intento1);
            }
        });




    }
}