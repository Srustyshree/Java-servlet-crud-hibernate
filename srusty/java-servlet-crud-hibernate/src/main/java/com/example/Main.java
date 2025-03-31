import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import java.io.File;

public class EmbeddedTomcat {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        String webAppDir = new File("src/main/webapp/").getAbsolutePath();
        tomcat.addWebapp("/", webAppDir);

        System.out.println("Starting Embedded Tomcat on port 8080...");
        tomcat.start();
        tomcat.getServer().await();
    }
}
