
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lerm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.lerm.world.features.ores.RubyOreFeature;
import net.mcreator.lerm.LermMod;

@Mod.EventBusSubscriber
public class LermModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, LermMod.MODID);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::new);
}
