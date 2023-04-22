public class MetodyRef {
    public void nazwa () {
        int result = 0;
        for (int i=0; i<100; i++) {
            result = result +1;
        }
        System.out.println("wartość to: " + result);
    }

    public void sum () {
        int firstNumber = 0;
        int secondNumber = 2;
        System.out.println("Suma to: " + (firstNumber+secondNumber));
    }
    public String imię () {
        System.out.println("Nazywam się Piotr");
        return "Piotr";
    }
}
