
// reverse array half



public class Demo {
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int half=arr.length/2;
		//System.out.println(half);
		int newArr[]= new int[10];
		int index=0;
		for(int i=half-1;i>=0;i--)
		{
			newArr[index++]=arr[i];
		}
		for(int i=arr.length-1;i>=half;i--)
		{
			newArr[index++]=arr[i];
		}
		
		for(int i:newArr) {
			System.out.print(" "+i);
		}
	}

}
