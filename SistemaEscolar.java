import java.util.Scanner;

class Estudante {
    public void cadastroEstudante(int id, String nome, String sobrenome, int idade, String endereco, String email, String senha) {
        //registrar no BD
    }
}

class Curso {
    public void cadastroCurso(String id, String nome, String credAula, String credTrab, String docente, String instituto) {
        //regitrar no BD
    }
}

class Menu {
    Scanner input = new Scanner(System.in);
    int escolha = 0;
    boolean exit = false;

    public void menu() {
        do {
            do {
                System.out.println("__________________MENU__________________");
                System.out.println("1 - Matricular novo aluno na instituição");
                System.out.println("2 - Desmatricular aluno da Instituição");
                System.out.println("3 - Cadastrar novo curso na Instituição");
                System.out.println("4 - Excluir curso da Instituição");
                System.out.println("5 - Matricular aluno em curso");
                System.out.println("6 - Desmatricular aluno de curso");
                System.out.println("7 - Sair");
                
                escolha = input.nextInt();
                input.nextLine();
            } while (escolha < 1 || escolha > 7);

            switch (escolha) {
                case 1:
                    System.out.print("NUSP:");
                    int NUSP = input.nextInt();
                    input.nextLine();
                
                    System.out.print("Nome:");
                    String nome = input.nextLine();
                    
                    System.out.print("Sobrenome:");
                    String sobrenome = input.nextLine();
                    
                    System.out.print("Idade:");
                    int idade = input.nextInt(); 
                    input.nextLine();
                    
                    System.out.print("Endereço:");
                    String endereco = input.nextLine();  
                    
                    System.out.print("E-mail:");
                    String email = input.nextLine(); 
                    
                    System.out.print("Senha:");
                    String senha = input.nextLine();  
                    
                    Estudante estudante = new Estudante();
                    estudante.cadastroEstudante(NUSP, nome, sobrenome, idade, endereco, email, senha);
                    estudante = null;
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    exit = true;
                    break;
            }
        } while (!exit); 
    }
}

public class Main {
    public static void main(String args[]) {
        Menu menu1 = new Menu();
        menu1.menu();
    }
}
