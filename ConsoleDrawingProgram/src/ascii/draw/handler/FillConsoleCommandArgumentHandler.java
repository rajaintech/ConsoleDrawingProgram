package ascii.draw.handler;

import java.util.Scanner;

import ascii.draw.userinput.Command;
import ascii.draw.userinput.FillCommand;


public class FillConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    char color = scanner.next().charAt(0);

    return new FillCommand(x, y, color);
  }
}
