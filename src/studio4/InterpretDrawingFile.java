package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameter1 = in.nextDouble();
		double parameter2 = in.nextDouble();
		double parameter3 = in.nextDouble();
		double parameter4 = in.nextDouble();
		
		if(shapeType.equals("ellipse")) {
			if (isFilled == false) {
				Color color = new Color(red, green, blue);
				StdDraw.setPenColor(color);
				StdDraw.ellipse(parameter1, parameter2, parameter3, parameter4);
			}
			
		}
		StdDraw.show();
		
		
	}
}
