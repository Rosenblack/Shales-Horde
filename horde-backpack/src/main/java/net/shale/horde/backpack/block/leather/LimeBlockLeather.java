package net.shale.horde.backpack.block.leather;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shale.horde.backpack.block.BackpackBlock;
import net.shale.horde.backpack.registry.BB_LeatherItemRegistry;

public class LimeBlockLeather extends BackpackBlock {
    public LimeBlockLeather(Settings settings) {
        super(settings);
    }
    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.isInSneakingPose()) {
            if (player.getStackInHand(hand).isEmpty()) {
                world.setBlockState((pos), Blocks.AIR.getDefaultState());
                player.giveItemStack(BB_LeatherItemRegistry.LEATHER_LIME_ITEM.getDefaultStack());
            }
        } else {

        }
        return ActionResult.FAIL;
    }
}
