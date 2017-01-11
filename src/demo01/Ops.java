package demo01;

public class Ops {
	
	public static int suma(int... nums) {
		
		int res = 0;
		
		for (int n : nums){
			res += n;
		}
		
		return res;
	}

}
