package br.edu.fateczl.professorsalario.model;

public class ProfessorHorista extends Professor {
    private int horasAula;
    private double valorHoraAula = 50.00d;

    public ProfessorHorista() {
        super();
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }


    @Override
    public double calcularSalario() {
        return horasAula * valorHoraAula;
    }
}
