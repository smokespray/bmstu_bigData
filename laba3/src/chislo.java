import java.util.Objects;

public class chislo {
    private double ch1;

    public chislo(double ch1){
        this.ch1 = ch1;
    }

    public double getCh1() {
        return ch1;
    }

    public void setCh1(double ch1) {
        this.ch1 = ch1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof chislo chislo)) return false;
        return Double.compare(chislo.getCh1(), getCh1()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCh1());
    }

    @Override
    public String toString() {
        return "chislo{" +
                "ch1=" + ch1 +
                '}';
    }
}