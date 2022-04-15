import java.util.Scanner;
public class Start {
	static char[] a= {'1','2','3','4','5','6','7','8','9'};
	static boolean isOn=true;
	
	public static void PrintGame() {
	String struct1=" "+"---"+" "+"---"+" "+"---";
	String line1="|"+" "+a[0]+" "+"|"+" "+a[1]+" "+"|"+" "+a[2]+" "+"|";
	String struct2=" "+"---"+" "+"---"+" "+"---";
	String line2="|"+" "+a[3]+" "+"|"+" "+a[4]+" "+"|"+" "+a[5]+" "+"|";
	String struct3=" "+"---"+" "+"---"+" "+"---";
	String line3="|"+" "+a[6]+" "+"|"+" "+a[7]+" "+"|"+" "+a[8]+" "+"|";
	String struct4=" "+"---"+" "+"---"+" "+"---";
	System.out.println(struct1);
	System.out.println(line1);
	System.out.println(struct2);
	System.out.println(line2);
	System.out.println(struct3);
	System.out.println(line3);
	System.out.println(struct4);
	}

	public static void checkV() {
		if(Start.a[0]==Start.a[1] && Start.a[1]==Start.a[2]) {
			System.out.println(Start.a[0] +" " +"WON");
			isOn=false;}
		else if(Start.a[0]==Start.a[3] && Start.a[3]==Start.a[6]) {
			System.out.println(Start.a[0] +" " +"WON");
			isOn=false;}
		else if(Start.a[0]==Start.a[4] && Start.a[4]==Start.a[8]) {
			System.out.println(Start.a[0] +" " +"WON");
			isOn=false;}
		else if(Start.a[1]==Start.a[4] && Start.a[4]==Start.a[7]) {
			System.out.println(Start.a[1] +" " +"WON");
			isOn=false;}
		else if(Start.a[2]==Start.a[5] && Start.a[5]==Start.a[8]) {
			System.out.println(Start.a[2] +" " +"WON");
			isOn=false;}
		else if(Start.a[2]==Start.a[4] && Start.a[4]==Start.a[6]) {
			System.out.println(Start.a[2] +" " +"WON");
			isOn=false;}
		else System.out.println("NEXT MOVE PLEASE.....");
	}
	
	public static void turn() {
		Scanner scan = new Scanner(System.in);
		int counter=0;
		try {
		do{
			int x=scan.nextInt();
			if(Start.a[x-1]!='X' && Start.a[x-1]!='O') {
			if(counter%2==0) Start.a[x-1]='X';
			else if (counter%2 != 0) Start.a[x-1]='O';
			else if(counter==0) break;
			counter++;
			Start.PrintGame();
			Start.checkV();	}	
			else {System.out.println("VALUE REPEAT.....1 ENTER AGAIN");
			}
		}while(counter<=8 && Start.isOn);}
		
		catch(Exception e) {
			System.out.println("ENTER CORRECT VALUE game over!!");
		}
		finally {
			if(counter==9) {
			System.out.println("OOPS...GAME OVER WELL PLAYED");}}
		
	}
	
	
	
	public static void turn1() {
		Start.turn();
	}
}
