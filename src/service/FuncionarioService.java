package service;

import model.Funcionario;
import model.exception.FuncionarioException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionar(Funcionario f) {
        if (f.getSalario() < 0) {
            throw new FuncionarioException("Salário não pode ser negativo!");
        }
        if (f.getIdade() < 18) {
            throw new FuncionarioException("Funcionário deve ter mais de 18 anos!");
        }
        funcionarios.add(f);
    }

    public void remover(String cpf) {
        Funcionario encontrado = buscarPorCpf(cpf);
        funcionarios.remove(encontrado);
    }

    public Funcionario buscarPorCpf(String cpf) {
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                return f;
            }
        }
        throw new FuncionarioException("Funcionário com CPF " + cpf + " não encontrado.");
    }

    public List<Funcionario> listarTodos() {
        return funcionarios;
    }

    public double calcularFolhaSalarial() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.getSalario();
        }
        return total;
    }

    public void aplicarAumentoGeral(double porcentagem) {
        for (Funcionario f : funcionarios) {
            f.aplicarAumento(porcentagem);
        }
    }
}