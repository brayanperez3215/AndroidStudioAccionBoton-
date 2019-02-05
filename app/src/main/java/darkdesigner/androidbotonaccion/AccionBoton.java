package darkdesigner.androidbotonaccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class AccionBoton extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accion_boton);

        View boton = findViewById(R.id.botonID);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == findViewById(R.id.botonID).getId()) {

            TextView texto = (TextView) findViewById(R.id.textoID);
            texto.setText("vivir la vida la la la..");





        }

            //if (v.getId() == findViewById(R.id.botonID).getId()) {

               // TextView texto = (TextView) findViewById(R.id.textoID);
                //texto.setText("viva colombia");

            }
        }







