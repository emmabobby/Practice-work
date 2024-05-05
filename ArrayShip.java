public class ArrayShip {

	public static int [] lexus(int [] array){
		for(int index = 0; index < array.length -1; index ++){
			for(int count = index +1; count < array.length; count++){
				if (array[index] > array [count]){

					array[index] = array[index] + array [count];
					array[count] = array[index] - array [count];
					array[index] = array[index] - array [count];
				}
			}
		}	

	return array;
	}


}