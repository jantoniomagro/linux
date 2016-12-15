/**
 * José Antonio Magro Cortés jmagro1@alumno.uned.es
 */

package rmi.servidor;

import java.rmi.RemoteException;

import rmi.common.Gui;

public class Servidor {

	private static void gui() throws RemoteException {
		int opt = 0;

		do {
			opt = Gui.menu("Menu Principal", new String[] { "Subir fichero",
					"Listar clientes", "Listar repositorios",
					"Listar repositorios-clientes", "Salir" });

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
			}
		} while (opt < 5 && opt >= 0);

	}

}