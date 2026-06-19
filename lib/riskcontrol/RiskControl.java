package com.bilibili.lib.riskcontrol;

import android.app.Activity;
import com.bilibili.gripper.api.riskcontrol.GRiskControl;
import dagger.hilt.EntryPoints;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/RiskControl.class */
public final class RiskControl {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String RISK_VERSION_1 = "1.0";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/RiskControl$a.class */
    public static final class a {
    }

    public static /* synthetic */ void showCaptcha$default(RiskControl riskControl, Activity activity, String str, boolean z6, RiskControlCallback riskControlCallback, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        riskControl.showCaptcha(activity, str, z6, riskControlCallback);
    }

    public static /* synthetic */ void showCaptcha$default(RiskControl riskControl, Activity activity, String str, boolean z6, RiskControlCallback riskControlCallback, String str2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        riskControl.showCaptcha(activity, str, z6, riskControlCallback, str2);
    }

    public static /* synthetic */ void showCaptcha$default(RiskControl riskControl, Activity activity, String str, boolean z6, RiskControlCallback riskControlCallback, String str2, String str3, String str4, DialogShowingCallback dialogShowingCallback, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        riskControl.showCaptcha(activity, str, z6, riskControlCallback, str2, str3, str4, dialogShowingCallback);
    }

    @JvmOverloads
    public final void showCaptcha(@NotNull Activity activity, @NotNull String str, @NotNull RiskControlCallback riskControlCallback) {
        showCaptcha$default(this, activity, str, false, riskControlCallback, 4, null);
    }

    @JvmOverloads
    public final void showCaptcha(@NotNull Activity activity, @NotNull String str, @NotNull RiskControlCallback riskControlCallback, @NotNull String str2) {
        showCaptcha$default(this, activity, str, false, riskControlCallback, str2, 4, null);
    }

    @JvmOverloads
    public final void showCaptcha(@NotNull Activity activity, @NotNull String str, @NotNull RiskControlCallback riskControlCallback, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable DialogShowingCallback dialogShowingCallback) {
        showCaptcha$default(this, activity, str, false, riskControlCallback, str2, str3, str4, dialogShowingCallback, 4, null);
    }

    @JvmOverloads
    public final void showCaptcha(@NotNull Activity activity, @NotNull String str, boolean z6, @NotNull RiskControlCallback riskControlCallback) {
        showCaptcha(activity, str, z6, riskControlCallback, "", "", "1.0", null);
    }

    @JvmOverloads
    public final void showCaptcha(@NotNull Activity activity, @NotNull String str, boolean z6, @NotNull RiskControlCallback riskControlCallback, @NotNull String str2) {
        showCaptcha(activity, str, z6, riskControlCallback, "", str2, "1.0", null);
    }

    @JvmOverloads
    public final void showCaptcha(@NotNull Activity activity, @NotNull String str, boolean z6, @NotNull RiskControlCallback riskControlCallback, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable DialogShowingCallback dialogShowingCallback) {
        GRiskControl gRiskControl = ((GRiskControl.Fetcher) EntryPoints.get(BiliRiskControlConfig.INSTANCE.getParams().fapp(), GRiskControl.Fetcher.class)).getGRiskControl();
        if (gRiskControl != null) {
            gRiskControl.showCaptcha(activity, str, z6, riskControlCallback, str2, str3, str4, dialogShowingCallback);
        }
    }
}
