/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */


package br.edu.fateczl.registrocpf;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.fateczl.registrocpf.model.Pessoa;
import br.edu.fateczl.registrocpf.model.LocalRegistro;

public class MainActivity extends AppCompatActivity {

    private EditText etCPF;
    private EditText etNome;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCPF = findViewById(R.id.etCPF);
        etNome = findViewById(R.id.etNome);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(v -> {
            String cpf = etCPF.getText().toString();
            String nome = etNome.getText().toString();

            // Cria o objeto Pessoa
            Pessoa pessoa = new Pessoa(cpf, nome);

            // Cria o objeto LocalRegistro para determinar a localização com base no CPF
            LocalRegistro localReg = new LocalRegistro();
            String localRegistro = localReg.getLocalRegistro(pessoa.getCpf());

            // Inicia a nova Activity e passa os dados da Pessoa e localização
            Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
            intent.putExtra("cpf", pessoa.getCpf());
            intent.putExtra("nome", pessoa.getNome());
            intent.putExtra("local", localRegistro);
            startActivity(intent);
        });
    }
}
