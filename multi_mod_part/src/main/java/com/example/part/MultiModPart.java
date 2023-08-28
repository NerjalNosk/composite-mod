/*
 * Copyright (C) 2023 Nerjal
 *
 * This is licensed under the Public Domain (the "License");
 * you may not give this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://creativecommons.org/publicdomain/zero/1.0/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the license.
 */

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
