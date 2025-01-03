public class SampleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}

public class SampleDotComTest {

	public static void main(String[] args) {
		SampleDotCom dot = new SampleDotCom();
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		String userGuess = "2";
		dot.checkYourself(userGuess);
	}
}
