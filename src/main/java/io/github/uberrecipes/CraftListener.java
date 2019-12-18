package io.github.uberrecipes;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

public class CraftListener
implements Listener {
    @EventHandler
    public void Craft(CraftItemEvent result) {
        if (result.getSlotType().equals((Object)InventoryType.SlotType.RESULT)) {
            // empty if block
        }
        Player p = (Player)result.getWhoClicked();
        ItemStack nameTag = new ItemStack(Material.NAME_TAG);
        ItemStack goldenApple = new ItemStack(Material.GOLDEN_APPLE);
        ItemStack pigSaddle = new ItemStack(Material.SADDLE);
        ItemStack leatherHorse = new ItemStack(Material.LEATHER_HORSE_ARMOR);
        ItemStack ironHorse = new ItemStack(Material.IRON_HORSE_ARMOR);
        ItemStack goldHorse = new ItemStack(Material.GOLDEN_HORSE_ARMOR);
        ItemStack diamondHorse = new ItemStack(Material.DIAMOND_HORSE_ARMOR);
        ItemStack chainHead = new ItemStack(Material.CHAINMAIL_HELMET);
        ItemStack chainChest = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemStack chainLegs = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ItemStack chainFeet = new ItemStack(Material.CHAINMAIL_BOOTS);
        ItemStack obsidian = new ItemStack(Material.OBSIDIAN);
        ItemStack iceBlock = new ItemStack(Material.ICE);
        ItemStack cobWeb = new ItemStack(Material.COBWEB);
        ItemStack spongeBlock = new ItemStack(Material.SPONGE);
        ItemStack grassBlock = new ItemStack(Material.GRASS);
        ItemStack mooDirt = new ItemStack(Material.MYCELIUM);
        ItemStack mossyCobble = new ItemStack(Material.MOSSY_COBBLESTONE);
        ItemStack mossyBricks = new ItemStack(Material.MOSSY_STONE_BRICKS);
        ItemStack crackedBricks = new ItemStack(Material.CRACKED_STONE_BRICKS);
        ItemStack chiseledBricks = new ItemStack(Material.CHISELED_STONE_BRICKS);
        ItemStack stoneslabBlock = new ItemStack(Material.STONE_SLAB);
        ItemStack sandstoneslabBlock = new ItemStack(Material.SANDSTONE_SLAB);
        ItemStack paIce = new ItemStack(Material.PACKED_ICE);
        if (result.getCurrentItem().equals((Object)nameTag) && !p.hasPermission("UberRep.nameTag")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft a Name Tag!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)goldenApple) && !p.hasPermission("UberRep.goldenApple")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Golden Apples!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)pigSaddle) && !p.hasPermission("UberRep.pigSaddle")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft a Saddle!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)leatherHorse) && !p.hasPermission("UberRep.leatherHorse")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Leather Horse Armour!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)ironHorse) && !p.hasPermission("UberRep.ironHorse")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Iron Horse Armour!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)goldHorse) && !p.hasPermission("UberRep.goldHorse")) {
            p.sendMessage((Object)ChatColor.RED + "Sorry, You do not have permission to craft Gold Horse Armour!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)diamondHorse) && !p.hasPermission("UberRep.diamondHorse")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Diamond Horse Armour!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)chainHead) && !p.hasPermission("UberRep.chainmailArmour")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft a chainmail helmet!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)chainChest) && !p.hasPermission("UberRep.chainmailArmour")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft a chainmail chestplate!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)chainLegs) && !p.hasPermission("UberRep.chainmailArmour")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft chainmail leggings!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)chainFeet) && !p.hasPermission("UberRep.chainmailArmour")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft chainmail boots!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)obsidian) && !p.hasPermission("UberRep.obsidianBlock")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Obsidian!");
            result.setCancelled(true);
        }
        if (result.getCurrentItem().equals((Object)iceBlock) && !p.hasPermission("UberRep.iceBlock")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Ice!");
            result.setCancelled(true);
        }
        if (result.getCurrentItem().equals((Object)cobWeb) && !p.hasPermission("UberRep.cobWeb")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft a Cobweb!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)spongeBlock) && !p.hasPermission("UberRep.spongeBlock")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Sponge!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)grassBlock) && !p.hasPermission("UberRep.grassBlock")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Grass!");
            result.setCancelled(true);
        }
        if (result.getCurrentItem().equals((Object)mooDirt) && !p.hasPermission("UberRep.myceliBlock")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Mycelium!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)mossyCobble) && !p.hasPermission("UberRep.mossyCobble")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Mossy Cobblestone!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)mossyBricks) && !p.hasPermission("UberRep.mossyBricks")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Mossy Stone Bricks!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)crackedBricks) && !p.hasPermission("UberRep.crackedBricks")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Cracked Stone Bricks!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)chiseledBricks) && !p.hasPermission("UberRep.chiseledBricks")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Chiseled Stone Bricks!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)stoneslabBlock) && !p.hasPermission("UberRep.stoneslabBlock")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft the Stone Slab Block!");
            result.setCancelled(true);
            return;
        }
        if (result.getCurrentItem().equals((Object)sandstoneslabBlock) && !p.hasPermission("UberRep.sandstoneslabBlock")) {
            p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Sandstone Slab Block");
            result.setCancelled(true);
            return;
        }
        if (!result.getCurrentItem().equals((Object)paIce)) return;
        if (p.hasPermission("UberRep.packedIce")) return;
        p.sendMessage((Object)ChatColor.RED + "You do not have permission to craft Packed Ice");
        result.setCancelled(true);
    }
}

