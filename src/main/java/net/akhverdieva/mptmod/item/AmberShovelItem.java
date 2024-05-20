package net.akhverdieva.mptmod.item;

import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;

public class AmberShovelItem extends ShovelItem {
    public AmberShovelItem(Tier tier, float attackDamageModifier, float attackSpeedModifier, Item.Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }
}
