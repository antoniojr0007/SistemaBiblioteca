/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Vitor
 */
public class Emprestimo {
    
    private String cpf;
    private String codlivro;

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the codlivro
     */
    public String getCodlivro() {
        return codlivro;
    }

    /**
     * @param codlivro the codlivro to set
     */
    public void setCodlivro(String codlivro) {
        this.codlivro = codlivro;
    }
}
