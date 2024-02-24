package me.srrapero720.embeddium.additions.mixins;

import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

import static me.srrapero720.embeddium.additions.EmbeddiumAdditions.LOGGER;

public class MixinPlugin implements IMixinConfigPlugin {
    private static final Marker IT = MarkerManager.getMarker(MixinPlugin.class.getSimpleName());

    @Override
    public void onLoad(String mixinPackage) {
        LOGGER.info(IT,"Mixin Plugin loaded");
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        return true;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
        // ALWAYS KEEP THIS, IS HELPFULLY FOR OTHER DEVELOPERS IN CASE YOUR MOD MODIFIES A LOT MINECRAFT BEHAVIOR
        LOGGER.debug(IT, "Applying mixin '{}' to target class {}", mixinClassName, targetClassName);
    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
        LOGGER.debug(IT, "Mixin '{}' applied successfully", mixinClassName);
    }

    @Override public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}
    @Override public List<String> getMixins() { return null; }
    @Override public String getRefMapperConfig() { return null; }
}
