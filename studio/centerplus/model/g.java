package com.bilibili.studio.centerplus.model;

import F3.G1;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/g.class */
public final class g extends ZA0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Lazy<String[]> f105167f = LazyKt.lazy(new G1(10));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String[][] f105168g = {PermissionsChecker.STORAGE_WITH_AUDIO_PERMISSIONS, PermissionsChecker.CAMERA_PERMISSION, new String[]{"android.permission.RECORD_AUDIO"}};

    @NotNull
    public static final Integer[] h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Integer[] f105169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Integer[] f105170j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, PreviewData>> f105171b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, Integer>> f105172c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<PreviewData> f105173d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f105174e = new MutableLiveData<>();

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[], java.lang.String[][]] */
    static {
        Lazy lazy = zw0.b.f130950a;
        h = new Integer[]{Integer.valueOf(((Boolean) zw0.b.f130951b.getValue()).booleanValue() ? 2131842197 : 2131841864), 2131842020, 2131842141};
        f105169i = new Integer[]{Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? 2131842432 : 2131841940), 2131842038, 2131842038};
        f105170j = new Integer[]{9008, 9009, 9010};
    }

    public static boolean J0(@Nullable FragmentActivity fragmentActivity, int i7) {
        if (fragmentActivity == null) {
            return false;
        }
        String[][] strArr = f105168g;
        boolean zCheckSelfPermissions = false;
        if (Arrays.equals(strArr[i7], PermissionsChecker.STORAGE_WITH_AUDIO_PERMISSIONS)) {
            zCheckSelfPermissions = false;
            if (Build.VERSION.SDK_INT >= 34) {
                zCheckSelfPermissions = PermissionsChecker.checkSelfPermissions(fragmentActivity, new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
            }
        }
        if (zCheckSelfPermissions) {
            return true;
        }
        return PermissionsChecker.checkSelfPermissions(fragmentActivity, strArr[i7]);
    }

    public final void I0(@NotNull FragmentActivity fragmentActivity, @Nullable Integer[] numArr, @NotNull String str, @NotNull String str2, int i7) {
        BuildersKt.launch$default(this.f29514a, Dispatchers.getMain(), (CoroutineStart) null, new PermissionCheckViewModel$checkNeededPermissions$1(this, numArr, fragmentActivity, str, i7, str2, null), 2, (Object) null);
    }
}
