package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.vanilla.T2__crops;
import net.shale.horde.resource.crops.item.custom.tier.T2_block;
import net.shale.horde.resource.crops.item.item_group;

public class T2__seeds {
    public static final Item SEED_AMETHYST = registerItem("vanilla/seed_amethyst", new
            T2_block(T2__crops.CROP_AMETHYST,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_CHICKEN = registerItem("vanilla/seed_chicken", new
            T2_block(T2__crops.CROP_CHICKEN,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_COAL = registerItem("vanilla/seed_coal", new
            T2_block(T2__crops.CROP_COAL,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_COPPER = registerItem("vanilla/seed_copper", new
            T2_block(T2__crops.CROP_COPPER,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_COW = registerItem("vanilla/seed_cow", new
            T2_block(T2__crops.CROP_COW,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_FISH = registerItem("vanilla/seed_fish", new
            T2_block(T2__crops.CROP_FISH,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_IRON = registerItem("vanilla/seed_iron", new
            T2_block(T2__crops.CROP_IRON,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_PIG = registerItem("vanilla/seed_pig", new
            T2_block(T2__crops.CROP_PIG,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
