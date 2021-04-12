package cl.douc.evaluaciongrupal2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_Expositores extends AppCompatActivity {

    ListView listView1;
    String mTitle[] = {"Nick Law", "Kwon Oh-hyun", "Pekka Lundmark", "Lei Jun", "Greg Brown", "Ren Zhengfei", "Koo Kwang Mo"};
    String mDescription[] =  {"Apple", "Samsung", "Nokia", "Xiaomi", "Motorola", "Huawei", "Lg"};

    String[] mDetalle ={"Nick es uno de los líderes creativos más progresistas y versátiles de nuestra industria. Impulsa una visión unificada para " +
            "la creatividad dinámica en la era moderna en todas las marcas creativas de Publicis Groupe, al tiempo que ayuda a fomentar culturas" +
            " dinámicas y diversas. Nick es responsable de liderar la creatividad de Publicis Groupe a nivel mundial y es miembro del comité " +
            "ejecutivo.",
            "Kwon Oh-hyun (nacido el 15 de octubre de 1952) es el vicepresidente y director ejecutivo de Samsung Electronics ." +
            " En 2013, la revista Time lo agregó a su lista de las 100 personas más influyentes. " +
            "En octubre de 2017, el Dr. Kwon anunció que dimitiría en marzo de 2018, citando una crisis sin precedentes. El Dr. Kwon tiene " +
                    "una licenciatura en ingeniería eléctrica de la Universidad Nacional de Seúl , una maestría en ingeniería eléctrica de KAIST " +
                    "(Instituto Avanzado de Ciencia y Tecnología de Corea) y un doctorado. en Ingeniería Eléctrica de la Universidad de Stanford ",

            "Pekka Lundmark (nacido el 9 de diciembre de 1963) es un ejecutivo de negocios finlandés y actual presidente y director ejecutivo de Nokia." +
                    " Anteriormente, se había desempeñado como director ejecutivo de Fortum , una empresa energética estatal finlandesa , desde 2015 " +
                    "hasta julio de 2020.  Lundmark nació el 9 de diciembre de 1963 en Espoo , Finlandia. Se graduó de la Universidad Tecnológica " +
                    "de Helsinki con una Maestría en Ciencias en Física Aplicada en 1988",

            "Lei Jun (en idioma chino: 雷军, nacido en Xiantao, Hubei, 16 de diciembre de 1969) es un ingeniero electrónico, empresario y " +
                    "director ejecutivo chino." +
                    "Realizó sus estudios de ingeniero electrónico en la Universidad de Wuhan. Trabajó para las empresas Kingsoft (1992-1998) y " +
                    "Amazon China." +
                    "Es uno de los cofundadores y director ejecutivo de la empresa china Xiaomi. La empresa china fue creada en 2010, junto a " +
                    "su amigo Lin Bin, y se dedicada al diseño, desarrollo y venta de teléfonos inteligentes, aplicaciones informáticas y otros " +
                    "productos electrónicos. " +
                    "En 2014 según la revista Forbes, Lei Jun es el multimillonario número 139 del mundo, con un patrimonio de 9.1 mil " +
                    "millones de dólares en 2014.",

            "Brown es presidente y director ejecutivo de Motorola Solutions, que proporciona comunicaciones, software de centro de comando y seguridad " +
                    "de video para empresas comerciales y de seguridad pública.  " +
                    "Fue presidente y director ejecutivo de la empresa de software de gestión de redes Micromuse (adquirida por IBM ) con sede en San " +
                    "Francisco durante cuatro años hasta su dimisión en diciembre de 2002 " +
                    "Brown se incorporó a Motorola Solutions en 2004, ha sido director ejecutivo desde enero de 2008 [8] y es el director ejecutivo con" +
                    " más años de servicio en la empresa, después del fundador Paul Galvin y su hijo Bob.",

            "Ren Zhengfei, (任正非), (Anshun, 25 de octubre de 1944) es un empresario chino, fundador y presidente de Huawei Technologies Co. Ltd , " +
                    "con casa matriz en Shenzhen. En 1987, Ren fundó Huawei Technologies Co. Ltd, una compañía especializada en el desarrollo, " +
                    "producción y ventas de equipamiento para telecomunicaciones como su presidente. La compañía, hoy por hoy, es un actor clave en " +
                    "la industria de las Telecomunicaciones, con una facturación anual de 13 mil millones de dólares y más de 70.000 empleados en 2007.",

            "Koo Kwang-mo es el hijo adoptado de Koo Bon-moo, el anterior presidente de LG Group. Bon-moo adoptó a Kwang-mo, quien era su sobrino, en " +
                    "1994 tras perder a su único hijo en un accidente de tráfico. El padre biológico de Kwang-mo es Bon-neung, hermano menor del " +
                    "anterior CEO de LG Group, mientras que su bisabuelo es el fundador de LG Group, Koo In-hwoi." +
                    "Koo estudió ingeniería en el Rochester Institute of Technology, y realizó su maestría en la Stanford Graduate School of " +
                    "Business."};

   // String mDetalle[] = {getString().
 //   ,".", ".",".",".",".",".",};
   // String jkshbdj[] = {String.valueOf(R.string.detalle_nick_Law)};

    int images[] =  {R.drawable.nick_law_apple, R.drawable.ceo_samsung, R.drawable.pekka_lundmark, R.drawable.lei_jun, R.drawable.greg_brown,
    R.drawable.ren_zhengfei, R.drawable.koo_kwang_mo};
    int images2[] = {R.drawable.siguiente2, R.drawable.siguiente2, R.drawable.siguiente2,R.drawable.siguiente2, R.drawable.siguiente2,
            R.drawable.siguiente2, R.drawable.siguiente2 };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__expositores);

        ImageView imgInicio = findViewById(R.id.imgInicio);


        listView1 = findViewById(R.id.lblListView);
        //now create an adapter class

        MyAdapter adapter = new MyAdapter( this, mTitle, mDescription, images, images2);
        listView1.setAdapter(adapter);
        //there is my mistake //now again check this


        //now set item clic on list view
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intento1 = new Intent(getApplicationContext(),MainActivityDetalle.class);
                    //this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intento1.putExtras(bundle);
                    //now put title and description to another activity
                    intento1.putExtra("title", mTitle[0]);
                    intento1.putExtra("description", mDescription[0]);
                    intento1.putExtra("detalle", mDetalle[0]);
                    //also put your position
                    intento1.putExtra("position", ""+0);
                    startActivity(intento1);


                    Toast.makeText(MainActivity_Expositores.this, "Nick Law Description",Toast.LENGTH_LONG).show();
                }
                if (position == 1){
                    Intent intento1 = new Intent(getApplicationContext(),MainActivityDetalle.class);
                    //this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intento1.putExtras(bundle);
                    //now put title and description to another activity
                    intento1.putExtra("title", mTitle[1]);
                    intento1.putExtra("description", mDescription[1]);
                    intento1.putExtra("detalle", mDetalle[1]);
                    //also put your position
                    intento1.putExtra("position", ""+1);
                    startActivity(intento1);
                    Toast.makeText(MainActivity_Expositores.this, "Kwon Oh-hyun Description",Toast.LENGTH_LONG).show();
                }
                if (position == 2){
                    Intent intento1 = new Intent(getApplicationContext(),MainActivityDetalle.class);
                    //this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intento1.putExtras(bundle);
                    //now put title and description to another activity
                    intento1.putExtra("title", mTitle[2]);
                    intento1.putExtra("description", mDescription[2]);
                    intento1.putExtra("detalle", mDetalle[2]);
                    //also put your position
                    intento1.putExtra("position", ""+2);
                    startActivity(intento1);
                    Toast.makeText(MainActivity_Expositores.this, "Pekka Lundmark Description",Toast.LENGTH_LONG).show();
                }
                if (position == 3){
                    Intent intento1 = new Intent(getApplicationContext(),MainActivityDetalle.class);
                    //this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intento1.putExtras(bundle);
                    //now put title and description to another activity
                    intento1.putExtra("title", mTitle[3]);
                    intento1.putExtra("description", mDescription[3]);
                    intento1.putExtra("detalle", mDetalle[3]);
                    //also put your position
                    intento1.putExtra("position", ""+3);
                    startActivity(intento1);
                    Toast.makeText(MainActivity_Expositores.this, "Lei Jun Description",Toast.LENGTH_LONG).show();
                }
                if (position == 4){
                    Intent intento1 = new Intent(getApplicationContext(),MainActivityDetalle.class);
                    //this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intento1.putExtras(bundle);
                    //now put title and description to another activity
                    intento1.putExtra("title", mTitle[4]);
                    intento1.putExtra("description", mDescription[4]);
                    intento1.putExtra("detalle", mDetalle[4]);
                    //also put your position
                    intento1.putExtra("position", ""+4);
                    startActivity(intento1);
                    Toast.makeText(MainActivity_Expositores.this, "Greg Brown Description",Toast.LENGTH_LONG).show();
                }
                if (position == 5){
                    Intent intento1 = new Intent(getApplicationContext(),MainActivityDetalle.class);
                    //this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[5]);
                    intento1.putExtras(bundle);
                    //now put title and description to another activity
                    intento1.putExtra("title", mTitle[5]);
                    intento1.putExtra("description", mDescription[5]);
                    intento1.putExtra("detalle", mDetalle[5]);
                    //also put your position
                    intento1.putExtra("position", ""+5);
                    startActivity(intento1);
                    Toast.makeText(MainActivity_Expositores.this, "Ren Zhengfei Description",Toast.LENGTH_LONG).show();
                }
                if (position == 6){
                    Intent intento1 = new Intent(getApplicationContext(),MainActivityDetalle.class);
                    //this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[6]);
                    intento1.putExtras(bundle);
                    //now put title and description to another activity
                    intento1.putExtra("title", mTitle[6]);
                    intento1.putExtra("description", mDescription[6]);
                    intento1.putExtra("detalle", mDetalle[6]);
                    //also put your position
                    intento1.putExtra("position", ""+6);
                    startActivity(intento1);
                    Toast.makeText(MainActivity_Expositores.this, "Koo Kwang Mo Description",Toast.LENGTH_LONG).show();
                }

            }
        });
        //so item click is done check


        //image to go back to start
        imgInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intento1 = new Intent(MainActivity_Expositores.this,MainActivity.class);
                startActivity(intento1);
            }
        });



    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];
        int rImgs2[];


        MyAdapter (Context c, String title[], String description[], int imgs[], int imgs2[]){
            super(c, R.layout.layout_expositores, R.id.txt1, title );
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
            this.rImgs2 = imgs2;


        }

        public  View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout_expositores = layoutInflater.inflate(R.layout.layout_expositores, parent, false);
            ImageView images = layout_expositores.findViewById(R.id.img1);
            TextView myTitle = layout_expositores.findViewById(R.id.txt1);
            TextView myDescription = layout_expositores.findViewById(R.id.txt2);
            ImageView images2 = layout_expositores.findViewById(R.id.img2);

            //now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            images2.setImageResource(rImgs2[position]);



                    return layout_expositores;

        }

    }
}




