package com.nikras.minecraftmod;

import com.nikras.minecraftmod.Reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Blocks;

/**
 * Created by Coding on 22-01-2015.
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION)

public class MinecraftMod
{

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("Testing the mod");
    }
}
