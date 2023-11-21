public class getset{
    //Atributos
    public String marca;
    public String modelo;
    public String color;
    public int cilindraje;

    getset(String nuevoMarca){
        marca=nuevoMarca;
    }
    //metodos
    //Geters
    public int getCilindraje(){
        return cilindraje;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    //Setters
    public void setModelo(String newModelo){
        this.modelo=newModelo;
    }
    public void setMarca(String newMarca){
        this.marca=newMarca;
    }
    public void setColor(String newColor){
        this.color=newColor;
    }
    public void setCilindraje(int newCilindraje){
        this.cilindraje=newCilindraje;
    }

}
