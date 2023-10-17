import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Pessoas.*;

public class Consultorio {
    Scanner scanner = new Scanner(System.in);
    private List <Medico> medicos = new ArrayList <Medico>();
    private List <Paciente> pacientes = new ArrayList <Paciente>();
    private List <Consulta> consultas = new ArrayList <Consulta>();
    private int contPaciente;
    private String telefone;
    private String endereco;
    private String nome;
    
    
//Getters e Setters 
    public List<Medico> getMedicos() {
        return medicos;
    }
    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    public int getContPaciente() {
        return contPaciente;
    }
    public void setContPaciente(int contPaciente) {
        this.contPaciente = contPaciente;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


//Metodos

    public void cadastrarPaciente(){
        System.out.println("Nome do paciente: ");
        String nome = scanner.nextLine();
        System.out.println("Sexo do paciente (M/F): ");
        char sexo = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Identidade:");
        int identidade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Relato do Paciente: ");
        String relato = scanner.nextLine();
        System.out.println("Medicação consumida regularmente:");
        String medicaoConsumidaRegularmente = scanner.nextLine();

        Paciente paciente = new Paciente(nome, sexo, endereco, cpf,telefone, identidade, relato, medicaoConsumidaRegularmente);

        pacientes.add(paciente);

        System.out.println("PACIENTE CADASTRADO COM SUCESSO!");
    }


    public void removerPaciente(){
        System.out.println("Digite o CPF do paciente que deseja remover: ");
        String cpf  = scanner.nextLine();

        for(Paciente paciente : pacientes){
            if(paciente.getCpf().equals(cpf)){
                pacientes.remove(paciente);
                System.out.println("PACIENTE REMOVIDO COM SUCESSO!");
                return;
            }
        }
        System.out.println("Nenhum paciente castrado nesse CPF");
    }


    public void cadastrarMedico(){
        System.out.println("Nome do medico: ");
        String nome = scanner.nextLine();
        System.out.println("Sexo do medico (M/F): ");
        char sexo = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Identidade:");
        int identidade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("CRM do medico: ");
        int crm = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Especialdade do medico:");
        String especialidade = scanner.nextLine();

        Medico medico = new Medico(nome, sexo, endereco, cpf,telefone, identidade, crm, especialidade);


        medicos.add(medico);

        System.out.println("MEDICO CADASTRADO COM SUCESSO!");
    }


      public void removerMedico(){
        System.out.println("Digite o crm do medico que deseja remover: ");
        int crm = scanner.nextInt();
        scanner.nextLine();

        for(Medico medico : medicos){
            if(medico.getCrm() == crm){
                medicos.remove(medico);
                System.out.println("MÉDICO REMOVIDO COM SUCESSO!");
                return;
            }
        }
        System.out.println("Nenhum medico castrado nesse CPF");
    }


        public void cadastrarConsulta(){
            System.out.println("Data da consulta: ");
            String data = scanner.nextLine();
            System.out.println("Horas:");
            String hora = scanner.nextLine();
            System.out.println("CPF do paciente:");
            String cpfPaciente = scanner.nextLine();  
            System.out.println("O CRM do medico:");
            int crmMedico = scanner.nextInt();
            scanner.nextLine();
            for (Paciente paciente : pacientes){
                for (Medico medico : medicos){
                    if(paciente.getCpf().equals(cpfPaciente) && medico.getCrm() == crmMedico){
                         Consulta consulta = new Consulta(data, hora, cpfPaciente, crmMedico);
                         consultas.add(consulta);
                         System.out.println("CONSULTA CADASTRADA COM SUCESSO!");
                         return;
                    }
                }
            }

            System.out.println("Paciente ou Medico não cadastrados!");


           
        }

        
        public void removerConsulta(){
            System.out.println("CPF do paciente: ");
            String cpfPaciente = scanner.nextLine();
            System.out.println("CRM do medico:");
            int crmMedico = scanner.nextInt();
            scanner.nextLine();

            for(Consulta consulta : consultas){
                if(consulta.getCpfPaciente().equals(cpfPaciente) && consulta.getCrmMedico() == crmMedico){
                    consultas.remove(consulta);
                    System.out.println("CONSULTA REMOVIDA COM SUCESSO!");
                }
            }
            System.out.println("Nenhum consulta encontrada com essas informações!");
        }


        public void imprimirListaDePaciente(){
            if(pacientes.isEmpty()){
                System.out.println("A lista está vazia");
            }else{
                for(Paciente paciente : pacientes){
                System.out.println("-------------------------------"); 
                paciente.imprimirPaciente();
                }
           }
        }
 

        public void imprimiListaDeMedicos(){
            if(medicos.isEmpty()){
                System.out.println("A lista está vazia!");
            }else{
                for(Medico medico : medicos){
                    System.out.println("-------------------------------"); 
                    medico.imprimirMedico();
                }
            }
        }


        public void imprimirListaDeConsultas(){
            if(consultas.isEmpty()){
                System.out.println("A lista está vazia!");
            }else{
                for(Consulta consulta : consultas){
                    System.out.println("-------------------------------"); 
                    consulta.imprimirConsulta();
                }
            }
        }
        
        
    }
