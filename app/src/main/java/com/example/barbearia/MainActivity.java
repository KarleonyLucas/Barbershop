package com.example.barbearia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double vdegrademaquina,vbigode,vdegradernavalhado,vsocial,vbarba,vluzes,vtotal;
    CheckBox cb_DM;
    CheckBox cb_DN;
    CheckBox cb_Bi;
    CheckBox cb_BA;
    CheckBox cb_SO;
    CheckBox cb_LU;
    TextView tv_total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb_DM = findViewById(R.id.cb_DM);
        cb_DN = findViewById(R.id.cb_DN);
        cb_Bi = findViewById(R.id.cb_Bi);
        cb_BA = findViewById(R.id.cb_BA);
        cb_SO = findViewById(R.id.cb_SO);
        cb_LU= findViewById(R.id.cb_LU);
        tv_total = findViewById(R.id.tv_total);
        vdegrademaquina = 20;
        vbigode = 10;
        vdegradernavalhado = 25;
        vsocial = 20;
        vbarba = 10;
        vluzes = 35;
        cb_DM.setText(cb_DM.getText().toString()+vdegrademaquina);
        cb_DN.setText(cb_DN.getText().toString()+vdegradernavalhado);
        cb_Bi.setText(cb_Bi.getText().toString()+vbigode);
        cb_BA.setText(cb_BA.getText().toString()+vbarba);
        cb_SO.setText(cb_SO.getText().toString()+vsocial);
        cb_LU.setText(cb_LU.getText().toString()+vluzes);
    }
    public void calcular(View v){
       vtotal = 0.0;
       if(cb_DM.isChecked()){
          vtotal+= vdegrademaquina;
       }
       if(cb_DN.isChecked()){
           vtotal+= vdegradernavalhado;
       }
       if(cb_Bi.isChecked()){
           vtotal+=vbigode;
       }
       if(cb_BA.isChecked()){
           vtotal+=vbarba;
       }
       if(cb_LU.isChecked()){
           vtotal+=vluzes;
       }
       if(cb_SO.isChecked()){
           vtotal+=vsocial;
       }
       tv_total.setText("valor total :R$"+vtotal);
    }
}