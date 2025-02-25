package aplicarion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceiro;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("Informe a quantiodade de funcionario: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("dados do Funcionario #" + i + " ");
			System.out.print("O funcionario e terceiro (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Informe o nome do Funcionario: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("informe horas trabalhadas: ");
			int horaTrabalhadas = sc.nextInt();
			System.out.print("Valor por hora:");
			double vlorPorHora = sc.nextDouble();
			if (ch == 's') {
				System.out.println("Taxa adicional: ");
				double taxaAdicional = sc.nextDouble();
				Funcionario funcionario = new FuncionarioTerceiro(nome, horaTrabalhadas, vlorPorHora, taxaAdicional);
				list.add(funcionario);
			} else {
				list.add(new Funcionario(nome, horaTrabalhadas, vlorPorHora));
			}

		}
		System.out.println();
		System.out.println("Pagamentos: ");
		for (Funcionario funcionario : list) {
			System.out.println(funcionario.getNome() + " - $ " + String.format("%.2f", funcionario.pagamento()));
		}
		sc.close();

	}

}
