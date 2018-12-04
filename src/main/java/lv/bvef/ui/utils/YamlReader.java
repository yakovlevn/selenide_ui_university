package lv.bvef.ui.utils;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

public class YamlReader {

    public static void readYamlFile(String yamlFile) throws IOException {
        Yaml yaml = new Yaml();
        try (InputStream in = YamlReader.class.getResourceAsStream("/" + yamlFile)) {
            ConfigurationVariables cfg = yaml.loadAs(in, ConfigurationVariables.class);
        }
    }
}
