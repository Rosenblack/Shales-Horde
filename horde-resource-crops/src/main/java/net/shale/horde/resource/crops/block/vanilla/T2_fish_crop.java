package net.shale.horde.resource.crops.block.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T2_fish_crop extends CropBlock {
    public T2_fish_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T2__crops.CROP_FISH;
    }
}