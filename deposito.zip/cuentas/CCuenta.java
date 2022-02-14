package cuentas;
/** clase con los m�todos y atributos necesarios para poder manejar el dinero de la cuenta*/
public class CCuenta {

    private String nombre; /** nombre del propietario de la cuenta*/
    private String cuenta; /** nombre/n�mero de la cuenta*/
    private double saldo; /** cantidad de saldo*/
    private double tipoInter�s; /** cantidad del tipo de inter�s*/
    /** m�todo vac�o de contenido*/
    public CCuenta()
    {
    }
    /** m�todo constructor*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
/** m�todos getters y setters*/
    /** m�todo para poder ver la cantidad de dinero del que se dispone
     * @return el saldo*/
    public double estado()
    {
        return getSaldo();
    }
    /** m�todo para poder ingresar cierta cantidad de dinero
     * @param la cantidad a ingresar*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /** m�todo para poder retirar cierta cantidad de dinero
     * @param la cantidad a retirar*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /** m�todo getter de nombre
     * @return el nombre*/
	String getNombre() {
		return nombre;
	}
	/** m�todo setter de nombre
	 * @param el nombre a cambiar*/
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/** m�todo getter de cuenta
	 * @return la cuenta*/
	String getCuenta() {
		return cuenta;
	}
	/** m�todo setter de cuenta
	 * @param el nombre/n�mero de la cuenta a cambiar*/
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/** m�todo getter de saldo
	 * @return el saldo*/
	double getSaldo() {
		return saldo;
	}
	/** m�todo setter de saldo
	 * @param cantidad de saldo a cambiar*/
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/** m�todo getter del tipo de inter�s
	 * @return el tipo de inter�s*/
	double getTipoInter�s() {
		return tipoInter�s;
	}
	/** m�todo setter del tipo de inter�s
	 * @param cantidad de inter�s a cambiar*/
	void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
}
