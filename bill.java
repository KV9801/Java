import java.util.*;
class bill
{
  Scanner sc=new Scanner(System.in);
  int id, qty;
  double bill;

  bill()
  {
    System.out.println("Items...\n\n5001 - Cornflakes  \t-Rs100\n5002 - Biscuits  \t-Rs40\n5003 - Toothpaste  \t-Rs30\n5004 - Shampoo  \t-Rs120\n5005 - Oil  \t\t-Rs80\n\nEnter the ID for your item: ");
    id = sc.nextInt();
    if(id<5001||id>5005)
      {
        System.out.println("\nID should be between 5001 and 5005...");
        System.exit(0);
      }
    System.out.println("Now enter quantity (between 1 and 4): ");
    qty = sc.nextInt();
    if(qty<1||qty>4)
      {
        System.out.println("\nQuantity should be between 1 and 4...");
        System.exit(0);
      }
    display(id,qty);
  }

  void display(int a, int b)
  {
    System.out.flush();
    System.out.println("Customer ID: 1156\nBill id: 107\n\n");
    if(a==5001)
      {
        System.out.println(a+"\tCornflakes"+"\tQty "+b+"\tMRP Rs.100\n\nOFFER: 10% OFF!\n");                                 
        bill = 100*b*0.9;
      }
    else if(a==5002)
      {
        System.out.println(a+"\tBiscuits"+"\tQty "+b+"\tMRP Rs.40\n\nOFFER: 20% OFF!\n");
        bill = 40*b*0.8;
      }
    else if(a==5003)
      {
        System.out.println(a+"\tToothpaste"+"\tQty "+b+"\tMRP Rs.30\n\nOFFER: 30% OFF!\n");
        bill = 30*b*0.7;
      }
    else if(a==5004)
      {
        System.out.println(a+"\tShampoo"+"\tQty "+b+"\tMRP Rs.120\n\n");
        bill = 120*b;
      }
    else if(a==5005)
      {
        System.out.println(a+"\tOil"+"\tQty "+b+"\tMRP Rs.80\n\n");
        bill = 80*b;
      }
      System.out.println("Your total is Rs. "+bill+"\nThank you for shopping with us!");
  }

  public static void main(String[] args)
  {
    bill obj = new bill();
  }
}
