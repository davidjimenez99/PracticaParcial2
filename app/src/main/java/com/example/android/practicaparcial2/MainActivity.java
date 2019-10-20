package com.example.android.practicaparcial2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1, c2, c3, c4, c5;
    ImageView dado1, dado2, dado3, dado4, dado5;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = findViewById(R.id.check1);
        c2 = findViewById(R.id.check2);
        c3 = findViewById(R.id.check3);
        c4 = findViewById(R.id.check4);
        c5 = findViewById(R.id.check5);

        dado1 = findViewById(R.id.dado1);
        dado2 = findViewById(R.id.dado2);
        dado3 = findViewById(R.id.dado3);
        dado4 = findViewById(R.id.dado4);
        dado5 = findViewById(R.id.dado5);
    }


    public void tirarTodos(View v) {
        cont++;
        if (cont == 2) {
            //result.putExtra("STRING_I_NEED", strName);        Datos a mandar
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("¿Estás seguro?");
            builder1.setCancelable(false);
            final Intent result = new Intent(this, Resultados.class);
            builder1.setPositiveButton(
                    "Aceptar",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            int rand1 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
                            switch (rand1) {
                                case 1:
                                    dado1.setImageResource(R.drawable.d1);
                                    dado1.setTag(1);
                                    break;
                                case 2:
                                    dado1.setImageResource(R.drawable.d2);
                                    dado1.setTag(2);
                                    break;
                                case 3:
                                    dado1.setImageResource(R.drawable.d3);
                                    dado1.setTag(3);
                                    break;
                                case 4:
                                    dado1.setImageResource(R.drawable.d4);
                                    dado1.setTag(4);
                                    break;
                                case 5:
                                    dado1.setImageResource(R.drawable.d5);
                                    dado1.setTag(5);
                                    break;
                                case 6:
                                    dado1.setImageResource(R.drawable.d6);
                                    dado1.setTag(6);
                                    break;
                            }
                            int rand2 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
                            switch (rand2) {
                                case 1:
                                    dado2.setImageResource(R.drawable.d1);
                                    dado2.setTag(1);
                                    break;
                                case 2:
                                    dado2.setImageResource(R.drawable.d2);
                                    dado2.setTag(2);
                                    break;
                                case 3:
                                    dado2.setImageResource(R.drawable.d3);
                                    dado2.setTag(3);
                                    break;
                                case 4:
                                    dado2.setImageResource(R.drawable.d4);
                                    dado2.setTag(4);
                                    break;
                                case 5:
                                    dado2.setImageResource(R.drawable.d5);
                                    dado2.setTag(5);
                                    break;
                                case 6:
                                    dado2.setImageResource(R.drawable.d6);
                                    dado2.setTag(6);
                                    break;
                            }
                            int rand3 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
                            switch (rand3) {
                                case 1:
                                    dado3.setImageResource(R.drawable.d1);
                                    dado3.setTag(1);
                                    break;
                                case 2:
                                    dado3.setImageResource(R.drawable.d2);
                                    dado3.setTag(2);
                                    break;
                                case 3:
                                    dado3.setImageResource(R.drawable.d3);
                                    dado3.setTag(3);
                                    break;
                                case 4:
                                    dado3.setImageResource(R.drawable.d4);
                                    dado3.setTag(4);
                                    break;
                                case 5:
                                    dado3.setImageResource(R.drawable.d5);
                                    dado3.setTag(5);
                                    break;
                                case 6:
                                    dado3.setImageResource(R.drawable.d6);
                                    dado3.setTag(5);
                                    break;
                            }
                            int rand4 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
                            switch (rand4) {
                                case 1:
                                    dado4.setImageResource(R.drawable.d1);
                                    dado4.setTag(1);
                                    break;
                                case 2:
                                    dado4.setImageResource(R.drawable.d2);
                                    dado4.setTag(2);
                                    break;
                                case 3:
                                    dado4.setImageResource(R.drawable.d3);
                                    dado4.setTag(3);
                                    break;
                                case 4:
                                    dado4.setImageResource(R.drawable.d4);
                                    dado4.setTag(4);
                                    break;
                                case 5:
                                    dado4.setImageResource(R.drawable.d5);
                                    dado4.setTag(5);
                                    break;
                                case 6:
                                    dado4.setImageResource(R.drawable.d6);
                                    dado4.setTag(6);
                                    break;
                            }
                            int rand5 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
                            switch (rand5) {
                                case 1:
                                    dado5.setImageResource(R.drawable.d1);
                                    dado5.setTag(1);
                                    break;
                                case 2:
                                    dado5.setImageResource(R.drawable.d2);
                                    dado5.setTag(2);
                                    break;
                                case 3:
                                    dado5.setImageResource(R.drawable.d3);
                                    dado5.setTag(3);
                                    break;
                                case 4:
                                    dado5.setImageResource(R.drawable.d4);
                                    dado5.setTag(4);
                                    break;
                                case 5:
                                    dado5.setImageResource(R.drawable.d5);
                                    dado5.setTag(5);
                                    break;
                                case 6:
                                    dado5.setImageResource(R.drawable.d6);
                                    dado5.setTag(6);
                                    break;
                            }

                            result.putExtra("dado1",dado1.getTag().toString());
                            result.putExtra("dado2",dado2.getTag().toString());
                            result.putExtra("dado3",dado3.getTag().toString());
                            result.putExtra("dado4",dado4.getTag().toString());
                            result.putExtra("dado5",dado5.getTag().toString());

                            startActivity(result);
                            dialog.cancel();
                        }
                    });
            builder1.setNegativeButton(
                    "Cancelar",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                            cont--;
                            return;
                        }
                    });

            AlertDialog alert1 = builder1.create();
            alert1.show();
        }
        else {
            //double x = (int)(Math.random()*((max-min)+1))+min;
            int rand1 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            switch (rand1) {
                case 1:
                    dado1.setImageResource(R.drawable.d1);
                    dado1.setTag(1);
                    break;
                case 2:
                    dado1.setImageResource(R.drawable.d2);
                    dado1.setTag(2);
                    break;
                case 3:
                    dado1.setImageResource(R.drawable.d3);
                    dado1.setTag(3);
                    break;
                case 4:
                    dado1.setImageResource(R.drawable.d4);
                    dado1.setTag(4);
                    break;
                case 5:
                    dado1.setImageResource(R.drawable.d5);
                    dado1.setTag(5);
                    break;
                case 6:
                    dado1.setImageResource(R.drawable.d6);
                    dado1.setTag(6);
                    break;
            }
            int rand2 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            switch (rand2) {
                case 1:
                    dado2.setImageResource(R.drawable.d1);
                    dado2.setTag(1);
                    break;
                case 2:
                    dado2.setImageResource(R.drawable.d2);
                    dado2.setTag(2);
                    break;
                case 3:
                    dado2.setImageResource(R.drawable.d3);
                    dado2.setTag(3);
                    break;
                case 4:
                    dado2.setImageResource(R.drawable.d4);
                    dado2.setTag(4);
                    break;
                case 5:
                    dado2.setImageResource(R.drawable.d5);
                    dado2.setTag(5);
                    break;
                case 6:
                    dado2.setImageResource(R.drawable.d6);
                    dado2.setTag(6);
                    break;
            }
            int rand3 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            switch (rand3) {
                case 1:
                    dado3.setImageResource(R.drawable.d1);
                    dado3.setTag(1);
                    break;
                case 2:
                    dado3.setImageResource(R.drawable.d2);
                    dado3.setTag(2);
                    break;
                case 3:
                    dado3.setImageResource(R.drawable.d3);
                    dado3.setTag(3);
                    break;
                case 4:
                    dado3.setImageResource(R.drawable.d4);
                    dado3.setTag(4);
                    break;
                case 5:
                    dado3.setImageResource(R.drawable.d5);
                    dado3.setTag(5);
                    break;
                case 6:
                    dado3.setImageResource(R.drawable.d6);
                    dado3.setTag(5);
                    break;
            }
            int rand4 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            switch (rand4) {
                case 1:
                    dado4.setImageResource(R.drawable.d1);
                    dado4.setTag(1);
                    break;
                case 2:
                    dado4.setImageResource(R.drawable.d2);
                    dado4.setTag(2);
                    break;
                case 3:
                    dado4.setImageResource(R.drawable.d3);
                    dado4.setTag(3);
                    break;
                case 4:
                    dado4.setImageResource(R.drawable.d4);
                    dado4.setTag(4);
                    break;
                case 5:
                    dado4.setImageResource(R.drawable.d5);
                    dado4.setTag(5);
                    break;
                case 6:
                    dado4.setImageResource(R.drawable.d6);
                    dado4.setTag(6);
                    break;
            }
            int rand5 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            switch (rand5) {
                case 1:
                    dado5.setImageResource(R.drawable.d1);
                    dado5.setTag(1);
                    break;
                case 2:
                    dado5.setImageResource(R.drawable.d2);
                    dado5.setTag(2);
                    break;
                case 3:
                    dado5.setImageResource(R.drawable.d3);
                    dado5.setTag(3);
                    break;
                case 4:
                    dado5.setImageResource(R.drawable.d4);
                    dado5.setTag(4);
                    break;
                case 5:
                    dado5.setImageResource(R.drawable.d5);
                    dado5.setTag(5);
                    break;
                case 6:
                    dado5.setImageResource(R.drawable.d6);
                    dado5.setTag(6);
                    break;
            }
        }

        Button lanzaSelec = findViewById(R.id.btnSelec);
        lanzaSelec.setEnabled(true);
        c1.setEnabled(true);
        c2.setEnabled(true);
        c3.setEnabled(true);
        c4.setEnabled(true);
        c5.setEnabled(true);

    }

    public void tirarSelec(View v) {
        if (c1.isChecked()) {
            int rand1 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            switch (rand1) {
                case 1:
                    dado1.setImageResource(R.drawable.d1);
                    dado1.setTag(1);
                    break;
                case 2:
                    dado1.setImageResource(R.drawable.d2);
                    dado1.setTag(2);
                    break;
                case 3:
                    dado1.setImageResource(R.drawable.d3);
                    dado1.setTag(3);
                    break;
                case 4:
                    dado1.setImageResource(R.drawable.d4);
                    dado1.setTag(4);
                    break;
                case 5:
                    dado1.setImageResource(R.drawable.d5);
                    dado1.setTag(5);
                    break;
                case 6:
                    dado1.setImageResource(R.drawable.d6);
                    dado1.setTag(6);
                    break;
            }
        }
        if (c2.isChecked()) {
            int rand2 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            switch (rand2) {
                case 1:
                    dado2.setImageResource(R.drawable.d1);
                    dado2.setTag(1);
                    break;
                case 2:
                    dado2.setImageResource(R.drawable.d2);
                    dado2.setTag(2);
                    break;
                case 3:
                    dado2.setImageResource(R.drawable.d3);
                    dado2.setTag(3);
                    break;
                case 4:
                    dado2.setImageResource(R.drawable.d4);
                    dado2.setTag(4);
                    break;
                case 5:
                    dado2.setImageResource(R.drawable.d5);
                    dado2.setTag(5);
                    break;
                case 6:
                    dado2.setImageResource(R.drawable.d6);
                    dado2.setTag(6);
                    break;
            }
        }
        if (c3.isChecked()) {
            int rand3 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            switch (rand3) {
                case 1:
                    dado3.setImageResource(R.drawable.d1);
                    dado3.setTag(1);
                    break;
                case 2:
                    dado3.setImageResource(R.drawable.d2);
                    dado3.setTag(2);
                    break;
                case 3:
                    dado3.setImageResource(R.drawable.d3);
                    dado3.setTag(3);
                    break;
                case 4:
                    dado3.setImageResource(R.drawable.d4);
                    dado3.setTag(4);
                    break;
                case 5:
                    dado3.setImageResource(R.drawable.d5);
                    dado3.setTag(5);
                    break;
                case 6:
                    dado3.setImageResource(R.drawable.d6);
                    dado3.setTag(5);
                    break;
            }
        }
        if (c4.isChecked()) {
            int rand4 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            switch (rand4) {
                case 1:
                    dado4.setImageResource(R.drawable.d1);
                    dado4.setTag(1);
                    break;
                case 2:
                    dado4.setImageResource(R.drawable.d2);
                    dado4.setTag(2);
                    break;
                case 3:
                    dado4.setImageResource(R.drawable.d3);
                    dado4.setTag(3);
                    break;
                case 4:
                    dado4.setImageResource(R.drawable.d4);
                    dado4.setTag(4);
                    break;
                case 5:
                    dado4.setImageResource(R.drawable.d5);
                    dado4.setTag(5);
                    break;
                case 6:
                    dado4.setImageResource(R.drawable.d6);
                    dado4.setTag(6);
                    break;
            }
        }
        if (c5.isChecked()) {
            int rand5 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            switch (rand5) {
                case 1:
                    dado5.setImageResource(R.drawable.d1);
                    dado5.setTag(1);
                    break;
                case 2:
                    dado5.setImageResource(R.drawable.d2);
                    dado5.setTag(2);
                    break;
                case 3:
                    dado5.setImageResource(R.drawable.d3);
                    dado5.setTag(3);
                    break;
                case 4:
                    dado5.setImageResource(R.drawable.d4);
                    dado5.setTag(4);
                    break;
                case 5:
                    dado5.setImageResource(R.drawable.d5);
                    dado5.setTag(5);
                    break;
                case 6:
                    dado5.setImageResource(R.drawable.d6);
                    dado5.setTag(6);
                    break;
            }
        }
        Intent result = new Intent(this, Resultados.class);

        //String tag=dado1.getTag().toString();
        //System.out.println(tag.getClass().getName());

        /*System.out.println("dado1: "+dado1.getTag().toString());
        System.out.println("dado2: "+dado2.getTag().toString());
        System.out.println("dado3: "+dado3.getTag().toString());
        System.out.println("dado4: "+dado4.getTag().toString());
        System.out.println("dado5: "+dado5.getTag().toString());*/

        result.putExtra("dado1",dado1.getTag().toString());
        result.putExtra("dado2",dado2.getTag().toString());
        result.putExtra("dado3",dado3.getTag().toString());
        result.putExtra("dado4",dado4.getTag().toString());
        result.putExtra("dado5",dado5.getTag().toString());

        startActivity(result);
    }



}
