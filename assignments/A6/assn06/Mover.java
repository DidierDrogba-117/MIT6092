import java.awt.Graphics;

// Interfaces define a common set of methods for different classes.
// They enable abstraction and polymorphism.

public interface Mover {
    void draw(Graphics surface);        // Add the draw method
    void setMovementVector(int x, int y);  // Add the setMovementVector method
} 