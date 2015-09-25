package httpserver;

import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import org.glassfish.grizzly.http.server.HttpServer;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;

/**
 * @author mizeng
 * @version v1.0
 * @description TODO
 * @date 9/25/15
 */
public class JerseyServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
        ResourceConfig config = new PackagesResourceConfig("httpserver");
        HttpServer server = GrizzlyServerFactory.createHttpServer(baseUri, config);
        Thread.sleep(1000000);
        server.stop();
    }
}
