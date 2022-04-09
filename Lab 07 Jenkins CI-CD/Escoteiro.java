public class Escoteiro {
	
	private String posto;
	private int tempo_de_socio;
	private int subsidio;
	private int subsidio_extra;

	public Escoteiro(String posto, int tempo_de_socio) {
		this.posto = posto;
		this.tempo_de_socio = tempo_de_socio;
	}
	
	public String getPosto() {
		return posto;
	}

	public void setPosto(String posto) {
		this.posto = posto;
	}
	
	public int getTempoDeSocio() {
		return tempo_de_socio;
	}
	
	public void setTempoDeSocio(int tempo_de_socio) {
		this.tempo_de_socio = tempo_de_socio;
	}

	public Integer valorSubsidio() {
		if (this.getTempoDeSocio() > 2) {
			this.subsidio = 50;
		} else if (this.getTempoDeSocio() == 2) {
			this.subsidio = 35;
		} else if (this.getTempoDeSocio() == 1) {
			this.subsidio = 25;
		} else {
			this.subsidio = 0;
		}
		return this.subsidio;
	}

	public Integer valorSubsidioExtra() {
		if (this.getPosto() == "LEÃO") {
			this.subsidio_extra = 20;
		} else if (this.getPosto() == "URSO") {
			this.subsidio_extra = 15;
		} else if (this.getPosto() == "LOBO") {
			this.subsidio_extra = 10;
		} else {
			this.subsidio_extra = 0;
		}
		return this.subsidio_extra;
	}

}