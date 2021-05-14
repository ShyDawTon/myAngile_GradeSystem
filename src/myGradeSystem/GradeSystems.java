package myGradeSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.*;

public class GradeSystems {
	public double[] weights = new double[5];
	public TreeMap <String, Grades> aTree = new TreeMap<String , Grades>();

/*	
 * 	1. �}�� input file ��gradeInput.txt��
	2. ��Java TreeMap�غca tree of anEntry(key, value) objects�s aTree
	3. read line
	4. while not endOfFile
	1. calls Grades() �غcaGrade
	2. ��Java Scanner scan line,ID�skey ��l�saGrade (value) 
	3. aGrade calls calculateTotalGrade(weights) returns aTotalGrade�⥦�s�JaGrade
	4. ��  (key,value) �s�J aTree
     end while
 */
	public GradeSystems () {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/gradeInput.txt"), "UTF-8"));

			while (br.ready()) {
				String[] data = br.readLine().split(" ");
				Grades aGrade = new Grades();
				
				aGrade.name = data[1];
				aGrade.lab1 = Integer.parseInt(data[2]);				
				aGrade.lab2 = Integer.parseInt(data[3]);
				aGrade.lab3 = Integer.parseInt(data[4]);				
				aGrade.midtermExam = Integer.parseInt(data[5]);		
				aGrade.finalExam = Integer.parseInt(data[6]);
				aGrade.calculateTotalGrade(weights);
				
				aTree.put(data[0], aGrade);
			}
			
			br.close();
		}
		catch(Exception e) {
			System.out.println("can't read file");
		}
	}
	
	/*-------------------------------------------------------------------------------------------------------------
	containID(ID)  ��aGradeSystem�O�_�t��ID

	parameters  ID   a user ID  ex: 123456789
	exceptions   IDExceptions3   print ���L�oID ���F!��
	returns  boolean
	time    O(log n)  n is aGradeSystem �����Z�H��
	
	1.	for anEntry in aTree 
 	if ID���� ID of anEntry then returns true 
 	end if 
  	end for 
	2.	throw an IDExceptions3 object
	-----------------------------------------------------------------------------------------------------------------*/
	public void containID(String ID) throws IDExceptions3 {
		try {
			aTree.containsKey(ID);
		}
		catch(Exception e) {
			throw new IDExceptions3();
		}
	}
	
	/*----------------------------------------------------------------------------------------------------------------------------
	showGrade(ID)  show �� ID ���U������ �� total grade 
	returns boolean
	
	for anEntry in aTree
  		if ID���� ID of anEntry then 
			show lab1,lab2,..,total grade; return true 
  		end if 
	end for
	----------------------------------------------------------------------------------------------------------------------------*/
	public boolean showGrade(String ID) {
		System.out.println(aTree.get(ID).lab1 + " " + aTree.get(ID).lab2 + " " + aTree.get(ID).midtermExam + " "  + aTree.get(ID).finalExam + " " + aTree.get(ID).totalGrade);
		return true;
	}
	
	/*----------------------------------------------------------------------------------------------------------------------------
	showRank(ID)  show �� ID�� rank
	returns boolean
	
	1. ���o�o ID �� theTotalGrade
	2. �Orank �� 1 
	3. for anEntry in aTree 
			if aTotalGrade > theTotalGrade then rank�[1(�h1�W) end if 
		end for
	4. show rank
	5. returns true
	���GshowGrade(ID) showRank(ID) �]�i��bUI class�A���N�O�t�@�س]�p�A�n��]�p�L�ߤ@�A
	���A�O�즸�ǲߡA�ҥH�п��u�����]�p (�O�o���u�}����?)�C
	----------------------------------------------------------------------------------------------------------------------------*/
	public boolean showRank(String ID) {
		int aTotalGrade = aTree.get(ID).calculateTotalGrade(weights);
		
		int rank = 1;
		
		for(Grades g : aTree.values()) {
			g.calculateTotalGrade(weights);
			if(g.totalGrade > aTotalGrade)
				rank++;
		}
			
		System.out.println(rank);
		return true;
	}
	
	/*----------------------------------------------------------------------------------------------------------------------------
	updateWeights () ��sweights
	returns  boolean
	
	1. showOldWeights() //�`�N�G���T�Ӭ�private methods�A�G���ݰ� test code
	2. getNewWeights() 
	3. setWeights(weights)
	4. for anEntry in aGradeSystem calculateTotalGrade(weights) & save it end for
	5. returns true
	----------------------------------------------------------------------------------------------------------------------------*/
	public boolean updateWeights() {
		showOldWeights();
		double[] weights = getNewWeights();
		setWeights(weights);
		return true;
	}
	
	private void showOldWeights() {
		StringBuilder sb = new StringBuilder();
		sb.append("�°t��\n");
		sb.append("\tlab1 " + weights[0] + "\n");
		sb.append("\tlab2 " + weights[1] + "\n");
		sb.append("\tlab3 " + weights[2] + "\n");
		sb.append("\tmidterm exam " + weights[3] + "\n");
		sb.append("\tfinal exam " + weights[4] + "\n");
		System.out.println(sb.toString());
	}
	
	private double[] getNewWeights() {
		Scanner sc = new Scanner(System.in);
		double[] std = new double[5];
		
		System.out.println("��J�s�t��");
		System.out.println("\tlab1 ");
		std[0] = Double.parseDouble(sc.nextLine())/100;
		System.out.println("\tlab2 ");
		std[1] = Double.parseDouble(sc.nextLine())/100;
		System.out.println("\tlab3 ");
		std[2] = Double.parseDouble(sc.nextLine())/100;
		System.out.println("\tmidterm exam ");
		std[3] = Double.parseDouble(sc.nextLine())/100;
		System.out.println("\tfinal exam ");
		std[4] = Double.parseDouble(sc.nextLine())/100;
		
		return std;
	}
	
	private void setWeights(double[] weights) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�нT�{�s�t��");
		sb.append("\tlab1 " + weights[0]*100 + "%\n");
		sb.append("\tlab2 " + weights[1]*100 + "%\n");
		sb.append("\tlab3 " + weights[2]*100 + "%\n");
		sb.append("\tmidterm exam " + weights[3]*100 + "%\n");
		sb.append("\tfinal exam " + weights[4]*100 + "%\n");
		System.out.println(sb.toString());
		
		System.out.print("�H�W���T��? Y (Yes) �� N (No)");
		String command = sc.nextLine();
		
		if(command.equals("Y") || command.equals("y")) {
			this.weights = weights;
			for(Grades g : aTree.values())
				g.calculateTotalGrade(this.weights);
		}
		
		return;
	}
	
	/*----------------------------------------------------------------------------------------------------------------------------
	getName() ���oID���W�r
	returns  String
	
	1. return name
	2. throws an IDExceptions3 object
	----------------------------------------------------------------------------------------------------------------------------*/
	public String getName(String id) throws IDExceptions3 {
		try {
			return aTree.get(id).name;
		}
		catch(Exception e) {
			throw new IDExceptions3();
		}
	}
}
