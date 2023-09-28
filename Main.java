import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{   static ArrayList<User>userList = new ArrayList<User>();
    static ArrayList<Computer>store = new ArrayList<Computer>();
    static ArrayList<Integer>FileCheck = new ArrayList<Integer>();
    public static void main(String[] args){
        ReadFileCSV();
        SystemCheck();
        loadUsers();
        Admin mainAdmin = new Admin();
        mainAdmin.setUserName("00000");
        mainAdmin.setPin("12345");
        Scanner myObj = new Scanner(System.in);
        boolean keepGoing = true;
        while(keepGoing){
            Introduction();
            String Var = myObj.nextLine();
            if (Var.equals("1")){
                boolean AdminKeepGoing = true;
                   while(AdminKeepGoing){
                   System.out.println("Enter the UserName:");
                   String AdminLoginInfoName = myObj.nextLine();
                   
                   System.out.println("Enter the Pin:");
                   String AdminLoginInfoPin = myObj.nextLine();
                   
                   if (AdminLoginInfoName.equals(mainAdmin.getUserName())&&(AdminLoginInfoPin.equals(mainAdmin.getPin()))){
                       AdminKeepGoing = false;
                   }
                   else{
                       System.out.println("Enter the Correct details!!");
                   }
                }
                AdminKeepGoing = true;
                while(AdminKeepGoing){
                    AdminMenu();
                    System.out.println("Enter the Option: ");
                    String AdminVar = myObj.nextLine();
                    if (AdminVar.equals("1")){
                        System.out.println("--------------------");
                        User u = new User();
                        boolean AdminVarBool1 = true;
                        while(AdminVarBool1){
                            System.out.println("Enter the UserName for the user: ");
                            String userNameCreate = myObj.nextLine();
                            if(userList.size() == 0){
                                  u.setUserName(userNameCreate); 
                                  AdminVarBool1 = false;
                            }
                            else{
                                for(int i = 0; i < (userList.size());i++){
                                    if(userNameCreate.equals(userList.get(i).getUserName())){
                                       System.out.println("UserName already Exists!!"); 
                                       System.out.println("--------------------");
                                    }
                                    else{
                                        u.setUserName(userNameCreate);
                                        AdminVarBool1 = false;
                                    }
                                } 
                            }
                        }
                        System.out.println("Enter the pin for the user: ");
                        String pinCreate = myObj.nextLine();
                        u.setPin(pinCreate);
                        userList.add(u);
                        System.out.println("--------------------");
                    }
                    else if(AdminVar.equals("2")){
                       System.out.println("Enter the user you want to delete:");
                       String removeUser = myObj.nextLine();
                       try{
                           for(User i: userList){ 
                               if (((i.getUserName()).equals(removeUser)) &&  ((i.getUserMoney())<= 0 )){
                               userList.remove(i);
                               System.out.println("DELETED USER!!");
                               }
                           }
                        }  
                       catch(ConcurrentModificationException ex){
                           
                       }  
                    }
                    else if (AdminVar.equals("3")){
                       System.out.println("--------------------");
                       for(User i: userList){
                           System.out.println("UserNames");
                           System.out.println(i.getUserName());
                        }
                       System.out.println("--------------------");
                   }
                   else if (AdminVar.equals("4")){
                       boolean AdminVarBool4 = true;
                       while(AdminVarBool4){
                           System.out.println("--------------------");
                           System.out.println("Enter 1 to Add a Computer");
                           System.out.println("Enter 2 to Exit");
                           System.out.println("--------------------");
                           String AdminVar4 = myObj.nextLine();
                           if(AdminVar4.equals("1")){
                               boolean serialNumberCheck = true;
                               Integer fSerialNumber = Collections.max(FileCheck);
                              
                               System.out.println("Enter the Company of the Computer:");
                               String Company = myObj.nextLine();
                               
                               System.out.println("Enter the Device Format:");
                               String Form = myObj.nextLine();
                               
                               System.out.println("Enter the Processor:");
                               String Processor = myObj.nextLine();
                               
                               System.out.println("Enter the Graphics Card:");
                               String Graphics = myObj.nextLine();
                               
                               System.out.println("Enter the Screen Specifications:");
                               String Screen = myObj.nextLine();
                               
                               System.out.println("Enter the Operating System:");
                               String OS = myObj.nextLine();
                               
                               System.out.println("Enter the RAM in GB (only numbers):");
                               int RAM = myObj.nextInt();
                               
                               System.out.println("Enter the Storage in TB (only numbers):");
                               int Storage = myObj.nextInt();
                               
                               System.out.println("Enter the Price in Dollars (only numbers):");
                               int Price = myObj.nextInt();
                               
                               Computer base = new Computer(fSerialNumber + 1,"Computer",Company,Form,OS,RAM,Storage,Processor,Graphics,Screen,Price,"Admin");
                               store.add(base);
                           }
                           else if(AdminVar4.equals("2")){
                               AdminVarBool4 = false; 
                               System.out.println("EXITING!!");
                           }
                           else{
                              System.out.println("Choose a correct option!!");
                              System.out.println("--------------------");
                           }
                       } 
                   }
                   else if (AdminVar.equals("5")){
                       System.out.println("");
                       System.out.println("");
                       ComputerListing();
                       boolean AdminVarBool5 = true;
                       while(AdminVarBool5){
                           System.out.println("Enter the Product you want to Delete:");
                           if(myObj.hasNextInt()) {
                                int deleteSerialNumber = myObj.nextInt();
                                for(int i = 0; i < (store.size());i++){
                                    if(deleteSerialNumber == store.get(i).getSerialNumber()){
                                        store.remove(i);
                                        AdminVarBool5 = false;
                                        System.out.println("Serial Number " + deleteSerialNumber + " deleted!!");
                                    } 
                                }
                           }  
                       }
                   }
                   else if (AdminVar.equals("6")){
                       WriteFileCSV();
                   }
                   else if (AdminVar.equals("7")){
                       AdminKeepGoing = false;
                       System.out.println("EXITING");
                   }
                   else{
                       System.out.println("Choose a correct option!!");
                       System.out.println("--------------------");
                   }
                }
            }
            else if(Var.equals("2")){
                int UserNumber = 0;
                boolean UserKeepGoing = true;
                   while(UserKeepGoing){
                   System.out.println("Enter the UserName:");
                   String UserLoginInfoName = myObj.nextLine();
                   
                   System.out.println("Enter the Pin:");
                   String UserLoginInfoPin = myObj.nextLine();
                   
                   if(userList.size() == 0){
                       keepGoing = false;
                       System.out.println("EXITING");
                   }
                   else{
                       for(int i = 0; i < (userList.size());i++){
                           if(userList.get(i).getUserName().equals(UserLoginInfoName) && userList.get(i).getPin().equals(UserLoginInfoPin)){
                               UserNumber = i;
                               UserKeepGoing = false;
                           }
                       }
                   }
                }
                UserKeepGoing = true;
                while(UserKeepGoing){
                    UserMenu();
                    System.out.println("Enter the Option: ");
                    String UserVar = myObj.nextLine();
                    if(UserVar.equals("1")){
                         System.out.println("Your Money: " + userList.get(UserNumber).getUserMoney());
                    }
                    else if(UserVar.equals("2")){
                        ComputerListing();
                        System.out.println("Enter the Serial Number that you want to buy: ");
                        boolean UserVar2 = true;
                        int serialNumber = 0;
                        while(UserVar2){
                            serialNumber = myObj.nextInt();
                            for(int i = 0; i < FileCheck.size();i++){
                                if(serialNumber == FileCheck.get(i)){
                                    UserVar2 = false;
                                }
                            }
                        }
                        System.out.println("Serial Number Selected: " + serialNumber);
                        
                        for(int i = 0; i<store.size();i++){
                            Computer base = store.get(i);
                            if(serialNumber == store.get(i).getSerialNumber()){
                                if(userList.get(UserNumber).getUserMoney() > store.get(i).getComputerPrice()){
                                    int price = store.get(i).getComputerPrice();
                                    int userMoney = userList.get(UserNumber).getUserMoney();
                                    userList.get(UserNumber).setUserMoney(userMoney - price);
                                    userList.get(UserNumber).setUserBoughtComputer(base);
                                    store.remove(i);
                                    System.out.println("Bought the Computer!!");
                                }
                            }
                        }
                    }
                    else if(UserVar.equals("3")){
                        if(userList.get(UserNumber).getUserBoughtComputerSize() == 0){
                            System.out.println("You have nothing to trade");
                        }
                        else{
                            System.out.println("Your Products:");
                            userList.get(UserNumber).getUserBoughtComputer();
                            boolean userVar3 = true;
                            while(userVar3){
                                System.out.println("Enter the serial Number you want to trade to Yes:");
                                int serialNumber = myObj.nextInt();
                                if(userList.get(UserNumber).getSerialValue(serialNumber) == 1){
                                    userList.get(UserNumber).setSerialTradeComputer(serialNumber);
                                    userVar3 = false;
                                    System.out.println("TRADING VALUE CHANGED!!");
                                    System.out.println("--------------------"); 
                                }
                                else{
                                    System.out.println("Enter a correct serial Number!!");
                                }
                            }
                        }
                    }
                    else if(UserVar.equals("4")){
                       System.out.println("Enter the Money you want to Deposit: ");
                       int Money = myObj.nextInt();
                       userList.get(UserNumber).addUserMoney(Money);
                       System.out.println("Your Money got deposited!"); 
                    }
                    else if(UserVar.equals("5")){
                        System.out.println("Your Products:");
                        userList.get(UserNumber).getUserBoughtComputer();
                    }
                    else if(UserVar.equals("6")){
                        if((userList.get(UserNumber).getBoolTrade() == true)&& (UserListingTrade(UserNumber) == true)){
                            boolean UserVar6 = true;
                            int serialNumber1 = 0;
                            while(UserVar6){
                               System.out.println("Select a product from your Buy list:");
                               userList.get(UserNumber).TradeInStats();
                               serialNumber1 = myObj.nextInt();
                               if(userList.get(UserNumber).getSerialTrade(serialNumber1) == 1){
                                   UserVar6 = false;
                                   System.out.println("You selected:");
                                   userList.get(UserNumber).getUserComputerSerialNumber(serialNumber1);
                               }
                            }
                            Computer base = new Computer(10,"N","N","N","N",1,1,"N","N","N",1,"N");
                            for(int i = 0; i < userList.size(); i++){
                                for(int j = 0; j < userList.get(i).userBoughtComputer.size(); j++){
                                    if( userList.get(i).userBoughtComputer.get(j).getSerialNumber() == serialNumber1){
                                        base = userList.get(i).userBoughtComputer.get(j);
                                    }
                                }
                            }
                            System.out.println("--------------------"); 
                            System.out.println("--------------------"); 
                            System.out.println("--------------------"); 
                            for(int i = 0; i < userList.size(); i++){
                                if(i != UserNumber){
                                    userList.get(i).TradeInStats();
                                }
                            }
                            UserVar6 = true;
                            while(UserVar6){
                                System.out.println("Enter the SerialNumber you want to trade with");
                                int serialNumber = myObj.nextInt();
                                for(int i = 0; i < userList.size(); i++){
                                    for(int j = 0; j < userList.get(i).userBoughtComputer.size(); j++){
                                        if(userList.get(i).userBoughtComputer.get(j).getTrade().equals("Yes") && (i != UserNumber)){
                                            if(userList.get(i).userBoughtComputer.get(j).getSerialNumber() == serialNumber){
                                                UserVar6 = false;
    Trade trade = new Trade(serialNumber,userList.get(i).getUserName(),userList.get(UserNumber).getUserName(),userList.get(i).userBoughtComputer.get(j),base,serialNumber1);
                                                userList.get(UserNumber).setTradingList(trade);
                                            }
                                        }
                                    } 
                                }
                            }
                            System.out.println("Your Trade is in PROGRESS!!");
                        }
                        else{
                             System.out.println("Nothing to Trade!!");
                        }
                    }
                    else if(UserVar.equals("7")){
                        if(userList.get(UserNumber).tradingList.size() == 0){
                            System.out.println("Nothing to Accept!!");
                        }
                        else{
                            System.out.println("Enter the serial Number that you want to accept:");
                            int serialNumberRemove = 0;
                            int serialNumberKeep = 0;
                            userList.get(UserNumber).getTradingList();
                            int serialNumber = myObj.nextInt();
                            for(int i = 0; i < userList.get(UserNumber).tradingList.size(); i++){
                                if(serialNumber == userList.get(UserNumber).tradingList.get(i).getSerialNumber()){
                                    userList.get(UserNumber).setUserBoughtComputer(userList.get(UserNumber).tradingList.get(i).getComputer());
                                    serialNumberRemove = userList.get(UserNumber).tradingList.get(i).getSwapSerialNumber();
                                    serialNumberKeep = userList.get(UserNumber).tradingList.get(i).getSerialNumber();
                                    for(int j = 0; j < userList.size(); j++){
                                        if(userList.get(j).getUserName().equals(userList.get(UserNumber).tradingList.get(i).getUserNameMine())){
                                            userList.get(j).removeUserBoughtComputer(serialNumberRemove);
                                        }
                                    }
                                    for(int j = 0; j < userList.size(); j++){
                                        if(userList.get(j).getUserName().equals(userList.get(UserNumber).tradingList.get(i).getUserName())){
                                            userList.get(j).setUserBoughtComputer(userList.get(UserNumber).tradingList.get(i).getComputer2());
                                            userList.get(j).removeUserBoughtComputer(serialNumberKeep);
                                        }
                                    }
                                    userList.get(UserNumber).tradingList.remove(i);
                                }   
                            }
                            System.out.println("TRADE IN DONE!!");
                        }
                    }
                    else if(UserVar.equals("8")){
                            UserKeepGoing = false;
                            System.out.println("EXITING");
                    }
                }
            }
            else if(Var.equals("3")){
                keepGoing = false;
                System.out.println("EXITING");
                saveUsers();
                WriteFileCSV();
            }
            else{
                System.out.println("Choose a correct option!!");
                System.out.println("--------------------"); 
            }
        }
    }
    public static boolean UserListingTrade(int serialNumber){
        boolean userListingTrade = false;
        for(int i = 0; i < userList.size(); i++){
            for(int j = 0; j < userList.get(i).userBoughtComputer.size(); j++){
                if(userList.get(i).userBoughtComputer.get(j).getTrade().equals("Yes") && i != serialNumber){
                    userListingTrade = true;
                }
            }
        }
        return userListingTrade;
    }
    public static void UserMenu(){
       System.out.println("--------------------");
       System.out.println("Enter 1 to get your balance");
       System.out.println("Enter 2 buy a Product");
       System.out.println("Enter 3 change your Trade Ins");
       System.out.println("Enter 4 to add money");
       System.out.println("Enter 5 to see all the Products Bought");
       System.out.println("Enter 6 to Trade");
       System.out.println("Enter 7 to accept Trade");
       System.out.println("Enter 8 to Exit");
       System.out.println("--------------------");
     }
   public static void AdminMenu(){
        System.out.println("--------------------");
        System.out.println("Enter 1 to Add a User");
        System.out.println("Enter 2 to Delete a User");
        System.out.println("Enter 3 to List all Users");
        System.out.println("Enter 4 to add a Product");
        System.out.println("Enter 5 to delete a Product"); 
        System.out.println("Enter 6 to update the TextFile");
        System.out.println("Enter 7 to Exit");
        System.out.println("--------------------");
   }
    public static void Introduction(){
        System.out.println("--------------------");
        System.out.println("WELCOME TO THE STORE");
        System.out.println("Enter 1 to Login as Admin");
        System.out.println("Enter 2 to Login as User");
        System.out.println("Enter 3 to Exit");
        System.out.println("--------------------");
    }
    public static void ComputerListing(){
        System.out.println("-------------------");
        System.out.println("COMPUTER LISTINGS");
        System.out.println("-------------------");
        for(int i = 0; i < (store.size());i++){
            store.get(i).getComputerStats();
        }
    }
    public static void SystemCheck(){
         HashSet<Integer>SystemCheckList = new HashSet<Integer>(FileCheck);
         if(SystemCheckList.size() < FileCheck.size()){
             System.out.println("INPUT FILE SERIAL NUMBER ERROR");
         }
         else{
             System.out.println("FILE LOADED SUCCESSFULLY");
         }
    }
    
    public static void saveUsers(){
        try {
        FileOutputStream UserFileOut = new FileOutputStream("UserArray.dat");
        ObjectOutputStream obOut = new ObjectOutputStream(UserFileOut);
        obOut.writeObject(userList);
        }catch (Exception e){
        System.out.println(e.getMessage());
        }    
    }
    public static void loadUsers(){
        try{
        FileInputStream UserFileIn = new FileInputStream("UserArray.dat");
        ObjectInputStream obIn = new ObjectInputStream(UserFileIn);
        userList = (ArrayList<User>)obIn.readObject();
        }catch (Exception e){
        System.out.println(e.getMessage());
        } 
    }
    
    public static void ReadFileCSV(){
        String splitBy = ",";  
        String line = "";  
        try {
          BufferedReader br = new BufferedReader(new FileReader("Products.txt"));  
          while ((line = br.readLine()) != null){
              String[] sellingList = line.split(splitBy); 
              if ((sellingList[1]).equals("Computer")){
                  int tempSerialNumber = Integer.parseInt(sellingList[0]);
                  int tempRam = Integer.parseInt(sellingList[5]);
                  int tempStorage = Integer.parseInt(sellingList[6]);
                  int tempPrice = Integer.parseInt(sellingList[10]);
                  Computer base = new Computer(tempSerialNumber,sellingList[1],sellingList[2],sellingList[3],sellingList[4],tempRam,tempStorage,sellingList[7],sellingList[8],sellingList[9],tempPrice,sellingList[11]);
                  store.add(base);
                  FileCheck.add(tempSerialNumber);
              }
          } 
      } catch (IOException e){
          System.out.println(e.getMessage());
      } 
    }
    public static void WriteFileCSV(){
        try{
            FileWriter outFile = new FileWriter("Products.txt", false);
            PrintWriter output = new PrintWriter(outFile);
            for(int i = 0; i < (store.size());i++){
                    output.print(store.get(i).getSerialNumber() + ",");
                    output.print(store.get(i).getSellType() + ",");
                    output.print(store.get(i).getComputerCompany() + ",");
                    output.print(store.get(i).getComputerType() + ",");
                    output.print(store.get(i).getComputerOS() + ",");
                    output.print(store.get(i).getComputerRam() + ",");
                    output.print(store.get(i).getComputerStorage() + ",");
                    output.print(store.get(i).getComputerProcessor() + ",");
                    output.print(store.get(i).getComputerGraphics() + ",");
                    output.print(store.get(i).getComputerScreen() + ",");
                    output.print(store.get(i).getComputerPrice() + ",");
                    output.println(store.get(i).getSellerType());
             }
          outFile.close();
          output.close();
         }
    catch (IOException e){
            System.out.println(e.getMessage());
         }
    }
}

