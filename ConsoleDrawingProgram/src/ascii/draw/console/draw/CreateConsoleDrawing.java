package ascii.draw.console.draw;

import java.util.Scanner;

import ascii.draw.handler.ConsoleCommandArgumentHandlerFactory;
import ascii.draw.userinput.Command;
import ascii.draw.utilities.DrawingTool;

public class CreateConsoleDrawing {
	private final static ConsoleCommandArgumentHandlerFactory handlerFactory = new ConsoleCommandArgumentHandlerFactory();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DrawingTool drawingTool = new DrawingTool();
		ConsoleCommand consoleCommand = ConsoleCommand.UNKNOWN;

		while (consoleCommand != ConsoleCommand.QUIT) {
			System.out.print("enter command:");
			try {
				consoleCommand = ConsoleCommand.parse(scanner.next());
				Command command = handlerFactory.handlerFor(consoleCommand).toCommandFrom(scanner);
				command.executeOn(drawingTool);

				drawingTool.draw(System.out);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

		scanner.close();
		System.exit(0);
	}
}
