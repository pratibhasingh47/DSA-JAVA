package Week_1;

class Person {
    String name;
    float marks;

    Person(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', marks=" + marks + "}";
    }
}

class SwapTest4 {
    public static void swap(Container x, Container y) {
        Object t = x.value;
        x.value = y.value;
        y.value = t;
    }

    static class Container {
        Object value;
        Container(Object value) {
            this.value = value;
        }
    }

    public static void main(String args[]) {
        Container p1 = new Container(new Person("Sumit", 99.9f));
        Container p2 = new Container(new Person("Rahul", 66.6f));

        System.out.println("p1 = " + p1.value + " p2 = " + p2.value);
        swap(p1, p2);
        System.out.println("p1 = " + p1.value + " p2 = " + p2.value);
    }
}
