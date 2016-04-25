
package pe.egcc.modek;


public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private String email;

    
    
    public Estudiante() {
        
        nombre = " Alvaro";
        apellido = " Espino";
        edad = 30;
        email = " alvaroespinonavarro@gmail.com";
        casado = true;
        
        
    }

    public Estudiante(String nombre, String apellido, int edad, boolean casado, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
        this.email = email;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("CHAU OBJETO");
        
    }
    
    

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
       
        String repo = "";
        
        repo += " Nombre: " + nombre + "\n";
        repo += " Apellido: " + apellido + "\n";
        repo += " Edad:" + edad + "\n";
        repo += " casado:" + casado +"\n";
        return repo;
         
    }
    
   
}
