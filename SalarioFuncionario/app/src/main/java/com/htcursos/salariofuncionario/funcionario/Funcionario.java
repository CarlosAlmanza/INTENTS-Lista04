package com.htcursos.salariofuncionario.funcionario;

import java.io.Serializable;

/**
 * Created by carlos on 27/10/2016.
 */

public class Funcionario implements Serializable {

    private String nome;
    private String cargo;
    private double salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
