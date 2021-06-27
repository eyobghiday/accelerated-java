package labs.lab2;

//Question : Finding the minimum value of an array.
//1. Assign a default value to minimum
//2. Compare with each array member 
//3. If member value is minimum than the holder swap the array value.
//4. Print out the results. 
public class Question2 {

	public static void main(String[] args) {
		
		int values[]={72, 101, 108, 108, 111, 32, 101, 118, 101, 114, 121, 111, 110, 101, 33, 32, 76, 111, 111, 107, 32, 97, 116, 32, 116, 104, 101, 115, 101, 32, 99, 111, 111, 108, 32, 115, 121, 109, 98, 111, 108, 115, 58, 32, 63264, 32, 945, 32, 8747, 32, 8899, 32, 62421};
		
		int min=values[0];
		
		for(int i=1;i<values.length;i++) //I'm comparing each elemet with with value. 
		{
		if(values[i]<min)
		{
		min=values[i]; //swap out if minimum element is found.
		}
		}
		
		System.out.println("The minimum Value is "+min);
		}

	}

