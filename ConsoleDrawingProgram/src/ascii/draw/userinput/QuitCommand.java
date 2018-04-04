package ascii.draw.userinput;

import ascii.draw.utilities.DrawingTool;

public class QuitCommand implements Command {

	@Override
	public void executeOn(DrawingTool drawingTool) {
		System.exit(0);
	}
}
