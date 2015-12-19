import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String username;

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        System.out.println("Hello, Ilya");
        username = getUsername();
        System.out.println("Hello, "+username);
    }
    private static String getUsername() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
