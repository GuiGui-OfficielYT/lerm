
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lerm.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.lerm.LermMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LermModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LermMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(LermModBlocks.RUBY_BLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(LermModItems.RUBY_ARMOR_HELMET.get());
			tabData.accept(LermModItems.RUBY_ARMOR_CHESTPLATE.get());
			tabData.accept(LermModItems.RUBY_ARMOR_LEGGINGS.get());
			tabData.accept(LermModItems.RUBY_ARMOR_BOOTS.get());
			tabData.accept(LermModItems.RUBY_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(LermModItems.RUBY.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(LermModBlocks.RUBY_ORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LermModItems.RUBY_AXE.get());
			tabData.accept(LermModItems.RUBY_PICKAXE.get());
			tabData.accept(LermModItems.RUBY_SHOVEL.get());
			tabData.accept(LermModItems.RUBY_HOE.get());
		}
	}
}
