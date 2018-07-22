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
			System.out.println("The given character is vowel");
		}
		else if(ch>='0'&&ch<='9'){
			System.out.println("The given character is digit");
		}
			else{
			System.out.println("The given character is consonant");
		}
	}

}
