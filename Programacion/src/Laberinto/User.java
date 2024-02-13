package Laberinto;

public class User {
    private String username;
    private String name;
    private String nif;
    private String email;
    private String address;
    private String role;

    public User(String username, String name, String nif, String email, String address, String role) {
        this.username = username;
        this.name = name;
        this.nif = nif;
        this.email = email;
        this.address = address;  
        this.role = role;
        
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getNif() {
        return nif;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }


    public String getRole() {
        return role;
    }
}