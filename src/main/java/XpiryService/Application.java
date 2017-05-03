package XpiryService;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * start point for app start.
 * test commit
 * Created by ramkumarsundarajan on 5/2/17.
 */
public class Application {

    public static void main(String args[]) {

        port(8000);

        get("/hello", (req, res) -> "Hello World");




    }
}
