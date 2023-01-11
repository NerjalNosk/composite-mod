package com.example.part;

import net.fabricmc.api.ClientModInitializer;

public class MultiModPartClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MultiModPart.LOGGER.info("[{}] Client mod loaded", MultiModPart.MOD_ID);
    }
}
