package victorlopezapps.basededades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonIngres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Busca dentro de la pantalla el boton con el id que le hemos dado */
        buttonIngres = (Button)findViewById(R.id.buttonIngres);
    }

    public void Ingres (View v) {

        Intent i = new Intent(this,ActivityIngresos2.class);
        startActivity(i);

    }


}
