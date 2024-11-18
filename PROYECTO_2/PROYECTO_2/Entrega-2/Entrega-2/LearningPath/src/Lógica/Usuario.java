package Lógica;
import java.io.Serializable;
public abstract class Usuario implements Serializable {
	
protected String user;

protected String password;

protected String correo;


public Usuario(String user, String password, String correo) {
	super();
	
	this.user = user;
	
	this.password = password;
	
	this.correo = correo;
}


public String getUser() {
	return user;
}


public void setUser(String user) {
	this.user = user;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}

//Método para autenticación; para comprobar que si sea las mismas credenciales
public boolean autenticar(String correo, String contraseña) {
    
    return this.correo.equals(correo) && this.password.equals(contraseña);
}
}

