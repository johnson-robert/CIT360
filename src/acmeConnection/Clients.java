package acmeConnection;
// Generated Feb 22, 2019 8:33:54 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clients generated by hbm2java
 */
public class Clients  implements java.io.Serializable {


     private Integer clientId;
     private String clientFirstname;
     private String clientLastname;
     private String clientEmail;
     private String clientPassword;
     private String clientLevel;
     private String comments;
     private Set reviewses = new HashSet(0);

    public Clients() {
    }

	
    public Clients(String clientFirstname, String clientLastname, String clientEmail, String clientPassword, String clientLevel, String comments) {
        this.clientFirstname = clientFirstname;
        this.clientLastname = clientLastname;
        this.clientEmail = clientEmail;
        this.clientPassword = clientPassword;
        this.clientLevel = clientLevel;
        this.comments = comments;
    }
    public Clients(String clientFirstname, String clientLastname, String clientEmail, String clientPassword, String clientLevel, String comments, Set reviewses) {
       this.clientFirstname = clientFirstname;
       this.clientLastname = clientLastname;
       this.clientEmail = clientEmail;
       this.clientPassword = clientPassword;
       this.clientLevel = clientLevel;
       this.comments = comments;
       this.reviewses = reviewses;
    }
   
    public Integer getClientId() {
        return this.clientId;
    }
    
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
    public String getClientFirstname() {
        return this.clientFirstname;
    }
    
    public void setClientFirstname(String clientFirstname) {
        this.clientFirstname = clientFirstname;
    }
    public String getClientLastname() {
        return this.clientLastname;
    }
    
    public void setClientLastname(String clientLastname) {
        this.clientLastname = clientLastname;
    }
    public String getClientEmail() {
        return this.clientEmail;
    }
    
    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }
    public String getClientPassword() {
        return this.clientPassword;
    }
    
    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }
    public String getClientLevel() {
        return this.clientLevel;
    }
    
    public void setClientLevel(String clientLevel) {
        this.clientLevel = clientLevel;
    }
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    public Set getReviewses() {
        return this.reviewses;
    }
    
    public void setReviewses(Set reviewses) {
        this.reviewses = reviewses;
    }




}

