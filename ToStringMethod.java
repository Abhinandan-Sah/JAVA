public class ToStringMethod{
    public String toString(){
        return "hello";
    }
    public static void main(String[] args){
        ToStringMethod obj = new ToStringMethod();
        System.out.println(obj.getClass().getName());
    }
}
