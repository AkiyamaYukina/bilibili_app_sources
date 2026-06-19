package com.bilibili.ogv.story;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import cV0.U;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.iconfont.IconTextDrawable;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/h.class */
@StabilityInferred(parameters = 0)
public final class h extends Nj0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f73069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BangumiUniformEpisode f73071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f73072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f73073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f73074g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f73075i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public IconTextDrawable f73081o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Drawable f73082p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f73084r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public BangumiBadgeInfo f73088v;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f73076j = new ExposureEntry(Pl0.b.f19035a, new U(this, 2));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f73077k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f73078l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f73079m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f73080n = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f73083q = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public String f73085s = "bangumi_detail_playing.json";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public SpannableString f73086t = new SpannableString("");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f73087u = -15197924;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/h$a.class */
    public interface a {
        void a(@NotNull BangumiUniformEpisode bangumiUniformEpisode, int i7);
    }

    public h(@NotNull Context context, long j7, @NotNull BangumiUniformEpisode bangumiUniformEpisode, @NotNull a aVar, @NotNull String str, @NotNull String str2, @NotNull String str3, int i7) {
        this.f73069b = context;
        this.f73070c = j7;
        this.f73071d = bangumiUniformEpisode;
        this.f73072e = aVar;
        this.f73073f = str;
        this.f73074g = str2;
        this.h = str3;
        this.f73075i = i7;
    }

    @Override // Nj0.c
    public final int m() {
        return 2131493267;
    }

    public final void n(long j7) {
        SpannableString spannableString;
        long j8 = MultipleThemeUtils.isNightTheme(this.f73069b) ? 4293388779L : 4279769372L;
        long j9 = MultipleThemeUtils.isNightTheme(this.f73069b) ? 4292103805L : 4294928025L;
        BangumiUniformEpisode bangumiUniformEpisode = this.f73071d;
        boolean z6 = j7 == bangumiUniformEpisode.a();
        if (z6 != this.f73084r) {
            this.f73084r = z6;
            notifyPropertyChanged(448);
        }
        if (j7 == bangumiUniformEpisode.a()) {
            spannableString = new SpannableString(this.f73077k);
            spannableString.setSpan(new LeadingMarginSpan.Standard(Uj0.c.b(16, this.f73069b), 0), 0, this.f73077k.length(), 18);
        } else {
            spannableString = new SpannableString(this.f73077k);
        }
        if (!Intrinsics.areEqual(spannableString, this.f73086t)) {
            this.f73086t = spannableString;
            notifyPropertyChanged(589);
        }
        int i7 = j7 == bangumiUniformEpisode.a() ? (int) j9 : (int) j8;
        if (i7 == this.f73087u) {
            return;
        }
        this.f73087u = i7;
        notifyPropertyChanged(380);
    }
}
