package others.com.src.Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wordSt="watch";
	    char[] word=wordSt.toCharArray();

	    for(int i=0;i<(word.length-1);i++){
	        for(int j=i+1;j>0;j--){
	            if(word[j]<word[j-1]){
	                char temp=word[j-1];
	                word[j-1]=word[j];
	                word[j]=temp;
	            }
	        }
	    }
	    wordSt=String.valueOf(word);
	    System.out.println(wordSt);
	}}