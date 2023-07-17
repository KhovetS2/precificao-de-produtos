
package GUI.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.RenderedImage;

import javax.swing.JCheckBox;

public class CheckBoxCustom extends JCheckBox{
    private int aluno_id;
    private int atividade_id;
    private final int border = 4;

    public CheckBoxCustom() {
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setOpaque(false);
        setBackground(new Color(0, 153, 0));
    }


    public CheckBoxCustom(int aluno_id, int atividade_id) {
        this.aluno_id = aluno_id;
        this.atividade_id = atividade_id;
    }


    public int getAluno_id() {
        return this.aluno_id;
    }

    public void setAluno_id(int aluno_id) {
        this.aluno_id = aluno_id;
    }

    public int getAtividade_id() {
        return this.atividade_id;
    }

    public void setAtividade_id(int atividade_id) {
        this.atividade_id = atividade_id;
    }

    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int ly = (getHeight()-16)/2;
        if (isSelected()) {
            if (isEnabled()) {
                g2.setColor(getBackground());
            } else {
                g2.setColor(Color.gray);
            }
            g2.fillRoundRect(1, ly, 16, 16, border, border);
            // Draw check icon

            int px[] = {4, 8, 14, 12, 8, 6};
            int py[] = {ly+8, ly+14, ly+5, ly+3, ly+10, ly+6};
            g2.setColor(Color.WHITE);
            g2.fillPolygon(px, py, px.length);
        }else{
            g2.setColor(Color.black);
            g2.fillRoundRect(1, ly, 16, 16, border, border);
            g2.setColor(Color.red);
            g2.fillRoundRect(2, ly+1, 14, 14, border, border);
        }
        g2.dispose();
    }


}
