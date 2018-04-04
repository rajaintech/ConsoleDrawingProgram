package ascii.draw.handler;

import java.util.Scanner;

import ascii.draw.userinput.Command;
import ascii.draw.userinput.LineCommand;



public class LineConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();

    return new LineCommand(x1, y1, x2, y2);
  }
}
