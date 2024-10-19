/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */


package br.edu.fateczl.registrocpf;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    private TextView tvResultado;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvResultado = findViewById(R.id.tvResultado);
        btnVoltar = findViewById(R.id.btnVoltar);

        // Recebe os dados passados da MainActivity
        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String cpf = intent.getStringExtra("cpf");
        String local = intent.getStringExtra("local");

        // Exibe os dados na TextView
        tvResultado.setText("Nome: " + nome + "\nCPF: " + cpf + "\nLocal de Registro: " + local);

        // Configura o comportamento do botão Voltar
        btnVoltar.setOnClickListener(view -> {
            finish(); // Apenas fecha a ResultadoActivity e retorna à MainActivity
        });
    }
}
