/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.principles_.skills.demo.brief.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.HeadlessException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author nevermindcv
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// Variables
        //To fix Decimals
        DecimalFormat df = new DecimalFormat("0.00");

        // phones
        String phone = "";

        //Loop
        int count = 0;

        // Answer Phone chosen
        int ans = 0;

        // Quantities Mobiles
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;

        // single Quantities Mobile
        //Stock
        int iphonexs = 100;
        int iphone8s = 100;
        int samsungs8s = 100;
        int pixel2s = 100;

        // Mobiles Prices
        int iphonexprice = 1100;
        int iphone8price = 900;
        int s8price = 900;
        int pixel2price = 850;

        for (count = 0; count < 4; count++) {

            for (int i = 0; i < 1; i++) {
                try {
                    ans = Integer.parseInt(JOptionPane.showInputDialog(null, "Which Mobile Do you Want to Purchase?" + "\n " + "\n Option 1: iPhone X:  €" + iphonexprice + "\n Option 2: iPhone 8 Plus:  €" + iphone8price
                            + "\n Option 3: Samsung S8 :  €" + s8price + "\n Option 4: Pixel 2 XL:  €" + pixel2price + "\n      "));
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid Answer, please Re-Enter Number Between 1 - 4 ", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                    i--; //subtrack one from the variable
                }
            }

            if (ans == 1) {

                q1 = Loop1("How Many iPhones X Do You Want to Purchase");

                if (iphonexs < q1 || iphonexs < 0 || q1 > 100) {
                    JOptionPane.showMessageDialog(null, "Out Of Stock", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                    count--;
                    JOptionPane.showMessageDialog(null, "Stock Left" + iphonexs + " Units");
                    
                /*}else if (q1 < 0){
                             JOptionPane.showMessageDialog(null, "Invalid Answer, please Re-Enter your Quantity ", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                            count--;*/
                } else {
                    iphonexs = iphonexs - q1;
                    phone = "iPhone X";// Variable for Ticket Type
                    int finalpriceiphonex = iphonexprice * q1;//Price
                    JOptionPane.showMessageDialog(null, "Phone Selected:  " + phone + "\n Total Price:  €" + df.format(finalpriceiphonex) + "\n Stock iPhone X: " + iphonexs + " Units left");//output per person
                    for (int e = 0; e < 1; e++) {
                        try {
                            for (int i = 0; i < 1; i++) {
                                double pay1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Amount of Cash to Make your Payment"));//Question asking payment

                                if (pay1 <= 0 || pay1 < finalpriceiphonex) {

                                    JOptionPane.showMessageDialog(null, "Insufficient money has entered, Please Re-Enter it Again", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                                    i--;
                                } else {
                                    double change1 = pay1 - finalpriceiphonex;
                                    JOptionPane.showMessageDialog(null, "Your Phone has been Dispensed" + "\n Your Change is: €" + df.format(change1));
                                }
                            }
                        } catch (Exception t) {
                            JOptionPane.showMessageDialog(null, "Wrong Character Entered, Please Enter an Amount of money valid", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                            e--;

                        }
                    }
                }
            } else if (ans == 2) {
                    q2 = Loop1("How Many iPhones 8 Plus Do You Want to Purchase");

                    if (iphone8s < q2 || iphone8s < 0 || q2 > 100) {
                    JOptionPane.showMessageDialog(null, "Out Of Stock", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                    count--;
                    JOptionPane.showMessageDialog(null, "Stock Left" + iphone8s + " Units");
                } else {
                iphone8s = iphone8s - q2;//stock
                phone = "iPhone 8 Plus";// Variable for Ticket Type
                int finalpriceiphone8 = iphone8price * q2;//Price
                
                JOptionPane.showMessageDialog(null, "Phone Selected:  " + phone + "\n Total Price:  €" + finalpriceiphone8 + "\n Stock iPhone X: " + iphone8s + " Units left");//output per person
                for (int x = 0; x < 1; x++) {
                    try {
                        for (int i = 0; i < 1; i++) {
                            double pay2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Amount of Cash to Make your Payment"));//Question asking payment

                            if (pay2 <= 0 || pay2 < finalpriceiphone8) {

                                JOptionPane.showMessageDialog(null, "Insufficient money has entered, Please Re-Enter it Again", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                                i--;
                            } else {
                                double change2 = pay2 - finalpriceiphone8;
                                JOptionPane.showMessageDialog(null, "Your Phone has been Dispensed" + "\n Your Change is: €" + df.format(change2));
                            }
                        }
                    } catch (Exception t) {
                        JOptionPane.showMessageDialog(null, "Wrong Character Entered, Please Enter an Amount of money valid", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                        x--;
                    }
                }
                    }
            }else if (ans == 3) {
                
                    q3 = Loop1("How Many Samsung S8 Plus Do You Want to Purchase");
                    if (samsungs8s < q3 || samsungs8s < 0 || q3 > 100) {
                    JOptionPane.showMessageDialog(null, "Out Of Stock", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                    count--;
                    JOptionPane.showMessageDialog(null, "Stock Left" + samsungs8s + " Units");
                } 
                
                    else{
                        samsungs8s = samsungs8s - q3;//stock
                phone = "Samsung S8 Plus";// Variable for Ticket Type
                int finalprices8 = s8price * q3;//Price
                
                JOptionPane.showMessageDialog(null, "Phone Selected:  " + phone + "\n Total Price:  €" + finalprices8 + "\n Stock iPhone X: " + samsungs8s + " Units left");//output per person
                for (int x = 0; x < 1; x++) {
                    try {
                        for (int i = 0; i < 1; i++) {
                            double pay3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Amount of Cash to Make your Payment"));//Question asking payment

                            if (pay3 <= 0 || pay3 < finalprices8) {

                                JOptionPane.showMessageDialog(null, "Insufficient money has entered, Please Re-Enter it Again", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                                i--;
                            } else {
                                double change3 = pay3 - finalprices8;
                                JOptionPane.showMessageDialog(null, "Your Phone has been Dispensed" + "\n Your Change is: €" + df.format(change3));
                            }
                        }
                    } catch (Exception t) {
                        JOptionPane.showMessageDialog(null, "Wrong Character Entered, Please Enter an Amount of money valid", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                        x--;
                    }
                    }
                }
            } else if (ans == 4) {
                    q4 = Loop1("How Many Pixel 2 XL Do You Want to Purchase");
                    if (pixel2s < q3 || pixel2s < 0 || q3 > 100) {
                    JOptionPane.showMessageDialog(null, "Out Of Stock", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                    count--;
                    JOptionPane.showMessageDialog(null, "Stock Left" + pixel2s + " Units");
                } 
                else{
                pixel2s = pixel2s - q4;//stock
                phone = "Pixel 2 XL";// Variable for Phone Model
                int finalpricepixel = pixel2price * q4;//Price
                JOptionPane.showMessageDialog(null, "Phone Selected:  " + phone + "\n Total Price:  €" + finalpricepixel + "\n Stock iPhone X: " + pixel2s + " Units left");//output per person
                for (int x = 0; x < 1; x++) {
                    try {
                        for (int i = 0; i < 1; i++) {
                            double pay4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Amount of Cash to Make your Payment"));//Question asking payment

                            if (pay4 <= 0 || pay4 < finalpricepixel) {

                                JOptionPane.showMessageDialog(null, "Insufficient money has entered, Please Re-Enter it Again", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                                i--;
                            } else {
                                double change4 = pay4 - finalpricepixel;
                                JOptionPane.showMessageDialog(null, "Your Phone has been Dispensed" + "\n Your Change is: €" + df.format(change4));
                            }
                        }
                    } catch (Exception t) {
                        JOptionPane.showMessageDialog(null, "Wrong Character Entered, Please Enter an Amount of money valid", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                        x--;
                    }
                    }
                    }
                }else {
                JOptionPane.showMessageDialog(null, "Invalid Answer, please Re-Enter Number Between 1 - 4 ", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                count--;
            }
        
        // Variable Final Stock

        int finalstockiphonex = iphonexs - q1;
        int finalstockiphone8 = iphone8s - q2;
        int finalstocks8 = samsungs8s - q3;
        int finalstockpixel = pixel2s - q4;

        JOptionPane.showMessageDialog(null, "FINAL STOCK" + "\n  " + "\n iPhone X: " + finalstockiphonex + " Units Left" + "\n iPhone 8: " + finalstockiphone8 + " Units Left" + "\n Samsung S8 Plus: " + finalstocks8 + " Units Left" + "\n Pixel 2 XL: " + finalstockpixel + " Units Left");
    }
    }

    public static int Loop1(String msg) {
        int q1 = 0;

        for (int z = 0; z < 1; z++) { // Loop to fix wrong input
            try {
                q1 = Integer.parseInt(JOptionPane.showInputDialog(null, msg)); // Question phone Quantity 
                if (q1 > 0) {

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Quantity, please Re-Enter Amount", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                    z--; //subtrack one from the variable
                }

            } catch (Exception a) {
                JOptionPane.showMessageDialog(null, "Invalid Quantity, please Re-Enter Amount", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                z--;//subtrack one from the variable
            }

        }
        return q1;

    }

   /* public static int loopQuestion() {
        int ans = 0;
        // Mobiles Prices
        int iphonexprice = 1100;
        int iphone8price = 900;
        int s8price = 900;
        int pixel2price = 850;

        for (int i = 0; i < 1; i++) {
            try {
                ans = Integer.parseInt(JOptionPane.showInputDialog(null, "Which Mobile Do you Want to Purchase?" + "\n " + "\n Option 1: iPhone X:  €" + iphonexprice + "\n Option 2: iPhone 8 Plus:  €" + iphone8price
                        + "\n Option 3: Samsung S8 :  €" + s8price + "\n Option 4: Pixel 2 XL:  €" + pixel2price + "\n      "));
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid Answer, please Re-Enter Number Between 1 - 4 ", "ERROR", JOptionPane.ERROR_MESSAGE);//Output when enter wrong Answer
                i--; //subtrack one from the variable
            }
        }
        return ans;

    }*/

}
