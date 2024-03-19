
class A {
    static int x = 10;
    int y = 20;
    private static int z = 30;
  
    static class B {
        void get() {
            System.out.println("x:" + x);
            System.out.println("z:" + z);
        }
    }
  
    public static class fb { // Moved FirstProgram to a public static class
        public static void main(String[] args) { // Corrected main method signature
            A.B obj = new A.B(); // Corrected class reference
            obj.get();
        }
    }
  }