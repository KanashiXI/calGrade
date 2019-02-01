import java.util.Scanner;

public class Process {
	int score;

	public Process(int score) {
		this.score = score;
	}
	public String calculate() {
		String grade;
		if(score>=80) {
			grade = "A";
		}
		else if (score>=75) {
			grade = "B+";
		}
		else if(score>=70){
            grade = "B";
        }
        else if(score >= 65){
            grade = "C+";
        }
        else if(score >= 60){
            grade = "C";
        }
        else if(score >=55) {
        	grade = "D+";
        }
        else if(score >= 50){
            grade = "D";
        }
        else{
            grade = "F";
        }
		return grade;
	}
	
}
