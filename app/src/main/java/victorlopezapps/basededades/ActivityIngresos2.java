package victorlopezapps.basededades;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityIngresos2 extends AppCompatActivity {

    private Button buttonGuardar,buttonEnrere;
    private EditText editTextImport, editTextDescripcio, editTextData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos2);

        buttonEnrere = (Button) findViewById(R.id.buttonEnrere);
        buttonGuardar = (Button) findViewById(R.id.buttonGuardar);
        editTextImport = (EditText) findViewById(R.id.editTextImport);
        editTextDescripcio = (EditText) findViewById(R.id.editTextDescripcio);
        editTextData = (EditText) findViewById(R.id.editTextData);
    }

    public void Enrere (View view){

        finish();
    }

    public void Guardar (View view) {

        MyDB admin = new MyDB(this, "Ingresos", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String Import = editTextImport.getText().toString();
        String Descripcio = editTextDescripcio.getText().toString();
        String Data = editTextData.getText().toString();
        ContentValues values = new ContentValues();
        values.put("COLUMN_IMPORT",Import);
        values.put("COLUMN_DESCRIPCIO",Descripcio);
        values.put("COLUMN_DATA", Data);
        db.insert("Ingresos",null,values);
        db.close();
        editTextImport.setText("");
        editTextDescripcio.setText("");
        editTextData.setText("");
        Toast.makeText(this, "Se guardaron los datos de la persona",
                Toast.LENGTH_SHORT).show();
    }
}
