package com.cassiepeele.cordage;

import com.cassiepeele.cordage.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModCrafting {
	public static void register() {

		OreDictionary.registerOre("tallgrass", new ItemStack(Blocks.TALLGRASS, 1, 0));
		OreDictionary.registerOre("tallgrass", new ItemStack(Blocks.TALLGRASS, 1, 1));
		OreDictionary.registerOre("tallgrass", new ItemStack(Blocks.TALLGRASS, 1, 2));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sinew, 2), new Object[] {Items.ROTTEN_FLESH, Items.ROTTEN_FLESH});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STRING), new Object[] {ModItems.sinew, ModItems.sinew});
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(Items.STRING, new Object[] {"tallgrass", "tallgrass"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.STRING, 2), new Object[] {"treeSapling", "treeSapling"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.STRING, 2), new Object[] {"vine", "vine"}));
	}
}
