package com.bilibili.ogv.story;

import HS0.H0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.data.page.detail.OgvPayTipShowType;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.framework.exposure.core.ExposureEntry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/x.class */
@StabilityInferred(parameters = 0)
public final class x extends Nj0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BangumiUniformSeason.StoryVipBar f73123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final H0 f73124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f73125d = new ExposureEntry(Pl0.b.f19035a, new HT0.f(this, 1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f73126e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f73127f = "https://i0.hdslb.com/bfs/activity-plat/static/20220913/a5480f18ac08c1e30876e3fde84db784/MjbvKGpey3.png";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f73128g = "";

    @NotNull
    public String h = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/x$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f73129a;

        static {
            int[] iArr = new int[OgvPayTipShowType.values().length];
            try {
                iArr[OgvPayTipShowType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[OgvPayTipShowType.SINGLE_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f73129a = iArr;
        }
    }

    public x(@NotNull BangumiUniformSeason.StoryVipBar storyVipBar, @NotNull H0 h02) {
        this.f73123b = storyVipBar;
        this.f73124c = h02;
    }

    @Override // Nj0.c
    public final int m() {
        int i7 = a.f73129a[this.f73123b.d.ordinal()];
        return i7 != 1 ? i7 != 2 ? 2131493269 : 2131493271 : 2131493270;
    }
}
