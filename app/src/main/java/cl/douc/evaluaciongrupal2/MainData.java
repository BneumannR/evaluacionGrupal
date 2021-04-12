package cl.douc.evaluaciongrupal2;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainData extends AppCompatActivity {

    Button botonInsertar, botonBuscar, botonActualizar, botonBorrar;
    EditText codigo, producto,descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_data);

        ImageView imgInicio2 = findViewById(R.id.imgInicio2);

        imgInicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento1 = new Intent(MainData.this, MainActivity.class);
                startActivity(intento1);
            }
        });

        botonInsertar = findViewById(R.id.btnInsertar);
        botonActualizar = findViewById(R.id.btnModificar);
        botonBorrar= findViewById(R.id.btnBorrar);
        botonBuscar= (Button)findViewById(R.id.btnBuscar);

        codigo = findViewById(R.id.txtCodigo);
        producto = findViewById(R.id.txtProducto);
        descripcion = findViewById(R.id.txtDescripcionBD);


        Bd_Helper_Custom helper = new Bd_Helper_Custom(this);


        botonInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Gets the data repository in write mode
                SQLiteDatabase db = helper.getWritableDatabase();

// Create a new map of values, where column names are the keys
                ContentValues values = new ContentValues();
                values.put(Estructura_BD.COLUMN_codigo_Id, codigo.getText().toString());
                values.put(Estructura_BD.COLUMN_Producto, producto.getText().toString());
                values.put(Estructura_BD.COLUMN_Descripcion, descripcion.getText().toString());
                Toast.makeText(getApplicationContext(),"Se guardo el registro con codigo: " + codigo.getText().toString(),Toast.LENGTH_LONG).show();

// Insert the new row, returning the primary key value of the new row
                long newRowId = db.insert(Estructura_BD.TABLE_NAME, null, values);

            }
        });

        botonActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = helper.getWritableDatabase();

// New value for one column
                String title = "MyNewTitle";
                ContentValues values = new ContentValues();
                values.put(Estructura_BD.COLUMN_Producto, producto.getText().toString());
                values.put(Estructura_BD.COLUMN_Descripcion, descripcion.getText().toString());


// Which row to update, based on the title
                String selection = Estructura_BD.COLUMN_codigo_Id + " LIKE ?";
                String[] selectionArgs = { codigo.getText().toString()};

                int count = db.update(
                        Estructura_BD.TABLE_NAME,
                        values,
                        selection,
                        selectionArgs);

                Toast.makeText(getApplicationContext(),"Se actualizo el registro con codigo: " + codigo.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });


        botonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Define 'where' part of query.
                SQLiteDatabase db = helper.getWritableDatabase();
                String selection = Estructura_BD.COLUMN_codigo_Id + " LIKE ?";
// Specify arguments in placeholder order.
                String[] selectionArgs = { codigo.getText().toString() };
// Issue SQL statement.
                int deletedRows = db.delete(Estructura_BD.TABLE_NAME, selection, selectionArgs);

                Toast.makeText(getApplicationContext(),"Se borro el registro con codigo: " + codigo.getText().toString(),Toast.LENGTH_LONG).show();

                codigo.setText("");
                producto.setText("");
                descripcion.setText("");
            }
        });

        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = helper.getReadableDatabase();

// Define a projection that specifies which columns from the database
// you will actually use after this query.
                String[] projection = {
                        // BaseColumns._ID,
                        Estructura_BD.COLUMN_Producto,
                        Estructura_BD.COLUMN_Descripcion
                };

// Filter results WHERE "title" = 'My Title'
                String selection = Estructura_BD.COLUMN_codigo_Id + " = ?";
                String[] selectionArgs = { codigo.getText().toString() };

// How you want the results sorted in the resulting Cursor
//                String sortOrder =
//                        FeedEntry.COLUMN_NAME_SUBTITLE + " DESC";

                try {
                    Cursor cursor = db.query(
                            Estructura_BD.TABLE_NAME,   // The table to query
                            projection,             // The array of columns to return (pass null to get all)
                            selection,              // The columns for the WHERE clause
                            selectionArgs,          // The values for the WHERE clause
                            null,                   // don't group the rows
                            null,                   // don't filter by row groups
                            null               // The sort order
                    );

                    cursor.moveToFirst();

                    producto.setText(cursor.getString(0));
                    descripcion.setText(cursor.getString(1));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No se encontro el registro ",Toast.LENGTH_LONG).show();
                }

            }

        });


    }
}