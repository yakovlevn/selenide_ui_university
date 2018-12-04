package lv.bvef.ui.utils;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;

public class YamlReader {

    public static ServiceConfig config = new ServiceConfig();

    public static void loadYamlConfigurationFile() {
        Constructor constructor = new Constructor(YamlConfig.class);
        Yaml yaml = new Yaml( constructor );

        InputStream input = null;
        try {
            input = new FileInputStream(new File("configuration.yaml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        config = yaml.loadAs( input, ServiceConfig.class );
    }
}

