/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */

package br.edu.fateczl.professorsalario;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.fateczl.professorsalario.model.ProfessorHorista;
import br.edu.fateczl.professorsalario.model.ProfessorTitular;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbTitular, rbHorista;
    private EditText etAnos, etHoras;
    private Button btnCalcular;
    private TextView tvSalario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAnos = findViewById(R.id.etAnos);
        etHoras = findViewById(R.id.etHoras);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvSalario = findViewById(R.id.tvSalario);
        rbTitular = findViewById(R.id.rbTitular);
        rbTitular.setChecked(true);
        rbHorista = findViewById(R.id.rbHorista);

        btnCalcular.setOnClickListener(v -> calcularSalario());
    }

    private void calcularSalario() {
        double salario = 0;

        if (rbTitular.isChecked()) {
            if (!etAnos.getText().toString().isEmpty()) {
                ProfessorTitular titular = new ProfessorTitular();
                int anos = Integer.parseInt(etAnos.getText().toString());
                titular.setAnosInstituicao(anos);
                salario = titular.calcularSalario();
            }
        } else if (rbHorista.isChecked()) {
            if (!etHoras.getText().toString().isEmpty()) {
                ProfessorHorista horista = new ProfessorHorista();
                int horas = Integer.parseInt(etHoras.getText().toString());
                horista.setHorasAula(horas);
                salario = horista.calcularSalario();
            }
        }
        tvSalario.setText(String.format("R$ %.2f", salario));
    }
}
