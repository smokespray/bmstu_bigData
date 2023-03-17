import java.util.Objects;

public class eze_drob {

    private chislo chisl;
    private chislo znam;
    protected void sloj(eze_drob eze_drob2){
        double chislitel = chisl.getCh1() * eze_drob2.znam.getCh1() + znam.getCh1() * eze_drob2.chisl.getCh1();
        double znamen = znam.getCh1() * eze_drob2.znam.getCh1();
        System.out.println("Сложение: ");
        System.out.println("Числитель: " + chislitel);
        System.out.println("Знаменатель: " + znamen);
    }
    protected void vich(eze_drob eze_drob2){
        double chislitel = chisl.getCh1() * eze_drob2.znam.getCh1() - znam.getCh1() * eze_drob2.chisl.getCh1();
        double znamen = znam.getCh1() * eze_drob2.znam.getCh1();
        System.out.println("Вычитание: ");
        System.out.println("Числитель: " + chislitel);
        System.out.println("Знаменатель: " + znamen);
    }
    protected void umnoj(eze_drob drob2){
        double chislitel = chisl.getCh1() * drob2.chisl.getCh1();
        double znamen = znam.getCh1() * drob2.znam.getCh1();
        System.out.println("Умножение: ");
        System.out.println("Числитель: " + chislitel);
        System.out.println("Знаменатель: " + znamen);
    }
    protected void del(eze_drob drob2){
        double chislitel = chisl.getCh1() * drob2.znam.getCh1();
        double znamen = znam.getCh1() * drob2.chisl.getCh1();
        System.out.println("Умножение: ");
        System.out.println("Числитель: " + chislitel);
        System.out.println("Знаменатель: " + znamen);
    }

    public eze_drob(chislo chisl, chislo znam) {
        this.chisl = chisl;
        this.znam = znam;
    }

    public chislo getChisl() {
        return chisl;
    }

    public void setChisl(chislo chisl) {
        this.chisl = chisl;
    }

    public chislo getZnam() {
        return znam;
    }

    public void setZnam(chislo znam) {
        this.znam = znam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof eze_drob eze_drob)) return false;
        return Objects.equals(getChisl(), eze_drob.getChisl()) && Objects.equals(getZnam(), eze_drob.getZnam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChisl(), getZnam());
    }

    @Override
    public String toString() {
        return "eze_drob{" +
                "chisl=" + chisl +
                ", znam=" + znam +
                '}';
    }
}