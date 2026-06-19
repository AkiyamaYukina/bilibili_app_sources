package com.bilibili.pegasus.components.graduation;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/S.class */
@StabilityInferred(parameters = 0)
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewGroup f76089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f76090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Q f76091c = new Runnable(this) { // from class: com.bilibili.pegasus.components.graduation.Q

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f76088a;

        {
            this.f76088a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            S s7 = this.f76088a;
            View view = s7.f76090b;
            if (view == null) {
                return;
            }
            view.animate().alpha(0.0f).setDuration(150L).withEndAction(new N60.g(view, s7)).start();
        }
    };

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.pegasus.components.graduation.Q] */
    public S(@NotNull ViewGroup viewGroup) {
        this.f76089a = viewGroup;
    }

    public final void a() {
        this.f76089a.removeCallbacks(this.f76091c);
        View view = this.f76090b;
        if (view != null) {
            view.animate().cancel();
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        this.f76090b = null;
    }

    public final int b(int i7) {
        return (int) ((i7 * this.f76089a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void c(@NotNull String str) {
        if (StringsKt.isBlank(str)) {
            return;
        }
        this.f76089a.post(new N60.e(1, str, this));
    }
}
