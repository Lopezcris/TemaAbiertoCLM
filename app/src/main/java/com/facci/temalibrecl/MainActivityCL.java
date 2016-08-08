package com.facci.temalibrecl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityCL extends AppCompatActivity {
    double  subtotal=0.00;
    double iva=0.00;
    double total=0.00;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_cl);
    }
    public void Calcular(View v){
        String NombreProducto="";
        double PrecioUnitario=0.00;
        int Cantidad=0;

        EditText Nombre=(EditText)findViewById(R.id.ProductoET);
        EditText Precio=(EditText)findViewById(R.id.PrecioUnitarioET);
        EditText Cant=(EditText)findViewById(R.id.CatidadET);

        TextView Subtotal=(TextView)findViewById(R.id.ResultadoSuboTotalTV);
        TextView Iva=(TextView)findViewById(R.id.ResultadoIvaTV);
        TextView Total=(TextView)findViewById(R.id.ResultadoTotalTV);


        NombreProducto=Nombre.getText().toString();
        PrecioUnitario=Double.valueOf(Precio.getText().toString()).doubleValue();
        Cantidad=Integer.valueOf(Cant.getText().toString()).intValue();

        subtotal=subtotal+PrecioUnitario*Cantidad;
        iva=subtotal*0.12;
        total=subtotal+iva;

        Subtotal.setText(new Double(subtotal).toString());
        Iva.setText(new Double(iva).toString());
        Total.setText(new Double(total).toString());

        Nombre.setText(""); Precio.setText(""); Cant.setText("");
    }
}
