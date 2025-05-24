import java.io.IOException;
public class Bash {
	public static void main(String[] args) throws InterruptedException, IOException {
		new ProcessBuilder("bash").inheritIO().start().waitFor();
	}
}
