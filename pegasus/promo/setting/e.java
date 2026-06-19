package com.bilibili.pegasus.promo.setting;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/e.class */
@Singleton
@StabilityInferred(parameters = 0)
public final class e implements com.bilibili.pegasus.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f78553a = LazyKt.lazy(new Ao0.e(8));

    public final void a() {
        c.a();
    }

    public final boolean b() {
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        boolean z6 = false;
        if (bLKVSharedPreference != null) {
            z6 = bLKVSharedPreference.getBoolean("pegasus_inline_volume_setting_operated", false);
        }
        return z6;
    }

    @Nullable
    public final String c() {
        return ((InlineVolumeSettingConfig) this.f78553a.getValue()).getGuidanceTitle();
    }

    @Nullable
    public final String d() {
        return ((InlineVolumeSettingConfig) this.f78553a.getValue()).getGuidanceButtonText();
    }

    public final int e() {
        return ((InlineVolumeSettingConfig) this.f78553a.getValue()).getGuidanceCdTime();
    }
}
