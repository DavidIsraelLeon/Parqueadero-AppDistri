package ec.ups.edu.appdis.g1.parqueadero.dao;
import java.sql.Connection;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;

import ec.ups.edu.appdis.g1.parqueadero.utils.Resources;

public class ClienteDAO {
	
	@Inject
	private Connection con;
	
	public boolean insert(Cliente entity) {
		return true;
	}
	
	public boolean update (Cliente entity) {
		return true;
	}
	public Cliente read(int id) {
		return null;
	}
	public boolean delete(Cliente entity) {
		return true;
	}

}
