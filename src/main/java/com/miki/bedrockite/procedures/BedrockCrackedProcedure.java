package com.miki.bedrockite.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import com.miki.bedrockite.init.BedrockiteModBlocks;

@EventBusSubscriber(modid = "bedrockite") 
public class BedrockCrackedProcedure {

    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        if (event.getState().is(BedrockiteModBlocks.BEDROCK_CRACKS.get())) {
            event.setCanceled(true);
            executeStageSwap(event.getLevel(), event.getPos());
        }
    }

    public static void executeStageSwap(LevelAccessor world, BlockPos pos) {
        world.setBlock(pos, BedrockiteModBlocks.CRACKED_BEDROCK.get().defaultBlockState(), 3);
    }
}
