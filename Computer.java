import java.util.*;
import java.io.*;
import java.lang.*;

public class Computer implements Serializable {
    protected String sellType;
    protected String company;
    protected String type;
    protected String os;
    protected int ram;
    protected int storage;
    protected String processor;
    protected String screen;
    protected int price;
    protected String sellerType;
    protected int serialNumber; 
    protected String graphics;
    protected String trade;
    public Computer(int serialNumber,String sellType,String company,String type,String os,int ram,int storage,String processor,String graphics, String screen,int price,String sellerType){
        this.graphics = graphics;
        this.company = company;
        this.type = type;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.screen = screen;
        this.price = price;
        this.sellType = sellType;
        this.sellerType = sellerType;
        this.serialNumber = serialNumber;
        this.trade = "No";
    }
    
    public void setTrade(String trade){
        this.trade = trade;
    }
    public String getTrade(){
        return this.trade;
    }
    
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    public int getSerialNumber(){
        return this.serialNumber;
    }
    
    public void setSellerType(String sellerType){
        this.sellerType = sellerType;
    }
    public String getSellerType(){
        return this.sellerType;
    }
    
    public void setSellType(String sellType){
        this.sellType = sellType;
    } 
    public String getSellType(){
        return this.sellType;
    } 
    
    public void setComputerCompany(String company){
        this.company = company;
    } 
    public String getComputerCompany(){
        return this.company;
    } 
    
    public void setComputerType(String type){
        this.type = type;
    } 
    public String getComputerType(){
        return this.type;
    } 
    
    public void setComputerOS(String os){
        this.os = os;
    } 
    public String getComputerOS(){
        return this.os;
    } 
    
    public void setComputerRam(int ram){
        this.ram = ram;
    } 
    public int getComputerRam(){
        return this.ram;
    } 

    public void setComputerStorage(int storage){
        this.storage = storage;
    } 
    public int getComputerStorage(){
        return this.storage;
    } 
    
    public void setComputerProcessor(String processor){
        this.processor =  processor;
    } 
    public String getComputerProcessor(){
        return this.processor;
    } 
    
    public void setComputerScreen(String screen){
        this.screen = screen;
    } 
    public String getComputerScreen(){
        return this.screen;
    } 
    
    public void setComputerGraphics(String graphics){
        this.graphics = graphics;
    } 
    public String getComputerGraphics(){
        return this.graphics;
    } 

    public void setComputerPrice(int price){
        this.price = price;
    } 
    public int getComputerPrice(){
        return this.price;
    } 
    
    public void getComputerStats(){
        System.out.println("---------"+ this.serialNumber + "---------");
        System.out.println("Product Type: " + this.sellType);
        System.out.println("Company: " + this.company);
        System.out.println("Device Type: " + this.type);
        System.out.println("Operating System: "+  this.os);
        System.out.println("RAM: " + this.ram + "GB");
        System.out.println("Storage: " + this.storage + "TB");
        System.out.println("Processor: " + this.processor);
        System.out.println("Graphics: " + this.graphics);
        System.out.println("Screen: " + this.screen);
        System.out.println("Price: " + this.price);
        System.out.println("Seller: " + this.sellerType);
        System.out.println("--------------------");
    }
} 


