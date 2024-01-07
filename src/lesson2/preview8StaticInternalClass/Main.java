package lesson2.preview8StaticInternalClass;


public class Main {
    public static void main(String[] args){

        System.out.println(Wrap.x);
        Wrap.AddOperations addOperations = new Wrap.AddOperations();
        addOperations.addOne();
        addOperations.addOne();
        addOperations.addOne();
        System.out.println(Wrap.x);

        Wrap.RemoveOperations removeOperations = new Wrap.RemoveOperations();
        removeOperations.removeTwo();
        System.out.println(Wrap.x);


    }
}
