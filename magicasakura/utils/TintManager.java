package com.bilibili.magicasakura.utils;

import Tg0.C2897a;
import Ug0.C2903a;
import Ug0.C2905c;
import Ug0.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import com.bilibili.base.MainThread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/utils/TintManager.class */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class TintManager {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f65499f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<WeakHashMap<Context, TintManager>> f65500g = new ThreadLocal<>();
    public static final a h = new LruCache(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f65501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LongSparseArray<ColorStateList> f65502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LongSparseArray<WeakReference<Drawable.ConstantState>> f65503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LongSparseArray<String> f65504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f65505e = MainThread.isMainThread();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/utils/TintManager$a.class */
    public static final class a extends LruCache<Integer, PorterDuffColorFilter> {
    }

    public TintManager(Context context) {
        this.f65501a = new WeakReference<>(context);
    }

    public static PorterDuffColorFilter a(Context context, ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        int iB = ThemeUtils.b(colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()), context);
        a aVar = h;
        aVar.getClass();
        int i7 = (31 + iB) * 31;
        PorterDuffColorFilter porterDuffColorFilter = aVar.get(Integer.valueOf(mode.hashCode() + i7));
        PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilter;
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(iB, mode);
            aVar.put(Integer.valueOf(mode.hashCode() + i7), porterDuffColorFilter2);
        }
        return porterDuffColorFilter2;
    }

    public static void clearTintCache() {
        WeakHashMap<Context, TintManager> weakHashMap = f65500g.get();
        if (weakHashMap == null) {
            return;
        }
        Iterator<Map.Entry<Context, TintManager>> it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            TintManager value = it.next().getValue();
            if (value != null) {
                LongSparseArray<ColorStateList> longSparseArray = value.f65502b;
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
                LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray2 = value.f65503c;
                if (longSparseArray2 != null) {
                    longSparseArray2.clear();
                }
                LongSparseArray<String> longSparseArray3 = value.f65504d;
                if (longSparseArray3 != null) {
                    longSparseArray3.clear();
                }
            }
        }
        h.evictAll();
    }

    public static void clearTintCache(Context context) {
        WeakHashMap<Context, TintManager> weakHashMap = f65500g.get();
        if (weakHashMap == null) {
            return;
        }
        TintManager tintManager = weakHashMap.get(context);
        if (tintManager != null) {
            LongSparseArray<ColorStateList> longSparseArray = tintManager.f65502b;
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray2 = tintManager.f65503c;
            if (longSparseArray2 != null) {
                longSparseArray2.clear();
            }
            LongSparseArray<String> longSparseArray3 = tintManager.f65504d;
            if (longSparseArray3 != null) {
                longSparseArray3.clear();
            }
        }
        h.evictAll();
    }

    public static TintManager get(Context context) {
        if (context == null) {
            return null;
        }
        ThreadLocal<WeakHashMap<Context, TintManager>> threadLocal = f65500g;
        WeakHashMap<Context, TintManager> weakHashMap = threadLocal.get();
        WeakHashMap<Context, TintManager> weakHashMap2 = weakHashMap;
        if (weakHashMap == null) {
            weakHashMap2 = new WeakHashMap<>();
            threadLocal.set(weakHashMap2);
        }
        TintManager tintManager = weakHashMap2.get(context);
        TintManager tintManager2 = tintManager;
        if (tintManager == null) {
            tintManager2 = new TintManager(context);
            weakHashMap2.put(context, tintManager2);
        }
        return tintManager2;
    }

    public static void tintViewBackground(View view, h hVar) {
        Drawable background;
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        if (!hVar.f24726d && !hVar.f24725c) {
            background.clearColorFilter();
            return;
        }
        background.mutate();
        if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(ThemeUtils.b(hVar.f24723a.getColorForState(view.getDrawableState(), hVar.f24723a.getDefaultColor()), view.getContext()));
        } else {
            background.setColorFilter(a(view.getContext(), hVar.f24726d ? hVar.f24723a : null, hVar.f24725c ? hVar.f24724b : f65499f, view.getDrawableState()));
        }
    }

    public static void tintViewDrawable(View view, Drawable drawable, h hVar) {
        if (view == null || drawable == null) {
            return;
        }
        if (!hVar.f24726d && !hVar.f24725c) {
            drawable.clearColorFilter();
            return;
        }
        drawable.mutate();
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(ThemeUtils.b(hVar.f24723a.getColorForState(view.getDrawableState(), hVar.f24723a.getDefaultColor()), view.getContext()));
        } else {
            drawable.setColorFilter(a(view.getContext(), hVar.f24726d ? hVar.f24723a : null, hVar.f24725c ? hVar.f24724b : f65499f, view.getDrawableState()));
        }
    }

    @Nullable
    public ColorStateList getColorStateList(@ColorRes int i7) {
        return getColorStateList(i7, 0);
    }

    @Nullable
    public ColorStateList getColorStateList(@ColorRes int i7, int i8) {
        Context context;
        ColorStateList colorStateList = null;
        if (i7 == 0 || (context = this.f65501a.get()) == null) {
            return null;
        }
        long j7 = i7;
        long j8 = j7;
        if (i8 != 0) {
            j8 = j7 | (((long) i8) << 32);
        }
        if (!MainThread.isMainThread()) {
            return C2903a.a(i7, context, i8);
        }
        LongSparseArray<ColorStateList> longSparseArray = this.f65502b;
        if (longSparseArray != null) {
            colorStateList = longSparseArray.get(j8);
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList == null) {
            ColorStateList colorStateListA = C2903a.a(i7, context, i8);
            colorStateList2 = colorStateListA;
            if (colorStateListA != null) {
                if (this.f65502b == null) {
                    this.f65502b = new LongSparseArray<>();
                }
                colorStateList2 = colorStateListA;
                if (this.f65505e) {
                    this.f65502b.append(j8, colorStateListA);
                    colorStateList2 = colorStateListA;
                }
            }
        }
        return colorStateList2;
    }

    @Nullable
    public Drawable getDrawable(@DrawableRes int i7) {
        return getDrawable(i7, 0);
    }

    @Nullable
    public Drawable getDrawable(@DrawableRes int i7, int i8) {
        Context context = this.f65501a.get();
        if (context == null || i7 == 0) {
            return null;
        }
        long j7 = i7;
        long j8 = i8 != 0 ? (((long) i8) << 32) | j7 : j7;
        if (!MainThread.isMainThread()) {
            return C2905c.a(i7, context, i8);
        }
        LongSparseArray<String> longSparseArray = this.f65504d;
        if (longSparseArray == null) {
            this.f65504d = new LongSparseArray<>();
        } else if ("appcompat_skip_skip".equals(longSparseArray.get(j8))) {
            return null;
        }
        Drawable drawableNewDrawable = null;
        if (MainThread.isMainThread()) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray2 = this.f65503c;
            if (longSparseArray2 == null) {
                drawableNewDrawable = null;
            } else {
                WeakReference<Drawable.ConstantState> weakReference = longSparseArray2.get(j8);
                drawableNewDrawable = null;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = weakReference.get();
                    if (constantState != null) {
                        context.getResources().getResourceName(i7);
                        try {
                            drawableNewDrawable = constantState.newDrawable();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                            this.f65503c.delete(j8);
                            drawableNewDrawable = null;
                        }
                    } else {
                        this.f65503c.delete(j8);
                        drawableNewDrawable = null;
                    }
                }
            }
        }
        boolean z6 = this.f65505e;
        Drawable drawable = drawableNewDrawable;
        if (drawableNewDrawable == null) {
            Drawable drawableA = C2905c.a(i7, context, i8);
            drawable = drawableA;
            if (drawableA != null) {
                drawable = drawableA;
                if (!(drawableA instanceof ColorDrawable)) {
                    if (MainThread.isMainThread() && !(drawableA instanceof C2897a)) {
                        Drawable.ConstantState constantState2 = drawableA.getConstantState();
                        drawable = drawableA;
                        if (constantState2 != null) {
                            if (this.f65503c == null) {
                                this.f65503c = new LongSparseArray<>();
                            }
                            if (z6) {
                                this.f65503c.put(j8, new WeakReference<>(constantState2));
                            }
                            context.getResources().getResourceName(i7);
                            drawable = drawableA;
                        }
                    } else {
                        drawable = drawableA;
                    }
                }
            }
        }
        if (drawable == null && z6) {
            this.f65504d.append(j7, "appcompat_skip_skip");
        }
        return drawable;
    }
}
