import java.util.Scanner;
public class ATM {
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        double amt=0.0;

        boolean flag=true;
        int userid=123;
        int pin=8953;
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("**********Welcome to The Mandarin Bank of India**********");
        System.out.println("");

        while(flag==true){
            System.out.println("-------------------------------------------------------");
            System.out.println("");
            System.out.println("Press 1 to Deposit Cash");
            System.out.println("Press 2 to Withdraw Cash");
            System.out.println("Press 3 to Cash Transfer");
            System.out.println("Press 4 to View Balance");
            System.out.println("Press 5 to Exit");
            int input = x.nextInt();
            System.out.println("");
            System.out.println("-------------------------------------------------------");
            System.out.println("Input the User ID");
            int id = x.nextInt();
            System.out.println("Input the Password");
            int pass = x.nextInt();
            if (pass == pin && id == userid) {
                switch (input) {
                    case 1:
                        amt += deposit();
                        System.out.println("Total Amount=" + amt);

                        break;
                    case 2:
                        amt -= withdraw(amt);
                        System.out.println("Total Amount=" + amt);
                        break;
                    case 3:
                        amt -= transfer(amt);
                        System.out.println("Total Amount=" + amt);
                        break;
                    case 4:
                        view(amt);
                        break;
                    case 5:
                        exit();
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            } else {
                System.out.println("Authentication Failed! Please Try Again");
            }
        }
    }
    public static double deposit()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Amount");
        double amt=x.nextDouble();
        System.out.println("");
        System.out.println("Press Y to continue and N to Cancel");
        char stu=(x.next()).charAt(0);
        if(stu=='Y')
        {
            System.out.println("Amount Deposited Successfully");
        }
        else
        {
            System.out.println("Transaction Cancelled");
            amt=0.0;
        }
        return amt;
    }
    public static double withdraw(double money)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Amount");
        double amt=x.nextDouble();
        System.out.println("");
        if(amt>money)
        {
            System.out.println("Your Amount does not have this much money");
        }
        else {
            System.out.println("Press Y to continue and N to Cancel");
            char stu = (x.next()).charAt(0);
            if (stu == 'Y') {
                System.out.println("Amount Withdraw Successfully");
            } else {
                System.out.println("Transaction Cancelled");
                amt = 0.0;
            }
        }
        return amt;
    }
    public static void view(double money)
    {
        System.out.println("Your Balance is:"+money);
    }
    public static double transfer(double money)
    {
        double amt=0.0;
        int trans=1234;
        Scanner x=new Scanner(System.in);
        System.out.println("Input the Receiver ID");
        int id=x.nextInt();
        System.out.println("");
        if(id==trans) {
            System.out.println("Enter the Amount");
            amt= x.nextDouble();
            System.out.println("");
            if (amt > money) {
                System.out.println("Your Amount does not have this much money");
            } else {
                System.out.println("Press Y to continue and N to Cancel");
                char stu = (x.next()).charAt(0);
                if (stu == 'Y') {
                    System.out.println("Amount Transfer Successfully");
                } else {
                    System.out.println("Transaction Cancelled");
                    amt = 0.0;
                }
            }
        }
        else
        {
            System.out.println("Error:ID not found");

        }
        return amt;
    }
    public static void exit()
    {
        System.out.println("Thanks! for visiting us");
    }

}
