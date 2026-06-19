package com.bilibili.ogv.operation.modular.modules.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.opbase.CommonCard;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/a.class */
@StabilityInferred(parameters = 0)
public abstract class a extends Nj0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f70433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f70434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f70435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f70437f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public CommonCard f70438g;
    public boolean h;

    public void n(boolean z6) {
        if (z6 == this.f70435d) {
            return;
        }
        this.f70435d = z6;
        notifyPropertyChanged(550);
    }
}
