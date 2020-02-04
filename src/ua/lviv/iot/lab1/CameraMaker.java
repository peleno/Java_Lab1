package ua.lviv.iot.lab1;

public class CameraMaker {
	public static void main(String[] args) {
		Camera sonyCamera = new Camera(2.5, 1024, "Sony", 1100.5, "black", "Alpha a7", 24);
		Camera canonCamera = new Camera(3.5, 512, "Canon", 1050.9);
		Camera nikonCamera = new Camera();

		System.out.println(sonyCamera);
		System.out.println(canonCamera);
		System.out.println(nikonCamera);

		nikonCamera.printDiameterOfLensInMm();
		Camera.printStaticDiameterOfLensInMm();

		final int countOfCameras = 4;
		int counter = 0;
		Camera[] camerasArray = new Camera[countOfCameras];
		do {
			camerasArray[counter] = new Camera();
			counter++;
		} while (counter < countOfCameras);

		for (Camera camera : camerasArray) {
			System.out.println(camera);
		}
	}
}
