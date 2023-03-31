
import java.util.ArrayList;

public class Mobile {
    public static void main(String[] args) {
        ArrayList<MObject> Mobile = new ArrayList<>();
        Mobile.add(new Type("Смартфон"));
        Mobile.add(new Model("Redmi 9T", "From China with love"));
        Mobile.add(new Features("Стоимость разработки - 3 ящика риса"));
        print(Mobile);
    }

    public static void print(ArrayList<MObject> mobile) {
        System.out.println("Информация о телефоне:");
        for (MObject object: mobile) {
            System.out.println(object.toString());
        }
    }
}

class MObject {
    String name;
    String info = "";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "MObject{" +
                "name='" + name + '\'' +
                '}';
    }

    public void printInfo() {
        System.out.println(info);
    }

    public MObject(String name) {
        this.name = name;
    }
}

class Type extends MObject {

    public Type(String name) {
        super(name);
    }

    public Type(String name, String info) {
        super(name);
        this.info = info;
    }

    @Override
    public String toString() {
        if (info.isEmpty()) {
            return "Тип - " + name;
        } else {
            return "Тип - " + name + " - " + info;
        }
    }
}
class Model extends MObject {

    public Model(String name) {
        super(name);
    }

    public Model(String name, String info) {
        super(name);
        this.info = info;
    }

    @Override
    public String toString() {
        if (info.isEmpty()) {
            return "Модель - " + name;
        } else {
            return "Модель - " + name + " - " + info;
        }
    }
}
class Features extends MObject {

    public Features(String name) {
        super(name);
    }

    public Features(String name, String info) {
        super(name);
        this.info = info;
    }

    @Override
    public String toString() {
        if (info.isEmpty()) {
            return "Фича - " + name;
        } else {
            return "Фича - " + name + " - " + info;
        }
    }
}