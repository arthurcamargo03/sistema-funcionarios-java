package model;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int idade;

    public Funcionario(String nome, String cpf, double salario, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    // Aumento de salário em porcentagem
    public void aplicarAumento(double porcentagem) {
        this.salario += this.salario * (porcentagem / 100);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %s | Idade: %d | Salário: R$ %.2f",
                nome, cpf, idade, salario);
    }
}