public class oddsum {

 public static int
oddSum(int num)
 {
  if (num == 1)
 {
  return 1;
 }
 return(2*num -1 + oddSum(num-1) );
 }
 public static void
  main(String[] args) {
 long startTime = System.nanoTime();
 int result = oddSum(9999);
 long endTime = System.nanoTime();
 long totalTime = endTime - startTime;

  System.out.println("Sum is "+result);

System.out.println("Time taken: " +totalTime);
 }
}
