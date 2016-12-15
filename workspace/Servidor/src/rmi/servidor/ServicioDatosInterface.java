/**
 * José Antonio Magro Cortés jmagro1@alumno.uned.es
 */

package rmi.servidor;

import java.rmi.Remote;
import java.util.HashMap;

import rmi.common.Fichero;
import rmi.repositorios.Repositorio;

public interface ServicioDatosInterface extends Remote {

	public static final String NOMBRE_SERVICIO = "DatosInterface";
	public static final String MAQUINA = "localhost";
	public static final int PUERTO = 7771;

	// relaciona [fichero-propietario]-repositorio
	public boolean relacionaClientesFicherosRepos(Fichero fich, Repositorio repo);

	// lista relaciones [fichero-propietario]-repositorio
	public HashMap<Fichero, Repositorio> listaRelacionesCliFichRep();

}
