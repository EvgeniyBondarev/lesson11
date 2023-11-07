public class Main {
    public static <T> void executionTime(T element){
        ListAdderer<T> adderer = new ListAdderer<>();
        long startA = System.nanoTime();
        adderer.addArrayList(element);
        long endA = System.nanoTime();
        long startL = System.nanoTime();
        adderer.addLinkedList(element);
        long endL = System.nanoTime();
        System.out.printf("\nВремя добавления 500000 %s элементов в: \n- ArrayList %d\n- LinkedList %d\n\n",
                element.getClass().getSimpleName(), endA - startA, endL - startL);
    }
    public static void main(String[] args){
        Integer i = 1000;
        String s = "1000";
        executionTime(i);
        executionTime(s);


    }
}
