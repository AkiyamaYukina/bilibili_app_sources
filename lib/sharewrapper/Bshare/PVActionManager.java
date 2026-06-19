package com.bilibili.lib.sharewrapper.Bshare;

import com.bilibili.lib.sharewrapper.Bshare.GShare;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/PVActionManager.class */
public final class PVActionManager {

    @NotNull
    public static final PVActionManager INSTANCE = new PVActionManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static String f64403a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static GShare.PVAction f64404b;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void createActionId() {
        /*
            r2 = this;
            com.bilibili.lib.sharewrapper.Bshare.GShare$PVAction r0 = com.bilibili.lib.sharewrapper.Bshare.PVActionManager.f64404b
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L15
            r0 = r3
            java.lang.String r0 = r0.getActionId()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L18
        L15:
            java.lang.String r0 = ""
            r3 = r0
        L18:
            r0 = r3
            com.bilibili.lib.sharewrapper.Bshare.PVActionManager.f64403a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.sharewrapper.Bshare.PVActionManager.createActionId():void");
    }

    @Nullable
    public final String getActionId() {
        return f64403a;
    }

    @Nullable
    public final GShare.PVAction getManager() {
        return f64404b;
    }

    public final void setActionId(@Nullable String str) {
        f64403a = str;
    }

    public final void setDelegate(@NotNull GShare.PVAction pVAction) {
        f64404b = pVAction;
    }

    public final void setManager(@Nullable GShare.PVAction pVAction) {
        f64404b = pVAction;
    }
}
