public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find(int[] array, int number) {
		for (int i = 0; i < array.length; i++){
			if (array[i] == number) {
				return i;
			}
		}
		return -1;
	}
	public static int findLast(String[] array, String string) {
		for (int i = array.length - 1; i >= 0; i--){
			if (array[i].equals(string)) {
				return i;
			}
		}
		return -1;
	}
	public static int findSecond(char[] array, char chracter) {
		int count = 0; 
		int index = 0; 
		for (int i = 0; i < array.length; i++){
			if (array[i] == chracter) {
				count ++;
				index = i;
				if (count == 2){
					return index; 
				}
			}
		}
		if (count == 1){
			return index;
		}
		else {
			return -1;
		}
	}

}
