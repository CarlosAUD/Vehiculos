public class carros {
    public static void main(String[] args){
        System.out.println("test");
        //Declarar un variabke de tipo "Perros"
        //String nombre
        getset miCarro1;
        getset miCarro2;
        getset miCarro3;
        getset miCarro4;
        miCarro1=new getset("Toyota");
        miCarro2=new getset("Nissan");
        miCarro3=new getset("Jeep");
        miCarro4=new getset("Ford");
        //Seteos de edad
        miCarro1.setCilindraje(4000);
        miCarro2.setCilindraje(2000);
        miCarro3.setCilindraje(1000);
        miCarro4.setCilindraje(2500);
        //Seteos de color
        miCarro1.setYear("2022");
        miCarro2.setYear("2018");
        miCarro3.setYear("2006");
        miCarro4.setYear("1998");
        //Seteos de raza
        miCarro1.setModelo("fortuner");
        miCarro2.setModelo("tida");
        miCarro3.setModelo("cherokee");
        miCarro4.setModelo("ranger");
        public static void Carros(String [] args){
            System.out.println("Bienvenido");
            getset carro1=new getset("")
        }//Finish the metod of Carros

        //Obtener los valores de cada atributo
        System.out.println(miCarro1.getMarca());
        System.out.println(miCarro2.getCilindraje());
        System.out.println(miCarro3.getModelo());
        System.out.println(miCarro4.getColor());
    }

}
}//Finish the class carros