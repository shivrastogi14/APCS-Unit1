//Import Scanner API
import java.util.Scanner;
//Import Random API
import java.util.Random;
//Password Generator class is designed to create a 8 character
//password from website name that is inputed by user 
//Example
	//Website name inputed "Wegmans"
	//Password generated is SNaM28#(
//Example 2
	//Website name inputed "lego"
	//Password generated is OgEL

public class PasswordGenerator {
//Global variables 
private static String web, website, spas2;
private static int count, cnum, num, passwordc;
private static char spec, num1, num2, passk, passk2;

//default/no-arg constructor
	public PasswordGenerator() {
}
	
//Method that sets value of variable web
	public static void WebN(String we) {
		if(we.indexOf('.') >=0) {
			web = we.trim().substring(0,we.indexOf('.'));
		}
		else {
		web = we.trim();
		}
	}
	
//Method that stores number of characters in website name to variable count
	public static int LenSite() {
		UserInput();
		count = 0;
		for (int i = 0; i<web.length(); i++) {
			if (Character.isLetter(web.charAt(i))) {
				count++;
			}
		}
		return count;
	}
//Method that returns name of website
	
//Method that randomizes values in char array of website name
//(Not Complete)
//	public static void Shuffle(StringBuilder sb) {
//		Random rd = new Random();
//		for(int i = sb.length() - 1; i>1; i--) {
//			int swapWith = rd.nextInt(i);
//			char swd = sb.charAt(swapWith);
//			sb.setCharAt(swapWith, sb.charAt(i));
//			sb.setCharAt(i, swd);;
//		}
//	}
	
//Method that obtains special key for password
	public static char Specialkey(char numnum) {
		switch(numnum) {
		case '0':
			spec = ')';
			break;
		case '1':
			spec = '!';
			break;
		case '2':
			spec = '@';
			break;
		case '3':
			spec = '#';
			break;
		case '4':
			spec = '$';
			break;
		case '5':
			spec = '%';
			break;
		case '6':
			spec = '^';
			break;
		case '7':
			spec = '&';
			break;
		case '8':
			spec = '*';
			break;
		case '9':
			spec = '(';
			break;
		default:
			System.out.println("Error");
		}
		return spec;
	}
	
//Method that capitalizes random letters within website name 
	public static String Cap() {
		Random rnd = new Random();
	    StringBuilder sb = new StringBuilder(web.length());

	    for (char c : web.toCharArray()) //true false to return randomly either lower or uppercase
	        sb.append(rnd.nextBoolean()
	                      ? 
	           Character.toLowerCase(c): Character.toUpperCase(c));

	    return sb.reverse().toString();
	}

//Method that accepts UserInput and assigns value to website name
	public static void UserInput() {
		//Instances of classes
			Scanner key = new Scanner(System.in);
			PasswordGenerator one = new PasswordGenerator();
			Random rand = new Random();
		//User input 
			System.out.println("What is the name of your website? ===> ");
			String webs = key.nextLine();
			one.WebN(webs);
	}
	
//Method that creates password from website name
	public static void Password() {
		PasswordGenerator one = new PasswordGenerator();
		Random rand = new Random();
		if(one.LenSite() <6) {
			num = rand.nextInt(25);  //get a random int from 0 - 24
		//If random number was <=9 then add space for 2 more char
		//evaluating value of variable num
			if(num<=9) {
				passwordc = count+2;
				cnum = num+1;
			//Lines of code to obtain a special key
				String snum = Integer.toString(cnum);
				num1 = snum.charAt(0);
				passk = Specialkey(num1);
			//If statement to evaluate edge case
				if(cnum==10) {
					passk = '!';
					passk2 = ')';
					passwordc = count+3;
				}
			}
		//Else statement for if statement evaluating num<=9
			else {
				int cnum = num+11;
				passwordc = count+4;
			//Lines of code to obtain special keys
				String snum = Integer.toString(cnum);
				num1 = snum.charAt(0);
				num2 = snum.charAt(1);
				passk = Specialkey(num1);
				passk2 = Specialkey(num2);
			}
		}
	//Else statement for if statement evaluating one.LenSite()<6
		else {
			num = rand.nextInt(26);
			num+=25;
			passwordc = count+4;
		//Lines of code to obtain special keys 
			int cnum = num+11;
			String snum = Integer.toString(cnum);
			num1 = snum.charAt(0);
			num2 = snum.charAt(1);
			passk = Specialkey(num1);
			passk2 = Specialkey(num2);
		}
		spas2 = Character.toString(passk2);
	//If statement evaluating if passwordc is less than 8
	//Evaluates if passwordc is less than 8 to know if the password length 
	//meets required 8 characters
		if(passwordc<8) {
			System.out.print("This is your password: "+one.Cap());
			Random rd = new Random();
			char updw[] = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'
					,'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
			for(int lcount = passwordc; lcount <8; lcount++) { 
			char extra[] = {updw[rd.nextInt(52)]};
			System.out.print(extra);
		}
			if(spas2 == null) {
				System.out.println(num+""+passk);
			}
			else {
			System.out.print(num+""+""+passk+""+passk2);
			}
		}
	//Else if statement evaluating if count is equal to 8
		else if(passwordc==8) {
			System.out.println("This is your password: "+one.Cap()+num+""+passk+""+passk2);
		}
	//Else statement for if statement evaluating if count is less than 8
		else {
			System.out.print("This is your password: ");
			int passwl = passwordc-8;
			website = one.Cap();
			char[] cwebsi = website.toCharArray();
			for(int i = 0; i<cwebsi.length-passwl; i++) {
				System.out.print(cwebsi[i]);
			}
			System.out.println(num+""+passk+""+passk2);
		}
	}
	
	
public static void main(String[] args) {
		Password();
}
}
