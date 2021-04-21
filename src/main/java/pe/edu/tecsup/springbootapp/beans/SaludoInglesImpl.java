package pe.edu.tecsup.springbootapp.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component("EN")
public class SaludoInglesImpl implements Saludo {

	@Override
	public String dia(String nombres) {
		return "Good mmorning " + nombres;
	}

	@Override
	public String tarde(String nombres) {
		return "Good Afternoon " + nombres;
	}

	@Override
	public String noche(String nombres) {
		return "Good evening " + nombres;
	}
	
}
