import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    BouncingBox box2;
    BouncingBox box3;
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        // boxes = new ArrayList<>();

        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(1, 0);
        boxes.add(box);

        box2 = new BouncingBox(100, 50, Color.BLUE);
        box2.setMovementVector(-1, 0);
        boxes.add(box2);

        box3 = new BouncingBox(0, 50, Color.GRAY);
        box3.setMovementVector(1, 1);
        boxes.add(box3);

    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
        // box.draw(surface);
        // box2.draw(surface);
        // box3.draw(surface);

        surface.drawOval(150, 150, 80, 80);
        surface.drawRect(0, 0, 80, 80);
    }
}