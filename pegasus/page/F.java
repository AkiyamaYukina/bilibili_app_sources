package com.bilibili.pegasus.page;

import HG0.Q0;
import android.widget.FrameLayout;
import aq0.C4849a;
import com.bilibili.pegasus.components.graduation.C5624z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/F.class */
public final /* synthetic */ class F implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeMachinePegasusFragment f78284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5624z f78285b;

    public /* synthetic */ F(TimeMachinePegasusFragment timeMachinePegasusFragment, C5624z c5624z) {
        this.f78284a = timeMachinePegasusFragment;
        this.f78285b = c5624z;
    }

    public final Object invoke() {
        FrameLayout frameLayout;
        TimeMachinePegasusFragment timeMachinePegasusFragment = this.f78284a;
        timeMachinePegasusFragment.f78324E = false;
        if (timeMachinePegasusFragment.f78342s == this.f78285b) {
            timeMachinePegasusFragment.f78342s = null;
        }
        if (timeMachinePegasusFragment.f78325F) {
            timeMachinePegasusFragment.f78325F = false;
            C4849a c4849a = timeMachinePegasusFragment.f78333j;
            if (c4849a != null && (frameLayout = c4849a.f53974j) != null) {
                frameLayout.post(new Q0(timeMachinePegasusFragment, 2));
            }
        }
        return Unit.INSTANCE;
    }
}
