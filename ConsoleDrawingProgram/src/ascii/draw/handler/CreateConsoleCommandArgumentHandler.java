package ascii.draw.handler;

import java.util.Scanner;

import ascii.draw.userinput.Command;
import ascii.draw.userinput.CreateCommand;



public class CreateConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    int width = scanner.nextInt();
    int height = scanner.nextInt();

    return new CreateCommand(width, height);
  }
}
