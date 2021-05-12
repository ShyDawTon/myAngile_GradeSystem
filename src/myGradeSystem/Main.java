package myGradeSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IDExceptions1, IDExceptions2, IDExceptions3{
		UI aUi = new UI();
		GradeSystems aGradeSystem = new GradeSystems();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				String id = aUi.promptID();
				if(id.equals("Q"))
					break;
				aUi.checkID(id);
				aGradeSystem.containID(id);
				String name = aGradeSystem.getName(id);
				aUi.showWelcomeMsg(name);
				while(true) {
					System.out.println(aUi.promptCommand());
					String command = sc.nextLine();
					if(command.equals("E"))
						break;
					else if(command.equals("G")) {
						aGradeSystem.showGrade(id);
					}
					else if(command.equals("R")) {
						aGradeSystem.showRank(id);
					}
					else if(command.equals("W")) {
						aGradeSystem.updateWeights();
					}
				}
			}
			catch(IDExceptions1 e1) {
				System.out.println(e1.getMessage());
			}
			catch(IDExceptions2 e2) {
				System.out.println(e2.getMessage());
			}
			catch(IDExceptions3 e3) {
				System.out.println(e3.getMessage());
			}
		}
	}
}
