public abstract class Pessoa { 
	private String nome; 
	private String cpf;
	private Date dataNascimento;
	private String email;
	private String telefone; 
	
	public Pessoa() {}
	public Pessoa(String nome, String cpf, Date dataNascimento, String email, String telefone) {
	this.nome = nome;
	this.cpf = cpf;
	this.dataNascimento = dataNascimento;
	this.email = email; 
	this.telefone = telefone;
	} 
}

public class Hospede extends Pessoa { 
	private boolean isAtivo;
	private Date dataCadastro;

	public Hospede() {}
	public Hospede(String nome, String cpf, Date dataNascimento, String email, String telefone, boolean isAtivo, Date dataCadastro) {
	super(nome, cpf, dataNascimento, email, telefone); 
	this.isAtivo = isAtivo;
	this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "[Hospede] " + this.getNome(); 
	}
}
	
public class Funcionario extends Pessoa {	
	private String usuario; 
	private String senha;

	public Funcionario() {}
	public Funcionario(String nome, String cpf, Date dataNascimento, String email, String telefone, String usuario, String senha) {
		super(String nome, String cpf, Date dataNascimento, String email, String telefone); 
		this.usuario = usuario;
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "[Funcionario] " + this.getNome(); 
	}
}
	
public abstract class Pagamento {
	private Hospede hospede;
	private Conta conta;
	private double total; 
	
	public Pagamento() {}
	public Pagamento (Hospede hospede, Conta conta, double total) {
		this.hospede = hospede;
		this.conta = conta;
		this.total = total;
	}
}

public class Cartao extends Pagamento {
	private String agencia;
	private String conta;
	private TipoPagamento tipo;

	public Cartao() {}
	public Cartao(String agencia, String conta, TipoPagamento tipo) {
		super(Hospede hospede, Conta conta, double total);
		this.agencia = agencia;
		this.conta = conta;
		this.tipo = tipo;
	}
}

public class Dinheiro extends Pagamento {
	private double pago;
	private double troco;

	public Dinheiro() {}
	public Dinheiro(double pago, double troco) {
		super(Hospede hospede, Conta conta, double total);
		this.pago = pago;
		this.troco = troco;
	}
}