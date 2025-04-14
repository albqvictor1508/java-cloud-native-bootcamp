public class App {
    public static void main(String[] args) throws Exception {
        BrazilianStates[] states = BrazilianStates.values();
        for(BrazilianStates state : states) {
            System.out.println(state.getName() + " - " + state.getAbbreviation());
        }

        Days today = Days.SEXTA;
        System.out.println("Hoje é " + today.toString().toLowerCase());
    }
}
