package com.example.part;

import com.example.base.MultiModBase;
import net.fabricmc.api.ClientModInitializer;

public class MultiModPartClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MultiModBase.LOGGER.info("[{}] Client mod loaded", MultiModPart.MOD_ID);
    }
}
