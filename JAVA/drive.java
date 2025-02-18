class drive extends Account{

    public drive(String name, String
    document, String email, String
    password){
        super(name, document, email, password);
    }

    void printDataDriver(){
        System.out.println("Document 
        driver: " + document + " Name 
        driver: " + name + " E-mail: " 
        + email + " Password: " + password );
    }
    
}