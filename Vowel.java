package program;
import java.util.Scanner;
public class Vowel {
public static void main(String[] args) {
		char ch;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		ch=in.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("The given charcter is vowel");
		}
		else{
			System.out.println("The given charcter is consonant");
		}
	}

}
