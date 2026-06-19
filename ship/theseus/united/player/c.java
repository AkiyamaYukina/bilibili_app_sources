package com.bilibili.ship.theseus.united.player;

import B41.m;
import Di0.C1600d;
import cf.p;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import kntr.common.behavior.prediction.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/c.class */
public final class c {
    public static final int a(int i7, @NotNull String str, boolean z6) {
        if (!com.bilibili.player.tangram.basic.a.c(i7)) {
            return i7;
        }
        boolean zIsWifiActive = ConnectivityMonitor.getInstance().isWifiActive();
        m.c cVarC = h.b.a.c(new m.b(str, i7, z6, zIsWifiActive));
        Integer numValueOf = null;
        m.c cVar = cVarC instanceof m.c ? cVarC : null;
        if (cVar != null) {
            numValueOf = Integer.valueOf(cVar.a);
        }
        StringBuilder sbB = C1600d.b("ai predict isWifi:", " avid:", str, " ratioMax:", zIsWifiActive);
        p.a(numValueOf, String.valueOf(i7), " new-RatioMax:", " isHighScreenRatio:", sbB);
        sbB.append(z6);
        defpackage.a.b("[theseus-united-QualityStrategyProviderKt-aiPredictQuality-b8gkTHg] ", sbB.toString(), "QualityStrategyProviderKt-aiPredictQuality-b8gkTHg");
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (iIntValue < 0) {
                i7 = 0;
            } else {
                i7 = iIntValue;
                if (iIntValue == 15) {
                    i7 = 16;
                }
            }
        }
        return i7;
    }
}
