package test;
import javax.swing.JOptionPane; 
	   
	public class daoxu {
	       
	    public static void main (String args[]){ 
	        String originalString; 
	        String resultString = "";    
	           
	        originalString = JOptionPane.showInputDialog("����������Ҫ�����ֵ");
	        char[] charArray = originalString.toCharArray(); 
	       
	        for (int i=charArray.length-1; i>=0; i--){ 
	            resultString += charArray[i]; 
	        } 
	           
	        JOptionPane.showMessageDialog(null, resultString, "Reverse String", JOptionPane.INFORMATION_MESSAGE); 
	      
	    } 
	}


