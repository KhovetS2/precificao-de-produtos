
package GUI.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class MyButton extends JButton {

    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClicked;
    private Color borderColor;
    private int radius = 0;
    
    public MyButton() {
        
        setColor(new java.awt.Color(239,131,84));
        colorOver = new java.awt.Color(4,210,130);
        colorClicked = new java.awt.Color(4,171,69);
        borderColor = new java.awt.Color(2, 30, 54, 20);
        setContentAreaFilled(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                setBackground(colorOver);
                over=true;

            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                setBackground(color);
                over=false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(colorClicked);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                if(over){
                    setBackground(colorOver);
                }else{
                    setBackground(color);
                }
            }
        });
    }
    

    public Color getColorClicked() {
        return colorClicked;
    }

    public void setColorClicked(Color colorClicked) {
        this.colorClicked = colorClicked;
    }

    public boolean isOver() {
        return this.over;
    }

    public boolean getOver() {
        return this.over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return this.colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getBorderColor() {
        return this.borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius , radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth()-4, getHeight()-4, radius , radius);

        super.paintComponent(g);
    }

}
