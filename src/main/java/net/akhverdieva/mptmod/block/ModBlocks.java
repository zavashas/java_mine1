package net.akhverdieva.mptmod.block;
import net.akhverdieva.mptmod.item.ModCreativeModeTab;
import net.akhverdieva.mptmod.item.ModItems;
import net.akhverdieva.mptmod.MptMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MptMod.MOD_ID);
    public static <T extends Block>RegistryObject<T> registryObject(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> toReturns = BLOCKS.register(name, block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;
    }
    public  static  <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
                                                                             CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public  static  final RegistryObject<Block> AMBER_BLOCK = registryObject( "amber_block",
() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                 .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MPT_TAB);

    public  static  final RegistryObject<Block> AMBER_ORE = registryObject( "amber_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
            UniformInt.of(3,7)), ModCreativeModeTab.MPT_TAB);

    public  static  final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registryObject( "deepslate_amber_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.MPT_TAB);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}