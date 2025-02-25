package entities;

public class ContaEmpresarial extends Conta {
	private Double limite;

	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limite) {
		super(numero, titular, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public void emprestimo(Double quantia) {
		if (quantia <= limite) {
			saldo += quantia - 10.0;
		}
	}
	@Override
	public void saque(Double quantia) {
		super.saque(quantia);
		saldo -= 2.0;

	}

}
