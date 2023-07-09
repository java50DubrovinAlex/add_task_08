package add_task_8;

public class Main {

	public static void main(String[] args) {
		Lottery loto = new Lottery(new int[]{5,2,17,48,43,7,9}) ;
		if (loto.rateCombination(new int[] {3,5,12,17,44,10,7}) != 3) {
			System.out.println("Test 1 failed");
            return;			
		}
		if (loto.rateCombination(new int[] {3,5,12,17,49,9,7}) != 4) {
			System.out.println("Test 2 failed");
            return;			
		}
		System.out.println("Success");
	}

}
