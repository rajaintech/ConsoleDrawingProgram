package ascii.draw.handler;

import java.util.Scanner;

import ascii.draw.userinput.Command;

public interface ConsoleCommandArgumentHandler {
	Command toCommandFrom(Scanner scanner);
}
