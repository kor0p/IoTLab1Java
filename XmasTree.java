package ua.lviv.iot.lab1;

public class XmasTree {
	private String name = "NoName";
	private int height;
	private int price;
	private String material = "NoMaterial"; // material of production

	private int radius; // radius of basis
	private String country = "NoCountry"; // country of production

	private static int numberOfTrees;

	protected int numberOfBranches;
	protected boolean wasUsed = false;

	public XmasTree() {
		numberOfTrees++;
	}

	public XmasTree(String name, int height, int price, String material) {
		this();
		this.name = name;
		this.height = height;
		this.price = price;
		this.material = material;
	}

	public XmasTree(String name, int height, int price, String material,
			int radius, String country, int numberOfBranches, boolean wasUsed) {
		this(name, height, price, material);
		this.radius = radius;
		this.country = country;
		this.numberOfBranches = numberOfBranches;
		this.wasUsed = wasUsed;
	}

	public String toString() {
		return " name: " + name + "\n height: " + height + "cm\n price: "
				+ price + "$\n material: " + material + "\n radius: "
				+ radius + "cm" + "\n country: " + country + "\n num of branches: "
				+ numberOfBranches + "\n was used: " + wasUsed + "\n";
	}

	public static void printStaticNumberOfTrees() {
		System.out.println("number of trees: " + numberOfTrees);
	}

	public void printNumberOfTrees() {
		System.out.println("number of trees: " + numberOfTrees);
	}

	public void resetValues(String name, int height, int price, String material, int radius, String country,
			int numberOfBranches, boolean wasUsed) {
		this.name = name;
		this.height = height;
		this.price = price;
		this.material = material;
		this.radius = radius;
		this.country = country;
		this.numberOfBranches = numberOfBranches;
		this.wasUsed = wasUsed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public static void main(String[] args) {
		XmasTree tree1 = new XmasTree();
		XmasTree tree2 = new XmasTree("Christmas feast", 150, 200, "plastic");
		XmasTree tree3 = new XmasTree("XmasHen", 300, 400, "plastic+metal", 100, "Ukraine", 100, true);
		System.out.println(tree1);
		System.out.println(tree2);
		System.out.println(tree3);
		XmasTree.printStaticNumberOfTrees();
		tree1.printNumberOfTrees();
	}
}
