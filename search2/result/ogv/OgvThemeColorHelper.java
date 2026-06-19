package com.bilibili.search2.result.ogv;

import Et0.g;
import Et0.h;
import Vn.A;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bilibili.app.comm.list.common.search.BitmapProcessType;
import com.bilibili.app.comm.list.common.search.IOgvThemeColorCallback;
import com.bilibili.app.comm.list.common.search.WideScreenAdaptType;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.bean.BlurTransformStrategy;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.imageviewer.utils.e;
import com.bilibili.search2.main.ogv.a;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import com.bilibili.search2.result.ogv.SearchColorModel;
import com.bilibili.search2.utils.B;
import kotlin.Function;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/OgvThemeColorHelper.class */
@StabilityInferred(parameters = 0)
public final class OgvThemeColorHelper implements IOgvThemeColorCallback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static float f88258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f88259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f88260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @JvmField
    public static float f88261s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @JvmField
    public static int f88263u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SearchColorModel f88266a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Bitmap f88270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88272g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public BlurTransformStrategy f88273i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public CenterCropWideScreenMode f88275k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f88278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f88279o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f88262t = Color.parseColor("#4c000000");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @JvmField
    public static final int f88264v = ListExtentionsKt.toPx(186);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @JvmField
    public static final int f88265w = ListExtentionsKt.toPx(44);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f88267b = "#363E53";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColorInt
    public int f88268c = B.s("#363E53", "#363E53");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ColorInt
    public int f88269d = B.s(this.f88267b, "#363E53");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public BitmapProcessType f88274j = BitmapProcessType.CENTER_CROP;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f88276l = 0.56f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ColorInt
    public int f88277m = f88262t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/OgvThemeColorHelper$CenterCropWideScreenMode.class */
    public static final class CenterCropWideScreenMode {
        private static final EnumEntries $ENTRIES;
        private static final CenterCropWideScreenMode[] $VALUES;
        public static final CenterCropWideScreenMode OVERLAY_IN_BITMAP = new CenterCropWideScreenMode("OVERLAY_IN_BITMAP", 0);
        public static final CenterCropWideScreenMode APPEND_EXTRA_BOTTOM = new CenterCropWideScreenMode("APPEND_EXTRA_BOTTOM", 1);

        private static final /* synthetic */ CenterCropWideScreenMode[] $values() {
            return new CenterCropWideScreenMode[]{OVERLAY_IN_BITMAP, APPEND_EXTRA_BOTTOM};
        }

        static {
            CenterCropWideScreenMode[] centerCropWideScreenModeArr$values = $values();
            $VALUES = centerCropWideScreenModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(centerCropWideScreenModeArr$values);
        }

        private CenterCropWideScreenMode(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<CenterCropWideScreenMode> getEntries() {
            return $ENTRIES;
        }

        public static CenterCropWideScreenMode valueOf(String str) {
            return (CenterCropWideScreenMode) Enum.valueOf(CenterCropWideScreenMode.class, str);
        }

        public static CenterCropWideScreenMode[] values() {
            return (CenterCropWideScreenMode[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/OgvThemeColorHelper$a.class */
    public static final class a {
        public static int a() {
            return OgvThemeColorHelper.f88260r ? 0 : OgvThemeColorHelper.f88259q;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/OgvThemeColorHelper$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f88280a;

        static {
            int[] iArr = new int[SearchColorModel.DestroyOgvData.values().length];
            try {
                iArr[SearchColorModel.DestroyOgvData.DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f88280a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/OgvThemeColorHelper$c.class */
    public static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f88281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OgvThemeColorHelper f88282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f88284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final BitmapProcessType f88285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final WideScreenAdaptType f88286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f88287g;
        public final int h;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/OgvThemeColorHelper$c$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f88288a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int[] f88289b;

            static {
                int[] iArr = new int[CenterCropWideScreenMode.values().length];
                try {
                    iArr[CenterCropWideScreenMode.OVERLAY_IN_BITMAP.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[CenterCropWideScreenMode.APPEND_EXTRA_BOTTOM.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f88288a = iArr;
                int[] iArr2 = new int[BitmapProcessType.values().length];
                try {
                    iArr2[BitmapProcessType.CENTER_CROP.ordinal()] = 1;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr2[BitmapProcessType.FIT_HEIGHT_BOTTOM_SHADOW.ordinal()] = 2;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr2[BitmapProcessType.FIT_HEIGHT_BOTH_SHADOW.ordinal()] = 3;
                } catch (NoSuchFieldError e11) {
                }
                f88289b = iArr2;
            }
        }

        public c(int i7, OgvThemeColorHelper ogvThemeColorHelper, String str, Context context, BitmapProcessType bitmapProcessType, WideScreenAdaptType wideScreenAdaptType, int i8, int i9) {
            this.f88281a = i7;
            this.f88282b = ogvThemeColorHelper;
            this.f88283c = str;
            this.f88284d = context;
            this.f88285e = bitmapProcessType;
            this.f88286f = wideScreenAdaptType;
            this.f88287g = i8;
            this.h = i9;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:143:0x076c  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x07df A[LOOP:1: B:148:0x078f->B:150:0x07df, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:153:0x07f0 A[LOOP:0: B:139:0x0726->B:153:0x07f0, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0973  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x0809 A[EDGE_INSN: B:194:0x0809->B:156:0x0809 BREAK  A[LOOP:0: B:139:0x0726->B:153:0x07f0], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:195:0x07e9 A[EDGE_INSN: B:195:0x07e9->B:151:0x07e9 BREAK  A[LOOP:1: B:148:0x078f->B:150:0x07df], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x02d3 A[Catch: Exception -> 0x0166, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0166, blocks: (B:26:0x00bf, B:28:0x00dd, B:31:0x012a, B:43:0x02b0, B:45:0x02ba, B:48:0x02d3, B:50:0x02f5, B:54:0x034f, B:57:0x0375, B:59:0x037b, B:62:0x03cd, B:64:0x03d5, B:68:0x0400, B:70:0x0433, B:72:0x043b, B:74:0x0443, B:76:0x044a, B:78:0x0452, B:80:0x045a, B:35:0x016a, B:37:0x01b2, B:39:0x01d9, B:41:0x025d), top: B:192:0x00bf }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x034f A[Catch: Exception -> 0x0166, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0166, blocks: (B:26:0x00bf, B:28:0x00dd, B:31:0x012a, B:43:0x02b0, B:45:0x02ba, B:48:0x02d3, B:50:0x02f5, B:54:0x034f, B:57:0x0375, B:59:0x037b, B:62:0x03cd, B:64:0x03d5, B:68:0x0400, B:70:0x0433, B:72:0x043b, B:74:0x0443, B:76:0x044a, B:78:0x0452, B:80:0x045a, B:35:0x016a, B:37:0x01b2, B:39:0x01d9, B:41:0x025d), top: B:192:0x00bf }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x03c7  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x03d5 A[Catch: Exception -> 0x0166, TRY_LEAVE, TryCatch #0 {Exception -> 0x0166, blocks: (B:26:0x00bf, B:28:0x00dd, B:31:0x012a, B:43:0x02b0, B:45:0x02ba, B:48:0x02d3, B:50:0x02f5, B:54:0x034f, B:57:0x0375, B:59:0x037b, B:62:0x03cd, B:64:0x03d5, B:68:0x0400, B:70:0x0433, B:72:0x043b, B:74:0x0443, B:76:0x044a, B:78:0x0452, B:80:0x045a, B:35:0x016a, B:37:0x01b2, B:39:0x01d9, B:41:0x025d), top: B:192:0x00bf }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(android.graphics.Bitmap r14) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 2449
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.OgvThemeColorHelper.c.a(android.graphics.Bitmap):void");
        }

        public final void onFailure() {
            S9.b.a(new StringBuilder("download ogv image failed "), this.f88283c, "[Search]OgvThemeColorHelper");
            OgvThemeColorHelper ogvThemeColorHelper = this.f88282b;
            if (this.f88281a != ogvThemeColorHelper.f88279o) {
                return;
            }
            ogvThemeColorHelper.b().f88297g.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/OgvThemeColorHelper$d.class */
    public static final /* synthetic */ class d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f88290a;

        public d(Function1 function1) {
            this.f88290a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f88290a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f88290a.invoke(obj);
        }
    }

    public final void a() {
        this.f88267b = "#363E53";
        this.f88268c = Color.parseColor("#363E53");
        this.f88269d = Color.parseColor(this.f88267b);
        b().f88300k.setValue(SearchColorModel.DestroyOgvData.DESTROY);
        MutableLiveData<Boolean> mutableLiveData = b().f88298i;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        b().f88299j.setValue(bool);
        b().h.setValue(null);
        b().f88297g.setValue(null);
        b().f88300k.setValue(null);
        b().f88292b.setValue(null);
        b().f88293c.setValue(null);
        b().f88303n.setValue(bool);
        b().f88304o.setValue(a.C0582a.f86856a);
        this.f88270e = null;
        this.f88271f = false;
        this.f88273i = null;
        this.f88275k = null;
        this.f88276l = 0.56f;
    }

    @NotNull
    public final SearchColorModel b() {
        SearchColorModel searchColorModel = this.f88266a;
        if (searchColorModel != null) {
            return searchColorModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ogvThemeModel");
        return null;
    }

    public final void c(int i7, int i8, @NotNull String str, boolean z6) {
        String str2;
        if (str == null || str.length() == 0) {
            str2 = "#363E53";
        } else {
            try {
                Color.parseColor(str);
                str2 = str;
            } catch (Exception e7) {
                str2 = "#363E53";
            }
        }
        this.f88267b = str2;
        this.f88268c = B.s(str, "#363E53");
        this.f88269d = i7;
        this.f88277m = i8;
        b().f88301l.setValue(Boolean.FALSE);
        this.f88278n = z6;
    }

    public final void clearGradientOverlay() {
        b().f88304o.setValue(a.C0582a.f86856a);
    }

    public final boolean d() {
        return Intrinsics.areEqual(b().f88298i.getValue(), Boolean.TRUE);
    }

    public final void destroyData(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function0<Unit> function0) {
        b().f88300k.observe(lifecycleOwner, new d(new g(function0, 0)));
    }

    public final void disableOgvTheme() {
        if (this.f88266a != null) {
            this.f88270e = null;
            this.f88271f = false;
            MutableLiveData<Boolean> mutableLiveData = b().f88297g;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            b().f88298i.setValue(bool);
            b().f88303n.setValue(bool);
            b().f88304o.setValue(a.C0582a.f86856a);
        }
    }

    public final void downLoadOgvBackGroundImage(@Nullable Context context, @NotNull String str, int i7, int i8, @Nullable ThumbnailUrlTransformStrategy thumbnailUrlTransformStrategy, @NotNull BitmapProcessType bitmapProcessType) {
        this.f88271f = false;
        int i9 = this.f88279o + 1;
        this.f88279o = i9;
        StringBuilder sbB = A.b(i7, i8, "download size: ", " x ", " ");
        sbB.append(bitmapProcessType);
        BLog.i("[Search]OgvThemeColorHelper", sbB.toString());
        WideScreenAdaptType wideScreenAdaptType = (context != null && com.bilibili.search2.component.e.g(context) && com.bilibili.search2.component.e.h(context)) ? WideScreenAdaptType.GRADIENT_BG_FIXED_HEIGHT : WideScreenAdaptType.DEFAULT;
        ImageExtentionKt.downloadCustomImage(context, str, i7, i8, true, true, thumbnailUrlTransformStrategy, new c(i9, this, str, context, bitmapProcessType, wideScreenAdaptType, i7, i8));
    }

    public final void drawOgvBackgroundColorBitmap(@ColorInt int i7, int i8, int i9) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (i8 <= 0 || i9 <= 0) {
            return;
        }
        if (this.f88271f && (bitmap = this.f88270e) != null && bitmap.getWidth() == 1 && (bitmap2 = this.f88270e) != null && bitmap2.getHeight() == 1) {
            return;
        }
        this.f88272g = i8;
        this.h = i9;
        f88263u = i9;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixel(0, 0, i7);
        this.f88270e = bitmapCreateBitmap;
        this.f88271f = true;
        b().f88297g.setValue(Boolean.TRUE);
    }

    public final boolean e() {
        if (this.f88266a == null) {
            return false;
        }
        SearchColorModel searchColorModelB = b();
        Boolean value = searchColorModelB.f88303n.getValue();
        Boolean bool = Boolean.TRUE;
        boolean z6 = false;
        if (Intrinsics.areEqual(value, bool)) {
            Integer value2 = searchColorModelB.f88292b.getValue();
            if (value2 == null) {
                z6 = false;
            } else {
                z6 = false;
                if (value2.intValue() == 0) {
                    z6 = false;
                    if (!Intrinsics.areEqual(searchColorModelB.f88299j.getValue(), bool)) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    @Nullable
    public final Bitmap getOgvBitmap() {
        return this.f88270e;
    }

    public final void notifyPageSelected(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super Integer, Unit> function1) {
        b().f88292b.observe(lifecycleOwner, new d(new h(function1, 0)));
    }

    public final void setDayNeedBlackView(boolean z6) {
        b().f88301l.setValue(Boolean.valueOf(z6));
    }

    public final void setImageHeightFromOutside(int i7) {
        this.h = i7;
    }

    public final void setImageWidthFromOutside(int i7) {
        this.f88272g = i7;
    }

    public final void setMaskColorFromOutside(int i7) {
        this.f88277m = i7;
    }

    public final void setupGradientOverlay(@ColorInt int i7, int i8, float f7, float f8) {
        if (i8 <= 0) {
            return;
        }
        b().f88304o.setValue(new a.b(i7, i8, f7, f8));
    }

    public final void startDrawBitmap(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> function0) {
        com.bilibili.search2.main.data.h.a(b().f88297g, lifecycleOwner.getLifecycle(), new Observer(this, function0) { // from class: Et0.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvThemeColorHelper f4709a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function0 f4710b;

            {
                this.f4709a = this;
                this.f4710b = function0;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue() || this.f4709a.f88270e == null) {
                    return;
                }
                this.f4710b.invoke();
            }
        });
    }
}
