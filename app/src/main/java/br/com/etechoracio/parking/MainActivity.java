package br.com.etechoracio.parking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText lblQtdehoras;
    EditText lblVhora;
    EditText lblHadicional;
    TextView lblTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblQtdehoras = findViewById(R.id.lblQtdehoras);
        lblVhora = findViewById(R.id.lblVhora);
        lblHadicional = findViewById(R.id.lblHadicional);
        lblTotal = findViewById(R.id.lblTotal);
    }
    public void Calcular (View view){

        if(lblQtdehoras.getText().toString().isEmpty()
        || lblVhora.getText().toString().isEmpty()
        || lblHadicional.getText().toString().isEmpty()){

            Toast.makeText(this, "Digite todos os valores por favor!! ", Toast.LENGTH_LONG).show();

        } else {

            double Qtdehoras = Double.parseDouble(lblQtdehoras.getText().toString());
            double Vhora = Double.parseDouble(lblVhora.getText().toString());
            double Hadicional = Double.parseDouble(lblHadicional.getText().toString());
            double Total = Vhora + Hadicional * (Qtdehoras - 1);

            lblTotal.setText(String.valueOf(Total));

        }
    }
}
