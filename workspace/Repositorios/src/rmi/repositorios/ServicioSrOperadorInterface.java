/**
 * José Antonio Magro Cortés jmagro1@alumno.uned.es
 */

package rmi.repositorios;

import java.rmi.Remote;

public interface ServicioSrOperadorInterface extends Remote {
	
	public static final String 	NOMBRE_SERVICIO = "SrOperadorInterface";
	public static final String 	MAQUINA = "localhost";
	public static final int PUERTO = 7751;
	
}
