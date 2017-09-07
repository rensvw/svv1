package svv1;

import java.awt.List;
import java.util.ArrayList;

public class exercises1 {
	
		static int[] intArray = new int[] {4,5,6,8};
		static int[] array1 = new int[] {4,5,6,8,12};
		static int[] array2 = new int[] {2,7,9,12};
		static int[] array3 = new int[array1.length + array2.length];
		
	
		public static void main(String[] args){
			System.out.println("Exercise 1, sorting algorithm:");
			System.out.println(isSorted(intArray));
			System.out.println("Exercise 3, merge sort algorithm:");
			
			mergeSort(array1,array2);
			
			for (int i=0; i < array1.length+array2.length; i++){
	            System.out.print(array3[i] + " ");
			}
			}
		
		public static boolean isSorted(int[] array){
			for(int x = 0; x < (array.length-1); x++){
				if(array[x] > array[x+1]){ return false; }
			}
			return true;
		}
		
		public static int[] mergeSort(int[] array1, int[] array2){

			if(isSorted(array1)){ 
				
				// false return 0 0 0 0 0 0 
				
				if(isSorted(array2)){	
					
					// false return 0 0 0 0 0 0 
					
					int i = 0, j = 0, k = 0;
				     
			        // loop eerst rij af tot dat x = length
					
			        while (i<array1.length && j <array2.length)
			        {
			            if (array1[i] < array2[j])
			                array3[k++] = array1[i++];
			            else
			            	array3[k++] = array2[j++];
			        }
			     
			        // voeg de rest van rij 1 toe aan het einde van de array mits al niet gedaan
			        
			        while (i < array1.length){
			            array3[k++] = array1[i++];
			        }			     
			        // voeg de rest van rij 2 toe aan het einde van de array mits al niet gedaan
			        
			        while (j < array2.length){
			            array3[k++] = array2[j++];
			        }
				}
					
			}
		return array3;

	}

}

