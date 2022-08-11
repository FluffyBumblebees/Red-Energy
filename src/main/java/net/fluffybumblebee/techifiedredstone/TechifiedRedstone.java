package net.fluffybumblebee.techifiedredstone;

import net.fabricmc.api.ModInitializer;
import net.fluffybumblebee.techifiedredstone.block.TRBlocks;
import net.fluffybumblebee.techifiedredstone.blockentity.TRBlockEntities;
import net.fluffybumblebee.techifiedredstone.item.TRItems;

public class TechifiedRedstone implements ModInitializer {

	@Override public void onInitialize() {
		TRItems.registerItems();
		TRBlocks.registerBlocks();
		TRBlockEntities.loadClass();
	}
}
