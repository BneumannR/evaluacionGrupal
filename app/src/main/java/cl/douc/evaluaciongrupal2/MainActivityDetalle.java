package cl.douc.evaluaciongrupal2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivityDetalle extends AppCompatActivity {

    ImageView imageView;
    TextView nombre, marca, detalle;
    int position;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_detalle);

        ActionBar actionBar = getSupportActionBar();

        ImageView imgAnterior = findViewById(R.id.imgAnterior);

        imgAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intento2 = new Intent(MainActivityDetalle.this,MainActivity_Expositores.class);
                startActivity(intento2);
            }
        });



        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            //aslo set in manifest
        }

        imageView = findViewById(R.id.another_imageView);
        nombre =  findViewById(R.id.txtNombre);
        marca = findViewById(R.id.txtMarca);
        detalle = findViewById(R.id.txtDescripcion);

        if (position == 0) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image" );
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aDetalle = intent.getStringExtra("detalle");

            imageView.setImageResource(pic);
            nombre.setText(aTitle);
            marca.setText(aDescription);
            detalle.setText(aDetalle);

            actionBar.setTitle(aTitle);
        }
        if (position == 1) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image" );
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aDetalle = intent.getStringExtra("detalle");

            imageView.setImageResource(pic);
            nombre.setText(aTitle);
            marca.setText(aDescription);
            detalle.setText(aDetalle);

            actionBar.setTitle(aTitle);
        }
        if (position == 2) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image" );
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aDetalle = intent.getStringExtra("detalle");

            imageView.setImageResource(pic);
            nombre.setText(aTitle);
            marca.setText(aDescription);
            detalle.setText(aDetalle);

            actionBar.setTitle(aTitle);
        }
        if (position == 3) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image" );
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aDetalle = intent.getStringExtra("detalle");
            imageView.setImageResource(pic);
            nombre.setText(aTitle);
            marca.setText(aDescription);
            detalle.setText(aDetalle);
            actionBar.setTitle(aTitle);
        }
        if (position == 4) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image" );
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aDetalle = intent.getStringExtra("detalle");
            imageView.setImageResource(pic);
            nombre.setText(aTitle);
            marca.setText(aDescription);
            detalle.setText(aDetalle);
            actionBar.setTitle(aTitle);
        }
        if (position == 5) {
            Intent intent = getIntent();
            String aDetalle = intent.getStringExtra("detalle");
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image" );
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");

            imageView.setImageResource(pic);
            nombre.setText(aTitle);
            marca.setText(aDescription);
            detalle.setText(aDetalle);
            actionBar.setTitle(aTitle);
        }
        if (position == 6) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image" );
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aDetalle = intent.getStringExtra("detalle");
            imageView.setImageResource(pic);
            nombre.setText(aTitle);
            marca.setText(aDescription);
            detalle.setText(aDetalle);
            actionBar.setTitle(aTitle);
        }

    }

    // now check it
}










