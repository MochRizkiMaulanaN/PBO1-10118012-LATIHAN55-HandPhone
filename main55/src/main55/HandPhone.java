/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main55;

/**
 *
 * @author LENOVO
 */
public class HandPhone {
    protected String manufacture,operatingSystem,model;
    protected int harga;
    
    public HandPhone(String man,String os,String model,int harga){
        manufacture=man;
        operatingSystem=os;
        this.model=model;
        this.harga=harga;
    }
    
    public void displayProduct(){
        System.out.println("Maufacture : "+manufacture);
        System.out.println("OS : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
    }
}
