/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

import javax.swing.JOptionPane;

/**
 *
 * @author Etec-User
 */
public class func {
    
    private String nome;
    private double salarioBase;
    private double bonificacao;
    private double salarioTotal;

    public func() {
    }

    public func(String nome, double salarioBase, double bonificacao, double salarioTotal) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonificacao = bonificacao;
        this.salarioTotal = salarioTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }
    
    public void cadastrarDados(String n, double salario) {
    
        nome = n;
        salarioBase = salario;
        
    }
    
    public void calcularBonificacao(){
        
        bonificacao = salarioBase * 0.10;
        
    }
    
    public void calcularSalarioTotal(){
        
        salarioTotal = salarioBase + bonificacao;
        
    }
    
    public void mostrarDados(){
   
        JOptionPane.showMessageDialog(null,"Nome: " + nome + "\n Salário Base" + salarioBase + "\nValor da Bonificação" + bonificacao + "\nSalario Total" + salarioTotal);
        
    }

    
}
