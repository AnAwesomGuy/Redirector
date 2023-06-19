package com.teampotato.redirectionor.mixin.entity.passive;

import com.teampotato.redirectionor.Redirectionor;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.util.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(StriderEntity.class)
public abstract class StriderEntityMixin {
    @Redirect(method = "getDismountLocationForPassenger", at = @At(value = "FIELD", target = "Lnet/minecraft/util/Direction;DOWN:Lnet/minecraft/util/Direction;"))
    private Direction implDown() {
        return Redirectionor.DOWN;
    }
}
