package com.bilibili.magicasakura.utils;

import Ug0.C2903a;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.magicasakura.widgets.Tintable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import kntr.base.android.legacy.context.ContextUtilKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/utils/ThemeUtils.class */
public class ThemeUtils {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f65494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f65495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f65496g;
    public static Method h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static b f65497i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f65490a = new ThreadLocal<>();
    public static final int[] DISABLED_STATE_SET = {-16842910};
    public static final int[] ENABLED_STATE_SET = {R.attr.state_enabled};
    public static final int[] FOCUSED_STATE_SET = {R.attr.state_focused};
    public static final int[] ACTIVATED_STATE_SET = {R.attr.state_activated};
    public static final int[] PRESSED_STATE_SET = {R.attr.state_pressed};
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final int[] SELECTED_STATE_SET = {R.attr.state_selected};
    public static final int[] EMPTY_STATE_SET = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f65491b = new int[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f65492c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f65493d = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseArray<b> f65498j = new SparseArray<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/utils/ThemeUtils$a.class */
    public interface a {
        void a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/utils/ThemeUtils$b.class */
    public interface b {
        @ColorInt
        int a(@ColorInt int i7, Context context);

        @ColorInt
        int b(@ColorRes int i7, Context context, int i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view) {
        ListAdapter listAdapter;
        if (view == 0) {
            return;
        }
        view.destroyDrawingCache();
        int i7 = 0;
        if (view instanceof Tintable) {
            ((Tintable) view).tint();
            if (!(view instanceof ViewGroup)) {
                return;
            }
            int i8 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i8 >= viewGroup.getChildCount()) {
                    return;
                }
                a(viewGroup.getChildAt(i8));
                i8++;
            }
        } else {
            if ((view instanceof AbsListView) && Build.VERSION.SDK_INT < 29) {
                try {
                    if (f65496g == null) {
                        Field declaredField = AbsListView.class.getDeclaredField("mRecycler");
                        f65496g = declaredField;
                        declaredField.setAccessible(true);
                    }
                    if (h == null) {
                        Method declaredMethod = Class.forName("android.widget.AbsListView$RecycleBin").getDeclaredMethod("clear", null);
                        h = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    h.invoke(f65496g.get(view), null);
                } catch (ClassNotFoundException e7) {
                    e7.printStackTrace();
                } catch (IllegalAccessException e8) {
                    e8.printStackTrace();
                } catch (NoSuchFieldException e9) {
                    e9.printStackTrace();
                } catch (NoSuchMethodException e10) {
                    e10.printStackTrace();
                } catch (InvocationTargetException e11) {
                    e11.printStackTrace();
                }
                ListAdapter wrappedAdapter = (ListAdapter) ((AbsListView) view).getAdapter();
                while (true) {
                    listAdapter = wrappedAdapter;
                    if (!(listAdapter instanceof WrapperListAdapter)) {
                        break;
                    } else {
                        wrappedAdapter = ((WrapperListAdapter) listAdapter).getWrappedAdapter();
                    }
                }
                if (listAdapter instanceof BaseAdapter) {
                    ((BaseAdapter) listAdapter).notifyDataSetChanged();
                }
            }
            if (view instanceof RecyclerView) {
                try {
                    if (f65494e == null) {
                        Field declaredField2 = RecyclerView.class.getDeclaredField("mRecycler");
                        f65494e = declaredField2;
                        declaredField2.setAccessible(true);
                    }
                    if (f65495f == null) {
                        Method declaredMethod2 = RecyclerView.Recycler.class.getDeclaredMethod("clear", null);
                        f65495f = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    }
                    f65495f.invoke(f65494e.get(view), null);
                } catch (ClassNotFoundException e12) {
                    e12.printStackTrace();
                } catch (IllegalAccessException e13) {
                    e13.printStackTrace();
                } catch (NoSuchFieldException e14) {
                    e14.printStackTrace();
                } catch (NoSuchMethodException e15) {
                    e15.printStackTrace();
                } catch (InvocationTargetException e16) {
                    e16.printStackTrace();
                }
                RecyclerView recyclerView = (RecyclerView) view;
                recyclerView.getRecycledViewPool().clear();
                recyclerView.invalidateItemDecorations();
            }
            if (!(view instanceof ViewGroup)) {
                return;
            }
            while (true) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                if (i7 >= viewGroup2.getChildCount()) {
                    return;
                }
                a(viewGroup2.getChildAt(i7));
                i7++;
            }
        }
    }

    public static void addSwitchColor(Context context, b bVar) {
        if (ContextUtilKt.findActivityOrNull(context) != null) {
            f65498j.put(context.hashCode(), bVar);
        }
    }

    @ColorInt
    public static int b(@ColorInt int i7, Context context) {
        if (context == null) {
            return i7;
        }
        b bVar = f65498j.get(context.hashCode());
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = f65497i;
        }
        if (bVar2 != null) {
            i7 = bVar2.a(i7, context);
        }
        return i7;
    }

    @ColorInt
    public static int c(@ColorRes int i7, Context context, int i8) {
        if (context == null) {
            return 0;
        }
        b bVar = f65498j.get(context.hashCode());
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = f65497i;
        }
        return bVar2 == null ? ContextCompat.getColor(context, i7) : bVar2.b(i7, context, i8);
    }

    public static void clearTintCache() {
        TintManager.clearTintCache();
    }

    public static void clearTintCache(Context context) {
        TintManager.clearTintCache(context);
    }

    public static boolean containsNinePatch(Drawable drawable) {
        Drawable wrapperDrawable = getWrapperDrawable(drawable);
        if ((wrapperDrawable instanceof NinePatchDrawable) || (wrapperDrawable instanceof InsetDrawable) || (wrapperDrawable instanceof LayerDrawable)) {
            return true;
        }
        if (!(wrapperDrawable instanceof StateListDrawable)) {
            return false;
        }
        DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) wrapperDrawable.getConstantState();
        if (drawableContainerState == null) {
            return true;
        }
        for (Drawable drawable2 : drawableContainerState.getChildren()) {
            Drawable wrapperDrawable2 = getWrapperDrawable(drawable2);
            if ((wrapperDrawable2 instanceof NinePatchDrawable) || (wrapperDrawable2 instanceof InsetDrawable) || (wrapperDrawable2 instanceof LayerDrawable)) {
                return true;
            }
        }
        return false;
    }

    public static int[] d(boolean z6, int[] iArr) {
        int[] iArr2;
        if (iArr.length > 0) {
            iArr2 = iArr;
            if (z6) {
                iArr2 = new int[]{ENABLED_STATE_SET[0], iArr[0]};
            }
        } else {
            iArr2 = iArr;
            if (z6) {
                iArr2 = ENABLED_STATE_SET;
            }
        }
        return iArr2;
    }

    public static b getBaseSwitchColor() {
        return f65497i;
    }

    @ColorInt
    public static int getColor(Context context, @ColorInt int i7) {
        return b(i7, context);
    }

    @ColorInt
    public static int getColorById(Context context, @ColorRes int i7) {
        return c(i7, context, 0);
    }

    @ColorInt
    public static int getColorById(Context context, @ColorRes int i7, int i8) {
        return c(i7, context, i8);
    }

    public static int getDisabledThemeAttrColor(Context context, @AttrRes int i7) {
        ColorStateList themeAttrColorStateList = getThemeAttrColorStateList(context, i7);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            return themeAttrColorStateList.getColorForState(DISABLED_STATE_SET, themeAttrColorStateList.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f65490a;
        TypedValue typedValue = threadLocal.get();
        TypedValue typedValue2 = typedValue;
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue2, true);
        float f7 = typedValue2.getFloat();
        return ColorUtils.setAlphaComponent(getThemeAttrColor(context, i7), Math.round(Color.alpha(r0) * f7));
    }

    public static boolean getThemeAttrBoolean(Context context, @AttrRes int i7) {
        int[] iArr = f65491b;
        iArr[0] = i7;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, false);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @ColorInt
    public static int getThemeAttrColor(Context context, @AttrRes int i7) {
        int iC = 0;
        if (hasThemeAttr(context, i7)) {
            iC = c(getThemeAttrId(context, i7), context, 0);
        }
        return iC;
    }

    public static ColorStateList getThemeAttrColorStateList(Context context, @AttrRes int i7) {
        int[] iArr = f65491b;
        iArr[0] = i7;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColorStateList(0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int getThemeAttrDimensionPixelSize(Context context, @AttrRes int i7) {
        int[] iArr = f65491b;
        iArr[0] = i7;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int getThemeAttrId(Context context, @AttrRes int i7) {
        int[] iArr = f65491b;
        iArr[0] = i7;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getResourceId(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int getThemeAttrId(Context context, AttributeSet attributeSet, @AttrRes int i7) {
        int[] iArr = f65491b;
        iArr[0] = i7;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        try {
            return typedArrayObtainStyledAttributes.getResourceId(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList getThemeColorStateList(Context context, @ColorRes int i7) {
        return C2903a.a(i7, context, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v42, types: [Ug0.h] */
    /* JADX WARN: Type inference failed for: r0v45, types: [Ug0.h] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5, types: [Ug0.h] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int[][]] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static ColorStateList getThemeColorStateList(Context context, ColorStateList colorStateList) {
        boolean z6;
        int[] iArr;
        int[][] iArr2;
        ?? r62;
        int[] iArr3;
        int i7;
        ?? r11 = 0;
        if (colorStateList == null) {
            return null;
        }
        if (!colorStateList.isStateful()) {
            return ColorStateList.valueOf(b(colorStateList.getDefaultColor(), context));
        }
        int defaultColor = colorStateList.getDefaultColor();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        int[] iArr4 = DISABLED_STATE_SET;
        int colorForState = colorStateList.getColorForState(iArr4, 0);
        if (colorForState != defaultColor) {
            linkedList.add(iArr4);
            linkedList2.add(Integer.valueOf(colorForState));
            z6 = true;
        } else {
            z6 = false;
        }
        int[] iArr5 = PRESSED_STATE_SET;
        int colorForState2 = colorStateList.getColorForState(d(z6, iArr5), 0);
        if (colorForState2 != defaultColor) {
            linkedList.add(iArr5);
            linkedList2.add(Integer.valueOf(colorForState2));
        }
        int[] iArr6 = FOCUSED_STATE_SET;
        int colorForState3 = colorStateList.getColorForState(d(z6, iArr6), 0);
        if (colorForState3 != defaultColor) {
            linkedList.add(iArr6);
            linkedList2.add(Integer.valueOf(colorForState3));
        }
        int[] iArr7 = CHECKED_STATE_SET;
        int colorForState4 = colorStateList.getColorForState(d(z6, iArr7), 0);
        if (colorForState4 != defaultColor) {
            linkedList.add(iArr7);
            linkedList2.add(Integer.valueOf(colorForState4));
        }
        int[] iArr8 = SELECTED_STATE_SET;
        int colorForState5 = colorStateList.getColorForState(d(z6, iArr8), 0);
        if (colorForState5 != defaultColor) {
            linkedList.add(iArr8);
            linkedList2.add(Integer.valueOf(colorForState5));
        }
        int[] iArr9 = EMPTY_STATE_SET;
        int colorForState6 = colorStateList.getColorForState(d(z6, iArr9), 0);
        if (colorForState6 != 0) {
            linkedList.add(iArr9);
            linkedList2.add(Integer.valueOf(colorForState6));
        }
        if (linkedList2.size() > 1) {
            ?? obj = new Object();
            obj.f24727e = new int[linkedList2.size()];
            for (int i8 = 0; i8 < linkedList2.size(); i8++) {
                obj.f24727e[i8] = ((Integer) linkedList2.get(i8)).intValue();
            }
            obj.f24728f = (int[][]) linkedList.toArray((Object[]) new int[linkedList.size()]);
            r11 = obj;
        }
        if (r11 == 0 || (iArr = r11.f24727e) == null || (iArr2 = r11.f24728f) == null || iArr.length != iArr2.length) {
            return colorStateList;
        }
        int[] iArr10 = iArr2[0];
        int[] iArr11 = DISABLED_STATE_SET;
        if (StateSet.stateSetMatches(iArr10, iArr11)) {
            r62 = new int[iArr2.length];
            iArr3 = new int[iArr2.length];
            i7 = 0;
        } else {
            ?? r63 = new int[iArr2.length + 1];
            iArr3 = new int[iArr2.length + 1];
            r63[0] = iArr11;
            iArr3[0] = getDisabledThemeAttrColor(context, 2130971260);
            i7 = 1;
            r62 = r63;
        }
        for (int i9 = 0; i9 < iArr2.length; i9++) {
            r62[i7] = iArr2[i9];
            iArr3[i7] = b(iArr[i9], context);
            i7++;
        }
        return new ColorStateList(r62, iArr3);
    }

    @Deprecated
    public static Activity getWrapperActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getWrapperActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static ContextWrapper getWrapperContext(Context context, @StyleRes int i7) {
        if (context == null) {
            return null;
        }
        return new ContextThemeWrapper(context, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static Drawable getWrapperDrawable(Drawable drawable) {
        if (drawable instanceof S0.b) {
            return ((S0.b) drawable).b();
        }
        ?? drawable2 = drawable;
        if (drawable instanceof DrawableWrapper) {
            drawable2 = ((DrawableWrapper) drawable).getDrawable();
        }
        return drawable2;
    }

    public static boolean hasThemeAttr(Context context, @AttrRes int i7) {
        int[] iArr = f65491b;
        iArr[0] = i7;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.hasValue(0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static boolean isSkipAnimatedSelector() {
        if (!f65493d) {
            String str = Build.VERSION.RELEASE;
            f65492c = !EnvironmentCompat.MEDIA_UNKNOWN.equals(str) && "5.0".compareTo(str) <= 0 && "5.1".compareTo(str) > 0;
            f65493d = true;
        }
        return f65492c;
    }

    public static void refreshUI(Context context) {
        refreshUI(context, null);
    }

    public static void refreshUI(Context context, a aVar) {
        TintManager.clearTintCache();
        Activity wrapperActivity = getWrapperActivity(context);
        if (wrapperActivity != null) {
            if (aVar != null) {
                aVar.a();
            }
            a(wrapperActivity.getWindow().getDecorView().findViewById(R.id.content));
        }
    }

    public static void removeSwitchColor(Context context) {
        if (ContextUtilKt.findActivityOrNull(context) != null) {
            f65498j.remove(context.hashCode());
        }
    }

    public static void setSwitchColor(b bVar) {
        f65497i = bVar;
    }

    @Deprecated
    public static Drawable tintDrawable(Context context, @DrawableRes int i7, @ColorRes int i8) {
        try {
            return tintDrawableByColorId(context, context.getResources().getDrawable(i7), i8);
        } catch (Resources.NotFoundException e7) {
            return null;
        }
    }

    @Deprecated
    public static Drawable tintDrawable(Drawable drawable, @ColorInt int i7) {
        return tintDrawable(drawable, i7, PorterDuff.Mode.SRC_IN);
    }

    @Deprecated
    public static Drawable tintDrawable(Drawable drawable, @ColorInt int i7, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(drawableWrap, i7);
        DrawableCompat.setTintMode(drawable, mode);
        return drawableWrap;
    }

    @Deprecated
    public static Drawable tintDrawable(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTintList(drawableWrap, colorStateList);
        DrawableCompat.setTintMode(drawable, mode);
        return drawableWrap;
    }

    @Deprecated
    public static Drawable tintDrawableByColorId(Context context, Drawable drawable, @ColorRes int i7) {
        if (drawable == null) {
            return null;
        }
        try {
            return tintDrawable(drawable, b(context.getResources().getColor(i7), context));
        } catch (Resources.NotFoundException e7) {
            return drawable;
        }
    }

    @Deprecated
    public static Drawable tintDrawableByColorList(Context context, Drawable drawable, @ColorRes int i7, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        try {
            ColorStateList colorStateList = TintManager.get(context).getColorStateList(i7, 0);
            PorterDuff.Mode mode2 = mode;
            if (mode == null) {
                mode2 = PorterDuff.Mode.SRC_IN;
            }
            return tintDrawable(drawable, colorStateList, mode2);
        } catch (Resources.NotFoundException e7) {
            return drawable;
        }
    }

    @Deprecated
    public static Drawable tintDrawableByDrawableId(Context context, @DrawableRes int i7, @ColorInt int i8) {
        try {
            return tintDrawable(context.getResources().getDrawable(i7), i8);
        } catch (Resources.NotFoundException e7) {
            return null;
        }
    }

    public static Resources updateNightMode(Resources resources, boolean z6) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        int i7 = configuration.uiMode;
        int i8 = z6 ? 32 : 16;
        if ((i7 & (-16)) != i8) {
            configuration.uiMode = i8 | (i7 & (-49));
            resources.updateConfiguration(configuration, displayMetrics);
        }
        return resources;
    }
}
