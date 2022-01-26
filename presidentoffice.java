import java.util.*;

public class presidentoffice {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] firstLine = s.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]), m = Integer.parseInt(firstLine[1]);
        String c = firstLine[2];
        String[][] layout = new String[n][m];
        for (int i = 0; i < n; i++){
            String[] line = s.nextLine().split("");
            for (int j = 0; j < m; j++){
                layout[i][j] = line[j];
            }
        }
        Set<String> colours = new HashSet<String>();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (layout[i][j].equals(c)){
                    if (j+1 < m && !layout[i][j+1].equals(".") && !layout[i][j+1].equals(c)){colours.add(layout[i][j+1]);}
                    if (j-1 >= 0 && !layout[i][j-1].equals(".") && !layout[i][j-1].equals(c)){colours.add(layout[i][j-1]);}
                    if (i+1 < n && !layout[i+1][j].equals(".") && !layout[i+1][j].equals(c)){colours.add(layout[i+1][j]);}
                    if (i-1 >= 0 && !layout[i-1][j].equals(".") && !layout[i-1][j].equals(c)){colours.add(layout[i-1][j]);}
                }
            }
        }
        System.out.println(colours.size());
        s.close();
    }
}
