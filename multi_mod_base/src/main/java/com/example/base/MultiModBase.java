package com.example.base;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MultiModBase implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "multi_mod_base";

    @Override
    public void onInitialize() {
        LOGGER.info("[{}] Mod loaded", MOD_ID);
    }
}
