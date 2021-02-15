import java.io.*;
import java.util.*;

class crossroad {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("crossroad.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crossroad.out")));
        int num = Integer.parseInt(f.readLine());
        int a = 0;
        int b = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if (map.containsKey(a)) {
                if (map.get(a) != b) {
                    count++;
                }
            }

            map.put(a, b);

        }
        out.println(count);

        out.close();
    }
}
