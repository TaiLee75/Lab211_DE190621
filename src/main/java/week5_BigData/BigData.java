/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_BigData;

/**
 *
 * @author ADMIN
 */
public class BigData {

    private String a, b;

    public BigData() {
    }

    public BigData(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String add(){
        StringBuilder result = new StringBuilder();
        int rememberValue = 0;
       
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        int maxLen = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLen; i++) {
            int sum = rememberValue;
            if (i < a.length()) sum += a.charAt(i) - '0';
            if (i < b.length()) sum += b.charAt(i) - '0';

            result.append(sum % 10);
            rememberValue = sum / 10;
        }
        if (rememberValue > 0) result.append(rememberValue);

        return result.reverse().toString();
        
        
        
        
    }
    
    
}
