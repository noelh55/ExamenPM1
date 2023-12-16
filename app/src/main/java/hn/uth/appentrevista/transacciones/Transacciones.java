package hn.uth.appentrevista.transacciones;

public class Transacciones {
    public static final String tablaImagen = "imagen";
    public static final String idOrden = "idOrden";
    public static final String blonImagen = "blonImagen";
    public static String nombre = "nombre";
    public static final String descripcion = "descripcion";
    public static String fecha = "fecha";

    public static final String CreateTableImagen =
            "CREATE TABLE imagen(idOrden INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "blonImagen BLOB, nombre TEXT, descripcion TEXT, fecha TEXT)";
    public static final String DropeTableImagen =
            "DROPE TABLE IF EXISTS imagen";

    /* Base de Datos */
    public static final String NameDataBase = "dbimagenes";
}
