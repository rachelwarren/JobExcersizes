import java.util.*; 
public class SetUnion{

	public static void main(String[] args){
		//test the function here 
		int[] ar = {1, 2, 3};
		ArrayList<Integer> tar1 = convertArray(ar);
		int[] nill = {}; 
		boolean t0 = test(nill, nill, new ArrayList()); 
		boolean t1 = test(ar, nill, tar1);
		boolean t2 = test(nill, ar, tar1); 
		boolean t3 = test(ar, ar, tar1); 
		int[] alist = {1, 5, 6, 8, 10}; 
		int[] blist = {0, 2, 3, 4, 5};  
		int[] ab = {0, 1, 2, 3, 4, 5, 6, 8, 10}; 
		ArrayList<Integer> tar4 = convertArray(ab); 
		boolean t4 = test(alist, blist, tar4);


	}
	public static boolean test(int[] listA, int[] listB, ArrayList<Integer> answer){
		ArrayList<Integer> A = convertArray(listA); 
		ArrayList<Integer> B = convertArray(listB); 
        System.out.println("A is: " + A.toString() + "B is " + B.toString());
		ArrayList test = union(listA, listB); 
		if(test.equals(answer)){
			System.out.println("Passes test. Answer = " + test.toString()); 
			return true; 
		}
		else{
			System.out.println("FAILS. Expected: " + answer.toString() + " got: "+ test.toString()); 
			return false; 
		}
	}

	public static ArrayList<Integer> convertArray(int[] ar){
		ArrayList<Integer> answer = new ArrayList(ar.length); 
		for(int a : ar){
			answer.add(a);
		}
		return answer; 
	}

	public static ArrayList<Integer> union(int[] A, int[] B){
		int n = A.length; 
		int m = B.length; 
		ArrayList<Integer> ans = new ArrayList(n);
		int i = 0; 
		int j = 0; 
		while(i < n && j < m){
			int a = A[i]; 
			int b = B[j]; 
			if(a < b){
				ans.add(a); 
				i++; 
			}
			else if (a == b) {
				ans.add(a); 
				i++;
				j++;
			}
			else{
				ans.add(b); 
				j++; 
			}
		}
		while(i < n){
			ans.add(A[i]); 
			i++; 
		}
		while(j < m){
			ans.add(B[j]); 
			j++; 
		}
		return ans; 
	}
} //end class 