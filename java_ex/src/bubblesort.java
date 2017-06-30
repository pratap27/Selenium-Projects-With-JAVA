
public class bubblesort {
	static void bubbleSort (int[] arr){
		int n = arr.length;
		int temp = 0;
		for (int i=0; i<n; i++){
			for(int j=1; j<(n-i); j++){
				if (arr[j-1] > arr [j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int arr[] = {2,34,5,65,7,89,9,0,1};
		
		System.out.println("Before bubbleSort");
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		bubbleSort(arr);
		
		System.out.println("After bubbleSort");
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
