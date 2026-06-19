package com.bilibili.pegasus.components.interestv2.host;

import Ig0.C2295a;
import PH.u;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.interest.v2.entry.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/j.class */
@StabilityInferred(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f77058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<tv.danmaku.bili.interest.v2.entry.k> f77059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final p f77060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C2295a f77061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final u f77062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ComposeView f77063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f77064g;

    @NotNull
    public final i h = new i(this);

    public j(@NotNull FragmentActivity fragmentActivity, @NotNull StateFlow stateFlow, @NotNull p pVar, @NotNull C2295a c2295a, @NotNull u uVar) {
        this.f77058a = fragmentActivity;
        this.f77059b = stateFlow;
        this.f77060c = pVar;
        this.f77061d = c2295a;
        this.f77062e = uVar;
    }

    public final void a() throws Exception {
        i iVar = this.h;
        iVar.setEnabled(false);
        if (this.f77064g) {
            iVar.remove();
            this.f77064g = false;
        }
        ComposeView composeView = this.f77063f;
        if (composeView == null) {
            return;
        }
        ViewParent parent = composeView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(composeView);
        }
        this.f77063f = null;
    }
}
