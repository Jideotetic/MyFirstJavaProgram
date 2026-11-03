public class LogicalOperator {
    public static void main(String[] args) {
        int age = 19;

        if (age > 18) {
//            System.out.println("Condition is True");
        }

        String gender = "male";
        if (gender == "male") {
//            System.out.println("Condition is True");
        }

        if(age > 18 && gender == "male") {
            System.out.println("Eligible");
        }
    }
}
