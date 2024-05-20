package net.akhverdieva.mptmod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.akhverdieva.mptmod.MptMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //переменная для регистрации предметов в моде
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);


    public static final RegistryObject<Item> AMBER =
            ITEMS.register("amber", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));


    public static final RegistryObject<Item> AMBER_RAW =
            ITEMS.register("amber_raw", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));



    public static final RegistryObject<Item> AMBER_SWORD = ITEMS.register("amber_sword",
            () -> new AmberSwordItem(ModWeaponMaterials.AMBER, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_PICKAXE = ITEMS.register("amber_pickaxe",
            () -> new AmberPickaxeItem(ModWeaponMaterials.AMBER, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_AXE = ITEMS.register("amber_axe",
            () -> new AmberAxeItem(ModWeaponMaterials.AMBER, 6.0F, -3.1F,
                    new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_SHOVEL = ITEMS.register("amber_shovel",
            () -> new AmberShovelItem(ModWeaponMaterials.AMBER, 1.5F, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_HOE = ITEMS.register("amber_hoe",
            () -> new AmberHoeItem(ModWeaponMaterials.AMBER, -2, -1.0F,
                    new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_BOOTS = ITEMS.register("amber_boots",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_HELMET = ITEMS.register("amber_helmet",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_LEGGINGS = ITEMS.register("amber_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));


    //метод для регистрации предметов
    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}






