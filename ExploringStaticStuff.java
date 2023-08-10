package demo3;

//3 - exporting
import java.util.*;

/*
What we want to do here is explore the use of static in a class to solve some problem. In this case we
want this class to have a mechanism which can let us fetch object instantiated from this class by calling
a static method. Object references are not global, that is they aren't automatically available everywhere in the code.
So, if we want a particular reference in some distant part of the code, this mechanism exists to give us
an easy way to fetch that.
 */
public class ExploringStaticStuff {
    /*
    This data type will store objects with a name.
     */
    private static Map<String, ExploringStaticStuff> objectStore = new HashMap<String, ExploringStaticStuff>();

    private ExploringStaticStuff() {

    }

    public static ExploringStaticStuff createNewObject(String name) {
        ExploringStaticStuff object = new ExploringStaticStuff();
        objectStore.put(name, object);
        return object;
    }

    /*
    This method is actually severely overengineered. We don't need to loop at all, we do already
    the key, which is name, so we can just use that. So, this is commented out and a better one is below.
     */
//    public static ExploringStaticStuff getObjectByName(String name) {
//        Set keySet = objectStore.keySet();
//        for(Object key : keySet) {
//            if (name.equals((String)key)) {
//                return objectStore.get(name);
//            }
//        }
//        return null;
//    }

    public static ExploringStaticStuff getObjectByName(String name){
        return objectStore.get(name);
    }



}

