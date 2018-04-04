package ascii.draw.userinput;

import ascii.draw.utilities.DrawingTool;

public interface Command
{
  void executeOn(DrawingTool drawingTool);
}
