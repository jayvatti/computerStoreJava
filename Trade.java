import java.util.*;
import java.io.*;
import java.lang.*;
public class Trade implements Serializable
{
    protected String userName;
    protected String userNameMine;
    protected int serialNumber;
    protected Computer tradingMine;
    protected Computer tradingYours;
    protected int swapSerialNumber;
    
    public Trade(int serialNumber,String userName,String userNameMine,Computer computer,Computer your,int swapSerialNumber)
    {
        this.serialNumber = serialNumber;
        this.userName = userName;
        this.userNameMine = userNameMine;
        this.tradingMine = computer;
        this.tradingYours = your;
        this.swapSerialNumber = swapSerialNumber;
    }
    public void getTradeStats(){
        System.out.println("------------------");
        System.out.println("UserName: " + this.userName);
        this.tradingMine.getComputerStats();
        System.out.println("--------------------");
    }
    public int getSerialNumber(){
        return this.serialNumber;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getUserNameMine(){
        return this.userNameMine;
    }
    public Computer getComputer(){
        return this.tradingMine;
    }
    public Computer getComputer2(){
        return this.tradingYours;
    }
    public int getSwapSerialNumber(){
        return this.swapSerialNumber;
    }
}

