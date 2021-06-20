/*
An online shopping cart is a collection of items that a shopper uses to collect things for purchase. A shopper can add items to the cart, remove them, empty the cart, view the items in the cart, and end shopping and proceed to checkout.
Using the Java ArrayList class/array of object, you will write a program to support these functions. Each item added to the cart will be represented with the CartItem class.

When your program begins, you will display a menu of actions the shopper can perform:

SHOPPING CART OPTIONS
1 add an item to your cart
2 remove an item from your cart
3 view the items in your cart
4 end shopping and go to checkout
5 empty your cart
6 exit the program

Your program will allow the shopper to add and remove items to the shopping cart. The program should continue as long as the shopper want to keep going. The shopper can exit by choosing option 6, and in this case the shopper will exit without making a purchase. The shopper can also exit by selecting option 4, and go to checkout. In this option, the program will display the amount due by adding up the cost of all the items in the cart. Use the NumberFormat class to format the amount in currency.

*/

import java.util.*;
class CartItem
{
    String itemName;
    float price;
    int qty;
    static float totalItemPrice;
    int cnt=0;
    static int Itemcnt=0;
    CartItem[] cart = new CartItem[20]; 

    int choice = 0;
    CartItem(){}

    boolean bool;
    Scanner sc = new Scanner(System.in);
    
    public CartItem(String itemName ,int qty,float price)
    {
        this.itemName = itemName;
        this.price = price;
        this.qty = qty;
    }

    public void addDetails()
    {
        do{

        System.out.println(" See the menu and choose the correct option");
        System.out.println("1-> Add Item in cart: ");
        System.out.println("2-> Remove Item in cart: ");
        System.out.println("3-> View Item in cart: ");
        System.out.println("4-> End shopping & go chechout: ");
        System.out.println("5-> empty your cart");
        System.out.println("6-> Exit");

         choice = sc.nextInt();
            switch(choice)
            {
                case 1 : addItems();                
                        break;
                
                case 2 : removeItems();            
                        break;

                case 3 : ViewAllItems();
                        break;

                case 4 : EndShoping();
                        break;

                case 5 : emptyCart();
                        break;

                case 6 : System.exit(0);

                default : System.out.println("You made wrong choice...!");
                        break;

            }

        }while(choice >0);
    
    }
    public void addItems()
    {
        System.out.println("Enter itemName, QtY, Price:");
        System.out.println("itemName should not be same.");
        sc.nextLine();
        String itemName = sc.nextLine();
        
        bool = ifSameName(itemName);
        if(bool)
        {
            addDetails();
        }
        
        int qty = sc.nextInt();
        float price = sc.nextFloat();
        float itemPrice = price*qty;
        totalItemPrice += itemPrice;
        CartItem c = new CartItem(itemName,qty,price);

        cart[cnt++]= new CartItem(c.itemName, c.qty, c.price);
        ++Itemcnt;
    }

    public void removeItems()
    {
        System.out.print("Enter name to remove :");
        String supress = sc.nextLine();
        String delete = sc.nextLine();
        float thatItemPrice = 0;
        int thatItemqty = 1;
        CartItem[] cartTemp = new CartItem[20]; 

        for(int i=0,k=0 ; i <Itemcnt; i++)
        {
            if(cart[i].itemName.equals(delete))
            {
                thatItemPrice = cart[i].price;
                thatItemqty = cart[i].qty;
                System.out.println(thatItemPrice);
                continue;
            }
            cartTemp[k++]= cart[i];
        }
        totalItemPrice-= thatItemPrice*thatItemqty; 
        --Itemcnt;
        for(int l=0 ; l < Itemcnt; l++)
        {
            cart[l] = cartTemp[l];
        }
    }

    public int ViewAllItems()
    {
        if(Itemcnt==0)
        {
            System.out.println("No item present..! plz add items");
            return 0;
        }
        try{
        
            for(int i = 0; i<Itemcnt; i++)
            {
            System.out.println("------------------------------");
            System.out.println("itemName: "+cart[i].itemName +" "+"QTY: "+cart[i].qty +" "+"Price: "+cart[i].price);
            }
    
        }catch(NullPointerException e)
        {
            System.out.println("Cart is empty..!! add items");
        }

        System.out.println("------------------------------");
        System.out.println("totalItemPrice: "+totalItemPrice); 
        System.out.println("------------------------------");
        return 1;  
    }
    
    public void EndShoping() 
    {
        System.out.println("Thanks for shopping...!!! Visit again.");
        System.out.println("Do you want to exit : -->1");
        int i = sc.nextInt();
        if(i==1)
        {
           System.exit(0); 
        }
        return;    
    }

    public void emptyCart() 
    {
        for(int i =0;i < Itemcnt;i++)
        {
            cart[i]=null;
        }   
        totalItemPrice=0;
    }

    public boolean ifSameName(String name)
    {
        for(int i = 0; i<Itemcnt;i++)
        {
            if(cart[i].itemName.equals(name))
            {
                System.out.println("Entered name is already taken...!");
                return true;
            }
        }
        return false;
    }
}

public class ShoppingCartMenu
{   
     public static void main(String[] args) {
    
        CartItem c = new CartItem();
        c.addDetails();
    }
}

