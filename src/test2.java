public class test2 {
 public static void main(String[] args) {
 int[][] a = {{10,20},{30},{50,60,70},{80,90}};
 System.out.println("Array size = "+ a.length);
 System.out.println("First row size = "+ a[0].length);
 System.out.println("Second row size = "+ a[1].length);
 System.out.println("third row size = "+ a[2].length);
System.out.println("four row size = "+ a[3].length);
 System.out.println("Array elements:");
for(int i=0; i <a.length; i++){
 for (int j=0; j < a[i].length; j++) {
  System.out.print(a[i][j] + "\t");}
System.out.println();
   }}
}

