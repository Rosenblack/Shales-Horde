package net.shale.horde.backpack.block.gold;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.backpack.block.BackpackBlock;
import net.shale.horde.backpack.registery.BB_DiamondItemRegistry;
import net.shale.horde.backpack.registery.BB_GoldItemRegistry;

public class BlueBlockGold extends BackpackBlock {
    public BlueBlockGold(Settings settings) {
        super(settings);
    }
    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.isInSneakingPose()) {
            if (player.getStackInHand(hand).isEmpty()) {
                world.setBlockState((pos), Blocks.AIR.getDefaultState());
                player.giveItemStack(BB_GoldItemRegistry.GOLD_BLUE_ITEM.getDefaultStack());
            }
        } else {

        }
        return ActionResult.FAIL;
    }
}
