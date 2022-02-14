package cuentas;
/** Clase principal en la que se encuentra el método main*/
public class Main {
	/** método main con el que se inicia el programa*/
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        operativa_cuenta(0);
    }
    /** método llamado por el método main en el cual se crea una cuenta, se consulta su saldo
     * y se intenta retirar e ingresar cierta cantidad de dinero*/
	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
