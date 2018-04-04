package ascii.draw.handler;

import java.util.Scanner;

import ascii.draw.userinput.Command;
import ascii.draw.userinput.QuitCommand;


public class QuitConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    return new QuitCommand();
  }
}
