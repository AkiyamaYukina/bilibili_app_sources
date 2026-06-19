package com.bilibili.ogv.operation.modular.modules;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.opbase.CommonCard;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/v.class */
@StabilityInferred(parameters = 0)
public final class C5490v extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f70767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f70768b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Drawable f70770d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public C5488t f70772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f70773g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f70774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f70775j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public List<C5488t> f70769c = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f70771e = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public List<CommonCard> f70776k = CollectionsKt.emptyList();

    public final void m(boolean z6) {
        if (z6 == this.f70768b) {
            return;
        }
        this.f70768b = z6;
        notifyPropertyChanged(449);
    }

    public final void n(boolean z6) {
        if (z6 == this.f70767a) {
            return;
        }
        this.f70767a = z6;
        notifyPropertyChanged(664);
    }
}
