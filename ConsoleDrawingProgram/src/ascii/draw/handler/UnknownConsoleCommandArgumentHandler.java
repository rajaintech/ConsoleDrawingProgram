package ascii.draw.handler;

import java.util.Scanner;

import ascii.draw.userinput.Command;

public class UnknownConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    scanner.nextLine();
    throw new IllegalArgumentException("Unsupported command");
  }
}
