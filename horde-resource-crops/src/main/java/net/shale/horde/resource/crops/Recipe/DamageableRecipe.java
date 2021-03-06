package net.shale.horde.resource.crops.Recipe;

import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.shale.horde.resource.crops.item.RemainderItem;

public class DamageableRecipe extends ShapedRecipe {
    public DamageableRecipe(Identifier id, String group, int width, int height, DefaultedList<Ingredient> input, ItemStack output) {
        super(id, group, width, height, input, output);
        System.out.println("LOOKHEEEERRREEEE2: " + output);
    }

    @Override
    public DefaultedList<ItemStack> getRemainder(CraftingInventory craftingInventory) {
        DefaultedList<ItemStack> defaultedList = DefaultedList.ofSize(craftingInventory.size(), ItemStack.EMPTY);

        for (int i = 0; i < defaultedList.size(); ++i) {
            Item item = craftingInventory.getStack(i).getItem();
            if (item.hasRecipeRemainder()) {
                ItemStack stack = new ItemStack(item.getRecipeRemainder());
                if (item instanceof RemainderItem && ((RemainderItem) item).canTakeDamage()) {
                    stack.setDamage(craftingInventory.getStack(i).getDamage() + 1);
                    if (stack.getDamage() < stack.getMaxDamage()) {
                        defaultedList.set(i, stack);
                    }
                } else {
                    defaultedList.set(i, stack);
                }
            }
        }

        return defaultedList;
    }
}
