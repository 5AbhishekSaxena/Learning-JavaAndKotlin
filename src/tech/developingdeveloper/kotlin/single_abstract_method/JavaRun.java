package tech.developingdeveloper.kotlin.single_abstract_method;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

public class JavaRun {

    public void runNow(Runnable runnable) {
        runnable.run();
    }



    public static void runNow(Function0<Unit> function) {

    }
}
