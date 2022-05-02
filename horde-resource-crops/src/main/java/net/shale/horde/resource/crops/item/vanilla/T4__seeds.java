package net.shale.horde.resource.crops.item.vanilla;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.block.vanilla.T4__crops;
import net.shale.horde.resource.crops.item.item_group;

public class T4__seeds {
    public static final Item SEED_DYE = registerItem("vanilla/seed_dye", new
            AliasedBlockItem(T4__crops.CROP_DYE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_EMERALD = registerItem("vanilla/seed_emerald", new
            AliasedBlockItem(T4__crops.CROP_EMERALD,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_ENDERMAN = registerItem("vanilla/seed_enderman", new
            AliasedBlockItem(T4__crops.CROP_ENDERMAN,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_EXPERIENCE = registerItem("vanilla/seed_experience", new
            AliasedBlockItem(T4__crops.CROP_EXPERIENCE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_GOLD = registerItem("vanilla/seed_gold", new
            AliasedBlockItem(T4__crops.CROP_GOLD,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_NATURE = registerItem("vanilla/seed_nature", new
            AliasedBlockItem(T4__crops.CROP_NATURE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_OBSIDIAN = registerItem("vanilla/seed_obsidian", new
            AliasedBlockItem(T4__crops.CROP_OBSIDIAN,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_PRISMARINE = registerItem("vanilla/seed_prismarine", new
            AliasedBlockItem(T4__crops.CROP_PRISMARINE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));
    public static final Item SEED_REDSTONE = registerItem("vanilla/seed_redstone", new
            AliasedBlockItem(T4__crops.CROP_REDSTONE,
            new FabricItemSettings()
                    .group(item_group.SEEDS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
