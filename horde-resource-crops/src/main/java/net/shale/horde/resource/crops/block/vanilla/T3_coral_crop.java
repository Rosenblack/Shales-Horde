package net.shale.horde.resource.crops.block.vanilla;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class T3_coral_crop extends CropBlock {
    public T3_coral_crop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return T3__crops.CROP_CORAL;
    }
}