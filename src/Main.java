import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("lg", "windows","red", 4, 100);
        Notebook notebook2 = new Notebook("sumsung", "windows","blue", 6, 300);
        Notebook notebook3 = new Notebook("philips", "windows","red", 8, 200);
        Notebook notebook4 = new Notebook("sony", "linux","black", 16, 500);
        Notebook notebook5 = new Notebook("hp", "windows","grey", 8, 100);
        Notebook notebook6 = new Notebook("apple", "macos","white", 32, 200);
        Notebook notebook7 = new Notebook("lg", "linux","green", 4, 300);
        Set<Notebook> set = new HashSet<>();
//        System.out.println(notebook1);
//        System.out.println(notebook2);
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        set.add(notebook6);
        set.add(notebook7);
//        System.out.println(set);
        Map<String, Object> filter = new HashMap<>();
        Map<String, Integer> filter2 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите критерии для фильтрации:" +
                "\n0 - Выйти\n1 - ОЗУ\n2 - Объем ЖД" +
                "\n3 - Операционная система\n4 - Цвет");
        int choice;
        loop:
        while (true){
            choice = scanner.nextInt();
            switch (choice){
                case 0:
                    break loop;
                case 1:
                    System.out.println("Какой минимальный ОЗУ?");
                    filter2.put("ram", scanner.nextInt());
                    for (Notebook item: set){
                        if (item.getRam() >= filter2.get("ram")){
                            System.out.println(item.toString());
                            System.out.println();
                        }
                    }break;
                case 2:
                    System.out.println("Какой минимальный ОЖД");
                    filter2.put("hdd", scanner.nextInt());
                    for (Notebook item: set){
                        if (item.getHdd() >= filter2.get("hdd")){
                            System.out.println(item.toString());
                            System.out.println();
                        }
                    }break;
                case 3:
                    System.out.println("Какая операционная система:");

                    filter.put("os", scanner.next());
                    System.out.println(filter);
                    for (Notebook item: set){
                        if (item.os.equals(filter.get("os"))) {
                            System.out.println(item);
                            System.out.println();
                        }
                    }break;
                case 4:
                    System.out.println("Какой цвет?");

                    filter.put("color", scanner.next());
                    System.out.println(filter);
                    for (Notebook item: set){
                        if (item.color.equals(filter.get("color"))){
                            System.out.println(item);
                            System.out.println();
                        }
                    }break;
                default:
                    System.out.println("Выберите из списка");

            }
        }

    }
}