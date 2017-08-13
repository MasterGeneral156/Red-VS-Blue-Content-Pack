package com.themastergeneral.redvblue.common.config;

import org.apache.logging.log4j.Level;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.redvblue.proxy.CommonProxy;

import scala.Int;
import net.minecraftforge.common.config.Configuration;

public class Config 
{
    private static final String CATEGORY_GENERAL = "General";

   	//Config values.
    public static int spartanchestdefense = 10;
    public static int spartanhelmetdefense = 10;
    public static int spartanbootsdefense = 10;
    public static int spartanlegsdefense = 10;
    public static int spartanarmortoughness = 10;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() 
    {
        Configuration cfg = CommonProxy.config;
        try 
        {
            cfg.load();
            initGeneralConfig(cfg);
        } 
        catch (Exception e1) 
        {
            Main.logger.log(Level.ERROR, "Problem loading config file!", e1);
        }
        finally 
        {
            if (cfg.hasChanged()) 
            {
                cfg.save();
            }
        }
    }
    private static void initGeneralConfig(Configuration cfg) 
    {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        spartanchestdefense = cfg.getInt("Spartan Chestplate Defense", CATEGORY_GENERAL, spartanchestdefense, 1, 20, "How much protection the Spartan Chestplate provides. (Effects Default/Red/Blue sets)");
        spartanhelmetdefense = cfg.getInt("Spartan Helmet Defense", CATEGORY_GENERAL, spartanhelmetdefense, 1, 20, "How much protection the Spartan Helmet provides. (Effects Default/Red/Blue sets)");
        spartanlegsdefense = cfg.getInt("Spartan Leggings Defense", CATEGORY_GENERAL, spartanlegsdefense, 1, 20, "How much protection the Spartan Leggings provides. (Effects Default/Red/Blue sets)");
        spartanbootsdefense = cfg.getInt("Spartan Boots Defense", CATEGORY_GENERAL, spartanlegsdefense, 1, 20, "How much protection the Spartan Boots provides. (Effects Default/Red/Blue sets)");
        spartanarmortoughness = cfg.getInt("Spartan Armor Toughness", CATEGORY_GENERAL, spartanarmortoughness, 1, 20, "How much toughness each armor piece provides. (Effects Default/Red/Blue sets)");
    }
}
