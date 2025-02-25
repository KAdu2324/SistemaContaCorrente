package entities;

public class Funcionario extends Pessoa {
	
	private String cargo;
	private Double salario;
	
	
	public Funcionario() {
		super();
	}


	public Funcionario(String nome, int idade, String cargo, Double salario) {
		super(nome, idade);
		this.cargo = cargo;
		this.salario = salario;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	

}
