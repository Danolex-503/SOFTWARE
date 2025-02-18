class Main {


    public static void main(String[]
    args){
        System.out.println
        ("Inicializando....");
        System.out.println("car....");
        Car car = new Car("AMQ123", new
        Account("Leonardo Borja","ADN12345","leopequerbi@gmail.com","12365"));
        car.passenger = 4; 
        car.printDataCar();

        System.out.println("Uberx....");
        Uberx uberx = new Uberx
        ("MKL185", new Account("Maria Loyola", "JKL12365" , "marial@hotmail.com","125478" ),"Toyota","Corolla");


}















}