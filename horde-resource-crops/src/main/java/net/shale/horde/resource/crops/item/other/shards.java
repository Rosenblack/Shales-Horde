package net.shale.horde.resource.crops.item.other;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;
import net.shale.horde.resource.crops.item.custom.Glinted;
import net.shale.horde.resource.crops.item.item_group;

public class shards {
    public static final Item SHARD_DRAGON_EGG = registerItem("shards/shard_dragon_egg", new Glinted(new FabricItemSettings()
            .group(item_group.ESSENCE)));
    public static final Item SHARD_NETHER_STAR = registerItem("shards/shard_nether_star", new Glinted(new FabricItemSettings()
            .group(item_group.ESSENCE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
