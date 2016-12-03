package com.cassiepeele.cordage.init;

import com.cassiepeele.cordage.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public final class ModItems {

	public static Item sinew;

	public static void init() {
		sinew = new Item().setRegistryName("sinew");
		sinew.setUnlocalizedName(sinew.getRegistryName().toString());
		sinew.setCreativeTab(CreativeTabs.MATERIALS);
	}

	public static void register() {
		GameRegistry.register(sinew);
	}

	public static void registerRenders() {
		registerRender(sinew);
	}

	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(
				item.getRegistryName(), "inventory"));
	}
}
