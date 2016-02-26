package intricateoreprocessing;

public class ClientOnlyProxy extends CommonProxy{

	public void preInit(){
		
		super.preInit();
		
		newBlock.StartupClientOnly.preInitClientOnly();
		
		
	}
	
	
	public void init() {
		
		super.init();
		newBlock.StartupClientOnly.initClientOnly();
		
		
		
	}
	
	public void postInit() {
		
		super.postInit();
		newBlock.StartupClientOnly.postInitClientOnly();
		
		
		
		
	}
	
	
	
}
