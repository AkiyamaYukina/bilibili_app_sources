package com.bilibili.userfeedback.laserreport;

import Ff1.f;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.bilibili.commons.StringUtils;
import com.bilibili.lib.biliid.api.BuvidHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import dagger.hilt.EntryPoints;
import java.util.HashMap;
import kntr.base.laser.api.ILaser;
import lf0.ActivityC7846a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/TriggerLaserActivity.class */
public class TriggerLaserActivity extends ActivityC7846a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f114710x = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/TriggerLaserActivity$a.class */
    public final class a implements ILaser.Callback {
        public final void onFailed(int i7, @Nullable String str) {
            BLog.i("TriggerLaserActivity", "trigger laser upload failed");
        }

        public final void onSuccess(int i7, @Nullable String str) {
            BLog.i("TriggerLaserActivity", "trigger laser upload successful");
        }
    }

    @Override // lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kntr.base.laser.api.ILaser$Callback] */
    @Override // lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (StringUtils.equals(getIntent().getData().getQueryParameter("buvid"), BuvidHelper.getBuvid())) {
            ILaser laser = ((ILaser.Fetcher) EntryPoints.get(getApplication(), ILaser.Fetcher.class)).getLaser();
            if (laser != null) {
                laser.upload(new ILaser.Request(), (ILaser.Callback) new Object());
            }
            Neurons.trackT(false, "infra.laser.upload-by-ep", new HashMap(), 1, new f(7));
            BLog.i("TriggerLaserActivity", "trigger laser upload");
        } else {
            BLog.i("TriggerLaserActivity", "buvid is invalid!");
        }
        finish();
    }
}
