/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

import javax.swing.JOptionPane;

/**
 *
 * @author braga
 */
public class gerente extends func{
    
    private double gratificacao;

    public gerente() {
    }

    public gerente(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public gerente(String nome, double salarioBase, double bonificacao, double salarioTotal, double gratificacao) {
        super(nome, salarioBase, bonificacao, salarioTotal);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public void cadastrarGerente (String n, double salario, double gratificacao ){
        
        this.setNome(n);
        this.setSalarioBase(salario);
        this.gratificacao = gratificacao;
       
    }
    
    public void calcularSalarioTotalG (){
        
         this.setSalarioTotal(gratificacao+this.getSalarioBase() + this.getBonificacao());
               
    }
    
    public void mostrarDadosGerente () {
        JOptionPane.showMessageDialog(null,"Nome: " + this.getNome() + "\n Salário Base" + this.getSalarioBase() + "\nValor da Bonificação" + this.getBonificacao() + "\nSalario Total" + this.getSalarioTotal() + "\nValor da Gratificação" + gratificacao);                      
    }
    
    
    
    
    
    
}
