package pe.edu.tecsup.springbootapp.beans;

import org.springframework.stereotype.Component;

@Component
public class SaludoImpl implements Saludo {

	@Override
	public String dia(String nombres) {
		// TODO Auto-generated method stub
		return "Buenos días " + nombres;
	}

	@Override
	public String tarde(String nombres) {
		// TODO Auto-generated method stub
		return "Buenas tardes " + nombres;
	}

	@Override
	public String noche(String nombres) {
		// TODO Auto-generated method stub
		return "Buenas noches " + nombres;
	}

}
