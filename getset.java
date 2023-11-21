public class getset{
    //Atributos
    public String marca;
    public String modelo;
    public String year;
    public int cilindraje;

    public getset(String marca, String modelo, String year, int cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getYear() {
        return year;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public void ImprimirDatos(){
        int tempyear=getYear();
        String tempmarca=getMarca();
        String tempmodelo=getModelo();
        System.out.println(getYear()+getModelo()+getMarca());
    }
}
