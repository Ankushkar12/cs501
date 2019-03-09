public class Sum_Odd_Even
{
 public static void
main(String[] args)
 {
 long startTime =
System.nanoTime();
 int n, sumO = 0;
 n = 9999;
 for(int i = 0; i <= n; i++)
 {
 if(i % 2 == 0)
 {
 int even;
 even=i;
 }
 else
 {
 sumO = sumO + i;
 }
 }

 long endTime =
System.nanoTime();
 long totalTime = endTime -
startTime;
 System.out.println("Sum of
Odd Numbers:"+sumO);

System.out.println(totalTime);
 }
}
