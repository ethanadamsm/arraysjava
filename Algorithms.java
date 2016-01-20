import java.lang.reflect.Array;

public class Algorithms {
	
	public static void main(String[] args){
		int[] cards = {1, 2, 4, 72, 3}; 
		System.out.println(max(cards)); 
		int[] newcards = bubbleSort(cards);
		for(int i : newcards){
			System.out.println(i);
		}
	}
	
	public static int[] bubbleSort(int[] array){
		int current = 0;
		int times = 1;
		for(int x = 0; x < array.length - 1; x++){
			for(int i = 0; i < array.length - 1; i++){
				if(array[i] > array[i + 1]){
					current = array[i + 1];
					array[i + 1] = array[i];
					array[i] = current;
				}
			}
			if(isSorted(array)){
				System.out.println("Times = " + times);
				return array;
			}
			times += 1;
		}
		System.out.println("Times = " + times);
		return array;
	}
	
	public static int[] selectionSort(int[] array){
		for(int i = 0; i < array.length; i++){
			for(int x = i; i < array.length - 1; i++){
				int[] newarray = new int[]{2, 1, 2};
			}
		}
		return array;
	}
	
	public static boolean isIn(int[] array, int spot){
		if(!isSorted(array)){
			array = bubbleSort(array);
		}
		for(int i = 0; i < array.length; i++){
			if(array[i] == (spot)){
				return true;
			}
			if(array[i] > spot){
				return false;
			}
		}
		return false;
	}
	
	public static boolean isSorted(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			if(array[i] > array[i + 1]){
				return false;
			}
		}
		return true;
	}
	
	public static int max(int[] array){
		int num = 0;
		for(int i : array){
			if(i > num){
				num = i;
			}
		}
		return num;
	}
	
	public static int min(int[] array){
		int num = max(array);
		for(int i : array){
			if(i < num){
				num = i;
			}
		}
		return num;
	}
	
}
