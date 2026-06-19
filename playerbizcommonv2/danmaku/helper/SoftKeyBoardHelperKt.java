package com.bilibili.playerbizcommonv2.danmaku.helper;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/helper/SoftKeyBoardHelperKt.class */
public final class SoftKeyBoardHelperKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/helper/SoftKeyBoardHelperKt$a.class */
    public static final class a extends WindowInsetsAnimationCompat.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f80963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f80964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.BooleanRef f80965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Window f80966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Ref.ObjectRef<WindowInsetsAnimationCompat> f80967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Ref.BooleanRef f80968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final View f80969g;
        public final Ref.IntRef h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Function1<Boolean, Unit> f80970i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Ref.FloatRef f80971j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(View view, View view2, Ref.BooleanRef booleanRef, Window window, Ref.ObjectRef<WindowInsetsAnimationCompat> objectRef, Ref.BooleanRef booleanRef2, View view3, Ref.IntRef intRef, Function1<? super Boolean, Unit> function1, Ref.FloatRef floatRef) {
            super(1);
            this.f80963a = view;
            this.f80964b = view2;
            this.f80965c = booleanRef;
            this.f80966d = window;
            this.f80967e = objectRef;
            this.f80968f = booleanRef2;
            this.f80969g = view3;
            this.h = intRef;
            this.f80970i = function1;
            this.f80971j = floatRef;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
        public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Function1<Boolean, Unit> function1;
            super.onEnd(windowInsetsAnimationCompat);
            if (!this.f80968f.element || (function1 = this.f80970i) == null) {
                return;
            }
            function1.invoke(Boolean.valueOf(this.f80965c.element));
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
        public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
            int i7;
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) this.f80967e.element;
            Float fValueOf = windowInsetsAnimationCompat != null ? Float.valueOf(windowInsetsAnimationCompat.getFraction()) : null;
            if (fValueOf != null && this.f80963a != null && this.f80964b != null && this.f80968f.element) {
                int bottom = this.f80966d.getDecorView().getBottom() - windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
                boolean z6 = this.f80965c.element;
                Ref.FloatRef floatRef = this.f80971j;
                if (z6 && bottom < (i7 = this.h.element)) {
                    float f7 = bottom - i7;
                    this.f80964b.setTranslationY(f7);
                    floatRef.element = f7;
                } else if (!z6) {
                    View view = this.f80964b;
                    float f8 = floatRef.element;
                    view.setTranslationY(Math.min(f8 - ((fValueOf.floatValue() + 0.5f) * f8), 0.0f));
                }
            }
            return windowInsetsCompat;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
        @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(androidx.core.view.WindowInsetsAnimationCompat r5, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat r6) {
            /*
                r4 = this;
                r0 = r4
                android.view.View r0 = r0.f80963a
                if (r0 == 0) goto La0
                r0 = r4
                android.view.View r0 = r0.f80964b
                if (r0 != 0) goto L11
                goto La0
            L11:
                r0 = r4
                android.view.Window r0 = r0.f80966d
                android.view.View r0 = r0.getDecorView()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.getRootWindowInsets(r0)
                r11 = r0
                r0 = 0
                r10 = r0
                r0 = r11
                if (r0 == 0) goto L32
                r0 = r11
                int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
                boolean r0 = r0.isVisible(r1)
                r9 = r0
                goto L35
            L32:
                r0 = 0
                r9 = r0
            L35:
                r0 = r4
                kotlin.jvm.internal.Ref$BooleanRef r0 = r0.f80965c
                r11 = r0
                r0 = r11
                r1 = r9
                r0.element = r1
                r0 = r4
                kotlin.jvm.internal.Ref$ObjectRef<androidx.core.view.WindowInsetsAnimationCompat> r0 = r0.f80967e
                r1 = r5
                r0.element = r1
                r0 = r11
                boolean r0 = r0.element
                if (r0 == 0) goto L72
                r0 = r4
                android.view.View r0 = r0.f80969g
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L66
                r0 = r10
                r9 = r0
                r0 = r5
                boolean r0 = r0.hasFocus()
                if (r0 == 0) goto L69
            L66:
                r0 = 1
                r9 = r0
            L69:
                r0 = r4
                kotlin.jvm.internal.Ref$BooleanRef r0 = r0.f80968f
                r1 = r9
                r0.element = r1
            L72:
                r0 = r11
                boolean r0 = r0.element
                if (r0 == 0) goto La0
                r0 = r4
                android.view.View r0 = r0.f80963a
                r5 = r0
                r0 = 2
                int[] r0 = new int[r0]
                r11 = r0
                r0 = r5
                r1 = r11
                r0.getLocationInWindow(r1)
                r0 = r11
                r1 = 1
                r0 = r0[r1]
                r7 = r0
                r0 = r5
                int r0 = r0.getHeight()
                r8 = r0
                r0 = r4
                kotlin.jvm.internal.Ref$IntRef r0 = r0.h
                r1 = r8
                r2 = r7
                int r1 = r1 + r2
                r0.element = r1
            La0:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.helper.SoftKeyBoardHelperKt.a.onStart(androidx.core.view.WindowInsetsAnimationCompat, androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat):androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat");
        }
    }

    public static final void hideSoftInput(@NotNull Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            return;
        }
        WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(activity.getWindow().getDecorView());
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsetsCompat.Type.ime());
        }
    }

    public static final boolean isSystemInsetsAnimationSupport(@NotNull View view) {
        WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(view);
        return (windowInsetsController == null || windowInsetsController.getSystemBarsBehavior() == 0) ? false : true;
    }

    @JvmOverloads
    @Nullable
    public static final Unit setWindowSoftInput(@NotNull Dialog dialog) {
        return setWindowSoftInput$default(dialog, (View) null, (View) null, (View) null, (Function1) null, 15, (Object) null);
    }

    @JvmOverloads
    @Nullable
    public static final Unit setWindowSoftInput(@NotNull Dialog dialog, @Nullable View view) {
        return setWindowSoftInput$default(dialog, view, (View) null, (View) null, (Function1) null, 14, (Object) null);
    }

    @JvmOverloads
    @Nullable
    public static final Unit setWindowSoftInput(@NotNull Dialog dialog, @Nullable View view, @Nullable View view2) {
        return setWindowSoftInput$default(dialog, view, view2, (View) null, (Function1) null, 12, (Object) null);
    }

    @JvmOverloads
    @Nullable
    public static final Unit setWindowSoftInput(@NotNull Dialog dialog, @Nullable View view, @Nullable View view2, @Nullable View view3) {
        return setWindowSoftInput$default(dialog, view, view2, view3, (Function1) null, 8, (Object) null);
    }

    @JvmOverloads
    @Nullable
    public static final Unit setWindowSoftInput(@NotNull Dialog dialog, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable Function1<? super Boolean, Unit> function1) {
        Unit unit;
        Window window = dialog.getWindow();
        if (window != null) {
            setWindowSoftInput(window, view, view2, view3, function1);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        return unit;
    }

    @JvmOverloads
    public static final void setWindowSoftInput(@NotNull Window window) {
        setWindowSoftInput$default(window, (View) null, (View) null, (View) null, (Function1) null, 15, (Object) null);
    }

    @JvmOverloads
    public static final void setWindowSoftInput(@NotNull Window window, @Nullable View view) {
        setWindowSoftInput$default(window, view, (View) null, (View) null, (Function1) null, 14, (Object) null);
    }

    @JvmOverloads
    public static final void setWindowSoftInput(@NotNull Window window, @Nullable View view, @Nullable View view2) {
        setWindowSoftInput$default(window, view, view2, (View) null, (Function1) null, 12, (Object) null);
    }

    @JvmOverloads
    public static final void setWindowSoftInput(@NotNull Window window, @Nullable View view, @Nullable View view2, @Nullable View view3) {
        setWindowSoftInput$default(window, view, view2, view3, (Function1) null, 8, (Object) null);
    }

    @JvmOverloads
    public static final void setWindowSoftInput(@NotNull final Window window, @Nullable View view, @Nullable final View view2, @Nullable final View view3, @Nullable final Function1<? super Boolean, Unit> function1) {
        if (!isSystemInsetsAnimationSupport(window.getDecorView())) {
            window.setSoftInputMode(48);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(window, booleanRef2, view3, booleanRef, function1, view2) { // from class: or0.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Window f124930a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Ref.BooleanRef f124931b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final View f124932c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Ref.BooleanRef f124933d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function1 f124934e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final View f124935f;

                {
                    this.f124930a = window;
                    this.f124931b = booleanRef2;
                    this.f124932c = view3;
                    this.f124933d = booleanRef;
                    this.f124934e = function1;
                    this.f124935f = view2;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ViewGroup.LayoutParams layoutParams;
                    Window window2 = this.f124930a;
                    Ref.BooleanRef booleanRef3 = this.f124931b;
                    View view4 = this.f124932c;
                    Ref.BooleanRef booleanRef4 = this.f124933d;
                    Function1 function12 = this.f124934e;
                    View view5 = this.f124935f;
                    WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(window2.getDecorView());
                    if (rootWindowInsets == null) {
                        return;
                    }
                    boolean zIsVisible = rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime());
                    int systemWindowInsetBottom = Build.VERSION.SDK_INT >= 30 ? rootWindowInsets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom : rootWindowInsets.getSystemWindowInsetBottom();
                    int i7 = rootWindowInsets.getInsets(WindowInsetsCompat.Type.ime()).bottom;
                    boolean z6 = false;
                    if (zIsVisible) {
                        if (view4 == null || view4.hasFocus()) {
                            z6 = true;
                        }
                        booleanRef3.element = z6;
                        if (!booleanRef4.element && z6 && function12 != null) {
                            function12.invoke(Boolean.TRUE);
                        }
                        booleanRef4.element = true;
                    } else {
                        if (booleanRef4.element && booleanRef3.element && function12 != null) {
                            function12.invoke(Boolean.FALSE);
                        }
                        booleanRef4.element = false;
                    }
                    BLog.d("soft input tag", "soft-keyboard height: " + i7);
                    int i8 = i7 - systemWindowInsetBottom;
                    if (i8 <= 0 || view5 == null || (layoutParams = view5.getLayoutParams()) == null || layoutParams.height == i8) {
                        return;
                    }
                    layoutParams.height = i8;
                    view5.setLayoutParams(layoutParams);
                }
            });
            return;
        }
        window.setSoftInputMode(48);
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        ViewCompat.setWindowInsetsAnimationCallback(window.getDecorView(), new a(view, view2, new Ref.BooleanRef(), window, new Ref.ObjectRef(), booleanRef3, view3, new Ref.IntRef(), function1, new Ref.FloatRef()));
    }

    public static /* synthetic */ Unit setWindowSoftInput$default(Dialog dialog, View view, View view2, View view3, Function1 function1, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            view = null;
        }
        if ((i7 & 2) != 0) {
            view2 = null;
        }
        if ((i7 & 4) != 0) {
            view3 = null;
        }
        if ((i7 & 8) != 0) {
            function1 = null;
        }
        return setWindowSoftInput(dialog, view, view2, view3, (Function1<? super Boolean, Unit>) function1);
    }

    public static /* synthetic */ void setWindowSoftInput$default(Window window, View view, View view2, View view3, Function1 function1, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            view = null;
        }
        if ((i7 & 2) != 0) {
            view2 = null;
        }
        if ((i7 & 4) != 0) {
            view3 = null;
        }
        if ((i7 & 8) != 0) {
            function1 = null;
        }
        setWindowSoftInput(window, view, view2, view3, (Function1<? super Boolean, Unit>) function1);
    }

    public static final void showSoftInput(@NotNull final EditText editText) {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        if (!isSystemInsetsAnimationSupport(editText)) {
            editText.postDelayed(new Runnable(editText) { // from class: or0.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final EditText f124929a;

                {
                    this.f124929a = editText;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditText editText2 = this.f124929a;
                    ((InputMethodManager) editText2.getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
                }
            }, 150L);
            return;
        }
        WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(editText);
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsetsCompat.Type.ime());
        }
    }
}
