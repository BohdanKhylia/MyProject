package helpers;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) {
        OopLab test = new OopLab();

        Field field;
        Integer name = 0;

        {
            try {
                field = test.getClass().getDeclaredField("var1");
                field.setAccessible(true);
                name = (Integer) field.get(test);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.println(name);

            try {
                Method method = test.getClass().getDeclaredMethod("meth");
                method.setAccessible(true);
                method.invoke(test);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
