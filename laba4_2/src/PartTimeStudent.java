public class PartTimeStudent extends Student{
    @Override
    public void makeLabaGreatAgain() {
        System.out.println("Студент-заочник делат лабу дома(спит дома)");
    }

    public static void main(String[] args) {
        Student student = new Student() {
            @Override
            public void makeLabaGreatAgain() {
                super.makeLabaGreatAgain();
            }
        };
        PartTimeStudent partTimeStudent = new PartTimeStudent();

        student.makeLabaGreatAgain();
        partTimeStudent.makeLabaGreatAgain();
    }
}
