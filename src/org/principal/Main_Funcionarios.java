package org.principal;

import org.model.Funcionarios.Desenvolvedor;
import org.model.Funcionarios.Estagiario;
import org.model.Funcionarios.Funcionario;
import org.model.Funcionarios.Gerente;

import java.util.ArrayList;

public class Main_Funcionarios {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando funcionários diferentes
        funcionarios.add(new Gerente("Ana Souza", "G001", 8000.0, 2000.0));
        funcionarios.add(new Desenvolvedor("Carlos Lima", "D101", 5000.0, 3, "Java"));
        funcionarios.add(new Estagiario("Marina Alves", "E501", 1500.0));

        // Iterando sobre os funcionários
        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.getNome() + " (Matrícula: " + f.getMatricula() + ")");
            f.realizarTarefa();
            System.out.println("Salário: R$ " + f.calcularSalario());
            System.out.println("--------------------------------------");
        }
    }
}