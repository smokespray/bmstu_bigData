// Ортогональность и равенство векторов в обеих задачах, как и размерность 3
public class laba5_1_2 {
    public static void main(String[] args) throws Equality {
        int n = 3; // размерность
        int c = 2; // константа
        Vector a = new Vector(n);
        a.printVector();
        Vector b = new Vector(n); // n+1
        b.printVector();
        //toCalculate(a,b);
        System.out.println("Сложение векторов");
        addVectors(a, b);
        System.out.println("Вычитание векторов");
        subtractVectors(a, b);
        System.out.println("Скалярное произведение векторов");
        System.out.println(multiplyVectors(a, b));
        System.out.println("Умножение вектора на константу c = " + c);
        multiplyVectorOnConst(a, c).printVector();
        System.out.println("Модуль вектора");
        System.out.println(vectorModule(a));
        orthogonalityCheck(a, b);
        collinearityCheck(a, b);
        //System.out.println(multiplyVectors(a, b)*2);
        //System.out.println(multiplyVectors(multiplyVectorOnConst(a, 2.0), b));
        int i = 0;
        do {
            a = new Vector(n);
            i++;
        } while (!collinearityCheck(a, b));
        a.printVector();
        b.printVector();
        do {
            a = new Vector(n);
            i++;
        } while (!orthogonalityCheck(a, b));
        a.printVector();
        b.printVector();
        //System.out.println(i);
    }

    public static class Equality extends Exception {
        public Equality(String mess) {
            super(mess);
        }
    }

    public static Vector toCalculate(Vector a, Vector b) throws laba5_1_2.Equality {
        System.out.println("Проверяем размерность ...");
        if (a.n == b.n) {
            System.out.println("Все верно");
        } else {
            throw new laba5_1_2.Equality("Разные размерности векторов!");
        }
        return a;
    }

    public static Vector addVectors(Vector a, Vector b) throws Equality {
        toCalculate(a,b);
        Vector result = new Vector(a);
        if(a.n == b.n) {
            for (int i = 0; i < a.n; i++) {
                result.coordinates[i] = a.coordinates[i] + b.coordinates[i];
            }
            result.printVector();
        } else {
            System.out.println("Разные размерности");
        }
        return result;
    }

    public static Vector subtractVectors(Vector a, Vector b) throws Equality {
        Vector result = new Vector(a);
        toCalculate(a,b);
        if(a.n == b.n) {
            for (int i = 0; i < a.n; i++) {
                result.coordinates[i] = a.coordinates[i] - b.coordinates[i];
            }
            result.printVector();
        } else {
            System.out.println("Разные размерности");
        }
        return result;
    }

    public static Vector multiplyVectorOnConst(Vector a, double c) {
        Vector result = new Vector(a);
        for (int i = 0; i < a.n; i++) {
            result.coordinates[i] = a.coordinates[i] * c;
        }
        return result;
    }

    public static Double multiplyVectors(Vector a, Vector b) {
        Double result = 0.0;
        //toCalculate(a,b);
        if(a.n == b.n) {
            for (int i = 0; i < a.n; i++) {
                result = result + (a.coordinates[i] * b.coordinates[i]);
            }
        } else {
            System.out.println("Разные размерности");
        }
        return result;
    }

    // Чтобы найти модуль вектора по координатам нужно извлечь квадратный корень из суммы квадратов его координат
    public static Double vectorModule(Vector a) {
        Double result = 0.0;
        for (int i = 0; i < a.n; i++) {
            result = result + (a.coordinates[i]*a.coordinates[i]);
        }
        return Math.sqrt(result);
    }

    // Вектора являются ортогональными (перпендикулярными), если их скалярное произведение равно нулю.
    public static boolean orthogonalityCheck(Vector a, Vector b) throws Equality {
        if (multiplyVectors(a, b) == 0) {
            System.out.println("Ортогональные векторы: ");
            return true;
        } else {
            //System.out.println("Векторы не ортогональны");
            return false;
        }
    }
    // Коллинеарные векторы — это векторы, лежащие на одной прямой или на параллельных прямых.
    public static boolean collinearityCheck(Vector a, Vector b){

            if (a.n == b.n) {
                double n;
                n = a.coordinates[0] / b.coordinates[0];
                if (equalsVectors(multiplyVectorOnConst(b, n), a)) {
                    System.out.println("Коллинеарные векторы: ");
                    return true;
                } else {
                    //System.out.println("Векторы не коллинеарны");
                    return false;
                }
            }
        return false;
    }

    // Векторы называются равными, если они сонаправлены и их длины равны.
    public static boolean equalsVectors(Vector a, Vector b) {
        for (int i = 0; i < a.n; i++) {
            if (a.coordinates[i] != b.coordinates[i])
                //System.out.println("Векторы не равны ");
                return false;
        }
        return true;
    }
}
