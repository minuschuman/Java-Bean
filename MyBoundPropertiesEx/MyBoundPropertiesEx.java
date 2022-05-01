package MyBoundPropertiesEx;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.awt.*;

public class MyBoundPropertiesEx extends Canvas implements Serializable {
    // Step2:
    String original = "Welcome";
    // instantiation
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    // constructor
    public MyBoundPropertiesEx() {
        setBackground(Color.red);
        setForeground(Color.blue);
    }

    public void setString(String newString) {
        // Step3
        String oldString = original;
        original = newString;
        pcs.firePropertyChange("String", oldString, newString);
    }

    public String getString() {
        return original;
    }

    public Dimension getMinimumSize() {
        return new Dimension(50, 50);
    }

    // Step4
    public void addPropertyChangeListener(PropertyChangeListener l) {
        pcs.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        pcs.removePropertyChangeListener(l);
    }
}