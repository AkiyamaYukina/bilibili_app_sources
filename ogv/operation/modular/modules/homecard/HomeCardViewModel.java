package com.bilibili.ogv.operation.modular.modules.homecard;

import Nj0.g;
import android.content.Context;
import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableInt;
import androidx.fragment.app.z;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.iconfont.IconTextDrawable;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.community.bean.BangumiFollowStatus;
import com.bilibili.ogv.community.k;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppBuildConfig;
import y0.C9014b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/homecard/HomeCardViewModel.class */
@StabilityInferred(parameters = 0)
public final class HomeCardViewModel extends Nj0.c implements g, Nj0.d {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @NotNull
    public static final a f70642i1 = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f70643A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f70644B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public String f70645C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public String f70646D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f70647E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public BangumiBadgeInfo f70648F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public List<String> f70649G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public String f70650H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f70651I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public String f70652J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f70653K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f70654L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f70655M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f70656N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public ObservableInt f70657O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f70658P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public Float f70659Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f70660R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public String f70661S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public BangumiBadgeInfo f70662T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f70663U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f70664V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @Nullable
    public String f70665W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @Nullable
    public IconTextDrawable f70666X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public int f70667X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @Nullable
    public String f70668Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    @NotNull
    public final Ak0.c f70669Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @Nullable
    public String f70670Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    @Nullable
    public SourceContent f70671Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f70672a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @Nullable
    public Sk0.c f70673a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HomeCardType f70674b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public long f70675b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Ok0.a f70676c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f70677c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long f70678c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f70679d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @Nullable
    public String f70680d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f70681e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f70682e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f70683f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f70684f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f70685g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f70686g1;

    @NotNull
    public final ExposureEntry h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final boolean f70687h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f70688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f70689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f70690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f70691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f70692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f70693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f70694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f70695p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public String f70696p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f70697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f70698r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f70699r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f70700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public String f70701t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f70702u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f70703v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f70704v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public String f70705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public String f70706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public String f70707y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public BangumiBadgeInfo f70708z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/homecard/HomeCardViewModel$HomeCardType.class */
    public static final class HomeCardType {
        private static final EnumEntries $ENTRIES;
        private static final HomeCardType[] $VALUES;
        public static final HomeCardType STATIC = new HomeCardType("STATIC", 0);
        public static final HomeCardType DYNAMIC_LANDSCAPE = new HomeCardType("DYNAMIC_LANDSCAPE", 1);
        public static final HomeCardType PORTRAIT = new HomeCardType("PORTRAIT", 2);
        public static final HomeCardType FAVOR = new HomeCardType("FAVOR", 3);
        public static final HomeCardType HOT = new HomeCardType("HOT", 4);

        private static final /* synthetic */ HomeCardType[] $values() {
            return new HomeCardType[]{STATIC, DYNAMIC_LANDSCAPE, PORTRAIT, FAVOR, HOT};
        }

        static {
            HomeCardType[] homeCardTypeArr$values = $values();
            $VALUES = homeCardTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(homeCardTypeArr$values);
        }

        private HomeCardType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<HomeCardType> getEntries() {
            return $ENTRIES;
        }

        public static HomeCardType valueOf(String str) {
            return (HomeCardType) Enum.valueOf(HomeCardType.class, str);
        }

        public static HomeCardType[] values() {
            return (HomeCardType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/homecard/HomeCardViewModel$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.homecard.HomeCardViewModel$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/homecard/HomeCardViewModel$a$a.class */
        public static final /* synthetic */ class C0431a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f70709a;

            static {
                int[] iArr = new int[HomeCardType.values().length];
                try {
                    iArr[HomeCardType.FAVOR.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[HomeCardType.HOT.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[HomeCardType.DYNAMIC_LANDSCAPE.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[HomeCardType.PORTRAIT.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                f70709a = iArr;
            }
        }

        public static int a(int i7, int i8, int i9, int i10, int i11, int i12) {
            if (i7 == 0) {
                return i10;
            }
            int i13 = i7 - 1;
            if (i13 != i9 - 1) {
                i11 = i8 - a(i13, i8, i9, i10, i11, i12);
            }
            return i12 - i11;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:234:0x0828  */
        /* JADX WARN: Removed duplicated region for block: B:273:0x0908  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x0940  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.bilibili.ogv.operation.modular.modules.homecard.HomeCardViewModel b(com.bilibili.ogv.operation.modular.modules.homecard.HomeCardViewModel.a r7, com.bilibili.ogv.opbase.CommonCard r8, Ok0.a r9, com.bilibili.ogv.operation.modular.modules.homecard.HomeCardViewModel.HomeCardType r10, com.bilibili.ogv.opbase.RecommendModule r11, int r12) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 4017
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.modular.modules.homecard.HomeCardViewModel.a.b(com.bilibili.ogv.operation.modular.modules.homecard.HomeCardViewModel$a, com.bilibili.ogv.opbase.CommonCard, Ok0.a, com.bilibili.ogv.operation.modular.modules.homecard.HomeCardViewModel$HomeCardType, com.bilibili.ogv.opbase.RecommendModule, int):com.bilibili.ogv.operation.modular.modules.homecard.HomeCardViewModel");
        }

        @JvmStatic
        public static int c(int i7, @NotNull Context context, int i8) {
            int iB = Uj0.c.b(12, context);
            int iB2 = (iB * 2) / 3;
            if (AppBuildConfig.Companion.isHDApp(context)) {
                iB = Uj0.c.b(22.0f, context);
                iB2 = Uj0.c.b(12.0f, context);
            }
            return a(i7, (int) ((((((i8 - 1) * iB2) + iB) + iB) * 1.0f) / i8), i8, iB, iB, iB2);
        }

        @JvmStatic
        public static int d(int i7, @NotNull Context context, int i8) {
            int iB = Uj0.c.b(12, context);
            int iB2 = (iB * 2) / 3;
            if (AppBuildConfig.Companion.isHDApp(context)) {
                iB = Uj0.c.b(22.0f, context);
                iB2 = Uj0.c.b(12.0f, context);
            }
            int iA = (int) ((C9014b.a(r0, iB2, iB, iB) * 1.0f) / i8);
            if (i7 != i8 - 1) {
                iB = iA - a(i7, iA, i8, iB, iB, iB2);
            }
            return iB;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/homecard/HomeCardViewModel$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f70710a;

        static {
            int[] iArr = new int[HomeCardType.values().length];
            try {
                iArr[HomeCardType.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[HomeCardType.DYNAMIC_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[HomeCardType.STATIC.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[HomeCardType.FAVOR.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[HomeCardType.HOT.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f70710a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/homecard/HomeCardViewModel$c.class */
    public static final class c<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HomeCardViewModel f70711a;

        public c(HomeCardViewModel homeCardViewModel) {
            this.f70711a = homeCardViewModel;
        }

        public final void accept(Object obj) {
            HomeCardViewModel homeCardViewModel = this.f70711a;
            homeCardViewModel.f70676c.a(homeCardViewModel.f70693n, ((BangumiFollowStatus) obj).f67504b, !homeCardViewModel.f70692m, homeCardViewModel.f70694o, false);
            homeCardViewModel.f70684f1 = false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/homecard/HomeCardViewModel$d.class */
    public static final class d<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HomeCardViewModel f70712a;

        public d(HomeCardViewModel homeCardViewModel) {
            this.f70712a = homeCardViewModel;
        }

        public final void accept(Object obj) {
            HomeCardViewModel homeCardViewModel = this.f70712a;
            homeCardViewModel.f70676c.a(homeCardViewModel.f70693n, ((Throwable) obj).getMessage(), !homeCardViewModel.f70692m, homeCardViewModel.f70694o, true);
            homeCardViewModel.f70684f1 = false;
        }
    }

    public HomeCardViewModel(HomeCardType homeCardType, Ok0.a aVar, float f7) {
        this.f70674b = homeCardType;
        this.f70676c = aVar;
        this.f70679d = f7;
        Context contextB = aVar.b();
        this.f70681e = contextB;
        this.f70683f = 2131499614;
        this.f70685g = new HashMap();
        this.h = new ExposureEntry(Pl0.b.f19035a, new Rk0.a(this, 0));
        this.f70688i = "";
        this.f70693n = 1;
        this.f70694o = true;
        this.f70707y = "";
        this.f70646D = "";
        this.f70649G = CollectionsKt.emptyList();
        this.f70651I = 14.0f;
        this.f70654L = 1;
        this.f70656N = 1;
        this.f70704v0 = Uj0.c.b(100.0f, contextB);
        this.f70667X0 = Uj0.c.b(100.0f, contextB);
        this.f70669Y0 = aVar.f17875d;
        this.f70687h1 = AppBuildConfig.Companion.isHDApp(contextB);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // Nj0.g
    public final void b(@NotNull Rect rect, @NotNull RecyclerView recyclerView) throws NoWhenBranchMatchedException {
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(2131166072);
        Context context = recyclerView.getContext();
        int i7 = b.f70710a[this.f70674b.ordinal()];
        a aVar = f70642i1;
        int i8 = 3;
        boolean z6 = this.f70687h1;
        if (i7 == 1) {
            if (z6) {
                i8 = 6;
            }
            int i9 = this.f70686g1;
            aVar.getClass();
            rect.set(a.c(i9, context, i8), 0, a.d(this.f70686g1, context, i8), dimensionPixelSize);
            return;
        }
        int i10 = 4;
        if (i7 == 2) {
            if (!z6) {
                i10 = 2;
            }
            int i11 = this.f70686g1;
            aVar.getClass();
            rect.set(a.c(i11, context, i10), 0, a.d(this.f70686g1, context, i10), dimensionPixelSize);
            return;
        }
        if (i7 == 3) {
            rect.set(dimensionPixelSize, 0, dimensionPixelSize, dimensionPixelSize);
            return;
        }
        if (i7 != 4 && i7 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (z6) {
            rect.set(Uj0.c.b(6.0f, context), 0, Uj0.c.b(6.0f, context), 0);
        } else {
            rect.set(Uj0.c.b(4.0f, context), 0, Uj0.c.b(4.0f, context), 0);
        }
    }

    @Override // Nj0.d
    @NotNull
    public final com.bilibili.ogv.operation.modular.modules.homecard.b c() {
        return new com.bilibili.ogv.operation.modular.modules.homecard.b(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Oj0.d, java.lang.Object] */
    @Override // Nj0.d
    @NotNull
    public final Oj0.d h() {
        return new Object();
    }

    @Override // Nj0.d
    @NotNull
    public final String i() {
        return this.f70674b == HomeCardType.STATIC ? this.f70676c.f17873b : "";
    }

    @Override // Nj0.c
    public final int m() {
        return this.f70683f;
    }

    public final void n() {
        boolean z6 = this.f70695p;
        Ok0.a aVar = this.f70676c;
        if (z6 && this.f70675b1 > 0) {
            if (this.f70674b == HomeCardType.FAVOR) {
                boolean z7 = this.f70692m;
                String strC = aVar.c();
                String strC2 = aVar.c();
                Neurons.reportClick(false, z.a("pgc.", strC, (Intrinsics.areEqual(strC2, "cinema-tab") || Intrinsics.areEqual(strC2, "cinema-tab-v2")) ? ".my-cinema" : ".my-anime", !z7 ? ".follow.click" : ".unfollow.click"), this.f70685g);
            }
            Neurons.reportClick(false, android.support.v4.media.a.a("pgc.", aVar.c(), !this.f70692m ? ".operation.follow.click" : ".operation.unfollow.click"), this.f70685g);
        }
        if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            aVar.f();
            return;
        }
        if (this.f70684f1) {
            return;
        }
        this.f70684f1 = true;
        if (this.f70695p) {
            Lazy lazy = k.f67551a;
            aVar.d().add(k.a(this.f70675b1, this.f70692m).subscribe(new c(this), new d(this)));
        }
    }

    public final void o(int i7, int i8, int i9, int i10) {
        if (i7 != this.f70704v0) {
            this.f70704v0 = i7;
            notifyPropertyChanged(92);
        }
        if (i8 != this.f70667X0) {
            this.f70667X0 = i8;
            notifyPropertyChanged(89);
        }
        if (i9 != this.f70672a0) {
            this.f70672a0 = i9;
            notifyPropertyChanged(244);
        }
        if (i10 == this.f70677c0) {
            return;
        }
        this.f70677c0 = i10;
        notifyPropertyChanged(243);
    }

    public final void q(float f7, float f8, float f9, int i7, int i8) {
        if (i7 != this.f70704v0) {
            this.f70704v0 = i7;
            notifyPropertyChanged(92);
        }
        if (i8 != this.f70667X0) {
            this.f70667X0 = i8;
            notifyPropertyChanged(89);
        }
        if (f7 != this.f70689j) {
            this.f70689j = f7;
            notifyPropertyChanged(132);
        }
        if (f8 != this.f70690k) {
            this.f70690k = f8;
            notifyPropertyChanged(131);
        }
        if (f9 == this.f70651I) {
            return;
        }
        this.f70651I = f9;
        notifyPropertyChanged(656);
    }

    public final void r() {
        Neurons.reportClick(false, android.support.v4.media.a.a("pgc.", this.f70676c.c(), ".operation.works.click"), this.f70685g);
    }

    public final void s(boolean z6) {
        if (z6 == this.f70643A) {
            return;
        }
        this.f70643A = z6;
        notifyPropertyChanged(262);
    }

    public final void u(int i7) {
        if (i7 == this.f70656N) {
            return;
        }
        this.f70656N = i7;
        notifyPropertyChanged(615);
    }

    public final void v(int i7) {
        if (i7 == this.f70654L) {
            return;
        }
        this.f70654L = i7;
        notifyPropertyChanged(654);
    }
}
