import java.util.*;
import java.io.*;
import java.lang.*;
public class User extends Login implements Serializable
{
    protected Bank userBank;
    
    
    public ArrayList<Trade>tradingList = new ArrayList<Trade>();
    
    public ArrayList<Computer>userBoughtComputer = new ArrayList<Computer>();
    public User()
    {
        this.userBank = new Bank();
    }
    
    public void setTradingList(Trade trade){
        this.tradingList.add(trade);
    }
    
    public void getTradingList(){
        if(tradingList.size() == 0){
            System.out.println("You have nothing to accept");
        }
        else{
            for(int i = 0; i < tradingList.size(); i++){
                tradingList.get(i).getTradeStats();
            }
        }
    }
    public int getSerialTrade(int serialNumber){
        int x = 0;
        for(int i = 0; i < userBoughtComputer.size(); i++){
            if(userBoughtComputer.get(i).getTrade().equals("Yes")){
                if(userBoughtComputer.get(i).getSerialNumber() == serialNumber){
                   x = 1; 
                }
            }
        }
        return x;
    }
    
    public boolean getBoolTrade(){
        boolean Trade = false;
        for(int i = 0; i < userBoughtComputer.size(); i++){
            if(userBoughtComputer.get(i).getTrade().equals("Yes")){
                Trade = true;
            }
        }
        return Trade;
    }
    
    public void getUserComputerSerialNumber(int serialNumber){
        for(int i = 0; i < userBoughtComputer.size(); i++){
             if(userBoughtComputer.get(i).getSerialNumber() == serialNumber){
                 userBoughtComputer.get(i).getComputerStats();
             }
        }
    }
    
    public int getSerialValue(int serialNumber){
        int x = 0;
        for(int i = 0; i < userBoughtComputer.size(); i++){
            if(userBoughtComputer.get(i).getSerialNumber() == serialNumber){
                userBoughtComputer.get(i).setTrade("Yes");
                x = 1;
            }
        }
        return x;
    }
    
    
    public void setSerialTradeComputer(int serialNumber){
        for(int i = 0; i < userBoughtComputer.size(); i++){
            if(userBoughtComputer.get(i).getSerialNumber() == serialNumber){
                userBoughtComputer.get(i).setTrade("Yes");
            }
        }
    }
      
    public void setUserBoughtComputer(Computer userBoughtComputer){
        this.userBoughtComputer.add(userBoughtComputer);
    }
    
    public void removeUserBoughtComputer(int serialNumber){
        for(int i = 0; i < userBoughtComputer.size(); i++){
            if(userBoughtComputer.get(i).getSerialNumber() == serialNumber){
                this.userBoughtComputer.remove(i);
            }
        }
    }
    public void TradeInStats(){
        if(userBoughtComputer.size() == 0){
            System.out.println(super.getUserName() + " has Nothing to Trade");
        }
        else{
            for(int i = 0; i < userBoughtComputer.size(); i++){
                if(userBoughtComputer.get(i).getTrade().equals("Yes")){
                    System.out.println("");
                    System.out.println("-----");
                    System.out.println(super.getUserName() + " - TRADE INs");
                    userBoughtComputer.get(i).getComputerStats();
                    System.out.println("-----");
                    System.out.println("");
                }
            }
        }
    }
    
    public void getUserBoughtComputer(){
        if(userBoughtComputer.size() == 0){
            System.out.println("You have bought no computers");
        }
        else{
            for(int i = 0; i < userBoughtComputer.size(); i++){
                userBoughtComputer.get(i).getComputerStats();
            }
        }
    }
    
    public int getUserBoughtComputerSize(){
        return this.userBoughtComputer.size();
    }
    
    public void addUserMoney(int money){
        this.userBank.addMoney(money);
    }
    public int getUserMoney(){
        return this.userBank.getMoney();
    }
    public void setUserMoney(int money){
        this.userBank.setMoney(money);
    }
}

