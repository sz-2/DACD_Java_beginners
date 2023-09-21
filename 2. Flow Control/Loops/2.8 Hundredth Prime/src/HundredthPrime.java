public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 0;
      int num = 2;

      while(count < 100)
      {
         for(int div=2; div <= num; div++)
         {
            if(num % div == 0 & num != div) break;
            else if(num % div == 0 & num == div)
            {
               count++;
            }
         }
         num++;
      }
      System.out.println(num-1);
   }
}