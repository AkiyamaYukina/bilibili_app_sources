package com.bilibili.lib.riskcontrol;

import androidx.activity.ComponentActivity;
import com.bilibili.gripper.api.riskcontrol.GRiskControl;
import dagger.hilt.EntryPoints;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/ActionValidateHelper.class */
public final class ActionValidateHelper {

    @NotNull
    public static final String ACTION_VALIDATE_SOURCE = "view_vvoucher";

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/ActionValidateHelper$a.class */
    public static final class a {
    }

    public static /* synthetic */ void checkAction$default(ActionValidateHelper actionValidateHelper, ComponentActivity componentActivity, String str, IActionValidateResult iActionValidateResult, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = null;
        }
        actionValidateHelper.checkAction(componentActivity, str, iActionValidateResult);
    }

    public final void checkAction(@NotNull ComponentActivity componentActivity, @Nullable String str, @NotNull IActionValidateResult iActionValidateResult) {
        GRiskControl gRiskControl = ((GRiskControl.Fetcher) EntryPoints.get(BiliRiskControlConfig.INSTANCE.getParams().fapp(), GRiskControl.Fetcher.class)).getGRiskControl();
        if (gRiskControl != null) {
            gRiskControl.checkAction(componentActivity, str, iActionValidateResult);
        }
    }
}
