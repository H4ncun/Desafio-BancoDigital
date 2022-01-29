
public class Endereco {

	private String rua;
	private String numero;
	private String cep;
	
	public Endereco(String rua, String numero, String cep) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
	}
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCEP() {
		return cep;
	}
	public void setCEP(String cep) {
		this.cep = cep;
	}
	
}
