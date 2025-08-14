package com.nnpg.glazed;

import net.minecraft.SharedConstants;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;

public class VersionUtil {

    public static ItemStack getArmorStack(ClientPlayerEntity player, int slot) {
        return player.getInventory().getArmorStack(slot);
    }

    public static int getSelectedSlot(ClientPlayerEntity player) {
        return player.getInventory().selectedSlot;
    }

    public static void setSelectedSlot(ClientPlayerEntity player, int slot) {
        player.getInventory().selectedSlot = slot;
    }

    public static double getPrevX(net.minecraft.entity.Entity entity) {
        return entity.prevX;
    }

    public static double getPrevY(net.minecraft.entity.Entity entity) {
        return entity.prevY;
    }

    public static double getPrevZ(net.minecraft.entity.Entity entity) {
        return entity.prevZ;
    }

    public static DefaultedList<ItemStack> getMainInventory(ClientPlayerEntity player) {
        return player.getInventory().main;
    }
}
