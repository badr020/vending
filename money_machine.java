import java.util.Scanner;

public class money_machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("please enter the amount = ");
int amount= input.nextInt();
int half=amount/50;
int reminder=amount%50;
int quarters=reminder/25;

reminder=reminder%25;
int qorosh=reminder/5;
reminder=reminder%5;
int halah=reminder;
System.out.print("the amount is =  \n"+ amount+"\n the half is = "+half+"\n quarter is = "+quarters+"\n qorosh is = "+ qorosh+"\nhalah is = "+halah);

	}

}
