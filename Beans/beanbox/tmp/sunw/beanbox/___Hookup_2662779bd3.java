// Automatically generated event hookup file.

package tmp.sunw.beanbox;
import sunw.demo.molecule.Molecule;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ___Hookup_2662779bd3 implements java.beans.PropertyChangeListener, java.io.Serializable {

    public void setTarget(sunw.demo.molecule.Molecule t) {
        target = t;
    }

    public void propertyChange(java.beans.PropertyChangeEvent arg0) {
        target.show();
    }

    private sunw.demo.molecule.Molecule target;
}
