package modelo;


public class Profesor {
   private String numeroEconomico;
   private String nombre;
   private int edad;
   private int idCategoria;
   private int idDepartamento;

   public Profesor() {
   }

   public Profesor(String numeroEconomico, String nombre, int edad, int idCategoria, int idDepartamento) {
       this.numeroEconomico = numeroEconomico;
       this.nombre = nombre;
       this.edad = edad;
       this.idCategoria = idCategoria;
       this.idDepartamento = idDepartamento;
   }

   public String getNumeroEconomico() {
       return numeroEconomico;
   }

   public void setNumeroEconomico(String numeroEconomico) {
       this.numeroEconomico = numeroEconomico;
   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public int getEdad() {
       return edad;
   }

   public void setEdad(int edad) {
       this.edad = edad;
   }

   public int getIdCategoria() {
       return idCategoria;
   }

   public void setIdCategoria(int idCategoria) {
       this.idCategoria = idCategoria;
   }


   public int getIdDepartamento() {
       return idDepartamento;
   }

   public void setIdDepartamento(int idDepartamento) {
       this.idDepartamento = idDepartamento;
   }
   
   @Override
   public String toString() {
       return "Profesor{" + "numeroEconomico=" + numeroEconomico + ", nombre=" + nombre + ", edad=" + edad + ", idCategoria=" + idCategoria + ", idDepartamento=" + idDepartamento + '}';
   }
   
   
}