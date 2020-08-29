/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apphelpus;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author igor
 */
public class Clientes {
    
    
    private String Nome;
    private String CPF;
    private String DataNascimento;
    private String Endereço;
    private String complemento;
    private String CEP;
    private String Telefone;
    private String Celular;
    private String Email;
    private String Usuario;
    private String Senha;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
     public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
     public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    public String salvar(){
        
        try {
            FileWriter fw = new FileWriter("Clientes.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: " +this.Nome);
            pw.println("CPF: " +this.CPF);
            pw.println("Data de nascimento: " +this.DataNascimento);
            pw.println("Endereço: "+this.Endereço);
            pw.println("Complemento: "+this.complemento);
            pw.println("CEP: "+this.CEP);
            pw.println("Telefone: "+this.Telefone);
            pw.println("Celular: "+this.Celular);
            pw.println("Email: "+this.Email);
            pw.println("Usuario: " +this.Usuario);
            pw.println("Senha: " +this.Senha);
            pw.println("");
            pw.println("");
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return "Cadastrado com sucesso";
    }
    
    
}
