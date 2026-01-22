import java.io.*;

public class CountWord {
    public static void main(String[] args) throws Exception {
        String word = "java";
        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;

        while((line = br.readLine()) != null) {
            for(String w : line.split(" ")) {
                if(w.equalsIgnoreCase(word))
                    count++;
            }
        }
        br.close();
        System.out.println("Count: " + count);
    }
}
