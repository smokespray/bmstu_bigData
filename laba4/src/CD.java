
import java.util.ArrayList;

public class CD {
    public static void main(String[] args) {
        ArrayList<CDObject> CD = new ArrayList<>();
        CD.add(new Directory("Панк-рок"));
        CD.add(new SubDirectory("Король и шут", "Алмаз русского панк-рока"));
        CD.add(new Track("Танец злобного гения"));
        print(CD);
    }

    public static void print(ArrayList<CDObject> cd) {
        System.out.println("CD диск имеет:");
        for (CDObject object: cd) {
            System.out.println(object.toString());
        }
    }
}

class CDObject {
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
        return "CDObject{" +
                "name='" + name + '\'' +
                '}';
    }

    public void printInfo() {
        System.out.println(info);
    }

    public CDObject(String name) {
        this.name = name;
    }
}

class Directory extends CDObject {

    public Directory(String name) {
        super(name);
    }

    public Directory(String name, String info) {
        super(name);
        this.info = info;
    }

    @Override
    public String toString() {
        if (info.isEmpty()) {
            return "Каталог - " + name;
        } else {
            return "Каталог - " + name + " - " + info;
        }
    }
}
class SubDirectory extends CDObject {

    public SubDirectory(String name) {
        super(name);
    }

    public SubDirectory(String name, String info) {
        super(name);
        this.info = info;
    }

    @Override
    public String toString() {
        if (info.isEmpty()) {
            return "Подкаталог - " + name;
        } else {
            return "Подкаталог - " + name + " - " + info;
        }
    }
}
class Track extends CDObject {

    public Track(String name) {
        super(name);
    }

    public Track(String name, String info) {
        super(name);
        this.info = info;
    }

    @Override
    public String toString() {
        if (info.isEmpty()) {
            return "Песня - " + name;
        } else {
            return "Песня - " + name + " - " + info;
        }
    }
}