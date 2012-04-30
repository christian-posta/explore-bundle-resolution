package org.apache.foo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created with IntelliJ IDEA.
 * User: cposta
 * Date: 4/30/12
 * Time: 8:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Hello, world!");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
