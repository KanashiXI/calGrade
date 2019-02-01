
public class GradeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input input = new Input();
		Process process;
		Output out;
		
		int score = input.inInt();
		process = new Process(score);
		System.out.println(process.calculate());
	}

}
