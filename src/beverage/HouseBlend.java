/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beverage;

/**
 *
 * @author Tuấn Anh
 */
public class HouseBlend extends Beverage
{

    public HouseBlend(String description)
    {
        super(description);
    }
    @Override
    public float cost()
    {
        return 17000;
    }
    
}
