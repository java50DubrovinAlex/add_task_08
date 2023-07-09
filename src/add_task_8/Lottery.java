package add_task_8;

public class Lottery {
	private int[] winningCombination;
	/**
	 * Constructor
	 * @param winningCombination - array of 7 unique numbers in range [1 to 49] (no need to check)
	 */
	public Lottery(int[] winningCombination) {
		this.winningCombination = winningCombination;
	}

	/**
	 * Rates player's combination of balls, comparing it with winner combination 
	 * @param playerCombination - array of 7 unique numbers in range [1 to 49] (no need to check)
	 * @return number of winning balls in player's combination
	 */
	public int rateCombination(int playerCombination[]) {
		int rate = 0;
		int []helperArray = new int [50];
		for(int i = 0; i < playerCombination.length;i++) {
			helperArray[playerCombination[i]] += 1;
		}
		for(int i = 0; i < winningCombination.length;i++) {
			if(helperArray[winningCombination[i]] > 0) {
				rate++;
				helperArray[winningCombination[i]] -=1;
			}
		}
		return rate;
	}
}
