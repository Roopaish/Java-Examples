class ProductImage {
  private String dimension;
  private String type;
  private boolean isColored;

  public ProductImage(String d, String t, boolean i) {
    dimension = d;
    type = t;
    isColored = i;
  }

  public void showInfo() {
    String color = isColored ? "colored" : "black and white";
    System.out.println("Image Info:\nDimension = " + dimension + ", Type = " + type + ", and is " + color);
  }
}

class Product {
  private int id;
  private String name;
  private ProductImage image;

  public Product(int id, String name, ProductImage image) {
    this.id = id;
    this.name = name;
    this.image = image;
  }

  public void showProductInfo() {
    System.out.println("Product Name = " + name + " and id = " + id);
    image.showInfo();
  }
}

class CommerceSite {
  public static void main(String[] args) {
    Product p = new Product(100, "T-shirt", new ProductImage("500x500", "jpeg", false));
    p.showProductInfo();
  }
}