package com.bilibili.pegasus.components;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.teenagersmode.TeenagersMode;
import com.bilibili.teenagersmode.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/e0.class */
@StabilityInferred(parameters = 0)
public final class e0 extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75956k = "oversea_teen_gate_component";

    @NotNull
    public final String getComponentName() {
        return this.f75956k;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (TeenagersMode.getInstance().isEnable()) {
            Boolean bool = Boolean.TRUE;
            kntr.common.restricted.ui.g.b.setValue((Object) null, kntr.common.restricted.ui.g.a[0], bool);
            return;
        }
        if (Intrinsics.areEqual(Boolean.FALSE, (Boolean) kntr.common.restricted.ui.g.b.getValue((Object) null, kntr.common.restricted.ui.g.a[0]))) {
            c.C1213c.f110575a.getClass();
            if (com.bilibili.teenagersmode.c.q()) {
                com.bilibili.teenagersmode.c.s(getRequireFragment().requireContext());
            }
        }
    }
}
