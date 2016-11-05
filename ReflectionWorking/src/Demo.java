import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by bapaydin on 05.11.2016.
 */
public class Demo {
    public static void main(String[] args) {
        PropertyDescriptor[] propertyDescriptors = null;
        try {
            propertyDescriptors= Introspector.getBeanInfo(SampleClass.class, Object.class).getPropertyDescriptors();
            for(PropertyDescriptor propertyDescriptor : propertyDescriptors){
                System.out.println("Setter method : " + propertyDescriptor.getWriteMethod());
                System.out.println("Getter method : " + propertyDescriptor.getReadMethod());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Class<SampleClass> clasz = SampleClass.class;
        Field[] fields = clasz.getDeclaredFields();
        for (Field field: fields) {
            String modifier = Modifier.isPrivate(field.getModifiers()) ? "private" : Modifier.isPublic(field.getModifiers()) ? "public" : null;
            System.out.println("Modifier of the field is  : " + modifier);
        }
    }
}
