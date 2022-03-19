package ro.utcluj.aut.isp.template;

import java.util.logging.Logger;

/**
 * @author mihai.hulea
 */
public class ExampleLogger {

    public static Logger LOG = Logger.getLogger( Example.class.getName() );

    public static void main(String[] args) {
        LOG.info("The logger is working!");
    }
}
