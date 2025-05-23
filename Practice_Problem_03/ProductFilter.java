package Practice_Problem_03;

public class ProductFilter {

    public void filterProducts(String category) {
        System.out.println("Filtering products in category: " + category);
    }


    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Filtering products with price between $" + minPrice + " and $" + maxPrice);
    }


    public void filterProductsByBrand(String brand) {
        System.out.println("Filtering products of brand: " + brand);
    }


    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Filtering products in category: " + category +
                " with price between $" + minPrice + " and $" + maxPrice);
    }


    public void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Filtering products in category: " + category +
                ", with price between $" + minPrice + " and $" + maxPrice +
                ", of brand: " + brand);
    }


    public static void main(String[] args) {
        ProductFilter pf = new ProductFilter();

        pf.filterProducts("Electronics");
        pf.filterProducts(100, 500);
        pf.filterProductsByBrand("Nike");
        pf.filterProducts("Fashion", 50, 200);
        pf.filterProducts("Electronics", 300, 1000, "Apple");
    }
}

