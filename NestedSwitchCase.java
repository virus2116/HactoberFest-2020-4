import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key:");
		int n = sc.nextInt();
		String s1=Integer.toString(n);
		int l = s1.length();
		char ch1 = s1.charAt(0);
    char ch2=s1.charAt(l-1);
    	int c1 = Integer.parseInt(Character.toString(ch1));
    	int c2 = Integer.parseInt(Character.toString(ch2));
        switch(c1) {
        case 0:
        	switch(c2) {
        	case 0:
        		System.out.println("&");
        		break;
        	case 1:
        		System.out.println("/");
        		break;
        		default:
            		System.out.println("-1");
        	}
        	break;
        case 1:
        	switch(c2) {
        	case 1:
        		System.out.println(" ");
        		break;
        	case 2:
        		System.out.println(".");
        		break;
        	case 3:
        		System.out.println("?");
        		break;
        		default:
            		System.out.println("-1");
        	}
        	break;
        case 2:
        	switch(c2) {
        	case 1:
        		System.out.println("A");
        		break;
        	case 2:
        		System.out.println("B");
        		break;
        	case 3:
        		System.out.println("C");
        		break;
        		default:
            		System.out.println("-1");
        	}
        	break;
        case 3:
        	switch(c2) {
        	case 1:
        		System.out.println("D");
        		break;
        	case 2:
        		System.out.println("E");
        		break;
        	case 3:
        		System.out.println("F");
        		break;
        		default:
            		System.out.println("-1");
        	}
        	break;
        case 4:
        	switch(c2) {
        	case 1:
        		System.out.println("G");
        		break;
        	case 2:
        		System.out.println("H");
        		break;
        	case 3:
        		System.out.println("I");
        		break;
        		default:
            		System.out.println("-1");
        	}
        	break;
        case 5:
        	switch(c2) {
        	case 1:
        		System.out.println("J");
        		break;
        	case 2:
        		System.out.println("K");
        		break;
        	case 3:
        		System.out.println("L");
        		break;
        		default:
            		System.out.println("-1");
        	}
        	break;
        case 6:
        	switch(c2) {
        	case 1:
        		System.out.println("M");
        		break;
        	case 2:
        		System.out.println("N");
        		break;
        	case 3:
        		System.out.println("O");
        		break;
        		default:
            		System.out.println("-1");
        	}
        	break;
        case 7:
        	switch(c2) {
        	case 1:
        		System.out.println("P");
        		break;
        	case 2:
        		System.out.println("Q");
        		break;
        	case 3:
        		System.out.println("R");
        		break;
        		default:
            		System.out.println("-1");
        	}
        	break;
        case 8:
        	switch(c2) {
        	case 1:
        		System.out.println("S");
        		break;
        	case 2:
        		System.out.println("T");
        		break;
        	case 3:
        		System.out.println("U");
        		break;
        		default:
            		System.out.println("-1");
        	}
        	break;
        case 9:
        	switch(c2) {
        	case 1:
        		System.out.println("V");
        		break;
        	case 2:
        		System.out.println("W");
        		break;
        	case 3:
        		System.out.println("X");
        		break;
        	case 4:
        		System.out.println("Y");
        		break;
        	case 5:
        		System.out.println("Z");
        		break;
        		default:
            		System.out.println("-1");
        	}
        	break;
        default:
    		System.out.println("-1");
        }
	}

}
