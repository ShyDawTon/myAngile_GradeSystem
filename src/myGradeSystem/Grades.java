package myGradeSystem;

public class Grades {
	public String name; 
	public int lab1, lab2, lab3, midtermExam, finalExam, totalGrade;
	
	
	/** **********************************************************************
	calculateTotalGrade(double[] weights)
	用weight計算總成績存入totalGrade並回傳
	************************************************************************/

	public int calculateTotalGrade(double[] weights){
		double temp = lab1 * weights[0] + lab2 * weights[1] + lab3 * weights[2] + midtermExam * weights[3] + finalExam * weights[4];
		totalGrade = (int) Math.round(temp);
		return totalGrade;
	}
}
