package entities;

public class FuncionarioTerceiro extends Funcionario{
	
	private Double custoAdicionarl;
	
	public FuncionarioTerceiro(){
		super();
	}

	public FuncionarioTerceiro(String nome, Integer horas, Double valorPorHora, Double custoAdicionarl) {
		super(nome, horas, valorPorHora);
		this.custoAdicionarl = custoAdicionarl;
	}

	public Double getCustoAdicionarl() {
		return custoAdicionarl;
	}

	public void setCustoAdicionarl(Double custoAdicionarl) {
		this.custoAdicionarl = custoAdicionarl;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + custoAdicionarl * 1.1;
		
	}
}
