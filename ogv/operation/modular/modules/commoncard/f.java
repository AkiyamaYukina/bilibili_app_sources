package com.bilibili.ogv.operation.modular.modules.commoncard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageMeasureBuilder;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.ogv.opbase.ModuleHeader;
import com.bilibili.ogv.opbase.OGVRankThemeType;
import com.bilibili.ogv.opbase.RecommendModule;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/commoncard/f.class */
@StabilityInferred(parameters = 0)
public final class f extends Nj0.c implements Nj0.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public String f70550A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public String f70551B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f70552C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public Map<String, String> f70553D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f70554E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Ok0.a f70555b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Drawable f70563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f70564l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f70566n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f70568p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f70570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f70571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f70572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f70573u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f70575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f70576x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public String f70578z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f70556c = 2131499596;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f70557d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ObservableArrayList<Nj0.c> f70558e = new ObservableArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f70559f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f70560g = "";

    @NotNull
    public String h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f70561i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f70562j = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f70565m = 3.1f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f70567o = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f70569q = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f70574v = RecommendModule.OGVCinemaSubscribeType.HIDE.m7463getValue().intValue();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public String f70577y = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/commoncard/f$a.class */
    public static final class a {
        public static final Object a(Fragment fragment, String str, OGVRankThemeType oGVRankThemeType, SuspendLambda suspendLambda) {
            Context contextRequireContext = fragment.requireContext();
            com.bilibili.ogvcommon.image.e eVar = com.bilibili.ogvcommon.image.e.f73197a;
            ImageMeasureBuilder imageMeasureBuilderAcquire = BiliImageLoader.INSTANCE.acquire(fragment);
            OGVRankThemeType oGVRankThemeType2 = OGVRankThemeType.DARK;
            return eVar.a(imageMeasureBuilderAcquire, str, oGVRankThemeType == oGVRankThemeType2 ? ContextCompat.getColor(contextRequireContext, 2131100293) : MultipleThemeUtils.isNightTheme(contextRequireContext) ? ContextCompat.getColor(contextRequireContext, 2131100294) : ContextCompat.getColor(contextRequireContext, 2131100295), (oGVRankThemeType == oGVRankThemeType2 || MultipleThemeUtils.isNightTheme(contextRequireContext)) ? new Pair(Float.valueOf(0.62f), Float.valueOf(0.21f)) : new Pair(Float.valueOf(0.09f), Float.valueOf(0.99f)), 60, 60, suspendLambda);
        }

        public static final LayerDrawable b(int i7) {
            int iC = Uj0.a.c(i7, 0);
            return new LayerDrawable(new GradientDrawable[]{new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Uj0.a.c(i7, ComposerKt.providerMapsKey), iC}), new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iC, i7, i7})});
        }

        public static void c(int i7, @NotNull RecommendModule recommendModule, @NotNull String str) {
            String str2;
            switch (i7) {
                case 2:
                case 6:
                case 8:
                    str2 = ".recom-multicard.card.show";
                    break;
                case 3:
                    ModuleHeader moduleHeader = (ModuleHeader) CollectionsKt.firstOrNull(recommendModule.f69908j);
                    String str3 = moduleHeader != null ? moduleHeader.f69863b : null;
                    if (str3 == null || StringsKt.isBlank(str3)) {
                        return;
                    } else {
                        str2 = ".operation.more.show";
                    }
                    break;
                case 4:
                case 7:
                    str2 = ".operation.0.show";
                    break;
                case 5:
                    str2 = ".rta-new-ogv.rtalist.show";
                    break;
                default:
                    return;
            }
            String strA = android.support.v4.media.a.a("pgc.", str, str2);
            Map<String, String> map = recommendModule.f69918t;
            Map<String, String> mapEmptyMap = map;
            if (map == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Neurons.reportExposure$default(false, strA, mapEmptyMap, (List) null, 8, (Object) null);
            if (i7 == 8) {
                String strA2 = android.support.v4.media.a.a("pgc.", str, ".recom-multicard.play.show");
                Map<String, String> map2 = recommendModule.f69918t;
                Map<String, String> mapEmptyMap2 = map2;
                if (map2 == null) {
                    mapEmptyMap2 = MapsKt.emptyMap();
                }
                Neurons.reportExposure$default(false, strA2, mapEmptyMap2, (List) null, 8, (Object) null);
            }
        }
    }

    public f(Ok0.a aVar) {
        this.f70555b = aVar;
    }

    @Override // Nj0.c
    public final int m() {
        return this.f70556c;
    }

    public final void n(int i7) {
        if (i7 == this.f70564l) {
            return;
        }
        this.f70564l = i7;
        notifyPropertyChanged(56);
    }

    public final void o(@Nullable Drawable drawable) {
        if (Intrinsics.areEqual(drawable, this.f70563k)) {
            return;
        }
        this.f70563k = drawable;
        notifyPropertyChanged(87);
    }
}
