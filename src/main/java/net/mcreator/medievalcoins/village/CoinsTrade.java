
package net.mcreator.medievalcoins.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.block.Blocks;

import net.mcreator.medievalcoins.item.SilverPieceItem;
import net.mcreator.medievalcoins.item.PlatinumPieceItem;
import net.mcreator.medievalcoins.item.GoldPieceItem;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CoinsTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.ARMORER) {
			trades.get(1).add(new BasicTrade(new ItemStack(Items.COAL, (int) (15)), new ItemStack(SilverPieceItem.block, (int) (10)), 16, 2, 0.05f));
			trades.get(1).add(new BasicTrade(new ItemStack(GoldPieceItem.block, (int) (26)), new ItemStack(SilverPieceItem.block, (int) (6)),
					new ItemStack(Items.IRON_HELMET), 5, 5, 0.05f));
			trades.get(1).add(new BasicTrade(new ItemStack(PlatinumPieceItem.block, (int) (8)), new ItemStack(Items.IRON_CHESTPLATE), 5, 5, 0.05f));
			trades.get(1).add(new BasicTrade(new ItemStack(GoldPieceItem.block, (int) (64)), new ItemStack(SilverPieceItem.block, (int) (6)),
					new ItemStack(Items.IRON_LEGGINGS), 5, 5, 0.05f));
			trades.get(1).add(new BasicTrade(new ItemStack(GoldPieceItem.block, (int) (26)), new ItemStack(SilverPieceItem.block, (int) (6)),
					new ItemStack(Items.IRON_BOOTS), 5, 5, 0.05f));
			trades.get(2)
					.add(new BasicTrade(new ItemStack(Items.IRON_INGOT, (int) (4)), new ItemStack(GoldPieceItem.block, (int) (20)), 10, 5, 0.05f));
			trades.get(2).add(new BasicTrade(new ItemStack(GoldPieceItem.block, (int) (64)), new ItemStack(Blocks.BELL), 10, 5, 0.05f));
			trades.get(2).add(new BasicTrade(new ItemStack(GoldPieceItem.block, (int) (50)), new ItemStack(Items.CHAINMAIL_LEGGINGS), 5, 5, 0.05f));
			trades.get(2).add(new BasicTrade(new ItemStack(GoldPieceItem.block, (int) (20)), new ItemStack(Items.CHAINMAIL_BOOTS), 5, 5, 0.05f));
			trades.get(3).add(new BasicTrade(new ItemStack(Items.LAVA_BUCKET), new ItemStack(GoldPieceItem.block, (int) (20)), 10, 5, 0.05f));
			trades.get(3).add(new BasicTrade(new ItemStack(Items.DIAMOND), new ItemStack(PlatinumPieceItem.block, (int) (6)), 10, 5, 0.05f));
			trades.get(3)
					.add(new BasicTrade(new ItemStack(GoldPieceItem.block, (int) (60)), new ItemStack(Items.CHAINMAIL_CHESTPLATE), 10, 5, 0.05f));
			trades.get(3).add(new BasicTrade(new ItemStack(GoldPieceItem.block, (int) (20)), new ItemStack(Items.CHAINMAIL_HELMET), 10, 5, 0.05f));
			trades.get(3).add(new BasicTrade(new ItemStack(GoldPieceItem.block, (int) (20)), new ItemStack(Items.SHIELD), 10, 5, 0.05f));
		}
	}
}
