import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert initial tuition cost: ");
		double InitialTuition = input.nextInt();
		
		
		
		double TotalTuition= InitialTuition;
		double YearTuition = InitialTuition;
		
		for (int i=0;i<3;i++){
			System.out.println("Insert percentage increase for next year: ");
			double increase = input.nextInt();
			
			YearTuition = YearTuition*(1+ increase/100);
			
			TotalTuition = TotalTuition + YearTuition;
		}
		System.out.printf("%.2f",TotalTuition);
				
		
}
}
