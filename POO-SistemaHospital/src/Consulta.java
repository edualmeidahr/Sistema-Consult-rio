public class Consulta {

//Atributos
   private String data;
   private String hora;
   private String cpfPaciente;
   private int crmMedico;

//Construtor
    public Consulta(String data, String hora, String cpfPaciente, int crmMedico){
        this.data = data;
        this.hora = hora;
        this.cpfPaciente = cpfPaciente;
        this.crmMedico = crmMedico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public int getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(int crmMedico) {
        this.crmMedico = crmMedico;
    }
    
    
//Metodos
    void imprimirConsulta(){
        System.out.println("Data: "+data);
        System.out.println("Hora: "+hora);
        System.out.println("CPF do Paciente: "+cpfPaciente);
        System.out.println("CRM do Medico: "+crmMedico);
    }
    
}
