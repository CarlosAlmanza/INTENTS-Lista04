package com.htcursos.salariofuncionario.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.htcursos.salariofuncionario.R;
import com.htcursos.salariofuncionario.funcionario.Calculos;
import com.htcursos.salariofuncionario.funcionario.Funcionario;
import com.htcursos.salariofuncionario.utils.Extras;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by carlos on 27/10/2016.
 */

public class Bactivity extends AppCompatActivity{

    @BindView(R.id.text_nome)
    TextView nome;

    @BindView(R.id.text_cargo)
    TextView cargo;

    @BindView(R.id.text_salario)
    TextView salario;

    @BindView(R.id.bnt_voltar)
    Button bnt_voltar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ButterKnife.bind(this);

        if(getIntent().getExtras() != null && getIntent().getExtras().containsKey(Extras.FUNC)){
            Funcionario f = (Funcionario) getIntent().getExtras().get(Extras.FUNC);

            nome.setText(f.getNome());
            cargo.setText(f.getCargo());

            double novoSalario = Calculos.calculoSalario( f.getSalario() );
            salario.setText("R$ " + String.valueOf(novoSalario));
        }

        bnt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
