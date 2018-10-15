class simpledotcom{
  int[] locationcells;
  int numofhits = 0;
  public void setlocationcells(int[] locs){
    locationcells = locs;
  }
  public String checkyourself(String userguess){
    int guess = Integer.parseInt(userguess);
    String result = "miss";
    for(int cell : locationcells){
      if(guess==cell){
        result="hit";
        numofhits++;
        break;
      }
    }
    if (numofhits==locationcells.length){
      result="kill";
    }
    System.out.println(result);
    return result;
  }
}
public class simpledotcomtestdrives{
  public static void main(String[] args){
    simpledotcom dot=new simpledotcom();
    int []locations={2,3,4};
    dot.setlocationcells(locations);
    String userguess="2";
    String result=dot.checkyourself(userguess);
  }
}
