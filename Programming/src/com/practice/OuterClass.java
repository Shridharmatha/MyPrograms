package com.practice;
public class OuterClass {
    private class InnerClass {
        void display() {
            System.out.println("This is a private inner class.");
        }
    }

    void createInnerClass() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

 class ain {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerClass();  // Works because it's called from within the enclosing class
        // OuterClass.InnerClass inner = new OuterClass().new InnerClass();  // This line would cause an error if uncommented
    }
}
