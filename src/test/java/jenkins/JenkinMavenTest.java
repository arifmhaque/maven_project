package jenkins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class JenkinMavenTest {
	
	@Test
	public void selem() {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(14);
		list.add(18);
		list.add(4);
		
     //  Iterator<Integer> it = list.iterator();
	   int sum = 0; 
	 /*  while(it.hasNext()) {
		   int lis = it.next();
		   sum = sum + lis;
	   }
	   System.out.println(sum);*/
	   
	   for(int x:list) {
		   sum = sum + x;
		   
	   }
	   System.out.println(sum);
	   
	}

}
