package com.bilibili.playset.detail.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.C4277b;
import androidx.fragment.app.FragmentContainerView;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/compose/x.class */
public final class x implements Function1<Context, View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public FragmentContainerView f84443b;

    public x(int i7) {
        this.f84442a = i7;
    }

    @NotNull
    public final FragmentContainerView b() {
        FragmentContainerView fragmentContainerView = this.f84443b;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new IllegalStateException(C4277b.a(this.f84442a, " yet", new StringBuilder("AndroidView has not created a container for ")).toString());
    }

    public final Object invoke(Object obj) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView((Context) obj);
        fragmentContainerView.setId(this.f84442a);
        this.f84443b = fragmentContainerView;
        return fragmentContainerView;
    }
}
