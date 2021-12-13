
package pojos;


public class Boleto {
    
    int IdBoleto;
    String Nombre;
    int Matricula;
    String Pelicula;
    int Horario;
    
    public Boleto()
    {
        
    }

    public Boleto(int IdBoleto, String Nombre, int Matricula, String Pelicula, int Horario) {
        this.IdBoleto = IdBoleto;
        this.Nombre = Nombre;
        this.Matricula = Matricula;
        this.Pelicula = Pelicula;
        this.Horario = Horario;
    }

    public int getIdBoleto() {
        return IdBoleto;
    }

    public void setIdBoleto(int IdBoleto) {
        this.IdBoleto = IdBoleto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public int getHorario() {
        return Horario;
    }

    public void setHorario(int Horario) {
        this.Horario = Horario;
    }
    
    
    
}
