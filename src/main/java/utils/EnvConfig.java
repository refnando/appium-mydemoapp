package utils;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvConfig {

    private static final Dotenv dotenv = Dotenv.configure()
            .directory(System.getProperty("user.dir"))
            .ignoreIfMalformed()
            .ignoreIfMissing()
            .load();

    public static String get(String key) {
        String value = dotenv.get(key);
        if (value == null || value.isEmpty()) {
            throw new RuntimeException(key + " is not defined in .env file");
        }
        return value;
    }
}
