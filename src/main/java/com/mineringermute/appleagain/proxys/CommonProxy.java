package com.mineringermute.appleagain.proxys;

import com.mineringermute.appleagain.craft.applecrafting;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {
    	applecrafting.initCrafting();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}