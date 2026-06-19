package com.bilibili.studio.centerplus.model;

import F3.O1;
import c6.P;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusRepository.class */
public final class CenterPlusRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CenterPlusRepository f105111a = new Object();

    public static boolean a(@NotNull ModLoadFrom modLoadFrom, @NotNull String[] strArr, boolean z6) {
        boolean z7 = true;
        for (String str : strArr) {
            if (!b(modLoadFrom, "uper", str, z6, true)) {
                z7 = false;
            }
        }
        return z7;
    }

    public static boolean b(ModLoadFrom modLoadFrom, String str, String str2, boolean z6, boolean z7) {
        ModResource modResource = ModResourceClient.getInstance().get(BiliContext.application(), str, str2);
        boolean z8 = modResource.isAvailable() && FC0.a.a(modResource);
        if (z7 && !z8) {
            String str3 = CenterPlusStatisticsHelper.f105195a;
            boolean zIsAvailable = modResource.isAvailable();
            String value = modLoadFrom.getValue();
            HashMap mapC = O4.b.c("mod_name", str2);
            mapC.put(Constant.IN_KEY_REASON, !zIsAvailable ? "no_mod" : "wrong_version");
            String str4 = value;
            if (value == null) {
                str4 = "";
            }
            mapC.put("load_from", str4);
            mapC.put("is_direct", z6 ? "1" : "0");
            Neurons.trackT(false, "bilibili-creation.reader.mod-downloading.reason.tracker", mapC, 1, new O1(9));
        }
        boolean zIsAvailable2 = modResource.isAvailable();
        boolean zA = FC0.a.a(modResource);
        StringBuilder sbA = G0.b.a("checkModResourceAvailable...poolName = ", str, ", modName = ", str2, ", result = ");
        P.a(", modResource.isAvailable = ", ", support(modResource) = ", sbA, z8, zIsAvailable2);
        sbA.append(zA);
        BLog.ifmt("CenterPlusRepository", sbA.toString(), new Object[0]);
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0493  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x05c5 -> B:113:0x05cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x035b -> B:60:0x0361). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull com.bilibili.studio.centerplus.model.ModLoadFrom r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String[] r14, boolean r15, boolean r16, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r17) {
        /*
            Method dump skipped, instruction units count: 1616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.model.CenterPlusRepository.c(com.bilibili.studio.centerplus.model.ModLoadFrom, java.lang.String, java.lang.String[], boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
