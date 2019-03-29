package entities;

public class contaBancaria {
    private int numConta;
    private String nome;
    private double valor;

    public contaBancaria(int numConta, String nome, double valor){
        this.numConta = numConta;
        this.nome = nome;
        fazerDeposito(valor);
    }

    public contaBancaria(int numConta, String nome){
        this.numConta = numConta;
        this.nome = nome;
    }

    public int getNumConta(){
        return numConta;
    }

    public String getNomeTitular(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValor(){
        return this.valor;
    }

    public void fazerDeposito(double deposito){
        this.valor+=deposito;
    }

    public void fazerSaque(double saque){
        this.valor-=(saque+5);
    }

    public String toString(){
        return "Numero da Conta: " +
                this.numConta +
                ", Nome do Titular: " +
                this.nome +
                ", Valor: " +
                this.valor;
    }


}
