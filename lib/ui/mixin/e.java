package com.bilibili.lib.ui.mixin;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.ui.RouteConstKt;
import com.bilibili.lib.ui.mixin.IHasRoute;
import lf0.ActivityC7846a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/e.class */
public final class e {
    @NotNull
    public static final IHasRoute.Info a(@NotNull ActivityC7846a activityC7846a) {
        Bundle extras = activityC7846a.getIntent().getExtras();
        return extras != null ? new d(extras.getString(RouteConstKt.BLROUTER_TARGETURL, ""), extras.getString(RouteConstKt.BLROUTER_PAGENAME, ""), extras.getString(RouteConstKt.BLROUTER_MATCHRULE, ""), 8) : (IHasRoute.Info) b.f64898a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.bilibili.lib.ui.mixin.d b(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r7) {
        /*
            r0 = r7
            android.os.Bundle r0 = r0.getArguments()
            r8 = r0
            r0 = 0
            r10 = r0
            r0 = r8
            if (r0 == 0) goto L15
            r0 = r8
            java.lang.String r1 = "blrouter.targeturl"
            java.lang.String r0 = r0.getString(r1)
            r8 = r0
            goto L17
        L15:
            r0 = 0
            r8 = r0
        L17:
            r0 = r10
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L9d
            r0 = r8
            int r0 = r0.length()
            if (r0 != 0) goto L29
            r0 = r10
            r9 = r0
            goto L9d
        L29:
            r0 = r7
            android.os.Bundle r0 = r0.getArguments()
            r9 = r0
            java.lang.String r0 = ""
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L43
            r0 = r9
            java.lang.String r1 = "blrouter.pagename"
            java.lang.String r0 = r0.getString(r1)
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L46
        L43:
            java.lang.String r0 = ""
            r9 = r0
        L46:
            r0 = r7
            android.os.Bundle r0 = r0.getArguments()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L5f
            r0 = r10
            java.lang.String r1 = "blrouter.matchrule"
            java.lang.String r0 = r0.getString(r1)
            r12 = r0
            r0 = r12
            r10 = r0
            r0 = r12
            if (r0 != 0) goto L62
        L5f:
            java.lang.String r0 = ""
            r10 = r0
        L62:
            r0 = r7
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r12 = r0
            r0 = r11
            r7 = r0
            r0 = r12
            if (r0 == 0) goto L91
            r0 = r12
            com.bilibili.lib.ui.mixin.IHasRoute$Info r0 = a(r0)
            r12 = r0
            r0 = r11
            r7 = r0
            r0 = r12
            if (r0 == 0) goto L91
            r0 = r12
            java.lang.String r0 = r0.getRouteName()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L91
            r0 = r11
            r7 = r0
            goto L91
        L91:
            com.bilibili.lib.ui.mixin.d r0 = new com.bilibili.lib.ui.mixin.d
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r7
            r1.<init>(r2, r3, r4, r5)
            r9 = r0
        L9d:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.mixin.e.b(androidx.fragment.app.Fragment):com.bilibili.lib.ui.mixin.d");
    }

    @NotNull
    public static final IHasRoute.Info c(@NotNull Fragment fragment) {
        d dVarB = b(fragment);
        IHasRoute.Info info = dVarB;
        if (dVarB == null) {
            Fragment parentFragment = fragment.getParentFragment();
            IHasRoute.Info infoC = parentFragment != null ? c(parentFragment) : null;
            info = infoC;
            if (infoC == null) {
                FragmentActivity fragmentActivityP3 = fragment.p3();
                IHasRoute.Info infoA = fragmentActivityP3 != null ? a(fragmentActivityP3) : null;
                info = infoA;
                if (infoA == null) {
                    info = (IHasRoute.Info) b.f64898a.getValue();
                }
            }
        }
        return info;
    }
}
