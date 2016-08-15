import java.util.Arrays;
import java.util.Comparator;

public class ArrayMerger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item[] array1 = {new Item(2,5),new Item(5,10),new Item(1, 10), new Item(4,12)};
		Item[] array2 = {new Item(3,7),new Item(2,10),new Item(1, 10)};
		//print(array1);
		mergeAndPrint(array1, array2);
	}
	
	public static void print(Item[] arr){
		for(Item i : arr){
			System.out.println(i.toString());
		}
		
		//System.out.println(Arrays.toString(arr));
	}
	
	public static class compareByIdAsc implements Comparator<Item>{
		public int compare(Item i1, Item i2){
			return i1.id - i2.id;
		}
	}
	
	public static class compareByIdDesc implements Comparator<Item>{
		public int compare(Item i1, Item i2){
			return i2.id - i1.id;
		}
	}
	
	public static class compareByWeight implements Comparator<Item>{
		public int compare (Item i1, Item i2){
			return i1.weight - i2.weight;
		}
	}
	
	public static void mergeAndPrint(Item[] arr1, Item[] arr2){
		Item[] result = new Item[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, result, 0, arr1.length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
		
		Arrays.sort(result, new compareByWeight());
		
		print(result);
	}
	
	public static class Item{
		int id;
		int weight;
		
		Item(int id, int weight){
			this.id = id;
			this.weight = weight;
		}
		
		public String toString(){
			return id+", "+weight;
		}
		
	}
	

}
