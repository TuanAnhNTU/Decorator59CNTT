/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import beverage.Beverage;

/**
 *
 * @author Tuấn Anh
 */
public class Milk extends CondimentDecorator
{
    public Milk(Beverage component)
    {
        super(component);
    }  
    @Override
    public float cost()
    {
         return component.cost() + 3000;
    }
    
    @Override
    public String getDescription()
    {
        return super.getDescription() + " + Milk"; 
        
    }   
}
