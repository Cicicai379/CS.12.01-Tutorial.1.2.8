import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close)
    { openDel = open; closeDel = close; }

    public String getOpenDel(){
        return openDel;
    }
    public String getCloseDel(){
        return closeDel;
    }
    public ArrayList<String> getDelimitersList(String[] token)
    {
        ArrayList<String> ans = new ArrayList<>();
        for (String e: token) {
            if (e.equals(openDel) || e.equals(closeDel))
                ans.add(e);
        }
        return ans;
    }
    public boolean isBalanced(ArrayList<String> delimiters) {
        int x = 0, y = 0;
        for(String d : delimiters){
            if(d.equals(openDel))
                x++;
            if(d.equals(closeDel))
                y++;
            if(y>x){
                return false;
            }
        }
        return x == y;
    }
}