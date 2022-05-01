// package check;

// ConstrainedEx.java 
//step1 
import java.awt.*;
import java.beans.*;

public class ConstrainedEx extends Canvas {
    // Step2
    String price = "100";
    VetoableChangeSupport vcs = new VetoableChangeSupport(this);
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    // constructor
    public ConstrainedEx() {
        setBackground(Color.red);
        setForeground(Color.blue);
    }

    public void setString(String newprice) {
        // Step3
        String oldprice = price;
        price = newprice;
        pcs.firePropertyChange(price, oldprice, newprice);
    }

    public String getString() {
        return price;
    }

    public Dimension getMinimumSize() {
        return new Dimension(100, 100);
    }

    // step4
    public void addVetoableChangeListener(VetoableChangeListener vcl) {
        vcs.addVetoableChangeListener(vcl);
    }

    public void removeVetoableChangeListener(VetoableChangeListener vcl) {
        vcs.removeVetoableChangeListener(vcl);
    }
}