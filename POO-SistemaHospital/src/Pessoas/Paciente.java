package Pessoas;

public class Paciente extends Pessoa{
//Atributos
    private String relato;
    private String medicacaoConsumidaRegularmente;
    
    
 //Construtor   
    public Paciente(String nome, char sexo, String endereco,
     String cpf, String telefone, int identidade, String relato, String medicacaoConsumidaRegularmente) {
        super(nome, sexo, endereco, cpf, telefone, identidade);
        this.relato = relato;
        this.medicacaoConsumidaRegularmente = medicacaoConsumidaRegularmente;
    }


//Getter e Setters 
    public String getRelato() {
        return relato;
    }



    public void setRelato(String relato) {
        this.relato = relato;
    }



    public String getMedicacaoConsumidaRegularmente() {
        return medicacaoConsumidaRegularmente;
    }



    public void setMedicacaoConsumidaRegularmente(String medicacaoConsumidaRegularmente) {
        this.medicacaoConsumidaRegularmente = medicacaoConsumidaRegularmente;
    }   

//Metodos

    public void imprimirPaciente(){
        imprimirPessoa();
        System.out.println("Relato: "+relato);
        System.out.println("Medicação Consumida Regularmente: "+ medicacaoConsumidaRegularmente);
    }

    
    
}
