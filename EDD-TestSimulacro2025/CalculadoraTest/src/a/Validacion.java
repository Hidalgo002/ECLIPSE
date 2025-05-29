package a;

import java.util.regex.Pattern;

public class Validacion {
	public boolean validarCorreo(String correo) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,6}$";
        return Pattern.matches(regex, correo);
    }

}
