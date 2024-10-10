public class Model {
    private String[][] data = {
        {"12345", "Coffee", "$8.32"},
        {"67890", "Tea", "$9.99"}
    };
    

    public String[] getProduct(int UPC) {
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equals(String.valueOf(UPC))) {
                return data[i];
            }
        }
        return null;
    }
}
