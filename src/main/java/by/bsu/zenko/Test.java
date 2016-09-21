package by.bsu.zenko;

import by.bsu.zenko.model.JsonObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;


public class Test {

    public static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonObject obj = mapper.readValue(new File("data/input.json"), JsonObject.class);
            LOGGER.debug("Object: {}", obj);
            mapper.writeValue(new File("data/output.json"), obj);
        } catch (IOException e) {
            LOGGER.error("Error parsing JSON", e);
        }
    }
}
