package ContrutoresMultiplos.application.entitites;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += salario * porcentagem / 100;
    }

    public String toString() {
        return "Funcionario: "
                + getNome()
                + ", Salario: R$"
                + String.format("%.2f", getSalario());
    }
}
