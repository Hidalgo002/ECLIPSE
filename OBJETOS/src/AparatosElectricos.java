
public class AparatosElectricos {

	int consumo;
	boolean estado; //apagado o encendido
	static public int consumoInstalacion=0;

	
	public AparatosElectricos(int consumo, boolean estado, int consumoInstalacion) {
		super();
		this.consumo = consumo;
		this.estado = estado;
		AparatosElectricos.consumoInstalacion = consumoInstalacion;
	}
	public AparatosElectricos(int consumo) {
		super();//LLama al elemento PADRE
		this.consumo = consumo;
		this.estado = false;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public static int getConsumoInstalacion() {
		return consumoInstalacion;
	}
	public static void setConsumoInstalacion(int consumoInstalacion) {
		AparatosElectricos.consumoInstalacion = consumoInstalacion;
	}
	@Override
	public String toString() {
		return "AparatosElectricos [consumo=" + consumo + ", estado=" + estado + ", consumoInstalacion="
				+ consumoInstalacion + "]";
	}
	
	public void encender() {
		if(!estado) {
			consumoInstalacion += consumo;
			estado = true;
		}
	}
	
	public void apagar() {
		if(estado) {
			consumoInstalacion -= consumo;
			estado = false;
		}
	}	
}
