package com.example.appforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView txtName = findViewById(R.id.txtName);
        TextView txtAge = findViewById(R.id.txtAge);
        TextView txtCpf = findViewById(R.id.txtCpf);
        TextView txtEMail = findViewById(R.id.txtEMail);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");
        String cpf = intent.getStringExtra("cpf");
        String email = intent.getStringExtra("email");
        txtName.setText(nome);
        txtAge.setText(idade);
        txtCpf.setText(cpf);
        txtEMail.setText(email);
    }
}
