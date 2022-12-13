package com.fresale.massecorporelle2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ET_saisieTaille;
    private EditText ET_saisiePoids;
    private Button BT_calcul;
    private Button BT_effacer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ET_saisieTaille = findViewById(R.id.main_talle_edittext);
       ET_saisiePoids = findViewById(R.id.main_poid_edittext);
       BT_calcul = findViewById(R.id.main_calculer_filledButton);
       BT_effacer = findViewById(R.id.main_effacer_outlinedButton);

       BT_calcul.setEnabled(false);


    }

    @Override
    protected void onStart() {
        super.onStart();

        ET_saisieTaille.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        BT_effacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetFields();
            }
        });
    }

    private void resetFields() {
        ET_saisieTaille.setText("");
        ET_saisiePoids.setText("");
        BT_calcul.setEnabled(false);
        ET_saisieTaille.requestFocus();
    }
}