public class Board{

  private String[][] squares;

  public Board(){
    String[][] squares=new String[10][10];
    for(int i=0;i<squares.length;i++)
      {
        for(int a=0;a<squares[0].length;a++)
          {
            squares[i][a]=("-");
          }
      }
  }

  public String toString(){
    String to="";
    for(int i=0;i<squares.length;i++)
      {
        for(int a=0;a<squares[0].length;a++)
          {
            to+=(squares[i][a]);
          }
        to+=("\n");
      }
    return to;
  }

  public boolean addShip(int row, int col, int len, boolean horizontal){
    if(horizontal)
    {
      for(int temp=0;temp<len;temp++)
        {
          if(!((row)<squares.length&&(col+temp)<squares[0].length))
          {
            return false;
          }
          if(squares[row][col+temp].equals("b"))
          {
            return false;
          }
        }
      for(int temp=0;temp<len;temp++)
        {
          for(String[] i:squares)
          {
            for(String a:i)
            {
              a=("b");
            }
          }
        }
      return true;
    } else {
      for(int temp=0;temp<len;temp++)
        {
          if(!((row)<squares.length&&(col+temp)<squares[0].length))
          {
            return false;
          }
          if(squares[row][col+temp].equals("b"))
          {
            return false;
          }
        }
      for(int temp=0;temp<len;temp++)
        {
          for(String[] i:squares)
          {
            for(String a:i)
            {
              a=("b");
            }
          }
        }
      return true;
    }
  }

  public boolean foundShip(int len){
    return false;
  }

  public int shoot(int row, int col){
    return 0;
  }

  public boolean gameOver(){
    return false;
  }

}
