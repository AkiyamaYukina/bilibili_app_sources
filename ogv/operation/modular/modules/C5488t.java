package com.bilibili.ogv.operation.modular.modules;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.ogv.opbase.CommonCard;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/t.class */
@StabilityInferred(parameters = 0)
public final class C5488t extends Nj0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f70742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f70743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Ak0.b f70744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f70745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f70746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f70747g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public SourceContent f70748i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ViewOnClickListenerC5481l f70750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public la0.f f70751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f70752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f70753n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f70755p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public CommonCard f70757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public String f70758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public C5485p f70759t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public C5486q f70760u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f70761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f70762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f70763x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f70764y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public List<C5489u> f70749j = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f70754o = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f70756q = true;

    public C5488t(@Nullable String str, @Nullable String str2, @Nullable Ak0.b bVar, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f70742b = str;
        this.f70743c = str2;
        this.f70744d = bVar;
        this.f70745e = str3;
        this.f70746f = str4;
        this.f70747g = str5;
    }

    @Override // Nj0.c
    public final int m() {
        return 2131499600;
    }

    public final void n(boolean z6) {
        if (z6 == this.f70754o) {
            return;
        }
        this.f70754o = z6;
        notifyPropertyChanged(558);
    }
}
