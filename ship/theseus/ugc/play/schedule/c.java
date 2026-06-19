package com.bilibili.ship.theseus.ugc.play.schedule;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/c.class */
public final class c {
    public static final boolean a(@NotNull e eVar, @Nullable Av0.a aVar) {
        if (Intrinsics.areEqual(eVar, aVar)) {
            return true;
        }
        boolean z6 = false;
        if (eVar != null) {
            Av0.a aVar2 = eVar.f98180a;
            if (aVar == null) {
                aVar2.getClass();
            } else if (aVar2.f590a == aVar.f590a && aVar2.f591b == aVar.f591b) {
                z6 = true;
            }
            z6 = false;
        }
        return z6;
    }
}
