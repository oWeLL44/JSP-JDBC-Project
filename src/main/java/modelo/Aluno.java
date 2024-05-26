package modelo;

public class Aluno {
	
	public Aluno(String nome, double prim, double seg, double ter, double qua) {
		this.nome = nome;
		this.prim = prim;
		this.seg = seg;
		this.ter = ter;
		this.qua = qua;
		this.media = this.calcularMedia();
		this.statusFinal = this.verificarStatus();
	}
	
	public Aluno(int ra, String nome, double prim, double seg, double ter, double qua) {
		this.ra = ra;
		this.nome = nome;
		this.prim = prim;
		this.seg = seg;
		this.ter = ter;
		this.qua = qua;
		this.media = this.calcularMedia();
		this.statusFinal = this.verificarStatus();
	}
	
	public Aluno() {}
	
	private int ra;
	private String nome;
	private double prim;
	private double seg;
	private double ter;
	private double qua;
	private double media;
	private String statusFinal;
	
	public double calcularMedia() {
		return (this.prim + this.seg + this.ter + this.qua) / 4;
	}
	
	public String verificarStatus() {
		
		if(this.media>=7 && this.media<=10) {
			return "APROVADO";
		}else if(this.media>=5 && this.media<7) {
			return "RECUPERAÇÃO";
		}else if(this.media>=0 && this.media<5) {
			return "REPROVADO";
		}else {
			return "MÉDIA INVÁLIDA";
		}
		
	}
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrim() {
		return prim;
	}
	public void setPrim(double prim) {
		this.prim = prim;
	}
	public double getSeg() {
		return seg;
	}
	public void setSeg(double seg) {
		this.seg = seg;
	}
	public double getTer() {
		return ter;
	}
	public void setTer(double ter) {
		this.ter = ter;
	}
	public double getQua() {
		return qua;
	}
	public void setQua(double qua) {
		this.qua = qua;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public String getStatusFinal() {
		return statusFinal;
	}
	public void setStatusFinal(String statusFinal) {
		this.statusFinal = statusFinal;
	}
	
	

}
