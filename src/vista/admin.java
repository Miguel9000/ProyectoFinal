
package vista;


public class admin {
    int idAdmin;
    String admin;
    String password;

    public admin() {
    }

    public admin(int idAdmin, String admin, String password) {
        this.idAdmin = idAdmin;
        this.admin = admin;
        this.password = password;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
