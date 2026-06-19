package com.bilibili.ogv.operation.modular.modules.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.data.model.SourceContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/i.class */
@StabilityInferred(parameters = 0)
public final class i extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f70462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f70463j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public SourceContent f70465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public f f70466m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f70468o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public g f70470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public h f70471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f70472s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f70464k = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f70467n = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f70469p = "";

    public i(@Nullable String str, @Nullable String str2, @Nullable Ak0.b bVar) {
        this.f70462i = str;
        this.f70463j = str2;
    }

    @Override // Nj0.c
    public final int m() {
        return 2131499616;
    }

    public final void o(boolean z6) {
        if (z6 == this.f70467n) {
            return;
        }
        this.f70467n = z6;
        notifyPropertyChanged(558);
    }
}
