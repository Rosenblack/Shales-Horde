package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.vanilla.T3__crops;
import net.shale.horde.resource.crops.item.item_group;

public class T3__seeds {
    public static final Item SEED_CORAL = registerItem("vanilla/seed_coral", new
            AliasedBlockItem(T3__crops.CROP_CORAL,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_CREEPER = registerItem("vanilla/seed_creeper", new
            AliasedBlockItem(T3__crops.CROP_CREEPER,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_HONEY = registerItem("vanilla/seed_honey", new
            AliasedBlockItem(T3__crops.CROP_HONEY,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_LAPIS = registerItem("vanilla/seed_lapis", new
            AliasedBlockItem(T3__crops.CROP_LAPIS,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_RABBIT = registerItem("vanilla/seed_rabbit", new
            AliasedBlockItem(T3__crops.CROP_RABBIT,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_SHEEP = registerItem("vanilla/seed_sheep", new
            AliasedBlockItem(T3__crops.CROP_SHEEP,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_SKELETON = registerItem("vanilla/seed_skeleton", new
            AliasedBlockItem(T3__crops.CROP_SKELETON,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_SLIME = registerItem("vanilla/seed_slime", new
            AliasedBlockItem(T3__crops.CROP_SLIME,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_SPIDER = registerItem("vanilla/seed_spider", new
            AliasedBlockItem(T3__crops.CROP_SPIDER,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_SQUID = registerItem("vanilla/seed_squid", new
            AliasedBlockItem(T3__crops.CROP_SQUID,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_TURTLE = registerItem("vanilla/seed_turtle", new
            AliasedBlockItem(T3__crops.CROP_TURTLE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_ZOMBIE = registerItem("vanilla/seed_zombie", new
            AliasedBlockItem(T3__crops.CROP_ZOMBIE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
