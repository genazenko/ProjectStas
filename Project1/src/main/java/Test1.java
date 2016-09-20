import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by 123 on 20.09.2016.
 */
public class Test1 {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        JsonObject obj = null;
//JSON from file to Object
        try {
            obj = mapper.readValue(new File("E:\\ProjectStas\\Project1\\src\\main\\resources\\input.json"), JsonObject.class);
            mapper.writeValue(new File("E:\\ProjectStas\\Project1\\src\\main\\resources\\output.json"), obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Logger logger = LoggerFactory.getLogger("Logger1");
        LogObject.logging(logger, obj);
        //JsonObject obj = mapper.readValue(jsonInString, JsonObject.class);
    }
}
