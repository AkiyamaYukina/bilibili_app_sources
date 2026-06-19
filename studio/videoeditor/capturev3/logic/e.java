package com.bilibili.studio.videoeditor.capturev3.logic;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.ui.PermissionRequestUtils;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/e.class */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String[][] f109222c = {PermissionsChecker.STORAGE_WITH_AUDIO_PERMISSIONS, PermissionsChecker.CAMERA_PERMISSION, PermissionsChecker.AUDIO_PERMISSION};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Integer[] f109223d = {32, 33, 34};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public BaseCaptureFragment f109225b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/e$a.class */
    public interface a {
        void i2(int i7, boolean z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NotNull BaseCaptureFragment baseCaptureFragment, @NotNull Lifecycle lifecycle) {
        int i7;
        String string;
        int i8;
        String[][] strArr = f109222c;
        if (strArr.length != 0 && (i7 = this.f109224a) < strArr.length) {
            String[] strArr2 = strArr[i7];
            int iIntValue = f109223d[i7].intValue();
            if (strArr.length != 0 && (i8 = this.f109224a) < strArr.length) {
                int i9 = i8 != 0 ? i8 != 1 ? 2131842141 : 2131842020 : ((Boolean) zw0.b.f130951b.getValue()).booleanValue() ? 2131842197 : 2131841864;
                Application application = BiliContext.application();
                string = application == null ? "" : application.getString(i9);
            } else {
                string = null;
            }
            PermissionRequestUtils.requestPermissionWithTip((Fragment) baseCaptureFragment, lifecycle, strArr2, iIntValue, string);
        }
    }
}
