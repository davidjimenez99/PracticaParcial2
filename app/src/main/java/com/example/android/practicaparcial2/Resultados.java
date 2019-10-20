package com.example.android.practicaparcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    int punt1=0;
    int punt2=0;
    int punt3=0;
    int punt4=0;
    int punt5=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        int[] dados = new int[5];

        Bundle extras = getIntent().getExtras();
        dados[0] = Integer.parseInt(extras.getString("dado1"));
        dados[1] = Integer.parseInt(extras.getString("dado2"));
        dados[2] = Integer.parseInt(extras.getString("dado3"));
        dados[3] = Integer.parseInt(extras.getString("dado4"));
        dados[4] = Integer.parseInt(extras.getString("dado5"));

        /*for(int i=0;i<dados.length;i++)
            System.out.println(dados[i]);*/


        for (int i = 0; i < dados.length; i++) {                            //ARREGLAR SWITCH CASE QUE NO SE SOBREESCRIBA
            switch (dados[i]) {
                case 1:
                    punt1 += 1;
                    break;
                case 2:
                    punt2 += 2;
                    break;
                case 3:
                    punt3 += 3;
                    break;
                case 4:
                    punt4 += 4;
                    break;
                case 5:
                    punt5 += 5;
                    break;
            }
        }

        TextView t1 = findViewById(R.id.tv1);
        TextView t2 = findViewById(R.id.tv2);
        TextView t3 = findViewById(R.id.tv3);
        TextView t4 = findViewById(R.id.tv4);
        TextView t5 = findViewById(R.id.tv5);
        TextView tot = findViewById(R.id.tPuntosTotales);

        t1.setText(Integer.toString(punt1));
        t2.setText(Integer.toString(punt2));
        t3.setText(Integer.toString(punt3));
        t4.setText(Integer.toString(punt4));
        t5.setText(Integer.toString(punt5));
        int puntosTotales = punt1 + punt2 + punt3 + punt4 + punt5;

        boolean igual5, igual4, igual3;
        //CHECAR SI HAY 3, 4 O 5 IGUALES Y SUMAR PUNTOS
        if (dados[0] == dados[1] || dados[1] == dados[2] || dados[2] == dados[3] || dados[3] == dados[4] || dados[4] == dados[5]){//CHECA SI LOS 5 SON IGUALES
            puntosTotales += 40;
            igual5=true;
        }




        tot.setText("Puntos: "+puntosTotales);

    }




    public void tirarNuevamente(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
