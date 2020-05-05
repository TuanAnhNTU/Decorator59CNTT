/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator59cntt2;
import beverage.Beverage;
import beverage.DarkRoast;
import decorator.Milk;

/**
 *
 * @author Tuấn Anh
 */
public class Decorator59CNTT2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       Beverage dr = new DarkRoast("Cafe đen só 1 thế giới");   
       dr = new Milk(dr);
       System.out.println(dr.getDescription());
       System.out.println("Giá: " + dr.cost());
       dr = new Milk(dr);
       //dr.cost();
       System.out.println(dr.getDescription());
       System.out.println("Giá: " + dr.cost());
    }
    
}
