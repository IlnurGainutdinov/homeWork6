public class Notebook {
    /*Подумать над структурой класса Ноутбук для магазина техники
     - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий
 (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
  Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
   соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев -
 сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/
    private String model;
    String os;
    String color;
    private int ram;
    private int hdd;

    public Notebook(String model, String os, String color, int ram, int hdd) {
        this.model = model;
        this.os = os;
        this.color = color;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "model: " + model + "\nos: " + os + "\ncolor: " + color + "\nram: " + ram + "\nhdd: " + hdd;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHdd() {
        return this.hdd;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook notebook = (Notebook) obj;
        return os.equals(notebook.os) && model.equals(notebook.model) && color.equals(notebook.color) && ram == notebook.ram && hdd == notebook.hdd;
    }

    public boolean contains(String os) {
        return true;
    }

}

