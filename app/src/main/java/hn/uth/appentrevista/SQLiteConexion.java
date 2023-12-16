package hn.uth.appentrevista;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import hn.uth.appentrevista.transacciones.Transacciones;

public class SQLiteConexion extends SQLiteOpenHelper {

    public SQLiteConexion(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, dbname, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {db.execSQL(Transacciones.CreateTableImagen);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Transacciones.DropeTableImagen);
        onCreate(db);
    }

    public Cursor getAll() {
        return(getReadableDatabase().rawQuery("SELECT * FROM imagen",null));
    }

    public void insert(byte[] bytes, String descripcionText, String nombreText, String fechaText)
    {
        ContentValues cv = new ContentValues();

        cv.put(Transacciones.blonImagen,bytes);
        cv.put(Transacciones.nombre,nombreText);
        cv.put(Transacciones.descripcion,descripcionText);
        cv.put(Transacciones.fecha,fechaText);
        Log.e("inserted", "inserted");
        getWritableDatabase().insert(Transacciones.tablaImagen,Transacciones.idOrden,cv);
    }
    public byte[] getImage(Cursor c)
    {
        return(c.getBlob(1));
    }
}
