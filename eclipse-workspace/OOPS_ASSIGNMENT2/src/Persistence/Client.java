package Persistence;

public class Client {

	public static void main(String[] args) {
		Filepesistence fl=new Filepesistence();
		fl.persist();
		Databasepersistence fd=new Databasepersistence();
		fd.persist();

	}

}
