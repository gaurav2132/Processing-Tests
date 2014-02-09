/**
 * 
 */
package my.tests.application.sketch;

import my.tests.application.data.Variable;
import processing.core.PApplet;

/**
 * 
 * Extend this class to create you own sketch
 * 
 * @author Gaurav
 *
 */
public abstract class Sketch {

	/** These variables restrict the display area for this sketch. 
	 * You should try to contain the drawing based on these parameters 
	 **/
	protected float plotX1, plotX2, plotY1, plotY2;
	
	/**
	 * This is a reference to Main instance, which has all the processing methods and variables.
	 */
	protected PApplet parent;
	
	/**
	 * display method checks this variable before drawing.
	 */
	protected boolean isActive;
	
	public Sketch(Variable data) {
		init(data);
		
	}
	
	/**
	 * This method is called in the constructor to initialize the instance.
	 */
	public void init(Variable data){
		this.parent = data.getParent();
		this.plotX1 = data.getPlotX1();
		this.plotY1 = data.getPlotY1();
		this.plotX2 = data.getPlotX2();
		this.plotY2 = data.getPlotY2();
	}
	
	/**
	 * This method is responsible for displaying sketch on the given screen resolution. 
	 */
	public final void display(){
		if(!isActive) return;
		draw();
	}
	
	/**
	 * Override this method for displaying your sketch
	 */
	protected abstract void draw();
	
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
