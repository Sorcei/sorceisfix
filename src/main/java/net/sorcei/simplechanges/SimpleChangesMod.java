package net.sorcei.simplechanges;

import net.fabricmc.api.ModInitializer;

import net.sorcei.simplechanges.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleChangesMod implements ModInitializer {
	public static final String SIMPLECHANGES = "simplechanges";
	public static final Logger LOGGER = LoggerFactory.getLogger(SIMPLECHANGES);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}