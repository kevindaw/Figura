package codigo;

import java.awt.*;

/**
 * @author Kevin
 * @version 2
 * @since version 0
 * Clase Figura.
 */
public abstract class Figura implements IFigura {
    private Punto centro;
    private Color color;

    /**
     * Para instanciar una nueva Figura.
     *
     * @param x
     * @param y
     * @param color
     */
    public Figura(double x, double y, Color color) {
        this.setCentro(new Punto(x, y));
        this.setColor(color);
    }

    /**
     * Get centro.
     *
     * @return  centro
     */
    public Punto getCentro() {
        return centro;
    }

    /**
     * Set centro.
     *
     * @param centro
     */
    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    /**
     * Get color.
     *
     * @return  color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set color.
     *
     * @param color
     *
     * @see <a href=https://docs.oracle.com/javase/8/docs/api/java/awt/Color.html></a>
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
