package model;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cpf, double salario, int idade, double bonus) {
        super(nome, cpf, salario, idade);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public double calcularSalarioTotal() {
        return getSalario() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Bônus: R$ %.2f | Total: R$ %.2f",
                bonus, calcularSalarioTotal());
    }
}