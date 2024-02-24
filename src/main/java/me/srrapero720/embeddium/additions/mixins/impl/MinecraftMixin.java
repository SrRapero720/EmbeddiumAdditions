package me.srrapero720.embeddium.additions.mixins.impl;

import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static me.srrapero720.embeddium.additions.EmbeddiumAdditions.LOGGER;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Unique private static final Marker EX$IT = MarkerManager.getMarker("MinecraftMixin");

    @Inject(method = "openChatScreen", at = @At("HEAD"))
    private void inject$openChatScreen(String pDefaultText, CallbackInfo ci) {
        LOGGER.info(EX$IT, "Chat is opened and you handle it with mixins");
    }
}
