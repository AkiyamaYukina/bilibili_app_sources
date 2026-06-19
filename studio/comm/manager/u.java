package com.bilibili.studio.comm.manager;

import com.bilibili.studio.centerplus.network.entity.UpperProfiles;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/u.class */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static volatile UpperProfiles f105426a;

    @JvmStatic
    public static final boolean a() {
        UpperProfiles upperProfiles = f105426a;
        boolean z6 = true;
        if ((upperProfiles != null ? Integer.valueOf(upperProfiles.UpSignAccountState) : null) != null) {
            UpperProfiles upperProfiles2 = f105426a;
            z6 = upperProfiles2 != null && upperProfiles2.UpSignAccountState == 1;
        }
        return z6;
    }
}
