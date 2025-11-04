package org.model.Funcionarios;

public class Desenvolvedor extends Funcionario{

    private double salarioBase;
    private int anosExperiencia;
    private String linguagemPreferida;

    public Desenvolvedor(String nome, String matricula, double salarioBase, int anosExperiencia, String linguagemPreferida) {
        super(nome, matricula);
        this.salarioBase = salarioBase;
        this.anosExperiencia = anosExperiencia;
        this.linguagemPreferida = linguagemPreferida;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.10 * anosExperiencia);
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Desenvolvedor " + nome + " está codificando em " + linguagemPreferida + ".");
    }
}
