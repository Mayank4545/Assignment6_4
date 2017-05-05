import java.util.Arrays;
import java.util.Scanner;

public class Assignment6_4 {

	public static void main(String[] args){
        int list[] = {1,3,5,7,8,5,6,9,4,10}; //Create one-dimentional list
        int a;

        System.out.print("Array list: "); //Print the array
        for(a=0; a<10; a++){
            System.out.print(list[a]+" ");
        }

        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in); //Take number to be searched as input from the user
		System.out.println("\nEnter the number to be searched in list: ");
		int number = s.nextInt();
		
        int position = Arrays.binarySearch(list,number); //Binary search

        if(position >= 0){ //Number found
        	
            System.out.println("\nIndex position of "+ number +" in the list is " + position);
            

        }else{ //Number not found
            System.out.println("\n"+number+" cannot be found in list.");
        }
    }
	
}
