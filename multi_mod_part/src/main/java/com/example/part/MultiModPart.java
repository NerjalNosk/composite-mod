package com.example.part;

import com.example.base.MultiModBase;
import net.fabricmc.api.ModInitializer;

public class MultiModPart implements ModInitializer {
    public static final String MOD_ID = "multi_mod_part";
    @Override
    public void onInitialize() {
        MultiModBase.LOGGER.info("[{}] Mod loaded", MOD_ID);
    }
}
