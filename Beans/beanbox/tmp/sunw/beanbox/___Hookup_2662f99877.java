// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import ConstrainedEx;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ___Hookup_2662f99877 implements java.beans.PropertyChangeListener, java.io.Serializable {

    public void setTarget(ConstrainedEx t) {
        target = t;
    }

    public void propertyChange(java.beans.PropertyChangeEvent arg0) {
        target.hide();
    }

    private ConstrainedEx target;
}
