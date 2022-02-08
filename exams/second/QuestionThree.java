package exams.second;
//Question Three: Sorting
//1. Create the given array of strings
//2. Sort the string array by length of each of word
//3. Once sorted print out the string back to console
public class QuestionThree {

	public static void main(String args[]) {
		
	String[] words = new String[]{"briefly", "mugwump", "articulation", "sync", "skein", "moire", "advisability", "varmint", "mandibular", "evergreen"};
	sort(words); //implementing the sort method
	
//	Since the words are sort based on length now let's print them
	System.out.println("The sorted array based on length of word is: \n");
	for (int i=0; i<words.length; i++)
		System.out.println(words[i]);
  }
	
	public static void sort(String []str) {
		for (int i=1 ;i<str.length; i++)
	{
		String temp = str[i]; //temp assign just so i can swap it later
		int j = i - 1;
		while (j >= 0 && temp.length() < str[j].length())
		{
		str[j+1] = str[j]; 
		j--;
		}
		str[j+1] = temp; 
	}
  }	
}
