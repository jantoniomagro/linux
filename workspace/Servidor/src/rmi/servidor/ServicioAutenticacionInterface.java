/**
 * José Antonio Magro Cortés jmagro1@alumno.uned.es
 */

package rmi.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicioAutenticacionInterface extends Remote {

	public static final String 	NOMBRE_SERVICIO = "AutenticacionInterface";
	public static final String 	MAQUINA = "localhost";
	public static final int PUERTO = 7770;
	
	// registra clientes y repositorios y devuelve ID
	public int registrar(String nombre, int tipo) throws RemoteException;
	
	// autentica un usuario contra el sistema
	public int autenticar(String nombre) throws RemoteException;
	
	
}
