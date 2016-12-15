/**
 * José Antonio Magro Cortés jmagro1@alumno.uned.es
 */

package rmi.repositorios;

import java.rmi.Remote;

public interface ServicioClOperadorInterface extends Remote {

	public static final String 	NOMBRE_SERVICIO = "ClOperadorInterface";
	public static final String 	MAQUINA = "localhost";
	public static final int PUERTO = 7750;
	
}
