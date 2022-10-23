package br.com.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigLogger.class);

    private static final ConfigLogger logger = null;

    public void debug(String mensagem) {
        LOGGER.debug(mensagem);
    }

    public void info(String mensagem) {
        LOGGER.info(mensagem);
    }

    public void error(String mensagem, Throwable throwable) {
        LOGGER.error(mensagem, throwable);
    }

    public void error(String mensagem) {
        LOGGER.error(mensagem);
    }

    public static ConfigLogger getLogger() {

        if (logger == null) {
            return new ConfigLogger();
        }
        return logger;
    }
}
