Main.class: Main.java User.class Computer.class Trade.class Admin.class Bank.class Login.class
	javac -g Main.java

Computer.class: Computer.java
	javac -g Computer.java

Trade.class: Trade.java
	javac -g Trade.java

Login.class: Login.java
	javac -g Login.java

Bank.class: Bank.java
	javac -g Bank.java

User.class: User.java Login.class
	javac -g User.java

Admin.class: Admin.java Login.class
	javac -g Admin.java


clean:
	rm -f *.class

run: Main.class
	java Main
