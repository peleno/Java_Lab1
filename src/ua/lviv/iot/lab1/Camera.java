package ua.lviv.iot.lab1;

public class Camera {

	private static int diameterOfLensInMm = 67;

	private double zoom;

	private int memoryCapacityInMB;

	private String producer;

	private double priceInDolars;

	private String color;

	protected String model;

	protected int numberOfMegapixels;

	public static void printStaticDiameterOfLensInMm() {
		System.out.println(diameterOfLensInMm);
	}

	public void printDiameterOfLensInMm() {
		System.out.println(diameterOfLensInMm);
	}

	public Camera(double zoom, int memoryCapacityInMB, String producer, double priceInDolars, String color,
			String model, int numberOfMegapixels) {
		this.zoom = zoom;
		this.memoryCapacityInMB = memoryCapacityInMB;
		this.producer = producer;
		this.priceInDolars = priceInDolars;
		this.color = color;
		this.model = model;
		this.numberOfMegapixels = numberOfMegapixels;
	}

	public Camera(double zoom, int memoryCapacityInMB, String producer, double priceInDolars) {
		this(zoom, memoryCapacityInMB, producer, priceInDolars, null, null, 0);
	}

	public Camera() {
		this(0, 0, null, 0);
	}

	public double getZoom() {
		return zoom;
	}

	public void setZoom(double zoom) {
		this.zoom = zoom;
	}

	public int getMemoryCapacityInMB() {
		return memoryCapacityInMB;
	}

	public void setMemoryCapacityInMB(int memoryCapacityInMB) {
		this.memoryCapacityInMB = memoryCapacityInMB;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getPriceInDolars() {
		return priceInDolars;
	}

	public void setPriceInDolars(double priceInDolars) {
		this.priceInDolars = priceInDolars;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumberOfMegapixels() {
		return numberOfMegapixels;
	}

	public void setNumberOfMegapixels(int numberOfMegapixels) {
		this.numberOfMegapixels = numberOfMegapixels;
	}

	@Override
	public String toString() {
		return "Camera [zoom=" + zoom + ", memoryCapacityInMB=" + memoryCapacityInMB + ", producer=" + producer
				+ ", priceInDolars=" + priceInDolars + ", color=" + color + ", model=" + model + ", numberOfMegapixels="
				+ numberOfMegapixels + "]";
	}

	public void restValues(double zoom, int memoryCapacityInMB, String producer, double priceInDolars, String color,
			String model, int numberOfMegapixels) {
		this.zoom = zoom;
		this.memoryCapacityInMB = memoryCapacityInMB;
		this.producer = producer;
		this.priceInDolars = priceInDolars;
		this.color = color;
		this.model = model;
		this.numberOfMegapixels = numberOfMegapixels;
	}
}
