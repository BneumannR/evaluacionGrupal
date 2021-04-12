package cl.douc.evaluaciongrupal2;

public class Estructura_BD {

    public static final String TABLE_NAME = "DatosProductos";
    public static final String COLUMN_codigo_Id= "codigo";
    public static final String COLUMN_Producto= "Producto";
    public static final String COLUMN_Descripcion= "Descripcion";

    //}
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Estructura_BD.TABLE_NAME + " (" +
                    Estructura_BD.COLUMN_codigo_Id + " INTEGER PRIMARY KEY," +
                    Estructura_BD.COLUMN_Producto+ " TEXT," +
                    Estructura_BD.COLUMN_Descripcion + " TEXT)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Estructura_BD.TABLE_NAME;
}
