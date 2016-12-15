/**
 * José Antonio Magro Cortés jmagro1@alumno.uned.es
 */

package rmi.cliente;

import java.rmi.Remote;

public interface ServicioDiscoClienteInterface extends Remote {

	public static final String 	NOMBRE_SERVICIO = "DiscoCliente";
	public static final String 	MAQUINA = "localhost";
	public static final int PUERTO = 7760;
	
}
