package net.shale.horde.resourcecrops.block.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T4_obsidian_crop extends CropBlock {
    public T4_obsidian_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T4__crops.CROP_OBSIDIAN;
    }
}
