package day11_class_object_part2;

public class CarpetClients {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();

        carpet1.width = 2.5;
        carpet1.length = 3.5;
        carpet1.unitPrice = 5;
        carpet1.isPersian = true;
        System.out.println(carpet1);

        carpet2.width = 4.5;
        carpet2.length = 1.5;
        carpet2.unitPrice = 6;
        carpet2.isPersian = false;
        System.out.println(carpet2);

    }
}
