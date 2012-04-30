package bundleI;

import org.apache.bar.BarClass;
import org.apache.foo.FooClass;

/**
 * Created with IntelliJ IDEA.
 * User: cposta
 * Date: 4/30/12
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public Client() {
        FooClass foo = new FooClass();
        BarClass bar = foo.execute();
    }
}
