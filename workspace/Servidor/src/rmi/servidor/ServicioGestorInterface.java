/**
 * José Antonio Magro Cortés jmagro1@alumno.uned.es
 */

package rmi.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import rmi.common.Fichero;

public interface ServicioGestorInterface extends Remote {

	public static final String 	NOMBRE_SERVICIO = "GestorInterface";
	public static final String 	MAQUINA = "localhost";
	public static final int PUERTO = 7772;
	
	// enumera los ficheros almacenados
	public List<Fichero> listar(int sesion) throws RemoteException;
	
	// sube un fichero al respositorio
	public boolean subir(Fichero fich) throws RemoteException;
	
	// borra un fichero del repositorio
	public boolean borrar(Fichero fich) throws RemoteException;
	
	// descarga un fichero del repositorio
	public boolean descargar(Fichero fich) throws RemoteException;
	
}
