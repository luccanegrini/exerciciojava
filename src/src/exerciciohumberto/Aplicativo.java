package exerciciohumberto;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Aplicativo {

	static ArrayList<Pessoa> dados = new ArrayList();

	// método para cadastrar o empregado (caique) // Não conseguimos fazer o método para diferenciar vendedor e gerente
	public static void CadastrarEmp(String nome,String cpf,String matricula) {
		Empregado novo = new Empregado();
		novo.setPessoa(nome, cpf);
		novo.setemp(matricula);
		dados.add(novo);
	}

	// método para cadastrar o cliente (lucca)
	public static void CadastrarCli(String nome, String cpf, double valorDiv) {
		Cliente novo = new Cliente();
		novo.setPessoa(nome, cpf);
		novo.setclientes(valorDiv);
		dados.add(novo);
	}

       //método para remover (caique)
	public static void Remover(String cpf) {
		int aux = dados.size();
		for (int x = 0; x < aux; x++) {
			System.out.println("A respectiva pessoa foi removida!");
			dados.remove(x);
		}
		System.out.println("Cpf inválido, tente com outro cpf");
	}

	// método de pesquisa (lucca)
	public static void Pesquisar(String cpf) {
		int aux = dados.size();
		for (int x = 0; x < aux; x++) {
			if (dados.get(x).cpf.equals(cpf)) {
				System.out.println("Esta pessoa é "+ dados.getClass());
				return;
			}
		}
		System.out.println("Cpf inválido");
		
	}

        // método para listar clientes (lucca)
	public static String ListarCli() {
		int n = dados.size();
		Cliente aux = new Cliente();
		String print = "";
		for (int x = 0; x < n; x++) {
			if (dados.get(x).getClass().equals(aux.getClass())) {
				print += dados.get(x).toString();
			}
		}
		return print;
	}

   	// método de listar empregados (caique)
	public static String ListarEmp() {
		int aux = dados.size();
		Empregado auxi = new Empregado();
		String print = "";
		for (int x = 0; x < aux; x++) {
			if (dados.get(x).getClass().equals(auxi.getClass())) {
				print += dados.get(x).toString();
			}
		}
		return print;
	}

	// método MAIN com os casos e JOptionPane (lucca e caique)
	public static void main(String[] args) throws Exception {

		String text;
		int valorDiv;
        String nome, cpf;
        
        	do {
    
        	text = JOptionPane.showInputDialog("Escolha uma opção\n1. Cadastrar Empregado\n2. Cadastrar Cliente\n3. Pesquisar\n4. Listar Empregados\n5. Listar Clientes\n6.  Remover\n7. Finalizar");
    
        	switch (text) {
        	case "1":
                    nome = JOptionPane.showInputDialog("Digite o nome:");
                    cpf = JOptionPane.showInputDialog("Digite o cpf:");
                    String matricula = JOptionPane.showInputDialog("Digite a matrícula do empregado:");
                    CadastrarEmp(nome,cpf,matricula);
                    break;
        	case "2":
                    nome = JOptionPane.showInputDialog("Digite o nome:");
                    cpf = JOptionPane.showInputDialog("Digite o cpf:");
                    valorDiv = Integer.parseInt(JOptionPane.showInputDialog("Digite a respectiva divida:"));
                    CadastrarCli(nome, cpf, valorDiv);
                    break;
        	case "3":
                    cpf = JOptionPane.showInputDialog("Digite o cpf que deseja:");
                    Pesquisar(cpf);
                    break;
        	case "4":
                    JOptionPane.showMessageDialog(null, ListarEmp());
                    break;
        	case "5":
                    JOptionPane.showMessageDialog(null, ListarCli());
                    break;
    		case "6":
                    cpf = JOptionPane.showInputDialog("Digite o cpf que deseja remover:");
                    Remover(cpf);
                    break;
    		case "7":
                    return;
        }	while
        	(text.equals("1") || text.equals("2") ||  text.equals("3") || text.equals("4") || text.equals("5") ||  text.equals("6") || text.equals("7")|| text.contentEquals(null));
        	}
	}
