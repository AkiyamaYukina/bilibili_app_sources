package com.bilibili.ogv.operation.entrance.filmlist;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableArrayList;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashMap;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/p.class */
@StabilityInferred(parameters = 0)
public final class p extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f70056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public OGVFilmListPage f70057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public OGVFilmListFragment f70058c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Drawable f70062g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f70063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f70064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f70065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f70066l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableState f70070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f70071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f70072r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f70075u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f70076v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f70077w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f70059d = "pgc.operation-playlist";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f70060e = "pgc.operation-playlist.0.0";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f70061f = "";

    @NotNull
    public String h = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ObservableArrayList<q> f70067m = new ObservableArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f70068n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableState f70069o = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public String f70073s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public String f70074t = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final n f70078x = new AppBarLayout.OnOffsetChangedListener(this) { // from class: com.bilibili.ogv.operation.entrance.filmlist.n

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f70054a;

        {
            this.f70054a = this;
        }

        public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
            float fAbs = Math.abs(i7) / appBarLayout.getTotalScrollRange();
            p pVar = this.f70054a;
            if (fAbs != pVar.f70064j) {
                pVar.f70064j = fAbs;
                pVar.notifyPropertyChanged(53);
            }
            float f7 = fAbs < 0.95f ? 0.0f : 1.0f;
            if (f7 != pVar.f70063i) {
                pVar.f70063i = f7;
                pVar.notifyPropertyChanged(643);
            }
            int i8 = pVar.f70065k;
            HashMap<String, Integer> map = Uj0.a.f24752a;
            int iC = Uj0.a.c(i8, MathKt.roundToInt(fAbs * 255));
            if (iC == pVar.f70066l) {
                return;
            }
            pVar.f70066l = iC;
            pVar.notifyPropertyChanged(276);
        }
    };

    /* JADX WARN: Type inference failed for: r1v14, types: [com.bilibili.ogv.operation.entrance.filmlist.n] */
    public p(boolean z6, @NotNull ExposureEntry exposureEntry) {
        this.f70056a = exposureEntry;
        this.f70070p = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z6), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(@org.jetbrains.annotations.NotNull android.view.View r5) {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.ogv.operation.entrance.filmlist.OGVFilmListPage r0 = r0.f70057b
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L5d
            r0 = r6
            com.bilibili.ogv.operation.entrance.filmlist.FilmListUpInfo r0 = r0.a()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "https://space.bilibili.com/"
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r7
            long r1 = r1.f69983a
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r6 = r0
            r0 = r5
            android.content.Context r0 = r0.getContext()
            r1 = r6
            Qj0.g.e(r0, r1)
            r0 = r4
            java.lang.String r0 = r0.f70059d
            java.lang.String r1 = ".list.up.click"
            java.lang.String r0 = G.p.a(r0, r1)
            r7 = r0
            r0 = r4
            com.bilibili.ogv.operation.entrance.filmlist.OGVFilmListPage r0 = r0.f70057b
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L53
            r0 = r5
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f70012n
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L57
        L53:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r5 = r0
        L57:
            r0 = 0
            r1 = r7
            r2 = r5
            com.bilibili.lib.neuron.api.Neurons.reportClick(r0, r1, r2)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.entrance.filmlist.p.m(android.view.View):void");
    }
}
