package com.bilibili.ogv.story;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bilibili.ad.core.click.K;
import com.bilibili.api.utils.GsonInstance;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.video.story.StoryDetail;
import com.bilibili.video.story.VipBarData;
import com.bilibili.video.story.h0;
import com.bilibili.video.story.helper.J;
import com.bilibili.video.story.helper.O;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryBottomVm.class */
@StabilityInferred(parameters = 0)
public final class OgvStoryBottomVm extends androidx.databinding.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f72963A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public String f72964B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public String f72965C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public String f72966D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public f f72967E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Kd.e f72968F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Kd.a f72969G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f72970H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f72972J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f72973K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public VipBarData f72975M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public O.a f72976N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f72978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f72979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f72980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f72981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ImageRequestBuilder f72982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f72983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f72984g;

    @Nullable
    public Drawable h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Drawable f72985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f72986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f72987k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f72988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f72989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f72990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f72991o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f72993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f72994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f72995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public GradientDrawable f72996t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f72997u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f72998v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f73001y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f73002z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f72992p = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f72999w = 1.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f73000x = 1.0f;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f72971I = K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f72974L = 2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final a f72977O = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryBottomVm$a.class */
    public static final class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvStoryBottomVm f73003a;

        public a(OgvStoryBottomVm ogvStoryBottomVm) {
            this.f73003a = ogvStoryBottomVm;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            OgvStoryBottomVm ogvStoryBottomVm = this.f73003a;
            if (0.0f != ogvStoryBottomVm.f73000x) {
                ogvStoryBottomVm.f73000x = 0.0f;
                ogvStoryBottomVm.notifyPropertyChanged(709);
            }
            OgvStoryBottomVm ogvStoryBottomVm2 = this.f73003a;
            if (true == ogvStoryBottomVm2.f72994r) {
                return;
            }
            ogvStoryBottomVm2.f72994r = true;
            ogvStoryBottomVm2.notifyPropertyChanged(704);
        }
    }

    public static String B(int i7, String str) {
        String strA = str;
        if (str.length() > i7) {
            strA = G.p.a(str.substring(0, i7 - 1), "…");
        }
        return strA;
    }

    public static boolean I(VipBarData vipBarData) {
        String strH;
        String strG;
        String strI = vipBarData.i();
        return (strI == null || strI.length() == 0 || (strH = vipBarData.h()) == null || strH.length() == 0 || (strG = vipBarData.g()) == null || strG.length() == 0) ? false : true;
    }

    public static GradientDrawable J(OgvStoryBottomVm ogvStoryBottomVm, Context context, float f7, ColorStateList colorStateList, int i7) {
        ColorStateList colorStateListWithAlpha = null;
        if ((i7 & 4) != 0) {
            ColorStateList colorStateList2 = AppCompatResources.getColorStateList(context, R$color.Ga9_u);
            colorStateList = colorStateList2 != null ? colorStateList2.withAlpha(RangesKt.coerceIn(MathKt.roundToInt(255 * 0.4f), 0, 255)) : null;
        }
        ColorStateList colorStateList3 = AppCompatResources.getColorStateList(context, R$color.Ga1_u);
        if (colorStateList3 != null) {
            colorStateListWithAlpha = colorStateList3.withAlpha(RangesKt.coerceIn(MathKt.roundToInt(255 * 0.15f), 0, 255));
        }
        ogvStoryBottomVm.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f7);
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(colorStateList);
        gradientDrawable.setStroke(Uj0.c.b(0.5f, context), colorStateListWithAlpha);
        return gradientDrawable;
    }

    public static boolean L(VipBarData vipBarData, int i7) {
        String strK;
        String strL;
        boolean z6 = true;
        if (i7 != 1 || (strK = vipBarData.k()) == null || strK.length() == 0 || (strL = vipBarData.l()) == null || strL.length() == 0 || !I(vipBarData)) {
            z6 = false;
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(final com.bilibili.ogv.story.OgvStoryBottomVm r9, android.content.Context r10, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.story.OgvStoryBottomVm.m(com.bilibili.ogv.story.OgvStoryBottomVm, android.content.Context, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static VipBarData o(StoryDetail storyDetail) {
        StoryDetail.SeasonCardInfo seasonInfo = storyDetail.getSeasonInfo();
        VipBarData vipBarData = null;
        if (seasonInfo != null) {
            String extraJson = seasonInfo.getExtraJson();
            if (extraJson == null) {
                vipBarData = null;
            } else {
                try {
                    vipBarData = (VipBarData) GsonInstance.globalGson.fromJson(extraJson, VipBarData.class);
                } catch (Exception e7) {
                    BLog.e("VipBarDataUtils", e7.getMessage(), e7);
                    vipBarData = null;
                }
            }
        }
        return vipBarData;
    }

    public static Map q(O.a aVar) {
        return MapsKt.hashMapOf(new Pair[]{TuplesKt.to("track_id", aVar.f), TuplesKt.to("simple_id", aVar.g), TuplesKt.to("goto", aVar.e), TuplesKt.to("r_id", String.valueOf(aVar.h)), TuplesKt.to(GameCardButton.extraAvid, String.valueOf(aVar.c)), TuplesKt.to("from_spmid", aVar.b), TuplesKt.to("spmid", aVar.a), TuplesKt.to("position", String.valueOf(aVar.i))});
    }

    public final void A(@NotNull View view) {
        O.a aVar = this.f72976N;
        if (aVar != null) {
            Neurons.reportClick(true, "main.ugc-video-detail-vertical.drama.0.click", q(aVar));
        }
        J.x(view.getContext());
    }

    public final void D(int i7, Context context) {
        Drawable drawable;
        if (i7 == 1) {
            String string = context.getString(2131857202);
            String string2 = context.getString(2131857203);
            if (this.f72973K) {
                string2 = string;
            }
            if (!Intrinsics.areEqual(string2, this.f72986j)) {
                this.f72986j = string2;
                notifyPropertyChanged(221);
            }
        } else if (i7 == 2) {
            String string3 = context.getString(2131851800);
            String string4 = context.getString(2131851799);
            if (this.f72973K) {
                string4 = string3;
            }
            if (!Intrinsics.areEqual(string4, this.f72986j)) {
                this.f72986j = string4;
                notifyPropertyChanged(221);
            }
        } else if (i7 == 3) {
            String string5 = context.getString(2131851803);
            String string6 = context.getString(2131851802);
            if (!this.f72973K) {
                string5 = string6;
            }
            if (!Intrinsics.areEqual(string5, this.f72986j)) {
                this.f72986j = string5;
                notifyPropertyChanged(221);
            }
        }
        int color = this.f72973K ? ContextCompat.getColor(context, R$color.Ga5_u) : ContextCompat.getColor(context, R$color.Wh0_u);
        if (color != this.f72987k) {
            this.f72987k = color;
            notifyPropertyChanged(223);
        }
        if (this.f72973K) {
            Drawable drawable2 = AppCompatResources.getDrawable(context, 2131236673);
            if (drawable2 != null) {
                int color2 = ContextCompat.getColor(context, R$color.Ga5_u);
                drawable = DrawableCompat.wrap(drawable2);
                DrawableCompat.setTint(drawable, color2);
            } else {
                drawable = null;
            }
        } else {
            drawable = AppCompatResources.getDrawable(context, 2131236685);
        }
        if (!Intrinsics.areEqual(drawable, this.f72985i)) {
            this.f72985i = drawable;
            notifyPropertyChanged(224);
        }
        Drawable drawable3 = this.f72973K ? AppCompatResources.getDrawable(context, 2131231341) : AppCompatResources.getDrawable(context, 2131231342);
        if (Intrinsics.areEqual(drawable3, this.h)) {
            return;
        }
        this.h = drawable3;
        notifyPropertyChanged(218);
    }

    public final void F(VipBarData vipBarData) {
        String strE = vipBarData.e();
        if (!Intrinsics.areEqual(strE, this.f72979b)) {
            this.f72979b = strE;
            notifyPropertyChanged(718);
        }
        String strI = vipBarData.i();
        String str = strI;
        if (strI == null) {
            str = "";
        }
        String strH = vipBarData.h();
        String str2 = strH;
        if (strH == null) {
            str2 = "";
        }
        String strG = vipBarData.g();
        if (strG == null) {
            strG = "";
        }
        String strB = B(12, str);
        if (!Intrinsics.areEqual(strB, this.f72964B)) {
            this.f72964B = strB;
            notifyPropertyChanged(715);
        }
        String strB2 = B(17, str2);
        if (!Intrinsics.areEqual(strB2, this.f72965C)) {
            this.f72965C = strB2;
            notifyPropertyChanged(713);
        }
        String strB3 = B(3, strG);
        if (Intrinsics.areEqual(strB3, this.f72966D)) {
            return;
        }
        this.f72966D = strB3;
        notifyPropertyChanged(712);
    }

    public final void G(VipBarData vipBarData, Context context) {
        String strK = vipBarData.k();
        if (!Intrinsics.areEqual(strK, this.f72978a)) {
            this.f72978a = strK;
            notifyPropertyChanged(719);
        }
        String strE = vipBarData.e();
        if (!Intrinsics.areEqual(strE, this.f72979b)) {
            this.f72979b = strE;
            notifyPropertyChanged(718);
        }
        String strF = vipBarData.f();
        if (!Intrinsics.areEqual(strF, this.f72980c)) {
            this.f72980c = strF;
            notifyPropertyChanged(717);
        }
        w(0);
        v(Uj0.c.b(28, context));
        u(J(this, context, Uj0.c.a(4, context), null, 12));
    }

    public final void H(boolean z6) {
        if (z6 != this.f72991o) {
            this.f72991o = z6;
            notifyPropertyChanged(720);
        }
        if (z6 && this.f72970H) {
            r();
        }
    }

    public final void K(@NotNull View view) {
        Map mapB;
        String str;
        VipBarData vipBarData;
        Map mapD;
        if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
            return;
        }
        VipBarData vipBarData2 = this.f72975M;
        String strA = vipBarData2 != null ? vipBarData2.a() : null;
        VipBarData vipBarData3 = this.f72975M;
        String strL = vipBarData3 != null ? vipBarData3.l() : null;
        if (strL == null || strL.length() == 0) {
            return;
        }
        VipBarData vipBarData4 = this.f72975M;
        if (vipBarData4 != null && (mapB = vipBarData4.b()) != null && (str = (String) mapB.get("click")) != null && (vipBarData = this.f72975M) != null && (mapD = vipBarData.d()) != null) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.putAll(mapD);
            O.a aVar = this.f72976N;
            if (aVar != null) {
                mapCreateMapBuilder.put("spmid", aVar.a);
            }
            Neurons.reportClick(true, str, MapsKt.build(mapCreateMapBuilder));
        }
        String strA2 = h0.a(strL, this.f72975M, this.f72976N);
        if (Intrinsics.areEqual(strA, "half_screen")) {
            J.y(view.getContext(), strA2);
        } else {
            Nl0.h.c(view.getContext(), strA2, 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, null);
        }
    }

    public final void n(@NotNull View view) {
        if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
        } else {
            BuildersKt.launch$default(this.f72971I, (CoroutineContext) null, (CoroutineStart) null, new OgvStoryBottomVm$followClick$1(this, view, null), 3, (Object) null);
        }
    }

    public final void r() {
        Map mapB;
        String str;
        VipBarData vipBarData;
        Map mapD;
        VipBarData vipBarData2 = this.f72975M;
        if (vipBarData2 == null || (mapB = vipBarData2.b()) == null || (str = (String) mapB.get("show")) == null || (vipBarData = this.f72975M) == null || (mapD = vipBarData.d()) == null) {
            return;
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(mapD);
        O.a aVar = this.f72976N;
        if (aVar != null) {
            mapCreateMapBuilder.put("spmid", aVar.a);
        }
        Neurons.reportExposure$default(true, str, MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
    }

    public final void s(Context context) {
        if (true != this.f72992p) {
            this.f72992p = true;
            notifyPropertyChanged(710);
        }
        if (1.0f != this.f72999w) {
            this.f72999w = 1.0f;
            notifyPropertyChanged(708);
        }
        if (1.0f != this.f73000x) {
            this.f73000x = 1.0f;
            notifyPropertyChanged(709);
        }
        z(false);
        u(J(this, context, Uj0.c.a(4, context), null, 12));
        int iRoundToInt = MathKt.roundToInt(Uj0.c.a(5, context));
        if (iRoundToInt != this.f72963A) {
            this.f72963A = iRoundToInt;
            notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FOOT_THRESHOLD);
        }
        int iRoundToInt2 = MathKt.roundToInt(Uj0.c.a(6, context));
        if (iRoundToInt2 != this.f73002z) {
            this.f73002z = iRoundToInt2;
            notifyPropertyChanged(703);
        }
        w(0);
        v(MathKt.roundToInt(Uj0.c.a(28, context)));
    }

    public final void u(@Nullable GradientDrawable gradientDrawable) {
        if (Intrinsics.areEqual(gradientDrawable, this.f72996t)) {
            return;
        }
        this.f72996t = gradientDrawable;
        notifyPropertyChanged(705);
    }

    public final void v(int i7) {
        if (i7 == this.f72998v) {
            return;
        }
        this.f72998v = i7;
        notifyPropertyChanged(706);
    }

    public final void w(int i7) {
        if (i7 == this.f72997u) {
            return;
        }
        this.f72997u = i7;
        notifyPropertyChanged(707);
    }

    public final void z(boolean z6) {
        if (z6 == this.f72993q) {
            return;
        }
        this.f72993q = z6;
        notifyPropertyChanged(716);
    }
}
