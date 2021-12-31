package net.corasol.minecher.item.custom;

import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


import java.util.List;

public class SilverNecklaceItem extends Item {


    public SilverNecklaceItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(user.getWorld().isClient)
        {
            BlockPos positionClicked = user.getBlockPos();
            PlayerEntity player = user; //same as user

            double d = 8.0;
            double e = 5.0;
            Vec3d vec3d = Vec3d.ofBottomCenter(positionClicked);
            List<HostileEntity> list = world.getEntitiesByClass(HostileEntity.class, new Box(vec3d.getX() - 8.0, vec3d.getY() - 5.0,
                    vec3d.getZ() - 8.0, vec3d.getX() + 8.0, vec3d.getY() + 5.0, vec3d.getZ() + 8.0), hostileEntity -> hostileEntity.isAngryAt(player));
            int badguyindex = 0;
            if (!list.isEmpty() && badguyindex < list.size()) {
                for (HostileEntity badguy : list)
                {
                    outputBadguyCoordinates(player, badguy);
                    badguyindex ++;
                }
                }
            else {
                player.sendMessage(new TranslatableText("item.minecher.silver_wolf_medallion.no_monsters"), false);
            }
            }

        return super.use(world, user, hand);
    }

    private void outputBadguyCoordinates(PlayerEntity player, HostileEntity badguy) {
        player.sendMessage(new LiteralText("Found " + badguy.getName().getString() + " at (" + badguy.getBlockPos().getX() + ", " +
                badguy.getBlockPos().getY() + ", " + badguy.getBlockPos().getZ() + ")"), false);
    }
}