package myGradeSystem;

import java.util.Scanner;

public class UI {

	/*----------------------------------------------------------------------------------------------------------
	checkID(ID) throws IDExceptions1, IDExceptions2

	exception: IDExceptions1  print ���oID�t�r�� ���F!��
	         IDExceptions2  print ���oID���פ��� ���F!��
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
	promptCommand () �߰ݫ��O

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
	promptID()  �߰�ID
	returns  ID  
	
	1.	print ����JID�� Q (�����ϥ�)�H��
	2.	read line, save it as ID
	3.	returns ID
	----------------------------------------------------------------------------------------------------------------*/
	public String promptID() {
		System.out.println("��JID�� Q (�����ϥ�)�H");
		Scanner scanner = new Scanner(System.in);
		String ID = scanner.next();
		return ID;
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	 * showFinishMsg()
	 * print �����F\r\n
	 * 
	 * 1.print �����F\r\n
	 ----------------------------------------------------------------------------------------*/
	public boolean showFinishMsg() {
		System.out.println("�����F");
		return true;
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	 * showWelcomeMsg(name)
	 * print Welcome name  ex. Welcome ���§�
	 * 
	 * 1.print Welcome name
	 ----------------------------------------------------------------------------------------*/
	public boolean showWelcomeMsg(String name) {
		System.out.println("Welcome "+name);
		return true;
	}
}
