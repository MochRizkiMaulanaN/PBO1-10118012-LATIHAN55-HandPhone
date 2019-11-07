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
public class Main55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android A =new Android("Samsung","Android","Grand",3000000);
        A.displayProduct();
        A.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store : "+A.getKeyStore());
        System.out.println("");
        BlackBerry B =new BlackBerry("BlckB","RIM","Curve", 2000000);
        B.displayProduct();
        B.setPinBB("BHS249");
        System.out.println("PIN : "+B.getPinBB());
        System.out.println("");
        WindowsPhone WP=new WindowsPhone("Nokia","Win8","Lumia",1000000);
        WP.displayProduct();
        WP.setWpKeyStore("UUUQIJWIRJ");
        System.out.println("Wp Key Store : "+WP.getWpKeyStore());
        
    }
    
}
