/**
 * José Antonio Magro Cortés jmagro1@alumno.uned.es
 */

package rmi.cliente;

import java.rmi.RemoteException;

import rmi.common.Gui;

public class Cliente {

	private int idCliente;
	private String nombreCliente;

	public Cliente(int idCliente, String nombreCliente) {
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	private static void gui() throws RemoteException {
		int opt = 0;

		do {
			opt = Gui.menu("Menu Principal", new String[] { "Subir fichero",
					"Bajar fichero", "Borrar fichero", "Lista ficheros", "Listar clientes del sistema",
					"Salir" });

			switch (opt) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		} while (opt < 6 && opt >= 0);
	}

}
