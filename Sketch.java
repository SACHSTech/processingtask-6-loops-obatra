import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Quadrant 1 - 10 x 10 grid
	  for (int lineX = 30; lineX <= 300; lineX += 30){
      stroke(0,0,0);
      line(0, lineX, 300, lineX);
    }

    for (int lineY = 30; lineY <= 300; lineY += 30){
      stroke(0,0,0);
      line(lineY, 0, lineY, 300);
    }
	
  
  // Quadrant 2 - circles
  for (int circleX = 350; circleX < 550; circleX = circleX + 40)
  {
    for(int circleY = 70; circleY < 250; circleY = circleY + 40) 
    {
      stroke(0,0,0);
      fill(204, 0, 102);
      ellipse(circleX, circleY, 20, 20);
    }
  }
  
// Quadrant 3 - gradient

for(int g = 0; g <= 300; g++){
  stroke(g,g,g);
  line(g, 300, g, 600);
    }
  }
}
