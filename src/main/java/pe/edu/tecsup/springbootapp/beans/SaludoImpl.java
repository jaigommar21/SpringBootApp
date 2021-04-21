package pe.edu.tecsup.springbootapp.beans;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component("ES")
public class SaludoImpl implements Saludo {

	@Override
	public String dia(String nombres) {
		return "Buen día " + nombres;
	}

	@Override
	public String tarde(String nombres) {
		return "Buenas tardes " + nombres;
	}

	@Override
	public String noche(String nombres) {
		return "Buenas noches " + nombres;
	}

}
