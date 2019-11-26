
/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price; 
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // Total amount of tickets sold.
    private int sold;
    


    public TicketMachine(int cost)
    {
        if ( 0<=cost||cost<=500) { 
        price = cost;
    }
        else {
        price = 500;
    }
        balance = 0;
        total = 0;
        sold = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    /**
    * * Return the total money
    */
    public int getTotal()
    { return total;
    }
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getAmount()
    {
        return balance;
    }
    
    public int getSold()
    {
        return sold;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
    * Task 8
    */
    public void prompt()
    { 
        System.out.print("Please insert the correct amount of money.");
    }    

    /**
    * Reduce the price by given amount.
    */
    public void discount ( int amount)
    {
        if (amount <= price) {
        price = price - amount; 
    }
    else {
        System.out.println("Pleaser enter a value, which is less than the value of price!");
    }
    }
    /**
    * Show price method.
    */
    public void showPrice()
    { 
        System.out.println("The price of a ticket is " + price + " cents.");
    }
    /**
    * Zero out the total field.
    */
    public void setEmpty()
    { total = 0;
    
    }
   
  
   /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
            // Update the number of tickets sold.
            sold = sold + 1;
        }
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return money in Euro amount
     * Balance also get cleared
     */   
    public double refundEuro()
    {
        double refundEuro;
        refundEuro = balance;
        refundEuro /= 100;
        balance = 0;
        return refundEuro;
    }
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }

}
