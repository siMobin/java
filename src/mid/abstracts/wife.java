package mid.abstracts;

/*
* @author you!
 * TODO:: Create your own thoughts
 * 
 */
public abstract class wife {

    wife() {
        System.out.println("Said kobul");
    }

    protected abstract String name(String name);

    protected abstract int age(int age);

    protected abstract int height(int h);

    // TODO::

}

class Husband extends wife {
    public Husband() {
        System.out.println("Married");
    }

    protected String name(String name) {
        return name;
    }

    protected int age(int age) {
        return age;
    };

    protected int height(int h) {
        return h;
    };

    // TODO::
}

class Status {
    public static void main(String args[]) {
        wife ob = new Husband();

        System.out.println(ob.name("name"));
        System.out.println(ob.age(23));
    }
}