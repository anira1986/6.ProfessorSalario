package br.edu.fateczl.professorsalario.model;

public class ProfessorTitular extends Professor {
    private int anosInstituicao;
    private double salarioBase = 3000.00d;

    public ProfessorTitular() {
        super();
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }


    @Override
    public double calcularSalario() {
        if (anosInstituicao < 5) {
            return salarioBase;
        } else {
            return salarioBase + (salarioBase * (anosInstituicao / 5) * 0.05);
        }
    }
}
