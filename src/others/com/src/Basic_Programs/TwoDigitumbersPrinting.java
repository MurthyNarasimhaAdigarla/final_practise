package others.com.src.Basic_Programs;

public class TwoDigitumbersPrinting {


    // Function to return the modified string
    static void extractInt(String str) {
        // Replacing every non-digit number
        // with a space(" ")
        str = str.replaceAll("[^\\d]", " ");

        // Remove extra spaces from the beginning
        // and the ending of the string
        str = str.trim();

        // Replace all the consecutive white
        // spaces with a single space
        str = str.replaceAll(" +", " ");
        String[] sss = str.split(" ");
        System.out.println(sss);


    }


    // Driver code
    public static void main(String[] args) {
        String str = "avbkjd1122klj4 53 af";
       // System.out.print(extractInt(str));


    }
}