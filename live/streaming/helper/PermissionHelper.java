package com.bilibili.live.streaming.helper;

import android.app.Activity;
import android.content.Context;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import androidx.collection.ArraySet;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/helper/PermissionHelper.class */
public final class PermissionHelper {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/helper/PermissionHelper$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Invocation(category = InvocationCategory.INVOKE_STATIC, name = "checkSelfPermission", owner = {"androidx.core.content.ContextCompat"}, scope = {})
        private static int __Ghost$Insertion$com_bilibili_infra_base_aop_StoragePermissionHook_checkSelfPermission(Context context, String str) {
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
        private static void __Ghost$Insertion$com_bilibili_infra_base_aop_StoragePermissionHook_requestPermissions(Activity activity, String[] strArr, int i7) {
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

        public final boolean checkSelfPermission(@NotNull Context context, @NotNull String[] strArr) {
            for (String str : strArr) {
                if (__Ghost$Insertion$com_bilibili_infra_base_aop_StoragePermissionHook_checkSelfPermission(context, str) != 0) {
                    return false;
                }
            }
            return true;
        }

        public final void requestPermission(@NotNull Activity activity, @NotNull String[] strArr, int i7) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (__Ghost$Insertion$com_bilibili_infra_base_aop_StoragePermissionHook_checkSelfPermission(activity, str) != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            __Ghost$Insertion$com_bilibili_infra_base_aop_StoragePermissionHook_requestPermissions(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), i7);
        }

        public final void requestScreenCapturePermission(@NotNull Activity activity, int i7) {
            activity.startActivityForResult(((MediaProjectionManager) activity.getApplicationContext().getSystemService("media_projection")).createScreenCaptureIntent(), i7);
        }
    }
}
