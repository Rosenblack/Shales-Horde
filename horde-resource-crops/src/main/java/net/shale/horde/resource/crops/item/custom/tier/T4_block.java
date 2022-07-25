package net.shale.horde.resource.crops.item.custom.tier;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemStack;
//import net.minecraft.text.LiteralText;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class T4_block extends AliasedBlockItem {


    public T4_block(Block block, Settings settings) {
        super(block, settings);
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        //tooltip.add(new LiteralText("Tier: 4").formatted(Formatting.DARK_RED));
        tooltip.add(Text.literal("Tier: 4").formatted(Formatting.DARK_RED));
    }
}
