package com.bilibili.ship.theseus.ogv.ep;

import com.bilibili.ship.theseus.united.player.mediaplay.f;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/d.class */
public final class d {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Nullable
    public static final com.bilibili.ship.theseus.united.bean.d a(@NotNull f fVar) throws NoWhenBranchMatchedException {
        com.bilibili.ship.theseus.united.bean.d dVar;
        if (fVar instanceof f.b) {
            dVar = ((f.b) fVar).f104515a.f117650f;
        } else if (fVar instanceof f.a) {
            dVar = ((f.a) fVar).f104514a.h;
        } else if (fVar instanceof f.c) {
            dVar = ((f.c) fVar).f104517b;
        } else if (fVar instanceof f.d) {
            dVar = null;
        } else {
            if (!(fVar instanceof f.e)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = ((f.e) fVar).f104523a.f117675d;
        }
        return dVar;
    }
}
