public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();

        double risultatoTriangolo = triangolo.calcolaArea(10,20);
        double risultatoRettangolo = rettangolo.calcolaArea(5,19);

        System.out.println("L'area del triangolo è " + risultatoTriangolo);
        System.out.println("L'area del Rettangolo è " + risultatoRettangolo);
    }
}