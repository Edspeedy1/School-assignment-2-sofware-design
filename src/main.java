public class main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View("MVC Scanner");
        Scanner scanner = new Scanner(model, view);
    }
}
