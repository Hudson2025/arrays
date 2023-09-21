
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String[] args) {
        String[] strArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};

        System.out.println ("\n");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);    
        }

        System.out.println ("\n");
        for (String item : strArray) {
            System.out.print(item + " ");
        }    

        System.out.println ("\n");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);
            if (i < strArray.length-1) {
                System.out.print("-");
            }
        }
        
    } 
} 