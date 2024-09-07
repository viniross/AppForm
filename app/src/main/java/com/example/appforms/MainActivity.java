package com.example.appforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTxtNome = findViewById(R.id.editTxtNome);
        EditText editTxtIdade = findViewById(R.id.editTxtIdade);
        EditText editTxtCPF = findViewById(R.id.editTxtCPF);
        EditText editTxtEmail= findViewById(R.id.editTxtEmail);
        Button btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = editTxtNome.getText().toString();
                String idade = editTxtIdade.getText().toString();
                String cpf = editTxtCPF.getText().toString();
                String email = editTxtEmail.getText().toString();

                Intent tela2 = new Intent(getApplicationContext(), ResultadoActivity.class);
                tela2.putExtra("nome", nome);
                tela2.putExtra("idade", idade);
                tela2.putExtra("cpf", cpf);
                tela2.putExtra("email", email);
                startActivity(tela2);
            }
        });
    }
}