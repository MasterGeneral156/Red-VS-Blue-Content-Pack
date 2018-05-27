package com.themastergeneral.redvblue;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.redvblue.client.CreativeTab;
import com.themastergeneral.redvblue.proxy.CommonProxy;

@Mod(modid = RedVBlue.MODID, name = RedVBlue.MODNAME, certificateFingerprint = RedVBlue.FingerPrint, version = RedVBlue.VERSION, dependencies = RedVBlue.DEPENDENCIES, updateJSON = RedVBlue.updateJSON, acceptedMinecraftVersions = RedVBlue.acceptedMinecraftVersions)
public class RedVBlue {
	// Important mod info, yo.
	public static final String MODID = "redvblue";
	public static final String MODNAME = "Red VS Blue";
	public static final String VERSION = "2.1.3";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.2,]";
	public static final String acceptedMinecraftVersions = "1.12.2";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/RedVSBlue.json";
	public static final String FingerPrint = "5101015479fe39f20b47f365472250d312a50a57";

	// Initialize the creative tab for the mod
	public static final CreativeTab creativeTab = new CreativeTab();

	// This allows us to call the RedVBlue variables from where-ever.
	@Instance
	public static RedVBlue instance = new RedVBlue();

	// Call the proxies so that they load on the correct side.
	@SidedProxy(clientSide = "com.themastergeneral.redvblue.proxy.ClientProxy", serverSide = "com.themastergeneral.redvblue.proxy.ServerProxy")
	// Load common proxy, since it loads information needed for both server and
	// client.
	public static CommonProxy proxy;
	public static Logger logger;

	// Loading event handlers.
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		logger.info("Red VS Blue is loading.");
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		logger.info("Red VS Blue has loaded completely.");
	}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for Red VS Blue! TheMasterGeneral will not support this version!");
	}
}
