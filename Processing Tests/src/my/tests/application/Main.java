package my.tests.application;

import java.util.ArrayList;
import java.util.logging.Logger;

import my.tests.application.data.Variable;
import my.tests.application.sketch.BarSketch;
import my.tests.application.sketch.Sketch;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PGraphics;

/**
 * TODO 
 * 		1. Timeline sketch add - data value disply on touching the year label.
 * 		2. Slider sketch - complete the change of axis functionality
 * 		3. Draw clustered data - bar graph
 * @author Gaurav
 *
 */
public class Main extends PApplet {
	private static Logger log = Logger.getLogger(Main.class.getName());
	private static final long serialVersionUID = 1L;
	protected PFont plotFont;
	protected ArrayList<Sketch> sketches = new ArrayList<Sketch>();
	protected PGraphics pg;
	@Override
	public void setup() {

		size(1000, 800);
		initSketches();
		
		// setup font for sketches

		plotFont = createFont( "SansSerif", 40);
		textFont(plotFont);
		smooth();
		
		pg = createGraphics(1000, 800);
		
		
	}
	
	

	public static void main(String args[]) {
	    PApplet.main(new String[] { "my.tests.application.Main" });
	}
	
	
	
	public void init() {
		super.init();
		
	}
	
	/**
	 * Used to initialize all the sketches, each sketch is added to the arraylist
	 */
	public void initSketches(){
		Variable v = new Variable();
		v.setParent(this);
		
		sketches.add(new BarSketch(v));
		
		for(Sketch s: sketches)
		  	s.setActive(true);
	}
	
	
	@Override
	public void draw() {
		  for(Sketch s: sketches)
			  	s.display();
	}
}