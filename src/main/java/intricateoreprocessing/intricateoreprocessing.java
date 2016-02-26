package intricateoreprocessing;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = intricateoreprocessing.MODID, version = intricateoreprocessing.VERSION)
public class intricateoreprocessing {

	
		public static final String MODID = "intricateoreprocessing";
		public static final String VERSION = "1.8.9a";
	
		@Mod.Instance(intricateoreprocessing.MODID)
		public static intricateoreprocessing instance;
	
		@SidedProxy(clientSide="intricateoreprocessing.ClientOnlyProxy", serverSide="intricateoreprocessing.DedicateServerProxy")
		public static CommonProxy proxy;
	
	
	
		@EventHandler
		public static void preInit(FMLPreInitializationEvent event)
		{
			proxy.preInit();
		}
		@EventHandler
		public static void Init(FMLInitializationEvent event)
		{
			proxy.init();
		}
		@EventHandler
		public static void postInit(FMLPostInitializationEvent event)
		{
			proxy.postInit();
		}
		
		public static String prependModID(String name) {return MODID + ":" + name;}
		
		
}
