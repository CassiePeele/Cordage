package com.cassiepeele.cordage.proxy;

import com.cassiepeele.cordage.init.ModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
	}

}
