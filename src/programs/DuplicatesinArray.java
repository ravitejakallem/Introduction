package programs;

public class DuplicatesinArray {

	public static void main(String[] args) {
		String[] arr= {"Java","c++","c","Java"};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate found :"+arr[i]);
				}
			}
		}

	}

}
