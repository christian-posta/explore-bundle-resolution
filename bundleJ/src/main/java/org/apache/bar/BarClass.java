package org.apache.bar;

/**
 * Created with IntelliJ IDEA.
 * User: cposta
 * Date: 4/30/12
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class BarClass {
    private String id;
    private String name;
    private boolean trueOrFalse;

    public BarClass(String id, String name, boolean trueOrFalse) {
        this.id = id;
        this.name = name;
        this.trueOrFalse = trueOrFalse;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
