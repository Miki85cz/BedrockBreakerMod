package com.miki.bedrockite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.miki.bedrockite.item.MoltenBedrockItem;
import com.miki.bedrockite.item.BedrockShardItem;
import com.miki.bedrockite.item.BedrockitePickaxeItem;
import com.miki.bedrockite.item.BedrockNuggetItem;
import com.miki.bedrockite.item.BedrockiteIngotItem;
import com.miki.bedrockite.BedrockiteMod;

public class BedrockiteModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BedrockiteMod.MODID);
	public static final DeferredItem<Item> BEDROCKITE_PICKAXE;
	public static final DeferredItem<Item> CRACKED_BEDROCK;
	public static final DeferredItem<Item> BEDROCK_NUGGET;
	public static final DeferredItem<Item> BEDROCK_SHARD;
	public static final DeferredItem<Item> MOLTEN_BEDROCK;
	public static final DeferredItem<Item> BEDROCKITE_INGOT;
	public static final DeferredItem<Item> BEDROCK_ORE;
	public static final DeferredItem<Item> NETHER_BEDROCK_ORE;
	static {
		BEDROCKITE_PICKAXE = REGISTRY.register("bedrockite_pickaxe", BedrockitePickaxeItem::new);
		CRACKED_BEDROCK = block(BedrockiteModBlocks.CRACKED_BEDROCK, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		BEDROCK_NUGGET = REGISTRY.register("bedrock_nugget", BedrockNuggetItem::new);
		BEDROCK_SHARD = REGISTRY.register("bedrock_shard", BedrockShardItem::new);
		MOLTEN_BEDROCK = REGISTRY.register("molten_bedrock", MoltenBedrockItem::new);
		BEDROCKITE_INGOT = REGISTRY.register("bedrockite_ingot", BedrockiteIngotItem::new);
		BEDROCK_ORE = block(BedrockiteModBlocks.BEDROCK_ORE, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		NETHER_BEDROCK_ORE = block(BedrockiteModBlocks.NETHER_BEDROCK_ORE, new Item.Properties().rarity(Rarity.RARE).fireResistant());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}