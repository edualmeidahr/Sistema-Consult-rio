package Pessoas;

public class Pessoa{
    //Atributos
    private String nome;
    private char sexo;
    private String endereco;
    private String cpf;
    private String telefone;
    private int identidade;

    //Construtor
    public Pessoa(String nome, char sexo, String endereco, String cpf, String telefone, int identidade){
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.identidade = identidade;
    }
 
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentidade() {
        return identidade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    
//Metodos

    public void imprimirPessoa(){
        System.out.println("Nome: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Endereço: "+endereco);
        System.out.println("CPF: "+cpf);
        System.out.println("Telefone: "+telefone);
        System.out.println("Identidade: "+identidade);
    }
}