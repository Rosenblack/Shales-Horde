package net.shale.horde.resourcecrops.block.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T2_chicken_crop extends CropBlock {
    public T2_chicken_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T2__crops.CROP_CHICKEN;
    }
}
