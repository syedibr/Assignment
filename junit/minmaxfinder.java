import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinMaxFinder {

	
	public int[] findMinMax(int arr[]) {
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<9;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		//int ans[]= {min,max};
		
		return new int[] {min,max};
	}
	/*public static void main(String []args) {
		int a[]= {56,34,7,3,54,3,34,34,53};
		int b[]=findMinMax(a);
		for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
		}
	}*/
}
