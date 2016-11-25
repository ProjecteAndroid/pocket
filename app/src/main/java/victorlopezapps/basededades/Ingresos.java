package victorlopezapps.basededades;

import android.provider.BaseColumns;

import java.util.UUID;

/**
 * Created by victor on 22/11/2016.
 */


public final class Ingresos {

    private Ingresos(){

    }

    public static class ingresos implements BaseColumns {


        public static final String TABLE_NAME = "TABLA_INGRESOS";
        public static final String COLUMN_IMPORT = "Import";
        public static final String COLUMN_DESCRIPCIO = "Descripcio";
        public static final String COLUMN_DATA = "Data";



    }



}


