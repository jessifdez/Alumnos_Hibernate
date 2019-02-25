package alumnoshibernate;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AccesoBD.setUp();
			Alumno a=new Alumno("Jessica",9.25f,2);
			AccesoBD.insertarAlumno(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 