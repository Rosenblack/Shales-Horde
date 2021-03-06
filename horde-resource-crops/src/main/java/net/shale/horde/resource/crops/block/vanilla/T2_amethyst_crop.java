package net.shale.horde.resource.crops.block.vanilla;

import net.minecraft.item.ItemConvertible;
import net.shale.horde.resource.crops.block.custom.crop_block;
import net.shale.horde.resource.crops.item.vanilla.T2__seeds;

public class T2_amethyst_crop extends crop_block {
    public T2_amethyst_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T2__seeds.SEED_AMETHYST;
    }
}
