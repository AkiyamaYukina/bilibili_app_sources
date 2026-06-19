package com.bilibili.lib.ui;

import Vf0.C2940c;
import Vf0.C2951n;
import Vf0.InterfaceC2943f;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.collection.ArraySet;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.ui.permission.PermissionBiz;
import java.lang.ref.WeakReference;
import java.util.Collections;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/PermissionRequestUtils.class */
public final class PermissionRequestUtils {

    @NotNull
    public static final PermissionRequestUtils INSTANCE = new PermissionRequestUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String[] f64796a = {"android.permission.READ_PHONE_STATE", "android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO", "android.permission.POST_NOTIFICATIONS", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR", "android.permission.RECORD_AUDIO", PermissionsChecker.ACCESS_COARSE_LOCATION, PermissionsChecker.ACCESS_FINE_LOCATION, "android.permission.BLUETOOTH_CONNECT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static WeakReference<View> f64797b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/PermissionRequestUtils$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64798a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f64798a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/PermissionRequestUtils$b.class */
    public static final class b implements InterfaceC2943f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1<Boolean, Unit> f64799a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1) {
            this.f64799a = function1;
        }

        @Override // Vf0.InterfaceC2943f
        public final void onCancel() {
            this.f64799a.invoke(Boolean.FALSE);
        }

        @Override // Vf0.InterfaceC2943f
        public final void onConfirm() {
            this.f64799a.invoke(Boolean.TRUE);
        }
    }

    @Invocation(category = InvocationCategory.INVOKE_STATIC, name = "checkSelfPermission", owner = {"androidx.core.content.ContextCompat"}, scope = {})
    public static int a(Context context, String str) {
        String str2 = str;
        if (Build.VERSION.SDK_INT >= 33) {
            if ("android.permission.READ_EXTERNAL_STORAGE".equals(str)) {
                str2 = "android.permission.READ_MEDIA_IMAGES";
            } else {
                str2 = str;
                if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                    return 0;
                }
            }
        }
        return ContextCompat.checkSelfPermission(context, str2);
    }

    @Invocation(category = InvocationCategory.INVOKE_STATIC, name = "requestPermissions", owner = {"androidx.core.app.ActivityCompat"}, scope = {})
    public static void b(Activity activity, String[] strArr, int i7) {
        String[] strArr2 = strArr;
        if (Build.VERSION.SDK_INT >= 33) {
            strArr2 = strArr;
            if (strArr != null) {
                ArraySet arraySet = new ArraySet();
                Collections.addAll(arraySet, strArr);
                if (arraySet.contains("android.permission.READ_EXTERNAL_STORAGE")) {
                    arraySet.remove("android.permission.READ_EXTERNAL_STORAGE");
                    arraySet.add("android.permission.READ_MEDIA_IMAGES");
                    arraySet.add("android.permission.READ_MEDIA_VIDEO");
                }
                arraySet.remove("android.permission.WRITE_EXTERNAL_STORAGE");
                strArr2 = new String[arraySet.size()];
                arraySet.toArray(strArr2);
            }
        }
        ActivityCompat.requestPermissions(activity, strArr2, i7);
    }

    public static void c(WindowManager windowManager, View view) {
        View view2;
        WeakReference<View> weakReference = f64797b;
        if (weakReference != null && (view2 = weakReference.get()) != null && view2.getParent() != null) {
            windowManager.removeViewImmediate(view2);
        }
        f64797b = new WeakReference<>(view);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.type = 1003;
            layoutParams.flags = 40;
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.gravity = 8388659;
            layoutParams.format = 1;
            layoutParams.windowAnimations = R.style.Animation.Dialog;
            windowManager.addView(view, layoutParams);
        } catch (Exception e7) {
            q4.M.b("PermissionRequestUtils addView error:: ", e7.getMessage(), "PermissionRequestUtils");
        }
    }

    public static void d(Activity activity, String[] strArr, PermissionBiz permissionBiz, Function1 function1) {
        if (activity instanceof FragmentActivity) {
            C2940c.a((FragmentActivity) activity, strArr, permissionBiz, new b(function1));
        }
    }

    public static void e(Context context, String str, String str2, Lifecycle lifecycle) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (str.length() == 0 && str2.length() == 0) {
            return;
        }
        x xVar = new x(context);
        TextView textView = xVar.f64997a;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = xVar.f64998b;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        lifecycle.addObserver(new H(new F(EntryPointKt.getMemleakOptEnable() ? new WeakReference(xVar) : null, xVar, booleanRef, context, (WindowManager) context.getSystemService("window")), lifecycle));
    }

    @JvmStatic
    public static final void onRequestPermissionsResult(@Nullable Activity activity, int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        View view;
        BLog.d("PermissionRequestUtils", "onRequestPermissionsResult");
        if (!(strArr.length == 0)) {
            PermissionsChecker.setPermissionRequested(strArr[0]);
        }
        WeakReference<View> weakReference = f64797b;
        if (weakReference == null || (view = weakReference.get()) == null || view.getParent() == null) {
            return;
        }
        BLog.d("PermissionRequestUtils", "wm.removeViewImmediate");
        Object systemService = activity != null ? activity.getSystemService("window") : null;
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager != null) {
            windowManager.removeViewImmediate(view);
        }
        f64797b = null;
    }

    @JvmStatic
    public static final void requestPermissionWithTip(@NotNull final Activity activity, @Nullable final Lifecycle lifecycle, @NotNull final PermissionBiz permissionBiz, @NotNull final String str, final int i7, @Nullable final String str2) {
        HandlerThreads.runOn(0, new Runnable(activity, lifecycle, permissionBiz, str, i7, str2) { // from class: com.bilibili.lib.ui.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Activity f65005a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f65006b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PermissionBiz f65007c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f65008d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Lifecycle f65009e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final int f65010f;

            {
                this.f65005a = activity;
                this.f65006b = str;
                this.f65007c = permissionBiz;
                this.f65008d = str2;
                this.f65009e = lifecycle;
                this.f65010f = i7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String strTitleForPermission;
                Activity activity2 = this.f65005a;
                String str3 = this.f65006b;
                PermissionBiz permissionBiz2 = this.f65007c;
                String str4 = this.f65008d;
                Lifecycle lifecycle2 = this.f65009e;
                int i8 = this.f65010f;
                PermissionRequestUtils permissionRequestUtils = PermissionRequestUtils.INSTANCE;
                if (PermissionsChecker.checkSelfPermissions(activity2, new String[]{str3}) && !C2951n.a(permissionBiz2, str3)) {
                    PermissionRequestUtils permissionRequestUtils2 = PermissionRequestUtils.INSTANCE;
                    Function1 function1 = new Function1(permissionBiz2, str3, activity2, i8) { // from class: com.bilibili.lib.ui.E

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final PermissionBiz f64740a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f64741b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Activity f64742c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final int f64743d;

                        {
                            this.f64740a = permissionBiz2;
                            this.f64741b = str3;
                            this.f64742c = activity2;
                            this.f64743d = i8;
                        }

                        public final Object invoke(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            PermissionRequestUtils permissionRequestUtils3 = PermissionRequestUtils.INSTANCE;
                            String str5 = this.f64741b;
                            if (zBooleanValue) {
                                C2951n.b(this.f64740a, str5, true);
                            }
                            this.f64742c.onRequestPermissionsResult(this.f64743d, new String[]{str5}, zBooleanValue ? new int[]{0} : new int[]{-1});
                            return Unit.INSTANCE;
                        }
                    };
                    permissionRequestUtils2.getClass();
                    PermissionRequestUtils.d(activity2, new String[]{str3}, permissionBiz2, function1);
                    return;
                }
                PermissionRequestUtils.INSTANCE.getClass();
                if (ArraysKt.contains(PermissionRequestUtils.f64796a, str3) && PermissionRequestUtils.a(activity2, str3) != 0) {
                    boolean z6 = PermissionsChecker.isPermissionFirstRequest(str3) || PermissionsChecker.shouldShowRequestPermissionRationale(activity2, new String[]{str3});
                    T9.e.a("shouldShow :: ", "PermissionRequestUtils", z6);
                    if (z6 && (strTitleForPermission = PermissionRequestUtils.titleForPermission(str3)) != null && strTitleForPermission.length() != 0 && str4 != null && str4.length() != 0) {
                        if (lifecycle2 != null) {
                            PermissionRequestUtils.e(activity2, strTitleForPermission, str4, lifecycle2);
                        } else {
                            BLog.d("PermissionRequestUtils", "Lifecycle is null");
                        }
                    }
                }
                try {
                    PermissionRequestUtils.b(activity2, new String[]{str3}, i8);
                } catch (Exception e7) {
                    activity2.onRequestPermissionsResult(i8, new String[]{str3}, new int[]{-1});
                }
            }
        });
    }

    @JvmStatic
    public static final void requestPermissionWithTip(@NotNull Activity activity, @Nullable Lifecycle lifecycle, @NotNull PermissionBiz permissionBiz, @NotNull String[] strArr, int i7, @Nullable String str) {
        HandlerThreads.runOn(0, new Xg.q(activity, lifecycle, permissionBiz, strArr, i7, str));
    }

    @JvmStatic
    public static final void requestPermissionWithTip(@NotNull Activity activity, @Nullable Lifecycle lifecycle, @NotNull String str, int i7, @Nullable String str2) {
        requestPermissionWithTip(activity, lifecycle, PermissionBiz.NONE, str, i7, str2);
    }

    @JvmStatic
    public static final void requestPermissionWithTip(@NotNull Activity activity, @Nullable Lifecycle lifecycle, @NotNull String[] strArr, int i7, @Nullable String str) {
        requestPermissionWithTip(activity, lifecycle, PermissionBiz.NONE, strArr, i7, str);
    }

    @JvmStatic
    public static final void requestPermissionWithTip(@NotNull final Fragment fragment, @Nullable final Lifecycle lifecycle, @NotNull final PermissionBiz permissionBiz, @NotNull final String str, final int i7, @Nullable final String str2) {
        HandlerThreads.runOn(0, new Runnable(fragment, lifecycle, permissionBiz, str, i7, str2) { // from class: com.bilibili.lib.ui.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Fragment f64999a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f65000b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65001c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final PermissionBiz f65002d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f65003e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Lifecycle f65004f;

            {
                this.f64999a = fragment;
                this.f65000b = str;
                this.f65001c = i7;
                this.f65002d = permissionBiz;
                this.f65003e = str2;
                this.f65004f = lifecycle;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                FragmentActivity fragmentActivityP3;
                String strTitleForPermission;
                Fragment fragment2 = this.f64999a;
                String str3 = this.f65000b;
                int i8 = this.f65001c;
                PermissionBiz permissionBiz2 = this.f65002d;
                String str4 = this.f65003e;
                Lifecycle lifecycle2 = this.f65004f;
                PermissionRequestUtils permissionRequestUtils = PermissionRequestUtils.INSTANCE;
                FragmentActivity fragmentActivityP32 = fragment2.p3();
                if (fragmentActivityP32 != null && PermissionsChecker.checkSelfPermissions(fragmentActivityP32, new String[]{str3}) && !C2951n.a(permissionBiz2, str3)) {
                    PermissionRequestUtils permissionRequestUtils2 = PermissionRequestUtils.INSTANCE;
                    Function1 function1 = new Function1(permissionBiz2, str3, fragmentActivityP32, i8) { // from class: com.bilibili.lib.ui.C

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final PermissionBiz f64730a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f64731b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final FragmentActivity f64732c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final int f64733d;

                        {
                            this.f64730a = permissionBiz2;
                            this.f64731b = str3;
                            this.f64732c = fragmentActivityP32;
                            this.f64733d = i8;
                        }

                        public final Object invoke(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            PermissionRequestUtils permissionRequestUtils3 = PermissionRequestUtils.INSTANCE;
                            String str5 = this.f64731b;
                            if (zBooleanValue) {
                                C2951n.b(this.f64730a, str5, true);
                            }
                            this.f64732c.onRequestPermissionsResult(this.f64733d, new String[]{str5}, zBooleanValue ? new int[]{0} : new int[]{-1});
                            return Unit.INSTANCE;
                        }
                    };
                    permissionRequestUtils2.getClass();
                    PermissionRequestUtils.d(fragmentActivityP32, new String[]{str3}, permissionBiz2, function1);
                    return;
                }
                PermissionRequestUtils.INSTANCE.getClass();
                if (ArraysKt.contains(PermissionRequestUtils.f64796a, str3) && (context = fragment2.getContext()) != null && PermissionRequestUtils.a(context, str3) != 0 && (fragmentActivityP3 = fragment2.p3()) != null) {
                    boolean z6 = PermissionsChecker.isPermissionFirstRequest(str3) || PermissionsChecker.shouldShowRequestPermissionRationale(fragmentActivityP3, new String[]{str3});
                    T9.e.a("shouldShow :: ", "PermissionRequestUtils", z6);
                    if (z6 && (strTitleForPermission = PermissionRequestUtils.titleForPermission(str3)) != null && strTitleForPermission.length() != 0 && str4 != null && str4.length() != 0) {
                        if (lifecycle2 != null) {
                            PermissionRequestUtils.e(context, strTitleForPermission, str4, lifecycle2);
                        } else {
                            BLog.d("PermissionRequestUtils", "Lifecycle is null");
                        }
                    }
                }
                try {
                    fragment2.requestPermissions(new String[]{str3}, i8);
                } catch (Exception e7) {
                    fragment2.onRequestPermissionsResult(i8, new String[]{str3}, new int[]{-1});
                }
            }
        });
    }

    @JvmStatic
    public static final void requestPermissionWithTip(@NotNull final Fragment fragment, @Nullable final Lifecycle lifecycle, @NotNull final PermissionBiz permissionBiz, @NotNull final String[] strArr, final int i7, @Nullable final String str) {
        HandlerThreads.runOn(0, new Runnable(fragment, lifecycle, permissionBiz, strArr, i7, str) { // from class: com.bilibili.lib.ui.A

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String[] f64698a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Fragment f64699b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f64700c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final PermissionBiz f64701d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f64702e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Lifecycle f64703f;

            {
                this.f64698a = strArr;
                this.f64699b = fragment;
                this.f64700c = i7;
                this.f64701d = permissionBiz;
                this.f64702e = str;
                this.f64703f = lifecycle;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FragmentActivity fragmentActivityP3;
                String strTitleForPermission;
                final String[] strArr2 = this.f64698a;
                Fragment fragment2 = this.f64699b;
                final int i8 = this.f64700c;
                final PermissionBiz permissionBiz2 = this.f64701d;
                String str2 = this.f64702e;
                Lifecycle lifecycle2 = this.f64703f;
                PermissionRequestUtils permissionRequestUtils = PermissionRequestUtils.INSTANCE;
                if (strArr2.length == 0) {
                    return;
                }
                final String str3 = strArr2[0];
                final FragmentActivity fragmentActivityP32 = fragment2.p3();
                if (fragmentActivityP32 != null && PermissionsChecker.checkSelfPermissions(fragmentActivityP32, strArr2) && !C2951n.a(permissionBiz2, str3)) {
                    PermissionRequestUtils permissionRequestUtils2 = PermissionRequestUtils.INSTANCE;
                    Function1 function1 = new Function1(permissionBiz2, str3, fragmentActivityP32, i8, strArr2) { // from class: com.bilibili.lib.ui.D

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final PermissionBiz f64735a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f64736b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final FragmentActivity f64737c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final int f64738d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final String[] f64739e;

                        {
                            this.f64735a = permissionBiz2;
                            this.f64736b = str3;
                            this.f64737c = fragmentActivityP32;
                            this.f64738d = i8;
                            this.f64739e = strArr2;
                        }

                        public final Object invoke(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            PermissionRequestUtils permissionRequestUtils3 = PermissionRequestUtils.INSTANCE;
                            if (zBooleanValue) {
                                C2951n.b(this.f64735a, this.f64736b, true);
                            }
                            this.f64737c.onRequestPermissionsResult(this.f64738d, this.f64739e, zBooleanValue ? new int[]{0} : new int[]{-1});
                            return Unit.INSTANCE;
                        }
                    };
                    permissionRequestUtils2.getClass();
                    PermissionRequestUtils.d(fragmentActivityP32, new String[]{str3}, permissionBiz2, function1);
                    return;
                }
                PermissionRequestUtils.INSTANCE.getClass();
                int length = strArr2.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        Context context = fragment2.getContext();
                        if (context != null && !PermissionsChecker.checkSelfPermissions(context, strArr2) && (fragmentActivityP3 = fragment2.p3()) != null) {
                            boolean z6 = PermissionsChecker.isPermissionFirstRequest(str3) || PermissionsChecker.shouldShowRequestPermissionRationale(fragmentActivityP3, new String[]{str3});
                            T9.e.a("shouldShow :: ", "PermissionRequestUtils", z6);
                            if (z6 && (strTitleForPermission = PermissionRequestUtils.titleForPermission(strArr2)) != null && strTitleForPermission.length() != 0 && str2 != null && str2.length() != 0) {
                                if (lifecycle2 != null) {
                                    PermissionRequestUtils.e(context, strTitleForPermission, str2, lifecycle2);
                                } else {
                                    BLog.d("PermissionRequestUtils", "Lifecycle is null");
                                }
                            }
                        }
                    } else if (ArraysKt.contains(PermissionRequestUtils.f64796a, strArr2[i9])) {
                        i9++;
                    }
                }
                try {
                    fragment2.requestPermissions(strArr2, i8);
                } catch (Exception e7) {
                    int length2 = strArr2.length;
                    int[] iArr = new int[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        iArr[i10] = -1;
                    }
                    fragment2.onRequestPermissionsResult(i8, strArr2, iArr);
                }
            }
        });
    }

    @JvmStatic
    public static final void requestPermissionWithTip(@NotNull Fragment fragment, @Nullable Lifecycle lifecycle, @NotNull String str, int i7, @Nullable String str2) {
        requestPermissionWithTip(fragment, lifecycle, PermissionBiz.NONE, str, i7, str2);
    }

    @JvmStatic
    public static final void requestPermissionWithTip(@NotNull Fragment fragment, @Nullable Lifecycle lifecycle, @NotNull String[] strArr, int i7, @Nullable String str) {
        requestPermissionWithTip(fragment, lifecycle, PermissionBiz.NONE, strArr, i7, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a7  */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String titleForPermission(@org.jetbrains.annotations.NotNull java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.PermissionRequestUtils.titleForPermission(java.lang.String):java.lang.String");
    }

    @JvmStatic
    @NotNull
    public static final String titleForPermission(@NotNull String[] strArr) {
        return strArr.length == 0 ? "" : titleForPermission(strArr[0]);
    }
}
