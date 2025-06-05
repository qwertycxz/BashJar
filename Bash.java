import java.io.IOException;
public class Bash {
	public static void main(String[] args) throws InterruptedException, IOException {
		var pm2 = new ProcessBuilder("/home/container/.bun/bin/pm2", "resurrect");
		var environment = pm2.environment();
		environment.put("PATH", environment.get("PATH") + ":/home/container/bin:/home/container/.bun/bin");
		pm2.start().waitFor();
		new ProcessBuilder("bash").inheritIO().start().waitFor();
	}
}
