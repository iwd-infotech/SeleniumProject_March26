package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	
//	String username = "students";  // hard coding
//	String password = "Password123";
	
	@Test
	@Parameters({"username", "password"})
	public void loginTest(String user, String pass) {
		System.out.println(user + " - " + pass);
	}
	

}
