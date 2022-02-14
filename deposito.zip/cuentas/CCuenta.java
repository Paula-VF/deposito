package cuentas;
/** clase con los métodos y atributos necesarios para poder manejar el dinero de la cuenta*/
public class CCuenta {

    private String nombre; /** nombre del propietario de la cuenta*/
    private String cuenta; /** nombre/número de la cuenta*/
    private double saldo; /** cantidad de saldo*/
    private double tipoInterés; /** cantidad del tipo de interés*/
    /** método vacío de contenido*/
    public CCuenta()
    {
    }
    /** método constructor*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
/** métodos getters y setters*/
    /** método para poder ver la cantidad de dinero del que se dispone
     * @return el saldo*/
    public double estado()
    {
        return getSaldo();
    }
    /** método para poder ingresar cierta cantidad de dinero
     * @param la cantidad a ingresar*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /** método para poder retirar cierta cantidad de dinero
     * @param la cantidad a retirar*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /** método getter de nombre
     * @return el nombre*/
	String getNombre() {
		return nombre;
	}
	/** método setter de nombre
	 * @param el nombre a cambiar*/
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/** método getter de cuenta
	 * @return la cuenta*/
	String getCuenta() {
		return cuenta;
	}
	/** método setter de cuenta
	 * @param el nombre/número de la cuenta a cambiar*/
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/** método getter de saldo
	 * @return el saldo*/
	double getSaldo() {
		return saldo;
	}
	/** método setter de saldo
	 * @param cantidad de saldo a cambiar*/
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/** método getter del tipo de interés
	 * @return el tipo de interés*/
	double getTipoInterés() {
		return tipoInterés;
	}
	/** método setter del tipo de interés
	 * @param cantidad de interés a cambiar*/
	void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
