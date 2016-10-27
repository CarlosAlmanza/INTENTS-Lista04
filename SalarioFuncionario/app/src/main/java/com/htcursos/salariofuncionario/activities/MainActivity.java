package com.htcursos.salariofuncionario.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.htcursos.salariofuncionario.R;
import com.htcursos.salariofuncionario.funcionario.Funcionario;
import com.htcursos.salariofuncionario.utils.Extras;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.htcursos.salariofuncionario.R.layout.activity_b;
import static com.htcursos.salariofuncionario.R.layout.activity_main;

/**
 * Created by carlos on 27/10/2016.
 */

public class MainActivity extends AppCompatActivity{

    Funcionario f = new Funcionario();

    @BindView(R.id.edit_nome)
    EditText nome;

    @BindView(R.id.edit_cargo)
    EditText cargo;

    @BindView(R.id.edit_salario)
    EditText salario;

    @BindView(R.id.btn)
    Button btn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        ButterKnife.bind(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f.setNome(nome.getText().toString());
                f.setCargo(cargo.getText().toString());
                f.setSalario(Double.parseDouble(salario.getText().toString()));

                Intent i = new Intent(MainActivity.this , Bactivity.class);
                i.putExtra(Extras.FUNC , f);
                startActivity(i);
            }
        });
    }
}
