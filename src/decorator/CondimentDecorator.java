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
public abstract class CondimentDecorator extends Beverage
{
    Beverage component;
    
    public CondimentDecorator(Beverage component)
    {
        this.component = component;
    }
    
    @Override
    public String getDescription()
    {
        return component.getDescription();
    }
}
