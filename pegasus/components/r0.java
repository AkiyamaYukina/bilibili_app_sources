package com.bilibili.pegasus.components;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.api.base.Config;
import com.bilibili.pegasus.BasePegasusComponent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/r0.class */
public final class r0 {
    public static final long a() {
        return Config.isDebuggable() ? System.currentTimeMillis() : SystemClock.elapsedRealtime();
    }

    public static final boolean b(@NotNull BasePegasusComponent basePegasusComponent) {
        FragmentActivity fragmentActivityP3;
        Fragment fragment = basePegasusComponent.getFragment();
        boolean z6 = true;
        if ((fragment != null ? fragment.p3() : null) != null) {
            Fragment fragment2 = basePegasusComponent.getFragment();
            z6 = (fragment2 == null || (fragmentActivityP3 = fragment2.p3()) == null || !fragmentActivityP3.isFinishing()) ? false : true;
        }
        return z6;
    }
}
