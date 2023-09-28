import java.util.*;
import java.io.*;
import java.lang.*;

public class Bank implements Serializable
{
    protected int money;
    
    
    public Bank(){
        this.money = 0;
    } 
    
    public void setMoney(int money){
        this.money = money;
    }
    public void addMoney(int money){
        this.money = this.money + money;
    } 
    public int getMoney(){
        return this.money;
    } 
} 

