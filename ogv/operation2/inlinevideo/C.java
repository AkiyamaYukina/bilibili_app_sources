package com.bilibili.ogv.operation2.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/C.class */
@StabilityInferred(parameters = 0)
public final class C extends ViewModel {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f70866f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private l f70867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f70868b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f70869c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OgvInlineStatusHelper f70870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function0<? extends Fragment> f70871e;

    @Nullable
    public final l I0() {
        return this.f70867a;
    }

    @NotNull
    public final OgvInlineStatusHelper J0() {
        OgvInlineStatusHelper ogvInlineStatusHelper = this.f70870d;
        if (ogvInlineStatusHelper != null) {
            return ogvInlineStatusHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inlineStatusHelper");
        return null;
    }

    @NotNull
    public final Function0<Fragment> K0() {
        Function0 function0 = this.f70871e;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("obtainFragment");
        return null;
    }

    @NotNull
    public final String L0() {
        return this.f70869c;
    }

    @NotNull
    public final String M0() {
        return this.f70868b;
    }

    public final void N0(@Nullable l lVar) {
        this.f70867a = lVar;
    }

    public final void O0(@NotNull OgvInlineStatusHelper ogvInlineStatusHelper) {
        this.f70870d = ogvInlineStatusHelper;
    }

    public final void P0(@NotNull Function0<? extends Fragment> function0) {
        this.f70871e = function0;
    }

    public final void Q0(@NotNull String str) {
        this.f70869c = str;
    }

    public final void R0(@NotNull String str) {
        this.f70868b = str;
    }
}
