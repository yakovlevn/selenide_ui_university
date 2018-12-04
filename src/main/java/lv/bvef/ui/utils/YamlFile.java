package lv.bvef.ui.utils;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;

public final class YamlFile {

    private static YamlFile INSTANCE;

    private YamlFile() {

    }

    public static YamlFile getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new YamlFile();
        }
        return INSTANCE;
    }

    public ServiceConfig config = new ServiceConfig();


    public void load() {
        Constructor constructor = new Constructor(YamlConfig.class);
        Yaml yaml = new Yaml(constructor);

        InputStream input = null;
        try {
            input = new FileInputStream(new File("configuration.yaml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        config = yaml.loadAs(input, ServiceConfig.class);
    }
}

