import net.codestory.http.WebServer;
import net.codestory.http.payload.Payload;

public class Main {
    public static void main(String[] args) {
        new WebServer()
                .configure(routes -> routes
                        .get("/version",
                                (context) ->
                                new Payload(
                                        "text/html",
                                        "1.0-SNAPSHOT",
                                        200)
                                        .withHeader("Access-Control-Allow-Origin", "*"))
                )
                .start();
    }
}