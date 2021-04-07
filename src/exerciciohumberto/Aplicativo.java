package exerciciohumberto;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Aplicativo {

	ArrayList<Pessoa> dados = new ArrayList();

	// m√©todo para cadastrar o empregado (caique)
	public void CadastrarEmp(String nome, String cpf, String matricula) {
		Empregado novo = new Empregado();
		novo.setPessoa(nome, cpf);
		novo.setemp(matricula);
		dados.add(novo);
	}

	// m√©todo para cadastrar o cliente (lucca)
	public void CadastrarCli(String nome, String cpf, double valorDiv) {
		Cliente novo = new Cliente();
		novo.setPessoa(nome, cpf);
		novo.setclientes(valorDiv);
		dados.add(novo);
	}

//m√©todo para remover (caique)
	public void Remover(String cpf) {
		int aux = dados.size();
		for (int x = 0; x < aux; x++) {
			System.out.println("Pessoa deletada!");
			dados.remove(x);
		}
		System.out.println("Cpf inv·lido, digite outro cpf");
	}

	// m√©todo de pesquisa (lucca)
	public Pessoa Pesquisar(String cpf) {
		int aux = dados.size();
		for (int x = 0; x < aux; x++) {
			if (dados.get(x).cpf.equals(cpf)) {
				System.out.println("Esta pessoa s„o " + dados.getClass());
				return dados.get(x);
			}
		}
		System.out.println("Cpf invalido");
		return null;
	}

// m√©todo para listar clientes (lucca)
	public String ListarCli() {
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

// m√©todo de listar empregados (caique)
	public String ListarEmp() {
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

	// m√©todo MAIN com os casos e JOptionPane (lucca e caique)
	public static void main(String[] args) throws Exception {

        String text;
        do {
    text = JOptionPane.showInputDialog("Escolha uma opÁ„o\n1. Cadastrar Empregado\n2. Cadastrar Cliente\n3. Pesquisar\n4. Listar Empregados\n5. Listar Clientes\n6.  Remover\n7. Finalizar");
    switch (text) {
    JOptionPane.showMessageDialog(null, ListarEmpregados());
    case "1":
                    nome = JOptionPane.showInputDialog("Informe o nome");
                    cpf = JOptionPane.showInputDialog("Informe o cpf");
                    String matricula = JOptionPane.showInputDialog("Informe a matrÌcula");
                    CadastrarEmpregado(nome, cpf, matricula);
                    break;
    case "2":
                    nome = JOptionPane.showInputDialog("Informe o nome");
                    cpf = JOptionPane.showInputDialog("Informe o cpf");
                    valorDaDivida = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da dÌvida"));
                    CadastrarCliente(nome, cpf, valorDaDivida);
                    break;
    case "3":
                    cpf = JOptionPane.showInputDialog("Informe o cpf a ser pesquisado");
                    Pesquisar(cpf);
                    break;
    case "4":
                    JOptionPane.showMessageDialog(null, ListarEmpregados());
                    break;
    case "5":
                    JOptionPane.showMessageDialog(null, ListarClientes());
                    break;
    case "6":
                    cpf = JOptionPane.showInputDialog("Informe o cpf a ser removido");
                    Remover(cpf);
                    break;
    case "7":
                    return;
        } while
 (text.equals("1") || text.equals("2") ||  text.equals("3") || text.equals("4") || text.equals("5") ||  text.equals("6") || text.equals("7")|| text.contentEquals(null));
    }
}
