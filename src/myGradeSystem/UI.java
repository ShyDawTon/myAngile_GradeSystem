package myGradeSystem;

import java.util.Scanner;

public class UI {

	/*----------------------------------------------------------------------------------------------------------
	checkID(ID) throws IDExceptions1, IDExceptions2

	exception: IDExceptions1  print “這ID含字母 錯了!”
	         IDExceptions2  print “這ID長度不對 錯了!”
	returns  boolean
	----
	1.	if a char in ID isLetter then throw an IDExceptions1 object end if
	2.	if length of ID not equal 9 then throw an IDExceptions2 object end if
	3.	returns true
	-------------------------------------------------------------------------------------------------------------- */
	public boolean checkID(String ID) throws IDExceptions1, IDExceptions2 {
		
		for(int i=0; i < ID.length(); i++) {
			if(Character.isLetter(ID.charAt(i)))
				throw new IDExceptions1();
		}
		
		if(ID.length() != 9)
			throw new IDExceptions2();
		
		return true;
	}
	
	/*-------------------------------------------------------------------------------------------------------------
	promptCommand () 詢問指令

	returns  command  G (Grade), R (Rank), W (Weights), or E (Exit)
	
	1.loop 
	prompt user for a command
	until command is G (Grade),R (Rank), W (Weights), or E (Exit),
	2.returns command
	-----------------------------------------------------------------------------------------------------------------*/
	public String promptCommand() {
		return ("G (Grade), R (Rank), W (Weights), or E (Exit)");
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	promptID()  詢問ID
	returns  ID  
	
	1.	print “輸入ID或 Q (結束使用)？”
	2.	read line, save it as ID
	3.	returns ID
	----------------------------------------------------------------------------------------------------------------*/
	public String promptID() {
		System.out.println("輸入ID或 Q (結束使用)？");
		Scanner scanner = new Scanner(System.in);
		String ID = scanner.next();
		return ID;
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	 * showFinishMsg()
	 * print 結束了\r\n
	 * 
	 * 1.print 結束了\r\n
	 ----------------------------------------------------------------------------------------*/
	public boolean showFinishMsg() {
		System.out.println("結束了");
		return true;
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	 * showWelcomeMsg(name)
	 * print Welcome name  ex. Welcome 李威廷
	 * 
	 * 1.print Welcome name
	 ----------------------------------------------------------------------------------------*/
	public boolean showWelcomeMsg(String name) {
		System.out.println("Welcome "+name);
		return true;
	}
}
