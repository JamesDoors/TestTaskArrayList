public class Task {
    
    private int numero;
    private String descripcion;
    private boolean finalizada;
    private String vencimiento;
    
    /*public Task(int numero, String descripcion, Date vencimiento) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.finalizada = false;
        this.vencimiento = vencimiento;
    }
   
    public Task(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.finalizada = false;
        this.vencimiento = null;
    }*/

    public Task() {
        this.numero = 0;
        this.descripcion = null;
        this.finalizada = false;
        this.vencimiento = null;
    }

    public Task(int numero) {
        this.numero = numero;
        this.descripcion = "";
        this.finalizada = false;
        this.vencimiento = "";
    }

    public int getNumero() {
        return numero;  
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;  
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getFinalizada() {
        return finalizada;  
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    public String getVencimiento() {
        return vencimiento;  
    }
    
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }
    
}
