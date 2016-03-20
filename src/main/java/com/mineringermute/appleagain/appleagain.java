package com.mineringermute.appleagain;

import com.mineringermute.appleagain.proxys.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = appleagain.MODID, name = appleagain.MODNAME, version = appleagain.VERSION)


public class appleagain {
	
	@SidedProxy(clientSide="com.mineringermute.appleagain.proxys.ClientProxy", serverSide="com.mineringermute.appleagain.proxys.ServerProxy")
	public static CommonProxy proxy;

    public static final String MODID = "appleagain";
    public static final String MODNAME = "Apples Again";
    public static final String VERSION = "1.0";
        
    @Instance
    public static appleagain instance = new appleagain();
        
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);          
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event); 
    }
}