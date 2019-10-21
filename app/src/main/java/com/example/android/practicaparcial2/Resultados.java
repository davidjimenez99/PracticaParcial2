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
    int punt6=0;
    int frec1=0;
    int frec2=0;
    int frec3=0;
    int frec4=0;
    int frec5=0;
    int frec6=0;
    boolean flag3=false;
    boolean flag4=false;
    boolean flag5=false;



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
                    frec1+=1;
                    break;
                case 2:
                    punt2 += 2;
                    frec2+=1;
                    break;
                case 3:
                    punt3 += 3;
                    frec3+=1;
                    break;
                case 4:
                    punt4 += 4;
                    frec4+=1;
                    break;
                case 5:
                    punt5 += 5;
                    frec5+=1;
                    break;
                case 6:
                    punt6+=6;
                    frec6+=1;
                    break;
            }
        }

        if(frec1==3 || frec2==3 || frec3==3 || frec4==3 || frec5==3 || frec6==3)
        {
            flag3=true;
        }
        else if (frec1==4 || frec2==4 || frec3==4 || frec4==4 || frec5==4 || frec6==4)
        {
            flag4=true;
        }
        else if (frec1==5 || frec2==5 || frec3==5 || frec4==5 || frec5==5 || frec6==5)
        {
            flag5=true;
        }

        TextView t1 = findViewById(R.id.tv1);
        TextView t2 = findViewById(R.id.tv2);
        TextView t3 = findViewById(R.id.tv3);
        TextView t4 = findViewById(R.id.tv4);
        TextView t5 = findViewById(R.id.tv5);
        TextView t6 = findViewById(R.id.tv6);
        TextView tot = findViewById(R.id.tPuntosTotales);
        TextView bonus = findViewById(R.id.txtBonus);

        t1.setText(Integer.toString(punt1));
        t2.setText(Integer.toString(punt2));
        t3.setText(Integer.toString(punt3));
        t4.setText(Integer.toString(punt4));
        t5.setText(Integer.toString(punt5));
        t6.setText(Integer.toString(punt6));
        int puntosTotales = punt1 + punt2 + punt3 + punt4 + punt5 + punt6;

        boolean igual5, igual4, igual3;
        //CHECAR SI HAY 3, 4 O 5 IGUALES Y SUMAR PUNTOS

        if (flag5)
        {
            puntosTotales += 40;
            bonus.setText("5 iguales: 40 puntos");

        }
        else if(flag4)
        {
            puntosTotales += 20;
            bonus.setText("4 iguales: 20 puntos");
        }
        else if(flag3)
        {
            puntosTotales += 10;
            bonus.setText("3 iguales: 10 puntos");
        }

        tot.setText("Puntos: "+puntosTotales);

    }




    public void tirarNuevamente(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
