package com.mdujovic17.horizontalpanes.data.provider;

import com.mdujovic17.horizontalpanes.data.loot.HorizontalPanesBlockLoot;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class HorizontalPanesLootTableProvider extends LootTableProvider {
    public HorizontalPanesLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, Set.of(), List.of(new SubProviderEntry(HorizontalPanesBlockLoot::new, LootContextParamSets.BLOCK)), lookupProvider);
    }
}
