package my.tests.application.sketch;

import my.tests.application.Utils;
import my.tests.application.data.Variable;

public class ExampleSketch extends Sketch {

	public ExampleSketch(Variable data) {
		super(data);
	}

	@Override
	public void draw() {
		// try to use push and pop
		parent.pushStyle();
		
		// try to put all the literal values in Constants file
		parent.fill(Utils.GREY);
		parent.rect(plotX1, plotY1, plotX2, plotY2);
		
		parent.fill(0);
		parent.textSize(20*Utils.SCALE);
		parent.text("This is the area where I can draw", plotX1 + 20, plotY1 + 100);
		//parent.smooth();
		parent.popStyle();
	}
}

