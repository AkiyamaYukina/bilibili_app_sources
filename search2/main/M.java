package com.bilibili.search2.main;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/M.class */
@StabilityInferred(parameters = 0)
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainSearchViewModel f86720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WeakReference<BiliMainSearchActivity> f86721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ConstraintLayout f86722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public RecyclerView f86723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public View f86724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public I f86725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f86726g;

    @Nullable
    public BiliMainSearchActivity h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public C6042i f86727i;

    public M(@NotNull BiliMainSearchActivity biliMainSearchActivity, @NotNull MainSearchViewModel mainSearchViewModel) {
        this.f86720a = mainSearchViewModel;
        this.f86721b = new WeakReference<>(biliMainSearchActivity);
    }
}
