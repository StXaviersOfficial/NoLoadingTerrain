package com.codingcat.noloadingterrain.client.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DownloadingTerrainScreen.class)
public abstract class DownloadingTerrainScreenMixin {
    /**
     * @author codingcat2468 (1.21.11 port by xd)
     * @reason Remove screen rendering entirely
     */
    @Overwrite
    public void render(DrawContext context, RenderTickCounter tickCounter) {}
}
