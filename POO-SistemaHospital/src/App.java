import java.util.Scanner;
import Pessoas.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Consultorio consultorio = new Consultorio();
        while (true) {
            System.out.println("-----------------------MENU---------------------");
            System.out.println("1)Cadastrar Médico");
            System.out.println("2)Cadastrar Paciente");
            System.out.println("3)Cadastrar Consulta");
            System.out.println("4)Imprimir dados dos Médicos");
            System.out.println("5)Imprimir Consultas:");
            System.out.println("6)Imprimir dados dos Pacientes");
            System.out.println("7)Imprimir data, hora, paciente e medico de uma consulta");
            System.out.println("8)Remover Médico:");
            System.out.println("9)Remover Paciente");
            System.out.println("10)Remover Consulta");
            System.out.println("11) Sair");
            int op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    consultorio.cadastrarMedico();
                    break;

                case 2:
                    consultorio.cadastrarPaciente();
                    break;

                case 3:
                    consultorio.cadastrarConsulta();
                    break;

                case 4:
                    consultorio.imprimiListaDeMedicos();
                    break;

                case 5:
                    consultorio.imprimirListaDeConsultas();
                    break;

                case 6:
                    consultorio.imprimirListaDePaciente();
                    break;

                case 7:
                 System.out.println("Digite o CRM do Médico:");
                 int crm = scanner.nextInt();
                 scanner.nextLine();
                 System.out.println("CPF do paciente:");
                 String cpf = scanner.nextLine();
                 consultorio.imprimirUmaConsulta(crm, cpf);
                 break;
                case 8:
                    consultorio.removerMedico();
                    break;

                case 9:
                    consultorio.removerPaciente();
                    break;

                case 10:
                    consultorio.removerConsulta();
                    break;

                case 11:
                    scanner.close();
                    return;

                default:
                    System.out.println("Valor Inválido");

            }
            
        }
    }
}
