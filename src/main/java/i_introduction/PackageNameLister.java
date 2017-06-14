package i_introduction;

import java.io.File;
import java.util.List;

/**
 * @author mhmdsalem
 */
public class PackageNameLister {

    public void list(){
        Class[] classes={String.class,List.class,File.class};
        for(Class clazz : classes){
            System.out.println(clazz.getPackage().getName());
        }
    }
}
