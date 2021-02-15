import java.io.*;
import java.util.StringTokenizer;

class teleport {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("teleport.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int distance1 = Math.abs(b - a);
        int distance2 = Math.abs(x - a) + Math.abs(y - b);
        int distance3 = Math.abs(y - a) + Math.abs(x - b);
        out.println(Math.min(distance1, Math.min(distance2, distance3)));
        out.close();
    }

}
