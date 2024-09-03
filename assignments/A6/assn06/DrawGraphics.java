import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingSprite;
    Bouncer movingSprite2;

    StraightMover sMover1;
    StraightMover sMover2;

    // ArrayList<Bouncer> bouncers = new ArrayList<>();
    // ArrayList<StraightMover> straightMovers = new ArrayList<>();

    ArrayList<Mover> movers;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        movers = new ArrayList<>();

        // bouncers
        Rectangle box = new Rectangle(15, 20, Color.RED);
        movingSprite = new Bouncer(100, 170, box);

        Oval oval = new Oval(10, 10, Color.YELLOW);
        movingSprite2 = new Bouncer(80, 70, oval);

        movers.add(movingSprite);
        movers.add(movingSprite2);

        // for (Bouncer b : bouncers) {
        //     b.setMovementVector(3, 1);
        // }

        // striaght movers

        Rectangle box1 = new Rectangle(22, 30, Color.GRAY);
        sMover1 = new StraightMover(80, 70, box1);

        Oval oval1 = new Oval(20, 20, Color.BLUE);
        sMover2 = new StraightMover(50, 10, oval1);

        // stright movers
        movers.add(sMover1);
        movers.add(sMover2);

        // for (StraightMover s : straightMovers) {
        //     s.setMovementVector(-1, -1);
        // }
        for (Mover m : movers) {
            if (m instanceof Bouncer) {
                m.setMovementVector(3, 1);
            } else {
                m.setMovementVector(-1, -1);
            }
        }
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover m : movers) {
            m.draw(surface);
        }
        // movingSprite.draw(surface);
        // for (Bouncer b : bouncers) {
        //     b.draw(surface);
        // }

        // for (StraightMover s : straightMovers) {
        //     s.draw(surface);
        // }
    }
}
