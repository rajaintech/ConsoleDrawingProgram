package ascii.draw.utilities;

import java.io.PrintStream;

public class DrawingTool {
	private Canvas canvas;

	public void crateCanvas(int width, int height) {
		if (width < 1 || height < 1)
			throw new IllegalArgumentException("Please enter valid canvas dimensions...!");

		canvas = new Canvas(width, height);
	}

	public void addLine(int x1, int y1, int x2, int y2) {
		isCanvasCreated();

		Line line = new Line(x1, y1, x2, y2);
		line.addTo(canvas);
	}

	public void addRectangle(int x1, int y1, int x2, int y2) {
		isCanvasCreated();

		Rectangle rectangle = new Rectangle(x1, y1, x2, y2);
		rectangle.addTo(canvas);
	}

	public void fill(int x, int y, char c) {
		isCanvasCreated();
		if (x < 1 || y < 1)
			throw new IllegalArgumentException("Please enter valid fill params...!");

		canvas.fill(x, y, c);
	}

	public void draw(PrintStream printer) {
		isCanvasCreated();

		canvas.draw(printer);
	}

	private void isCanvasCreated() {
		if (canvas == null)
			throw new IllegalStateException("Please create canvas first..!");
	}
}
