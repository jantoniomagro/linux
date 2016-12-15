/**
 * José Antonio Magro Cortés jmagro1@alumno.uned.es
 */

package rmi.repositorios;

import java.rmi.RemoteException;

import rmi.common.Gui;

public class Repositorio {

	private int idRepo;
	private String nombreRepo;

	public Repositorio(int idRepo, String nombreRepo) {
		this.idRepo = idRepo;
		this.nombreRepo = nombreRepo;

	}

	public int getIdRepo() {
		return idRepo;
	}

	public String getNombreRepo() {
		return nombreRepo;
	}

	private static void gui() throws RemoteException {
		int opt = 0;

		do {
			opt = Gui
					.menu("Menu Principal", new String[] { "Subir fichero",
							"Listar clientes", "Listar ficheros del cliente",
							"Salir" });

			switch (opt) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			}
		} while (opt < 3 && opt >= 0);

	}

}
