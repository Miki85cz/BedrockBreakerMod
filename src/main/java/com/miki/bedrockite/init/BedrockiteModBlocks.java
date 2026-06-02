package com.miki.bedrockite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import com.miki.bedrockite.block.NetherBedrockOreBlock;
import com.miki.bedrockite.block.CrackedBedrockBlock;
import com.miki.bedrockite.block.BedrockOreBlock;
import com.miki.bedrockite.block.BedrockCracksBlock;
import com.miki.bedrockite.BedrockiteMod;

public class BedrockiteModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BedrockiteMod.MODID);
	public static final DeferredBlock<Block> CRACKED_BEDROCK;
	public static final DeferredBlock<Block> BEDROCK_ORE;
	public static final DeferredBlock<Block> NETHER_BEDROCK_ORE;
	public static final DeferredBlock<Block> BEDROCK_CRACKS;
	static {
		CRACKED_BEDROCK = REGISTRY.register("cracked_bedrock", CrackedBedrockBlock::new);
		BEDROCK_ORE = REGISTRY.register("bedrock_ore", BedrockOreBlock::new);
		NETHER_BEDROCK_ORE = REGISTRY.register("nether_bedrock_ore", NetherBedrockOreBlock::new);
		BEDROCK_CRACKS = REGISTRY.register("bedrock_cracks", BedrockCracksBlock::new);
	}
}