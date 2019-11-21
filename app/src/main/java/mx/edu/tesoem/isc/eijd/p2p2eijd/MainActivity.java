package mx.edu.tesoem.isc.eijd.p2p2eijd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<String> listaEstados;
String[] strEstados;
Spinner objSpinner;
ArrayAdapter<String> listEstados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objSpinner = findViewById(R.id.cargalista);
        strEstados = new String[]
                {
                        "AGUASCALIENTE",
                        "BAJA CALIFORNIA",
                        "BAJA CALIFORNIA SUR",
                        "CAMPECHE",
                        "CDMX",
                        "CHIAPAS",
                        "CHIHUAHUA",
                        "COAHUILA DE ZARAGOZA",
                        "COLIMA",
                        "DURANGO",
                        "GUANAJUATO",
                        "GUERRERO",
                        "HIDALGO",
                        "JALISCO",
                        "ESTADO DE MÉXICO",
                        "MICHOACAN DE OCAMPO",
                        "MORELOS",
                        "NAYARIT",
                        "NUEVO LEÓN",
                        "OAXACA",
                        "PUEBLA",
                        "QUERETARO DE ARTEAGA",
                        "QUINTANA ROO",
                        "SAN LUIS POTOSI",
                        "SINALOA",
                        "SONORA",
                        "TABASCO",
                        "TAMAULIPAS",
                        "TLAXCALA",
                        "VERACRUZ",
                        "YUCATAN",
                        "ZACATECAS"
                };
        listaEstados = new ArrayList<String>();
        Collections.addAll(listaEstados,strEstados);
        listEstados = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,listaEstados);
        objSpinner.setAdapter(listEstados);
        };
    }
