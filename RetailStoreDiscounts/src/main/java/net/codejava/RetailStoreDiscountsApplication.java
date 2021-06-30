package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class RetailStoreDiscountsApplication {  
  
int userNo;
String userName;
int noOfYears;
int discount,price;

void discount()
{
 if(price > 100)
 {
     discount = 5 * (price/100);
     price = price - discount;
 }
}
 int getPrice()
 {
   return price;  
 }


//Create different objects and check their discounts
	public static void main(String[] args) {
		SpringApplication.run(RetailStoreDiscountsApplication.class, args);
                
                Employee object = new Employee(202002434,"Reneilwe",2,450);
                object.discount();
                System.out.println("The price is: ");
                System.out.println(object.getPrice());
                
                Affiliate affObject = new Affiliate(202002412,"Maseko",2,50);
                affObject.discount();
                System.out.println("The price is: ");
                System.out.println(affObject.getPrice());
                
                Customer cusObject = new Customer(202003490,"Olebogeng",2,40566);
                cusObject.discount();
                System.out.println("The price is: ");
                System.out.println(cusObject.getPrice());
                
	}

}


 class Employee extends RetailStoreDiscountsApplication
{
    public Employee(int x,String y,int z,int a)
     {
       userNo = x;
       userName = y;
       noOfYears = z; 
       price = a;
     }
 @Override
 void discount()
 {
   discount = (int) (0.3 * price); 
   price = price - discount;
 }
 
}

 class Affiliate extends RetailStoreDiscountsApplication
{
     public Affiliate(int x,String y,int z,int a)
     {
       userNo = x;
       userName = y;
       noOfYears = z; 
       price = a;
     }
 @Override
 void discount()
 {
   discount = (int) (0.1 * price); 
   price = price - discount;  
 }
 
}

 class Customer extends RetailStoreDiscountsApplication
{
     public Customer(int x,String y,int z,int a)
     {
       userNo = x;
       userName = y;
       noOfYears = z; 
       price = a;
     }

 @Override
 void discount()
 {
   if(noOfYears > 2)
   {
   discount = (int) (0.05 * price); 
   price = price - discount;   
   }
 }
 
}