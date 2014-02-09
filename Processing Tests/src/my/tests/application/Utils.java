package my.tests.application;



/**
 * Utility Methods and constants
 * 
 * @author Gaurav
 */
public class Utils {
	
	public static float SCALE = 1;
	public static final float FONT_SCALE = 1;
	public static final String ARIAL = "Arial";
	
	public static final int GREY = 200;
	// I am thinking of putting PFont here too as they don't need to have many instances
	
	public static float majorMark;
	public static float minorMark;
	
	
	public static boolean isBetween(float smaller, float larger, float val){
		return (val >= smaller && val <= larger )? true:false;
	}
	
	public static int[] toIntArray(String[] numbers){
		int[] ints = new int[numbers.length];
		for(int i = 0;i < ints.length;i++){
			try {
				ints[i] = Integer.parseInt(numbers[i]);
			} catch (NumberFormatException e) {
				System.out.println("Unable to parse " + numbers[i]);
			}
		}
		return ints;
	}
	
	public static int getMax(int[] numbers){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++)
			if(max < numbers[i]) max = numbers[i];
		
		return max;
	}
}
