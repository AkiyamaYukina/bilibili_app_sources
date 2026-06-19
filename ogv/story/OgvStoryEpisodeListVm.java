package com.bilibili.ogv.story;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import com.bilibili.bangumi.data.page.detail.entity.BangumiModule;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisodeStat;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.iconfont.IconFont;
import com.bilibili.iconfont.IconTextDrawable;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.ogv.story.h;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryEpisodeListVm.class */
@StabilityInferred(parameters = 0)
public final class OgvStoryEpisodeListVm extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f73004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f73005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h.a f73007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f73008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f73009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f73010g;

    @NotNull
    public final Function0<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public BangumiUniformSeason f73011i;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Drawable f73021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f73022t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f73023u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f73024v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f73026x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public x f73027y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f73012j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f73013k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f73014l = -32988;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f73015m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f73016n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public String f73017o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ObservableArrayList<Nj0.c> f73018p = new ObservableArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f73019q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f73020r = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public Pair<Integer, Integer> f73025w = new Pair<>(0, 0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Function2<CoroutineScope, Continuation<? super Unit>, Object> f73028z = new OgvStoryEpisodeListVm$observeIfAttached$1(this, null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryEpisodeListVm$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f73029a;

        static {
            int[] iArr = new int[BangumiModule.Type.values().length];
            try {
                iArr[BangumiModule.Type.EP_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BangumiModule.Type.SECTION_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f73029a = iArr;
        }
    }

    public OgvStoryEpisodeListVm(@NotNull Context context, long j7, long j8, @NotNull h.a aVar, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function0<Unit> function0) {
        this.f73004a = context;
        this.f73005b = j7;
        this.f73006c = j8;
        this.f73007d = aVar;
        this.f73008e = str;
        this.f73009f = str2;
        this.f73010g = str3;
        this.h = function0;
    }

    public final void m(BangumiUniformSeason bangumiUniformSeason, List<BangumiUniformEpisode> list, boolean z6) {
        String strH;
        int i7 = 0;
        for (Object obj : list) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BangumiUniformEpisode bangumiUniformEpisode = (BangumiUniformEpisode) obj;
            Context context = this.f73004a;
            String str = this.f73009f;
            String str2 = this.f73010g;
            long j7 = this.f73006c;
            h hVar = new h(context, j7, bangumiUniformEpisode, this.f73007d, this.f73008e, str, str2, i7);
            String str3 = bangumiUniformEpisode.i;
            String str4 = str3;
            if (str3 == null) {
                str4 = "";
            }
            if (!Intrinsics.areEqual(str4, hVar.f73078l)) {
                hVar.f73078l = str4;
                hVar.notifyPropertyChanged(134);
            }
            String str5 = bangumiUniformEpisode.j;
            if (z6) {
                strH = str5;
                if (str5 == null) {
                    strH = "";
                }
            } else {
                strH = Nl0.f.h(context, bangumiUniformSeason.b(), str5, false);
            }
            String str6 = bangumiUniformEpisode.k;
            String str7 = str6;
            if (str6 == null) {
                str7 = "";
            }
            hVar.f73077k = B0.a.a(strH, " ", str7);
            String str8 = MultipleThemeUtils.isNightTheme(context) ? "bangumi_detail_playing_night.json" : "bangumi_detail_playing.json";
            if (!Intrinsics.areEqual(str8, hVar.f73085s)) {
                hVar.f73085s = str8;
                hVar.notifyPropertyChanged(446);
            }
            BangumiBadgeInfo bangumiBadgeInfo = hVar.f73088v;
            BangumiBadgeInfo bangumiBadgeInfo2 = bangumiUniformEpisode.d;
            if (!Intrinsics.areEqual(bangumiBadgeInfo2, bangumiBadgeInfo)) {
                hVar.f73088v = bangumiBadgeInfo2;
                hVar.notifyPropertyChanged(45);
            }
            if (bangumiUniformSeason.D.a()) {
                if (!Intrinsics.areEqual("", hVar.f73083q)) {
                    hVar.f73083q = "";
                    hVar.notifyPropertyChanged(105);
                }
                if (!Intrinsics.areEqual("", hVar.f73080n)) {
                    hVar.f73080n = "";
                    hVar.notifyPropertyChanged(441);
                }
                if (!Intrinsics.areEqual((Object) null, hVar.f73082p)) {
                    hVar.f73082p = null;
                    hVar.notifyPropertyChanged(147);
                }
                if (!Intrinsics.areEqual((Object) null, hVar.f73081o)) {
                    hVar.f73081o = null;
                    hVar.notifyPropertyChanged(440);
                }
            } else {
                BangumiUniformEpisodeStat bangumiUniformEpisodeStat = bangumiUniformEpisode.s;
                String strA = Nl0.g.a(bangumiUniformEpisodeStat != null ? bangumiUniformEpisodeStat.b : 0L, "-");
                String str9 = strA;
                if (strA == null) {
                    str9 = "--";
                }
                if (!Intrinsics.areEqual(str9, hVar.f73083q)) {
                    hVar.f73083q = str9;
                    hVar.notifyPropertyChanged(105);
                }
                Drawable drawable = AppCompatResources.getDrawable(context, 2131238820);
                if (!Intrinsics.areEqual(drawable, hVar.f73082p)) {
                    hVar.f73082p = drawable;
                    hVar.notifyPropertyChanged(147);
                }
                String str10 = bangumiUniformEpisode.c().b;
                if (!Intrinsics.areEqual(str10, hVar.f73080n)) {
                    hVar.f73080n = str10;
                    hVar.notifyPropertyChanged(441);
                }
                IconTextDrawable assetIconDrawable = IconFont.getAssetIconDrawable(bangumiUniformEpisode.c().a, ContextCompat.getColor(context, R$color.Graph_medium));
                if (!Intrinsics.areEqual(assetIconDrawable, hVar.f73081o)) {
                    hVar.f73081o = assetIconDrawable;
                    hVar.notifyPropertyChanged(440);
                }
            }
            Duration.Companion companion = Duration.Companion;
            String strA2 = Sj0.a.a(DurationKt.toDuration(bangumiUniformEpisode.w, DurationUnit.MILLISECONDS));
            if (!Intrinsics.areEqual(strA2, hVar.f73079m)) {
                hVar.f73079m = strA2;
                hVar.notifyPropertyChanged(439);
            }
            hVar.n(j7);
            this.f73018p.add(hVar);
            i7++;
        }
    }

    public final void n(BangumiUniformSeason bangumiUniformSeason, boolean z6) {
        u(z6);
        int iB = bangumiUniformSeason.b();
        boolean zA = com.bilibili.ogv.pub.season.b.a(iB <= 0 ? com.bilibili.ogv.pub.season.a.f71781i : new com.bilibili.ogv.pub.season.a(iB));
        String string = (zA && z6) ? this.f73004a.getString(2131857184) : (!zA || z6) ? z6 ? this.f73004a.getString(2131851803) : this.f73004a.getString(2131851802) : this.f73004a.getString(2131857181);
        if (!Intrinsics.areEqual(string, this.f73019q)) {
            this.f73019q = string;
            notifyPropertyChanged(229);
        }
        int i7 = z6 ? -7038560 : -1;
        if (i7 != this.f73020r) {
            this.f73020r = i7;
            notifyPropertyChanged(230);
        }
        Drawable drawable = null;
        if (z6) {
            Drawable drawable2 = AppCompatResources.getDrawable(this.f73004a, 2131236654);
            if (drawable2 != null) {
                drawable2.setTint(ContextCompat.getColor(this.f73004a, R$color.Ga5));
                int iB2 = Uj0.c.b(14.0f, this.f73004a);
                drawable2.setBounds(0, 0, iB2, iB2);
                drawable = drawable2;
            }
        } else {
            Drawable drawable3 = AppCompatResources.getDrawable(this.f73004a, 2131236687);
            if (drawable3 != null) {
                drawable3.setTint(ContextCompat.getColor(this.f73004a, R$color.Wh0_u));
                int iB3 = Uj0.c.b(14.0f, this.f73004a);
                drawable3.setBounds(0, 0, iB3, iB3);
                drawable = drawable3;
            }
        }
        if (Intrinsics.areEqual(drawable, this.f73021s)) {
            return;
        }
        this.f73021s = drawable;
        notifyPropertyChanged(224);
    }

    public final void o(long j7) {
        for (Nj0.c cVar : this.f73018p) {
            h hVar = cVar instanceof h ? (h) cVar : null;
            if (hVar != null) {
                hVar.n(j7);
            }
        }
        r(j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0635  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(@org.jetbrains.annotations.NotNull com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason r9) {
        /*
            Method dump skipped, instruction units count: 1651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.story.OgvStoryEpisodeListVm.q(com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason):void");
    }

    public final void r(long j7) {
        int i7;
        Iterator<Nj0.c> it = this.f73018p.iterator();
        int i8 = 0;
        int i9 = -1;
        while (true) {
            i7 = i9;
            if (!it.hasNext()) {
                break;
            }
            Nj0.c next = it.next();
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Nj0.c cVar = next;
            h hVar = cVar instanceof h ? (h) cVar : null;
            int i10 = i7;
            if (hVar != null) {
                BangumiUniformEpisode bangumiUniformEpisode = hVar.f73071d;
                i10 = i7;
                if (bangumiUniformEpisode != null) {
                    i10 = i7;
                    if (j7 == bangumiUniformEpisode.a()) {
                        i10 = i8;
                    }
                }
            }
            i8++;
            i9 = i10;
        }
        if (i7 != -1) {
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(i7), Integer.valueOf(Uj0.c.b(300, this.f73004a)));
            if (Intrinsics.areEqual(pair, this.f73025w)) {
                return;
            }
            this.f73025w = pair;
            notifyPropertyChanged(528);
        }
    }

    public final void s(boolean z6) {
        if (z6 == this.f73024v) {
            return;
        }
        this.f73024v = z6;
        notifyPropertyChanged(197);
    }

    public final void u(boolean z6) {
        if (z6 == this.f73022t) {
            return;
        }
        this.f73022t = z6;
        notifyPropertyChanged(232);
    }

    public final void v(boolean z6) {
        if (z6 == this.f73023u) {
            return;
        }
        this.f73023u = z6;
        notifyPropertyChanged(361);
    }
}
