package ru.snake.amazonwatcher;

import java.awt.AWTException;
import java.io.IOException;

import ru.snake.amazonwatcher.view.TrayWindow;

public final class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws AWTException
	 */
	public static void main(String[] args) throws AWTException, IOException {
		TrayWindow trayWindow = new TrayWindow();

		trayWindow.setVisible(true);
	}
}
