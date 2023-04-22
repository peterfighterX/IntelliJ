public class StudentChecker {

    public static void main(String[] args) {


        Student piotr = new Student();
        piotr.imie = "Piotr";
        piotr.nazwisko = "Walczak";
        piotr.numerIndeksu = 144854;
        piotr.email = "piotr.walczak003@gmail.com";
        piotr.nick = "Peter Fighter";

        Student robert = new Student();
        robert.imie = "Robert";
        robert.nazwisko = "Lewandowski";
        robert.numerIndeksu = 144827;
        robert.email = "robert.lewandowski@fcbarcelona.com";
        robert.nick = "RL9";

        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Małysz";
        adam.numerIndeksu = 144832;
        adam.email = "adam.małysz@pzn.pl";
        adam.nick = "Orzeł z Wisły";


        Student[] students = new Student[3];
        students[0] = piotr;
        students[1] = robert;
        students[2] = adam;

        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajemail();
            students[i].podajnrIndeksu();
            students[i].zalogujSie();
        }
    }
}
