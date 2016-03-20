package com.mineringermute.appleagain.craft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class applecrafting {

	public static void initCrafting() {
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_apple, 1 , 1), new Object[] {
				"###",
				"#1#",
				"###",
				'1', Items.apple, '#', Blocks.gold_block});
		
	}

}
