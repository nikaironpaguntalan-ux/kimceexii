public abstract class User {

    protected int id;
    protected String username;
    protected String password;
    protected String role;
    public User( int id, String username, String password, String role){
        this.id = id;
        this.username = username; 
        this.password = password;
        this.role= role;

    }




    public int getId(){
        return id;
    }
    public String getusername(){
        return username;
    }
    public String getpassword(){
        return password;
    }
    public String getrole(){
        return role;
    }

    

    public abstract void RoleDashb();







    
    
}
