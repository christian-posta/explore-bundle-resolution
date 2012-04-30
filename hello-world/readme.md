A simple hello-world OSGI bundle.

1) To run, first run 'mvn install' to package and install the bundle into your local maven repository.
2) Then, start karaf ([follow th karaf getting started guide][1] to see how to do that)
3) Run osgi:install mvn:explore-bundle-resolution/hello-world/1.0

You should see "Hello, world!" displayed in the Karaf shell


[1]: http://karaf.apache.org/manual/2.2.4/quick-start.html
