package com.bilibili.pegasus.components;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.pegasus.PegasusVisibleState;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/j0.class */
@StabilityInferred(parameters = 0)
public final class j0 implements MainDialogManager.IDialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Fragment f77066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RecommendGuidanceComponent f77067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public LA.c f77068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f77069d = LazyKt.lazy(new Tq.j(this, 4));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/j0$a.class */
    public static final class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f77070a;

        public a(j0 j0Var) {
            this.f77070a = j0Var;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                MainDialogManager.removeDialog("recommend_mode_guide");
                this.f77070a.f77066a.getLifecycle().removeObserver(this);
            }
        }
    }

    public j0(@NotNull Fragment fragment, @NotNull RecommendGuidanceComponent recommendGuidanceComponent) {
        this.f77066a = fragment;
        this.f77067b = recommendGuidanceComponent;
    }

    public final void onShow() {
        Fragment fragment = this.f77066a;
        if (!fragment.isAdded() || !fragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            MainDialogManager.showNextDialog("recommend_mode_guide", false, (Context) null);
            return;
        }
        Tq.k kVar = new Tq.k(this, 6);
        RecommendGuidanceComponent recommendGuidanceComponent = this.f77067b;
        if (PegasusVisibleState.isVisible-impl(recommendGuidanceComponent.getVisibleState-XRWi58s())) {
            kVar.invoke();
        } else {
            recommendGuidanceComponent.f75862n = kVar;
        }
    }
}
