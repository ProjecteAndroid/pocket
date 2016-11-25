package victorlopezapps.basededades;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

/**
 * Created by victor on 22/11/2016.
 */

public class MyDB extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Ingresos.db";
    /*private static final String TABLA_INGRESOS = "Ingresos";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_IMPORT = "Import";
    private static final String COLUMN_DESCRIPCIO = "Descripcio";
    private static final String COLUMN_DATA = "Data";
/* Crea la tabla con sus columnas */
    private static final String SQL_CREATE_TABLES =
            "CREATE TABLE " + Ingresos.ingresos.TABLE_NAME + " (" +
                    Ingresos.ingresos._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    Ingresos.ingresos.COLUMN_IMPORT + " INTEGER, " +
                    Ingresos.ingresos.COLUMN_DESCRIPCIO + " TEXT, " +
                    Ingresos.ingresos.COLUMN_DATA + " TEXT);";



    public MyDB(Context context, String ingresos, Object o, int i) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_TABLES);
/* Ejecuta la tabla por primera vez */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + Ingresos.ingresos.TABLE_NAME);
        onCreate(db);

    }
/*
    *//* Añadir ingresos *//*

    public void addIngres (Ingresos ingresos) {
        *//* Android utiliza una clase llamada "Content Values" para almacenar los valores de las columnas.
           Se utiliza getWritableDatabase para escribir en la base de datos *//*
        ContentValues values = new ContentValues();
        values.put(COLUMN_IMPORT,ingresos.getImport());
        values.put(COLUMN_DESCRIPCIO,ingresos.getDescripcio());
        values.put(COLUMN_DATA, ingresos.getData());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLA_INGRESOS,null,values);
        db.close();
    }

    *//* Borrar ingresos *//*

    public void borrarIngreso (int ingres_id){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLA_INGRESOS + " WHERE " + COLUMN_ID + " = " + ingres_id + ";");
        db.close();
    }*/




}
