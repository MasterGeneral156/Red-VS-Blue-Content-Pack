package com.themastergeneral.redvblue.proxy;

import java.io.File;

import com.themastergeneral.redvblue.common.blocks.ModBlocks;
import com.themastergeneral.redvblue.common.config.Config;
import com.themastergeneral.redvblue.common.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class CommonProxy 
{
	public static Configuration config;
	public void preInit(FMLPreInitializationEvent e) 
    {
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "ctd/redvsblue.cfg"));
		Config.readConfig();
		ModItems.init();
		ModBlocks.init();
    }
    public void init(FMLInitializationEvent e) 
    {
    	
    }
    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}
