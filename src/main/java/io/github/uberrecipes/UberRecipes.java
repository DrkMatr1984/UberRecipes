package io.github.uberrecipes;

import io.github.uberrecipes.CraftListener;
import java.util.Iterator;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class UberRecipes
extends JavaPlugin {
	
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents((Listener)new CraftListener(), (Plugin)this);
        this.saveDefaultConfig();
        this.moarRecipes();
    }

    public void onDisable() {
        this.saveConfig();
    }

    private void moarRecipes() {
        if (this.getConfig().getBoolean("settings.recipes.goldenApple", true)) {
            Iterator<Recipe> recipes = this.getServer().recipeIterator();
            while (recipes.hasNext()) {
                Recipe recipe = (Recipe)recipes.next();
                if (recipe == null || recipe.getResult().getType() != Material.GOLDEN_APPLE) continue;
                recipes.remove();
            }
            ItemStack goldenApple = new ItemStack(Material.GOLDEN_APPLE);
            ShapedRecipe GoldApple = new ShapedRecipe(new NamespacedKey(this, "Golden_Apple"), goldenApple).shape(new String[]{"AAA", "ABA", "AAA"}).setIngredient('A', Material.GOLD_NUGGET).setIngredient('B', Material.APPLE);
            this.getServer().addRecipe((Recipe)GoldApple);
        }
        if (this.getConfig().getBoolean("settings.recipes.nameTag", true)) {
            ItemStack NameTag = new ItemStack(Material.NAME_TAG);
            ShapedRecipe NameTag1 = new ShapedRecipe(new NamespacedKey(this, "nametag_1"), NameTag).shape(new String[]{"ABB", "   ", "   "}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag2 = new ShapedRecipe(new NamespacedKey(this, "nametag_2"), NameTag).shape(new String[]{"   ", "ABB", "   "}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag3 = new ShapedRecipe(new NamespacedKey(this, "nametag_3"), NameTag).shape(new String[]{"   ", "   ", "ABB"}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag4 = new ShapedRecipe(new NamespacedKey(this, "nametag_4"), NameTag).shape(new String[]{"BBA", "   ", "   "}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag5 = new ShapedRecipe(new NamespacedKey(this, "nametag_5"), NameTag).shape(new String[]{"   ", "BBA", "   "}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag6 = new ShapedRecipe(new NamespacedKey(this, "nametag_6"), NameTag).shape(new String[]{"   ", "   ", "BBA"}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag7 = new ShapedRecipe(new NamespacedKey(this, "nametag_7"), NameTag).shape(new String[]{"A  ", "B  ", "B  "}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag8 = new ShapedRecipe(new NamespacedKey(this, "nametag_8"), NameTag).shape(new String[]{" A ", " B ", " B "}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag9 = new ShapedRecipe(new NamespacedKey(this, "nametag_9"), NameTag).shape(new String[]{"  A", "  B", "  B"}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag10 = new ShapedRecipe(new NamespacedKey(this, "nametag_10"), NameTag).shape(new String[]{"B  ", "B  ", "A  "}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag11 = new ShapedRecipe(new NamespacedKey(this, "nametag_11"), NameTag).shape(new String[]{" B ", " B ", " A "}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag12 = new ShapedRecipe(new NamespacedKey(this, "nametag_12"), NameTag).shape(new String[]{"  B", "  B", "  A"}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag13 = new ShapedRecipe(new NamespacedKey(this, "nametag_13"), NameTag).shape(new String[]{"  A", " B ", "B  "}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag14 = new ShapedRecipe(new NamespacedKey(this, "nametag_14"), NameTag).shape(new String[]{"  B", " B ", "A  "}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag15 = new ShapedRecipe(new NamespacedKey(this, "nametag_15"), NameTag).shape(new String[]{"A  ", " B ", "  B"}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            ShapedRecipe NameTag16 = new ShapedRecipe(new NamespacedKey(this, "nametag_16"), NameTag).shape(new String[]{"B  ", " B ", "  A"}).setIngredient('A', Material.STRING).setIngredient('B', Material.PAPER);
            this.getServer().addRecipe((Recipe)NameTag1);
            this.getServer().addRecipe((Recipe)NameTag2);
            this.getServer().addRecipe((Recipe)NameTag3);
            this.getServer().addRecipe((Recipe)NameTag4);
            this.getServer().addRecipe((Recipe)NameTag5);
            this.getServer().addRecipe((Recipe)NameTag6);
            this.getServer().addRecipe((Recipe)NameTag7);
            this.getServer().addRecipe((Recipe)NameTag8);
            this.getServer().addRecipe((Recipe)NameTag9);
            this.getServer().addRecipe((Recipe)NameTag10);
            this.getServer().addRecipe((Recipe)NameTag11);
            this.getServer().addRecipe((Recipe)NameTag12);
            this.getServer().addRecipe((Recipe)NameTag13);
            this.getServer().addRecipe((Recipe)NameTag14);
            this.getServer().addRecipe((Recipe)NameTag15);
            this.getServer().addRecipe((Recipe)NameTag16);
        }
        if (this.getConfig().getBoolean("settings.recipes.pigSaddle", true)) {
            ItemStack Saddle = new ItemStack(Material.SADDLE);
            ShapedRecipe pigSaddle = new ShapedRecipe(new NamespacedKey(this, "saddle_1"), Saddle).shape(new String[]{"AAA", "A A", "B B"}).setIngredient('A', Material.LEATHER).setIngredient('B', Material.IRON_INGOT);
            this.getServer().addRecipe((Recipe)pigSaddle);
        }
        if (this.getConfig().getBoolean("settings.recipes.leatherhorse", true)) {
            ItemStack LeatherHorse = new ItemStack(Material.LEATHER_HORSE_ARMOR);
            ShapedRecipe LeatherHorse1 = new ShapedRecipe(new NamespacedKey(this, "leatherhorse_1"), LeatherHorse).shape(new String[]{"  B", "BAB", "BBB"}).setIngredient('A', Material.STRING).setIngredient('B', Material.LEATHER);
            ShapedRecipe LeatherHorse2 = new ShapedRecipe(new NamespacedKey(this, "leatherhorse_2"), LeatherHorse).shape(new String[]{"B  ", "BAB", "BBB"}).setIngredient('A', Material.STRING).setIngredient('B', Material.LEATHER);
            this.getServer().addRecipe((Recipe)LeatherHorse1);
            this.getServer().addRecipe((Recipe)LeatherHorse2);
        }
        if (this.getConfig().getBoolean("settings.recipes.ironHorse", true)) {
            ItemStack IronHorse = new ItemStack(Material.IRON_HORSE_ARMOR);
            ShapedRecipe IronHorse1 = new ShapedRecipe(new NamespacedKey(this, "ironhorse_1"), IronHorse).shape(new String[]{"  B", "BAB", "BBB"}).setIngredient('A', Material.LEATHER).setIngredient('B', Material.IRON_INGOT);
            ShapedRecipe IronHorse2 = new ShapedRecipe(new NamespacedKey(this, "ironhorse_2"), IronHorse).shape(new String[]{"B  ", "BAB", "BBB"}).setIngredient('A', Material.LEATHER).setIngredient('B', Material.IRON_INGOT);
            this.getServer().addRecipe((Recipe)IronHorse1);
            this.getServer().addRecipe((Recipe)IronHorse2);
        }
        if (this.getConfig().getBoolean("settings.recipes.goldHorse", true)) {
            ItemStack GoldHorse = new ItemStack(Material.GOLDEN_HORSE_ARMOR);
            ShapedRecipe GoldHorse1 = new ShapedRecipe(new NamespacedKey(this, "goldhorse_1"), GoldHorse).shape(new String[]{"  B", "BAB", "BBB"}).setIngredient('A', Material.LEATHER).setIngredient('B', Material.GOLD_INGOT);
            ShapedRecipe GoldHorse2 = new ShapedRecipe(new NamespacedKey(this, "goldhorse_2"), GoldHorse).shape(new String[]{"B  ", "BAB", "BBB"}).setIngredient('A', Material.LEATHER).setIngredient('B', Material.GOLD_INGOT);
            this.getServer().addRecipe((Recipe)GoldHorse1);
            this.getServer().addRecipe((Recipe)GoldHorse2);
        }
        if (this.getConfig().getBoolean("settings.recipes.diamondHorse", true)) {
            ItemStack DiamondHorse = new ItemStack(Material.DIAMOND_HORSE_ARMOR);
            ShapedRecipe DiamondHorse1 = new ShapedRecipe(new NamespacedKey(this, "diamondhorse_1"), DiamondHorse).shape(new String[]{"  B", "BAB", "BBB"}).setIngredient('A', Material.LEATHER).setIngredient('B', Material.DIAMOND);
            ShapedRecipe DiamondHorse2 = new ShapedRecipe(new NamespacedKey(this, "diamondhorse_2"), DiamondHorse).shape(new String[]{"B  ", "BAB", "BBB"}).setIngredient('A', Material.LEATHER).setIngredient('B', Material.DIAMOND);
            this.getServer().addRecipe((Recipe)DiamondHorse1);
            this.getServer().addRecipe((Recipe)DiamondHorse2);
        }
        if (this.getConfig().getBoolean("settings.recipes.chainmailArmour", true)) {
            ItemStack ChainHead = new ItemStack(Material.CHAINMAIL_HELMET);
            ShapedRecipe MailHead = new ShapedRecipe(new NamespacedKey(this, "chainmail_helmet"), ChainHead).shape(new String[]{"AAA", "A A", "   "}).setIngredient('A', Material.IRON_BARS);
            this.getServer().addRecipe((Recipe)MailHead);
            ItemStack ChainChest = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
            ShapedRecipe MailChest = new ShapedRecipe(new NamespacedKey(this, "chainmail_chestplate"), ChainChest).shape(new String[]{"A A", "AAA", "AAA"}).setIngredient('A', Material.IRON_BARS);
            this.getServer().addRecipe((Recipe)MailChest);
            ItemStack ChainLegs = new ItemStack(Material.CHAINMAIL_LEGGINGS);
            ShapedRecipe MailLegs = new ShapedRecipe(new NamespacedKey(this, "chainmail_leggings"), ChainLegs).shape(new String[]{"AAA", "A A", "A A"}).setIngredient('A', Material.IRON_BARS);
            this.getServer().addRecipe((Recipe)MailLegs);
            ItemStack ChainFeet = new ItemStack(Material.CHAINMAIL_BOOTS);
            ShapedRecipe MailFeet = new ShapedRecipe(new NamespacedKey(this, "chainmail_boots"), ChainFeet).shape(new String[]{"   ", "A A", "A A"}).setIngredient('A', Material.IRON_BARS);
            this.getServer().addRecipe((Recipe)MailFeet);
        }
        if (this.getConfig().getBoolean("settings.recipes.obsidianBlock", true)) {
            ItemStack Obsidian = new ItemStack(Material.OBSIDIAN);
            ShapelessRecipe Obby = new ShapelessRecipe(new NamespacedKey(this, "obsidian"), Obsidian).addIngredient(Material.LAVA_BUCKET).addIngredient(Material.WATER_BUCKET);
            this.getServer().addRecipe((Recipe)Obby);
        }
        if (this.getConfig().getBoolean("settings.recipes.iceBlock", true)) {
            ItemStack Ice = new ItemStack(Material.ICE);
            ShapelessRecipe IceBlock = new ShapelessRecipe(new NamespacedKey(this, "ice_block"), Ice).addIngredient(Material.SNOW_BLOCK).addIngredient(Material.WATER_BUCKET);
            this.getServer().addRecipe((Recipe)IceBlock);
        }
        if (this.getConfig().getBoolean("settings.recipes.cobWeb", true)) {
            ItemStack Cob = new ItemStack(Material.COBWEB);
            ShapedRecipe Web1 = new ShapedRecipe(new NamespacedKey(this, "cobweb_1"), Cob).shape(new String[]{"A A", " A ", "A A"}).setIngredient('A', Material.STRING);
            ShapedRecipe Web2 = new ShapedRecipe(new NamespacedKey(this, "cobweb_2"), Cob).shape(new String[]{" A ", "AAA", " A "}).setIngredient('A', Material.STRING);
            this.getServer().addRecipe((Recipe)Web1);
            this.getServer().addRecipe((Recipe)Web2);
        }
        if (this.getConfig().getBoolean("settings.recipes.spongeBlock", true)) {
            ItemStack spongeBlock = new ItemStack(Material.SPONGE);
            ShapedRecipe blockSponge = new ShapedRecipe(new NamespacedKey(this, "spongeblock"), spongeBlock).shape(new String[]{"AAA", "AAA", "AAA"}).setIngredient('A', Material.YELLOW_WOOL);
            this.getServer().addRecipe((Recipe)blockSponge);
        }
        if (this.getConfig().getBoolean("settings.recipes.grassBlock", true)) {
            ItemStack Grass = new ItemStack(Material.GRASS, 3);
            ShapedRecipe GrassBlock1 = new ShapedRecipe(new NamespacedKey(this, "grass_block_1"), Grass).shape(new String[]{"AAA", "BBB", "   "}).setIngredient('A', Material.WHEAT_SEEDS).setIngredient('B', Material.DIRT);
            ShapedRecipe GrassBlock2 = new ShapedRecipe(new NamespacedKey(this, "grass_block_2"), Grass).shape(new String[]{"   ", "AAA", "BBB"}).setIngredient('A', Material.WHEAT_SEEDS).setIngredient('B', Material.DIRT);
            this.getServer().addRecipe((Recipe)GrassBlock1);
            this.getServer().addRecipe((Recipe)GrassBlock2);
        }
        if (this.getConfig().getBoolean("settings.recipes.myceliBlock", true)) {
            ItemStack ShroomDirt = new ItemStack(Material.MYCELIUM, 3);
            ShapedRecipe MooDirt1 = new ShapedRecipe(new NamespacedKey(this, "mycelium_1"), ShroomDirt).shape(new String[]{"AAA", "CBB", "DDD"}).setIngredient('A', Material.BROWN_DYE).setIngredient('B', Material.BROWN_MUSHROOM).setIngredient('C', Material.RED_MUSHROOM).setIngredient('D', Material.DIRT);
            ShapedRecipe MooDirt2 = new ShapedRecipe(new NamespacedKey(this, "mycelium_2"), ShroomDirt).shape(new String[]{"AAA", "BCB", "DDD"}).setIngredient('A', Material.BROWN_DYE).setIngredient('B', Material.BROWN_MUSHROOM).setIngredient('C', Material.RED_MUSHROOM).setIngredient('D', Material.DIRT);
            ShapedRecipe MooDirt3 = new ShapedRecipe(new NamespacedKey(this, "mycelium_3"), ShroomDirt).shape(new String[]{"AAA", "BBC", "DDD"}).setIngredient('A', Material.BROWN_DYE).setIngredient('B', Material.BROWN_MUSHROOM).setIngredient('C', Material.RED_MUSHROOM).setIngredient('D', Material.DIRT);
            ShapedRecipe MooDirt4 = new ShapedRecipe(new NamespacedKey(this, "mycelium_4"), ShroomDirt).shape(new String[]{"AAA", "BCC", "DDD"}).setIngredient('A', Material.BROWN_DYE).setIngredient('B', Material.BROWN_MUSHROOM).setIngredient('C', Material.RED_MUSHROOM).setIngredient('D', Material.DIRT);
            ShapedRecipe MooDirt5 = new ShapedRecipe(new NamespacedKey(this, "mycelium_5"), ShroomDirt).shape(new String[]{"AAA", "CBC", "DDD"}).setIngredient('A', Material.BROWN_DYE).setIngredient('B', Material.BROWN_MUSHROOM).setIngredient('C', Material.RED_MUSHROOM).setIngredient('D', Material.DIRT);
            ShapedRecipe MooDirt6 = new ShapedRecipe(new NamespacedKey(this, "mycelium_6"), ShroomDirt).shape(new String[]{"AAA", "CCB", "DDD"}).setIngredient('A', Material.BROWN_DYE).setIngredient('B', Material.BROWN_MUSHROOM).setIngredient('C', Material.RED_MUSHROOM).setIngredient('D', Material.DIRT);
            this.getServer().addRecipe((Recipe)MooDirt1);
            this.getServer().addRecipe((Recipe)MooDirt2);
            this.getServer().addRecipe((Recipe)MooDirt3);
            this.getServer().addRecipe((Recipe)MooDirt4);
            this.getServer().addRecipe((Recipe)MooDirt5);
            this.getServer().addRecipe((Recipe)MooDirt6);
        }
        if (this.getConfig().getBoolean("settings.recipes.mossyCobble", true)) {
            ItemStack MossyCobble = new ItemStack(Material.MOSSY_COBBLESTONE);
            ShapedRecipe moCobble = new ShapedRecipe(new NamespacedKey(this, "mossy_cobble"), MossyCobble).shape(new String[]{"AAA", "ABA", "AAA"}).setIngredient('A', Material.VINE).setIngredient('B', Material.COBBLESTONE);
            this.getServer().addRecipe((Recipe)moCobble);
        }
        if (this.getConfig().getBoolean("settings.recipes.mossyBricks", true)) {
            ItemStack MossyBricks = new ItemStack(Material.MOSSY_STONE_BRICKS);
            ShapedRecipe moBricks = new ShapedRecipe(new NamespacedKey(this, "mossy_bricks"), MossyBricks).shape(new String[]{"AAA", "ABA", "AAA"}).setIngredient('A', Material.VINE).setIngredient('B', Material.SMOOTH_STONE);
            this.getServer().addRecipe((Recipe)moBricks);
        }
        if (this.getConfig().getBoolean("settings.recipes.crackedBricks", true)) {
            ItemStack CrackedBricks = new ItemStack(Material.CRACKED_STONE_BRICKS);
            ShapedRecipe crBricks = new ShapedRecipe(new NamespacedKey(this, "cracked_bricks"), CrackedBricks).shape(new String[]{"AAA", "ABA", "AAA"}).setIngredient('A', Material.SMOOTH_STONE).setIngredient('B', Material.COBBLESTONE);
            this.getServer().addRecipe((Recipe)crBricks);
        }
        if (this.getConfig().getBoolean("settings.recipes.chiseledBricks", true)) {
            ItemStack chiseledBricks = new ItemStack(Material.CHISELED_STONE_BRICKS);
            ShapedRecipe cBricks1 = new ShapedRecipe(new NamespacedKey(this, "chiseled_bricks_1"), chiseledBricks).shape(new String[]{"A  ", "A  ", "   "}).setIngredient('A', Material.STONE_BRICK_STAIRS);
            ShapedRecipe cBricks2 = new ShapedRecipe(new NamespacedKey(this, "chiseled_bricks_2"), chiseledBricks).shape(new String[]{" A ", " A ", "   "}).setIngredient('A', Material.STONE_BRICK_STAIRS);
            ShapedRecipe cBricks3 = new ShapedRecipe(new NamespacedKey(this, "chiseled_bricks_3"), chiseledBricks).shape(new String[]{"  A", "  A", "   "}).setIngredient('A', Material.STONE_BRICK_STAIRS);
            ShapedRecipe cBricks4 = new ShapedRecipe(new NamespacedKey(this, "chiseled_bricks_4"), chiseledBricks).shape(new String[]{"   ", "A  ", "A  "}).setIngredient('A', Material.STONE_BRICK_STAIRS);
            ShapedRecipe cBricks5 = new ShapedRecipe(new NamespacedKey(this, "chiseled_bricks_5"), chiseledBricks).shape(new String[]{"   ", " A ", " A "}).setIngredient('A', Material.STONE_BRICK_STAIRS);
            ShapedRecipe cBricks6 = new ShapedRecipe(new NamespacedKey(this, "chiseled_bricks_6"), chiseledBricks).shape(new String[]{"   ", "  A", "  A"}).setIngredient('A', Material.STONE_BRICK_STAIRS);
            this.getServer().addRecipe((Recipe)cBricks1);
            this.getServer().addRecipe((Recipe)cBricks2);
            this.getServer().addRecipe((Recipe)cBricks3);
            this.getServer().addRecipe((Recipe)cBricks4);
            this.getServer().addRecipe((Recipe)cBricks5);
            this.getServer().addRecipe((Recipe)cBricks6);
        }
        if (this.getConfig().getBoolean("settings.recipes.stoneslabBlock", true)) {
            ItemStack StSlBlock = new ItemStack(Material.STONE_SLAB);
            ShapedRecipe SlabBlock1 = new ShapedRecipe(new NamespacedKey(this, "stone_slab_1"), StSlBlock).shape(new String[]{"A  ", "A  ", "   "}).setIngredient('A', Material.STONE);
            ShapedRecipe SlabBlock2 = new ShapedRecipe(new NamespacedKey(this, "stone_slab_2"), StSlBlock).shape(new String[]{" A ", " A ", "   "}).setIngredient('A', Material.STONE);
            ShapedRecipe SlabBlock3 = new ShapedRecipe(new NamespacedKey(this, "stone_slab_3"), StSlBlock).shape(new String[]{"  A", "  A", "   "}).setIngredient('A', Material.STONE);
            ShapedRecipe SlabBlock4 = new ShapedRecipe(new NamespacedKey(this, "stone_slab_4"), StSlBlock).shape(new String[]{"   ", "A  ", "A  "}).setIngredient('A', Material.STONE);
            ShapedRecipe SlabBlock5 = new ShapedRecipe(new NamespacedKey(this, "stone_slab_5"), StSlBlock).shape(new String[]{"   ", " A ", " A "}).setIngredient('A', Material.STONE);
            ShapedRecipe SlabBlock6 = new ShapedRecipe(new NamespacedKey(this, "stone_slab_6"), StSlBlock).shape(new String[]{"   ", "  A", "  A"}).setIngredient('A', Material.STONE);
            this.getServer().addRecipe((Recipe)SlabBlock1);
            this.getServer().addRecipe((Recipe)SlabBlock2);
            this.getServer().addRecipe((Recipe)SlabBlock3);
            this.getServer().addRecipe((Recipe)SlabBlock4);
            this.getServer().addRecipe((Recipe)SlabBlock5);
            this.getServer().addRecipe((Recipe)SlabBlock6);
        }
        if (!this.getConfig().getBoolean("settings.recipes.packedIce", true)) return;
        ItemStack PackedIce = new ItemStack(Material.PACKED_ICE);
        ShapedRecipe paIce = new ShapedRecipe(new NamespacedKey(this, "packed_ice"), PackedIce).shape(new String[]{"AAA", "ABA", "AAA"}).setIngredient('A', Material.ICE).setIngredient('B', Material.WATER_BUCKET);
        this.getServer().addRecipe((Recipe)paIce);
    }
}

