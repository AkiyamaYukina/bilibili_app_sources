package com.bilibili.pegasus.page;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.GeneralActivity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/GraduationSeasonTimeMachineContainerActivity.class */
@StabilityInferred(parameters = 0)
public final class GraduationSeasonTimeMachineContainerActivity extends GeneralActivity {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f78288I = 0;

    @Override // com.bilibili.lib.ui.GeneralActivity, androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.GeneralActivity, com.bilibili.lib.ui.s, com.bilibili.lib.ui.AbstractActivityC5342c, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
    }
}
