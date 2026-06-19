package com.bilibili.pegasus.promo.setting;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.preference.BLKVSwitchPreference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/RecommendSettingFragment.class */
@StabilityInferred(parameters = 0)
public final class RecommendSettingFragment extends BasePreferenceFragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final IPegasusInlineConfig f78545m = (IPegasusInlineConfig) BLRouter.get$default(BLRouter.INSTANCE, IPegasusInlineConfig.class, (String) null, 2, (Object) null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public BLKVSwitchPreference f78546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public PreferenceCategory f78547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Preference f78548p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0255  */
    /* JADX WARN: Type inference failed for: r1v38, types: [androidx.preference.Preference$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [androidx.preference.Preference$c, java.lang.Object] */
    @Override // androidx.preference.PreferenceFragmentCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreatePreferences(@org.jetbrains.annotations.Nullable android.os.Bundle r7, @org.jetbrains.annotations.Nullable java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.promo.setting.RecommendSettingFragment.onCreatePreferences(android.os.Bundle, java.lang.String):void");
    }
}
