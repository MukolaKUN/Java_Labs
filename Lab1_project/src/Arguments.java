public class Arguments {
    // Метод main є точкою входу в програму.
    public static void main(String[] args) {
        // Виводить всі аргументи
        for(int i=0;i<4;i++)
        {
            System.out.println("аргумент " +args[i]);
        }
        System.out.println();

        // Виводить перший і останній аргумент
        System.out.println("аргумент " +args[0]);
        System.out.println("аргумент " +args[3]);
        System.out.println();

        // Виводить всі крім перщого аргумента
        for(int i=1;i<4;i++)
        {
            System.out.println("аргумент " +args[i]);
        }
        System.out.println();

        System.out.println("Задано " + args.length + " аргуметнів");
        // перший аргумент попадає в масив під індексом 0
        System.out.println("Значення 1го аргумента " + args[0]);
    }
}
