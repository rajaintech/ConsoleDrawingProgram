package ascii.draw.userinput;

import ascii.draw.utilities.DrawingTool;

public class UnknownCommand implements Command
{
  @Override
  public void executeOn(DrawingTool drawingTool)
  {
   System.out.println("Unknown command...Exiting...!");
   System.exit(0);
  }
}
