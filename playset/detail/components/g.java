package com.bilibili.playset.detail.components;

import U60.M;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.bilibili.droid.ToastHelper;
import com.bilibili.playset.collection.enums.CollectionTypeEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/components/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Fragment f84311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final q f84312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l f84313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final f f84314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final M f84315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.bpf.lifecycle.a f84316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Zx0.d f84317g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/components/g$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f84318a;

        static {
            int[] iArr = new int[CollectionTypeEnum.values().length];
            try {
                iArr[CollectionTypeEnum.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[CollectionTypeEnum.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[CollectionTypeEnum.OGV_V2.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f84318a = iArr;
        }
    }

    public g(@NotNull Fragment fragment, @NotNull q qVar, @NotNull l lVar, @NotNull f fVar, @NotNull M m7, @NotNull com.bilibili.ogv.bpf.lifecycle.a aVar, @Nullable Zx0.d dVar) {
        this.f84311a = fragment;
        this.f84312b = qVar;
        this.f84313c = lVar;
        this.f84314d = fVar;
        this.f84315e = m7;
        this.f84316f = aVar;
        this.f84317g = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.components.g.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(int i7) {
        Context context = this.f84311a.getContext();
        if (context != null) {
            ToastHelper.showToast(context, context.getString(i7), 0, 17);
        }
    }
}
