package myexception;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLogging {

    public static void main(String[] args) {
        Log log = LogFactory.getLog(CommonsLogging.class);
        log.info("start");
        log.warn("end");
        new CommonsLogging().testOrdinary();
        System.out.println(Math.random());
    }
    public void testOrdinary(){
        System.out.println(getClass());
        Log log =LogFactory.getLog(getClass());//实例方法用getclass获取
        try {
            int x = 10/0;
        }catch (ArithmeticException e){
            log.error("除0异常",e);
        }
    }
}

