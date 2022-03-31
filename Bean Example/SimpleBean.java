import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

//introspection
public class SimpleBean {
    private String name = "Minus";
    private int Size;

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.Size;
    }

    public void setSize(int size) {
        this.Size = size;
    }

    public void setName(String s) {
        this.name = s;
    }

    public static void main(String[] args) throws IntrospectionException {
        BeanInfo info = Introspector.getBeanInfo(SimpleBean.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println("BeanIngo:=" + pd.getName());
        }
        MethodDescriptor[] methods = info.getMethodDescriptors();
        for (MethodDescriptor m : methods) {
            System.out.println("Method:" + m.getName());
        }

        EventSetDescriptor[] eventSets = info.getEventSetDescriptors();
        for (EventSetDescriptor e : eventSets) {
            System.out.println("Event :" + e.getName());
        }
    }
}