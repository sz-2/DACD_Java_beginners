public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];
      int change = 0;

      /* Create and print a chessboard. */
     for(int row=0; row < 8; row++)
     {
         for(int colum=0; colum < 8; colum++)
         {
            if (change%2 != 0)
            {
                if(colum%2 != 0)
                {
                    chessboard[row][colum]='\u25A1';
                    System.out.print(chessboard[row][colum]);
                } else{
                    chessboard[row][colum]='\u25A0';
                    System.out.print(chessboard[row][colum]);
                }
            } else{
                if(colum%2 != 0)
                {
                    chessboard[row][colum]='\u25A0';
                    System.out.print(chessboard[row][colum]);
                } else{
                    chessboard[row][colum]='\u25A1';
                    System.out.print(chessboard[row][colum]);
                }
            }
         }
         System.out.print('\n');
         change++;
     }
   }
}