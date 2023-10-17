package Pessoas;

public class Medico extends Pessoa{
   //Atributos
     private int crm;
     private String especialidade;
    
    
    
 //Construtor   
    public Medico(String nome, char sexo, String endereco, String cpf,
     String telefone, int identidade, int crm, String especialidade) {
        super(nome, sexo, endereco, cpf, telefone, identidade);
        this.crm = crm;
        this.especialidade = especialidade;
    }



//Getters e Setters 
    public int getCrm() {
        return crm;
    }




    public void setCrm(int crm) {
        this.crm = crm;
    }




    public String getEspecialidade() {
        return especialidade;
    }




    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

//Metodos

    public void imprimirMedico(){
        imprimirPessoa();
        System.out.println("CRM: "+crm);
        System.out.println("Especialidade do Médico: "+especialidade);

    }



    
    
    
}
