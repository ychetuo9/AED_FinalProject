/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map;

/**
 *
 * @author oooo
 */
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * A waypoint that is represented by a button on the map.
 *
 * @author Daniel Stahr
 */
public class SwingWaypoint extends DefaultWaypoint {
    private final JButton button;
    private final String text;
    
    //red button for selected request
    public SwingWaypoint(String text, GeoPosition coord) {
        super(coord);
        this.text = text;
        button = new JButton(text.substring(0, 1));
        button.setSize(18, 18);
        button.setPreferredSize(new Dimension(18, 18));
        button.addMouseListener(new SwingWaypointMouseListener());
        button.setVisible(true);
        button.setBackground(Color.RED);
    }
    
    
    //blue button for selected role
    public SwingWaypoint(String text, GeoPosition coord, String role) {
        super(coord);
        this.text = text;
        button = new JButton(text.substring(0, 1));
        button.setSize(18, 18);
        button.setPreferredSize(new Dimension(18, 18));
        button.addMouseListener(new SwingWaypointMouseListener());
        button.setVisible(true);
        button.setBackground(Color.BLUE);
    }

    public JButton getButton() {
        return button;
    }

    private class SwingWaypointMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(button, "This is location of " + text);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
}
