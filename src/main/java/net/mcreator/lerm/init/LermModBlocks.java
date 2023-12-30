
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lerm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lerm.block.RubyOreBlock;
import net.mcreator.lerm.block.RubyBlockBlock;
import net.mcreator.lerm.LermMod;

public class LermModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LermMod.MODID);
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
}
