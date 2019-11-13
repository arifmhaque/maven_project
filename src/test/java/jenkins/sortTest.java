package jenkins;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class sortTest {
	
	@Test
	public void sorting() {
		int [] arr = {20,3,50,12,2,3,20,12};
		
		int temp;
		for(int i = 1; i<arr.length; i++) {
			for(int j =i; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(arr[0]);
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				list.add(arr[i]);
			}
		}
		System.out.println();
		/*for(int i =0; i<list.size(); i++) {
			System.out.print(" "+list.get(i));
		}*/
		
		for(int x:list) {
			System.out.print(" "+x);
		}
	}

}
