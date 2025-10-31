package org.example.example;

import net.ornithemc.osl.entrypoints.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Entrypoint implements ModInitializer
{
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void init() {
        LOGGER.info("Initializing");
    }
}
