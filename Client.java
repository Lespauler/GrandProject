public class Client {
    
    String name, password;
    int id;
    double currentMoney;
    Client[][][][] clients;

    public Client(String name,String password, int id,double currentMoney){

        this.name=name;
        this.password=password;
        this.id=id;
        this.currentMoney=currentMoney;

    
    }

    public void setOnClients(String name, String password,int id , double currentMoney){

        

    }

    public void newClient(double currentMoney){

        

    }


    public String getName() {
        
        return name;

    }

    public void setName(String name) {
        
        this.name = name;

    }

    public String getPassword() {
        
        return password;

    }

    public void setPassword(String password) {
        
        this.password = password;

    }

    public int getId() {
        
        return id;

    }

    public void setId(int id) {
        
        this.id = id;

    }

    public double getCurrentMoney() {
        
        return currentMoney;

    }

    public void setCurrentMoney(double currentMoney) {
  
        this.currentMoney = currentMoney;

    }

}
    