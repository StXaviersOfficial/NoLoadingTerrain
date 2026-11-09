package com.codingcat.noloadingterrain.client.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ProgressScreen;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ProgressScreen.class)
public abstract class ProgressScreenMixin {
    /**
     * @author codingcat2468 (1.21.11 port by xd)
     * @reason Remove screen rendering entirely
     */
    @Overwrite
    public void render(DrawContext context, RenderTickCounter tickCounter) {}
}
