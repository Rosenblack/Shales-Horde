package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.vanilla.T1__crops;
import net.shale.horde.resource.crops.item.custom.tier.T1_block;
import net.shale.horde.resource.crops.item.item_group;

public class T1__seeds {
    public static final Item SEED_DEEPSLATE = registerItem("vanilla/seed_deepslate", new
            T1_block(T1__crops.CROP_DEEPSLATE,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_DIRT = registerItem("vanilla/seed_dirt", new
            T1_block(T1__crops.CROP_DIRT,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_ICE = registerItem("vanilla/seed_ice", new
            T1_block(T1__crops.CROP_ICE,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_STONE = registerItem("vanilla/seed_stone", new
            T1_block(T1__crops.CROP_STONE,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));
    public static final Item SEED_WOOD = registerItem("vanilla/seed_wood", new
            T1_block(T1__crops.CROP_WOOD,
            new FabricItemSettings()
                    .group(item_group.ESSENCE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
