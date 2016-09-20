import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by 123 on 20.09.2016.
 */
public class LogObject {
    public static void logging(Logger logger, JsonObject obj){
        logger.debug("Name: "+obj.getName());
        logger.debug("Age: "+obj.getAge());
        logger.debug("Position: "+obj.getPosition());
        logger.debug("Salary: "+obj.getSalary());
        List<String> skills = obj.getSkills();
        StringBuilder str1 = new StringBuilder();
        for (int i=0; i<skills.size(); i++)
            str1.append(" "+skills.get(i));
        logger.debug("Skills: "+str1);

    }
}
