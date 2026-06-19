package com.bilibili.lib.ui;

import Vf0.C2951n;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import bolts.Task;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.permission.PermissionBiz;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import kntr.base.utils.foundation.PermissionSettingPageJumper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/PermissionsChecker.class */
public final class PermissionsChecker {
    public static final String ACCESS_COARSE_LOCATION = "android.permission.ACCESS_COARSE_LOCATION";
    public static final String ACCESS_FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION";
    public static final String[] AUDIO_PERMISSION;
    public static final String[] BLUETOOTH_CONNECT_PERMISSION;
    public static final String[] CAMERA_PERMISSION;
    public static final String[] NOTIFICATION_PERMISSION;
    public static final String[] PHONE_PERMISSION;
    public static final int REQUEST_CODE_PERMISSION_AUDIO = 19;
    public static final int REQUEST_CODE_PERMISSION_BLUETOOTH_CONNECT = 20;
    public static final int REQUEST_CODE_PERMISSION_CAMERA = 17;
    public static final int REQUEST_CODE_PERMISSION_NOTIFICATION = 22;
    public static final int REQUEST_CODE_PERMISSION_PHONE = 18;
    public static final int REQUEST_CODE_PERMISSION_STORAGE = 16;
    public static final int REQUEST_CODE_PERMISSION_STORAGE_WITH_AUDIO = 21;
    public static final String[] STORAGE_PERMISSIONS;
    public static final String[] STORAGE_WITH_AUDIO_PERMISSIONS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray<Task<Void>.TaskCompletionSource> f64800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray<PermissionBiz> f64801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseBooleanArray f64802c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/PermissionsChecker$PermissionSettingAlertEventListener.class */
    public interface PermissionSettingAlertEventListener {
        void onCancelClick(AlertDialog alertDialog);

        void onSettingClick(AlertDialog alertDialog);

        void onShow(AlertDialog alertDialog);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/PermissionsChecker$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Task.TaskCompletionSource f64804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PermissionBiz f64805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Lifecycle f64806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Activity f64807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String[] f64808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f64809g;

        public a(int i7, Task.TaskCompletionSource taskCompletionSource, PermissionBiz permissionBiz, Lifecycle lifecycle, Activity activity, String[] strArr, String str) {
            this.f64803a = i7;
            this.f64804b = taskCompletionSource;
            this.f64805c = permissionBiz;
            this.f64806d = lifecycle;
            this.f64807e = activity;
            this.f64808f = strArr;
            this.f64809g = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PermissionsChecker.f64800a.put(this.f64803a, this.f64804b);
            PermissionsChecker.f64801b.put(this.f64803a, this.f64805c);
            Lifecycle lifecycle = this.f64806d;
            if (lifecycle != null) {
                PermissionRequestUtils.requestPermissionWithTip(this.f64807e, lifecycle, this.f64805c, this.f64808f, this.f64803a, this.f64809g);
                return;
            }
            Activity activity = this.f64807e;
            String[] strArr = this.f64808f;
            int i7 = this.f64803a;
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
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/PermissionsChecker$b.class */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Task.TaskCompletionSource f64811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PermissionBiz f64812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Lifecycle f64813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Fragment f64814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String[] f64815f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f64816g;

        public b(int i7, Task.TaskCompletionSource taskCompletionSource, PermissionBiz permissionBiz, Lifecycle lifecycle, Fragment fragment, String[] strArr, String str) {
            this.f64810a = i7;
            this.f64811b = taskCompletionSource;
            this.f64812c = permissionBiz;
            this.f64813d = lifecycle;
            this.f64814e = fragment;
            this.f64815f = strArr;
            this.f64816g = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PermissionsChecker.f64800a.put(this.f64810a, this.f64811b);
            PermissionsChecker.f64801b.put(this.f64810a, this.f64812c);
            Lifecycle lifecycle = this.f64813d;
            if (lifecycle == null) {
                this.f64814e.requestPermissions(this.f64815f, this.f64810a);
            } else {
                PermissionRequestUtils.requestPermissionWithTip(this.f64814e, lifecycle, this.f64812c, this.f64815f, this.f64810a, this.f64816g);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/PermissionsChecker$c.class */
    public final class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f64817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AlertDialog f64818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PermissionSettingAlertEventListener f64819c;

        public c(Activity activity, AlertDialog alertDialog, PermissionSettingAlertEventListener permissionSettingAlertEventListener) {
            this.f64817a = activity;
            this.f64818b = alertDialog;
            this.f64819c = permissionSettingAlertEventListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PermissionSettingPageJumper.INSTANCE.open(this.f64817a, true);
            this.f64818b.dismiss();
            PermissionSettingAlertEventListener permissionSettingAlertEventListener = this.f64819c;
            if (permissionSettingAlertEventListener != null) {
                permissionSettingAlertEventListener.onSettingClick(this.f64818b);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/PermissionsChecker$d.class */
    public final class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertDialog f64820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PermissionSettingAlertEventListener f64821b;

        public d(AlertDialog alertDialog, PermissionSettingAlertEventListener permissionSettingAlertEventListener) {
            this.f64820a = alertDialog;
            this.f64821b = permissionSettingAlertEventListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f64820a.dismiss();
            PermissionSettingAlertEventListener permissionSettingAlertEventListener = this.f64821b;
            if (permissionSettingAlertEventListener != null) {
                permissionSettingAlertEventListener.onCancelClick(this.f64820a);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/PermissionsChecker$e.class */
    public final class e implements PermissionSettingAlertEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64822a;

        public e(String str) {
            this.f64822a = str;
        }

        @Override // com.bilibili.lib.ui.PermissionsChecker.PermissionSettingAlertEventListener
        public final void onCancelClick(AlertDialog alertDialog) {
            HashMap map = new HashMap();
            map.put("spmid", this.f64822a);
            Neurons.reportClick(false, "app.storage-permission.cancel-button.0.click", map);
        }

        @Override // com.bilibili.lib.ui.PermissionsChecker.PermissionSettingAlertEventListener
        public final void onSettingClick(AlertDialog alertDialog) {
            HashMap map = new HashMap();
            map.put("spmid", this.f64822a);
            Neurons.reportClick(false, "app.storage-permission.set-button.0.click", map);
        }

        @Override // com.bilibili.lib.ui.PermissionsChecker.PermissionSettingAlertEventListener
        public final void onShow(AlertDialog alertDialog) {
            HashMap map = new HashMap();
            map.put("spmid", this.f64822a);
            Neurons.reportExposure(false, "app.storage-permission.storage-permission.0.show", map);
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            STORAGE_PERMISSIONS = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (i7 >= 33) {
            STORAGE_PERMISSIONS = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        } else {
            STORAGE_PERMISSIONS = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        }
        if (i7 >= 34) {
            STORAGE_WITH_AUDIO_PERMISSIONS = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_AUDIO"};
        } else if (i7 >= 33) {
            STORAGE_WITH_AUDIO_PERMISSIONS = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"};
        } else {
            STORAGE_WITH_AUDIO_PERMISSIONS = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        }
        CAMERA_PERMISSION = new String[]{"android.permission.CAMERA"};
        AUDIO_PERMISSION = new String[]{"android.permission.RECORD_AUDIO"};
        PHONE_PERMISSION = new String[]{"android.permission.READ_PHONE_STATE"};
        BLUETOOTH_CONNECT_PERMISSION = new String[]{"android.permission.BLUETOOTH_CONNECT"};
        NOTIFICATION_PERMISSION = new String[]{"android.permission.POST_NOTIFICATIONS"};
        f64800a = new SparseArray<>();
        f64801b = new SparseArray<>();
        f64802c = new SparseBooleanArray();
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

    @Invocation(category = InvocationCategory.INVOKE_STATIC, name = "shouldShowRequestPermissionRationale", owner = {"androidx.core.app.ActivityCompat"}, scope = {})
    public static boolean b(Activity activity, String str) {
        String str2 = str;
        if (Build.VERSION.SDK_INT >= 33) {
            if ("android.permission.READ_EXTERNAL_STORAGE".equals(str)) {
                str2 = "android.permission.READ_MEDIA_IMAGES";
            } else {
                str2 = str;
                if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                    return false;
                }
            }
        }
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, str2);
    }

    public static boolean checkBizBlockPermission(Context context, PermissionBiz permissionBiz, String[] strArr) {
        PermissionBiz permissionBiz2 = permissionBiz;
        if (permissionBiz == null) {
            permissionBiz2 = PermissionBiz.NONE;
        }
        boolean z6 = false;
        if (strArr != null) {
            z6 = false;
            if (strArr.length > 0) {
                z6 = false;
                if (!C2951n.a(permissionBiz2, strArr[0])) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public static boolean checkPermissionByBiz(Context context, PermissionBiz permissionBiz, String str) {
        boolean z6 = true;
        if (permissionBiz == PermissionBiz.NONE) {
            if (a(context, str) != 0) {
                z6 = false;
            }
            return z6;
        }
        if (C2951n.a(permissionBiz, str)) {
            return a(context, str) == 0;
        }
        return false;
    }

    public static boolean checkSelfPermissions(Context context, PermissionBiz permissionBiz, String[] strArr) {
        boolean z6;
        boolean z7;
        boolean zCheckPermissionByBiz;
        PermissionBiz permissionBiz2 = permissionBiz;
        if (permissionBiz == null) {
            permissionBiz2 = PermissionBiz.NONE;
        }
        for (String str : strArr) {
            if ("android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str)) {
                if (strArr.length == 0) {
                    zCheckPermissionByBiz = false;
                } else if (strArr.length == 1) {
                    zCheckPermissionByBiz = checkPermissionByBiz(context, permissionBiz2, strArr[0]);
                } else {
                    int length = strArr.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            z6 = false;
                            break;
                        }
                        String str2 = strArr[i7];
                        if (!"android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str2)) {
                            i7++;
                        } else if (!checkPermissionByBiz(context, permissionBiz2, str2)) {
                            z6 = true;
                        }
                    }
                    int length2 = strArr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            z7 = true;
                            break;
                        }
                        String str3 = strArr[i8];
                        if (!"android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str3) && !checkPermissionByBiz(context, permissionBiz2, str3)) {
                            z7 = false;
                            break;
                        }
                        i8++;
                    }
                    zCheckPermissionByBiz = false;
                    if (!z6) {
                        zCheckPermissionByBiz = false;
                        if (z7) {
                            zCheckPermissionByBiz = true;
                        }
                    }
                }
                return zCheckPermissionByBiz;
            }
        }
        for (String str4 : strArr) {
            if (!checkPermissionByBiz(context, permissionBiz2, str4)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSelfPermissions(Context context, String[] strArr) {
        return checkSelfPermissions(context, PermissionBiz.NONE, strArr);
    }

    @Nullable
    public static AlertDialog checkShowStoragePermissionAlert(Activity activity, String str) {
        boolean z6 = b(activity, "android.permission.READ_EXTERNAL_STORAGE") && b(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
        boolean z7 = BiliGlobalPreferenceHelper.getBLKVSharedPreference(BiliContext.application()).getBoolean("HAS_CLICK_STORAGE_DENY", false);
        if (z6) {
            return null;
        }
        BiliGlobalPreferenceHelper.getBLKVSharedPreference(BiliContext.application()).edit().putBoolean("HAS_CLICK_STORAGE_DENY", true).apply();
        if (z7) {
            return showPermissionSettingAlert(activity, activity.getString(2131825617), activity.getString(2131825616), new e(str));
        }
        return null;
    }

    public static Task<File> getExternalPublicDir(FragmentActivity fragmentActivity, Lifecycle lifecycle, String str, String str2, String str3) {
        return grantExternalPermission(fragmentActivity, lifecycle, str3).onSuccess(new I(str, str2));
    }

    public static Task<File> getExternalPublicDir(FragmentActivity fragmentActivity, Lifecycle lifecycle, String str, String str2, boolean z6, String str3) {
        return grantExternalPermissions(fragmentActivity, lifecycle, z6, str3).onSuccess(new I(str, str2));
    }

    public static Task<File> getExternalPublicDir(FragmentActivity fragmentActivity, String str, String str2) {
        return grantExternalPermissions(fragmentActivity).onSuccess(new I(str, str2));
    }

    public static Task<File> getExternalPublicDir(FragmentActivity fragmentActivity, String str, String str2, boolean z6) {
        return grantExternalPermissions(fragmentActivity, z6).onSuccess(new I(str, str2));
    }

    public static Task<File> getExternalPublicDir(BaseAppCompatActivity baseAppCompatActivity, Lifecycle lifecycle, String str, String str2, String str3) {
        return grantExternalPermission(baseAppCompatActivity, lifecycle, str3).onSuccess(new I(str, str2));
    }

    public static Task<File> getExternalPublicDir(BaseAppCompatActivity baseAppCompatActivity, String str, String str2) {
        return grantExternalPermissions(baseAppCompatActivity).onSuccess(new I(str, str2));
    }

    public static Task<File> getExternalPublicDir(BaseFragment baseFragment, String str, String str2) {
        return grantExternalPermissions(baseFragment).onSuccess(new I(str, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Lifecycle getLifecycle(Activity activity) {
        if (activity instanceof LifecycleOwner) {
            return ((LifecycleOwner) activity).getLifecycle();
        }
        return null;
    }

    public static Task<Void> grantAudioPermission(Activity activity) {
        return grantPermissions(activity, AUDIO_PERMISSION, 19, 2131825605);
    }

    public static Task<Void> grantCameraPermission(Activity activity) {
        return grantPermissions(activity, CAMERA_PERMISSION, 17, 2131825608);
    }

    public static Task<Void> grantCameraPermission(Activity activity, @Nullable Lifecycle lifecycle, String str) {
        return grantPermission(activity, lifecycle, CAMERA_PERMISSION, 17, 2131825608, str);
    }

    public static Task<Void> grantCameraPermission(BaseAppCompatActivity baseAppCompatActivity) {
        return grantPermissions(baseAppCompatActivity, CAMERA_PERMISSION, 17, 2131825608);
    }

    public static Task<Void> grantCameraPermission(BaseAppCompatActivity baseAppCompatActivity, @Nullable Lifecycle lifecycle, String str) {
        return grantPermission(baseAppCompatActivity, lifecycle, CAMERA_PERMISSION, 17, 2131825608, str);
    }

    public static Task<Void> grantExternalPermission(Fragment fragment, boolean z6, @Nullable Lifecycle lifecycle, String str) {
        return z6 ? grantPermission(fragment, lifecycle, STORAGE_PERMISSIONS, 16, 2131825612, str) : grantPermission(fragment, lifecycle, STORAGE_PERMISSIONS, 16, str);
    }

    public static Task<Void> grantExternalPermission(FragmentActivity fragmentActivity, @Nullable Lifecycle lifecycle, String str) {
        return grantPermission(fragmentActivity, lifecycle, STORAGE_PERMISSIONS, 16, 2131825612, str);
    }

    public static Task<Void> grantExternalPermission(FragmentActivity fragmentActivity, boolean z6, @Nullable Lifecycle lifecycle, String str) {
        return z6 ? grantPermission(fragmentActivity, lifecycle, STORAGE_PERMISSIONS, 16, 2131825612, str) : grantPermission(fragmentActivity, lifecycle, STORAGE_PERMISSIONS, 16, str);
    }

    public static Task<Void> grantExternalPermission(BaseAppCompatActivity baseAppCompatActivity, @Nullable Lifecycle lifecycle, String str) {
        return grantPermission(baseAppCompatActivity, lifecycle, STORAGE_PERMISSIONS, 16, 2131825612, str);
    }

    public static Task<Void> grantExternalPermission(BaseFragment baseFragment, @Nullable Lifecycle lifecycle, String str) {
        return grantPermission(baseFragment, lifecycle, STORAGE_PERMISSIONS, 16, 2131825612, str);
    }

    public static Task<Void> grantExternalPermissions(Fragment fragment, boolean z6) {
        return z6 ? grantPermissions(fragment, STORAGE_PERMISSIONS, 16, 2131825612) : grantPermissions(fragment, STORAGE_PERMISSIONS, 16);
    }

    public static Task<Void> grantExternalPermissions(FragmentActivity fragmentActivity) {
        return grantPermissions(fragmentActivity, STORAGE_PERMISSIONS, 16, 2131825612);
    }

    public static Task<Void> grantExternalPermissions(FragmentActivity fragmentActivity, Lifecycle lifecycle, boolean z6, String str) {
        return z6 ? grantPermission(fragmentActivity, lifecycle, STORAGE_PERMISSIONS, 16, 2131825612, str) : grantPermission(fragmentActivity, lifecycle, STORAGE_PERMISSIONS, 16, str);
    }

    public static Task<Void> grantExternalPermissions(FragmentActivity fragmentActivity, boolean z6) {
        return z6 ? grantPermissions(fragmentActivity, STORAGE_PERMISSIONS, 16, 2131825612) : grantPermissions(fragmentActivity, STORAGE_PERMISSIONS, 16);
    }

    public static Task<Void> grantExternalPermissions(BaseAppCompatActivity baseAppCompatActivity) {
        return grantPermissions(baseAppCompatActivity, STORAGE_PERMISSIONS, 16, 2131825612);
    }

    public static Task<Void> grantExternalPermissions(BaseFragment baseFragment) {
        return grantPermissions(baseFragment, STORAGE_PERMISSIONS, 16, 2131825612);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bolts.Task<java.lang.Void> grantPermission(android.app.Activity r10, @androidx.annotation.Nullable androidx.lifecycle.Lifecycle r11, com.bilibili.lib.ui.permission.PermissionBiz r12, java.lang.String[] r13, int r14, int r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.PermissionsChecker.grantPermission(android.app.Activity, androidx.lifecycle.Lifecycle, com.bilibili.lib.ui.permission.PermissionBiz, java.lang.String[], int, int, java.lang.String):bolts.Task");
    }

    public static Task<Void> grantPermission(Activity activity, @Nullable Lifecycle lifecycle, PermissionBiz permissionBiz, String[] strArr, int i7, String str) {
        return grantPermission(activity, lifecycle, permissionBiz, strArr, i7, 0, str);
    }

    public static Task<Void> grantPermission(Activity activity, @Nullable Lifecycle lifecycle, String[] strArr, int i7, int i8, String str) {
        return grantPermission(activity, lifecycle, PermissionBiz.NONE, strArr, i7, i8, str);
    }

    public static Task<Void> grantPermission(Activity activity, @Nullable Lifecycle lifecycle, String[] strArr, int i7, String str) {
        return grantPermission(activity, lifecycle, PermissionBiz.NONE, strArr, i7, 0, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bolts.Task<java.lang.Void> grantPermission(androidx.fragment.app.Fragment r10, @androidx.annotation.Nullable androidx.lifecycle.Lifecycle r11, com.bilibili.lib.ui.permission.PermissionBiz r12, java.lang.String[] r13, int r14, int r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.PermissionsChecker.grantPermission(androidx.fragment.app.Fragment, androidx.lifecycle.Lifecycle, com.bilibili.lib.ui.permission.PermissionBiz, java.lang.String[], int, int, java.lang.String):bolts.Task");
    }

    public static Task<Void> grantPermission(Fragment fragment, @Nullable Lifecycle lifecycle, PermissionBiz permissionBiz, String[] strArr, int i7, String str) {
        return grantPermission(fragment, lifecycle, permissionBiz, strArr, i7, 0, str);
    }

    public static Task<Void> grantPermission(Fragment fragment, @Nullable Lifecycle lifecycle, String[] strArr, int i7, int i8, String str) {
        return grantPermission(fragment, lifecycle, PermissionBiz.NONE, strArr, i7, i8, str);
    }

    public static Task<Void> grantPermission(Fragment fragment, @Nullable Lifecycle lifecycle, String[] strArr, int i7, String str) {
        return grantPermission(fragment, lifecycle, PermissionBiz.NONE, strArr, i7, 0, str);
    }

    public static Task<Void> grantPermissions(Activity activity, String[] strArr, int i7) {
        return grantPermission(activity, (Lifecycle) null, PermissionBiz.NONE, strArr, i7, 0, "");
    }

    public static Task<Void> grantPermissions(Activity activity, String[] strArr, int i7, int i8) {
        return grantPermission(activity, (Lifecycle) null, PermissionBiz.NONE, strArr, i7, i8, "");
    }

    public static Task<Void> grantPermissions(Fragment fragment, String[] strArr, int i7) {
        return grantPermission(fragment, (Lifecycle) null, PermissionBiz.NONE, strArr, i7, 0, "");
    }

    public static Task<Void> grantPermissions(Fragment fragment, String[] strArr, int i7, int i8) {
        return grantPermission(fragment, (Lifecycle) null, PermissionBiz.NONE, strArr, i7, i8, "");
    }

    public static Task<Void> grantPhonePermission(BaseAppCompatActivity baseAppCompatActivity) {
        return grantPermissions(baseAppCompatActivity, PHONE_PERMISSION, 18, 2131825610);
    }

    public static Task<Void> grantPhonePermission(BaseAppCompatActivity baseAppCompatActivity, @Nullable Lifecycle lifecycle, String str) {
        return grantPermission(baseAppCompatActivity, lifecycle, PHONE_PERMISSION, 18, 2131825610, str);
    }

    public static boolean isNotFirstAndNotRationale(Activity activity, String str) {
        return (isPermissionFirstRequest(str) || b(activity, str)) ? false : true;
    }

    public static boolean isPermissionFirstRequest(String str) {
        return !BiliGlobalPreferenceHelper.getBLKVSharedPreference(Foundation.instance().getApp()).getBoolean(C4496a.a("permission_", str), false);
    }

    public static boolean onPermissionMultiResult(int i7, String[] strArr, int[] iArr) {
        Task<Void>.TaskCompletionSource taskCompletionSource = f64800a.get(i7);
        if (taskCompletionSource == null) {
            return false;
        }
        String.format("onRequestPermissionsResult(%d,%s,%s)", Integer.valueOf(i7), Arrays.toString(strArr), Arrays.toString(iArr));
        boolean z6 = false;
        for (int i8 : iArr) {
            z6 = i8 != 0;
            if (z6) {
                break;
            }
        }
        if (z6) {
            taskCompletionSource.trySetCancelled();
        } else {
            taskCompletionSource.trySetResult(null);
        }
        f64800a.delete(i7);
        SparseArray<PermissionBiz> sparseArray = f64801b;
        PermissionBiz permissionBiz = sparseArray.get(i7);
        if (permissionBiz != null && strArr != null && strArr.length > 0) {
            C2951n.b(permissionBiz, strArr[0], !z6);
        }
        sparseArray.delete(i7);
        return true;
    }

    public static boolean onPermissionResult(int i7, String[] strArr, int[] iArr) {
        Task<Void>.TaskCompletionSource taskCompletionSource = f64800a.get(i7);
        if (taskCompletionSource == null) {
            return false;
        }
        String.format("onRequestPermissionsResult(%d,%s,%s)", Integer.valueOf(i7), Arrays.toString(strArr), Arrays.toString(iArr));
        boolean z6 = false;
        for (int i8 : iArr) {
            z6 = i8 == 0;
            if (z6) {
                break;
            }
        }
        if (z6) {
            taskCompletionSource.trySetResult(null);
        } else {
            taskCompletionSource.trySetCancelled();
        }
        f64800a.delete(i7);
        SparseArray<PermissionBiz> sparseArray = f64801b;
        PermissionBiz permissionBiz = sparseArray.get(i7);
        if (permissionBiz != null && permissionBiz != PermissionBiz.NONE && strArr != null && strArr.length > 0) {
            C2951n.b(permissionBiz, strArr[0], z6);
        }
        sparseArray.delete(i7);
        return true;
    }

    public static boolean onPermissionResult(BaseAppCompatActivity baseAppCompatActivity, int i7, String[] strArr, int[] iArr) {
        return onPermissionResult(i7, strArr, iArr);
    }

    public static boolean onPermissionResult(BaseFragment baseFragment, int i7, String[] strArr, int[] iArr) {
        return onPermissionResult(i7, strArr, iArr);
    }

    public static void setPermissionBlock(Context context, PermissionBiz permissionBiz, String str, boolean z6) {
        PermissionBiz permissionBiz2 = permissionBiz;
        if (permissionBiz == null) {
            permissionBiz2 = PermissionBiz.NONE;
        }
        C2951n.b(permissionBiz2, str, z6);
    }

    public static void setPermissionRequested(String str) {
        BiliGlobalPreferenceHelper.getBLKVSharedPreference(Foundation.instance().getApp()).edit().putBoolean(C4496a.a("permission_", str), true).apply();
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String[] strArr) {
        for (String str : strArr) {
            if (b(activity, str)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static AlertDialog showPermissionSettingAlert(Activity activity, String str, String str2, PermissionSettingAlertEventListener permissionSettingAlertEventListener) {
        WindowManager.LayoutParams attributes;
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        View viewInflate = LayoutInflater.from(activity).inflate(2131494716, (ViewGroup) null);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity, 2131887568).setView(viewInflate).setCancelable(false).create();
        try {
            alertDialogCreate.show();
        } catch (Exception e7) {
        }
        TextView textView = (TextView) viewInflate.findViewById(2131309620);
        TextView textView2 = (TextView) viewInflate.findViewById(2131299414);
        TextView textView3 = (TextView) viewInflate.findViewById(2131297898);
        TextView textView4 = (TextView) viewInflate.findViewById(2131311141);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        if (TextUtils.isEmpty(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str2);
        }
        textView4.setOnClickListener(new c(activity, alertDialogCreate, permissionSettingAlertEventListener));
        textView3.setOnClickListener(new d(alertDialogCreate, permissionSettingAlertEventListener));
        if (permissionSettingAlertEventListener != null) {
            permissionSettingAlertEventListener.onShow(alertDialogCreate);
        }
        if (alertDialogCreate.getWindow() != null && (attributes = alertDialogCreate.getWindow().getAttributes()) != null) {
            attributes.width = ScreenUtil.dip2px(activity, 280.0f);
            alertDialogCreate.getWindow().setAttributes(attributes);
        }
        return alertDialogCreate;
    }
}
