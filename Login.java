import java.util.*;
import java.io.*;
import java.lang.*;

public class Login implements Serializable{
    protected String userName;
    protected String pin;
    
    public Login(){
    } 
    
    public Login(String userName,String pin){
        this.userName = userName;
        this.pin = pin;
    } 
    
    public void setUserName(String userName){
        this.userName = userName;
    } 
    
    public void setPin(String pin){
        this.pin = pin;
    } 
    
    public String getUserName(){
        return this.userName;
    } 
    
    public String getPin(){
        return this.pin;
    }  
    
} 
