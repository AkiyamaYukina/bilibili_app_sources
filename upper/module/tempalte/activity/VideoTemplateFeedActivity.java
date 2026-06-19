package com.bilibili.upper.module.tempalte.activity;

import GO.q;
import Xz0.g;
import Xz0.j;
import Xz0.k;
import Xz0.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import bF0.AbstractC5033q;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.centerplus.util.i;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.upper.module.tempalte.fragment.VideoTemplateFragment;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/activity/VideoTemplateFeedActivity.class */
@StabilityInferred(parameters = 0)
public final class VideoTemplateFeedActivity extends BaseAppCompatActivity implements IPvTracker {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final String f113942B = "contribute";

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "creation.creation-template-selection.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : ((HashMap) k.b()).entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        bundle.putString(CaptureSchema.JUMP_PARAMS_RELATION_FROM, this.f113942B);
        bundle.putString("templates_abtest", "a");
        g.b(bundle);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.lifecycle.LifecycleObserver, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        String strA = l.a(intent != null ? intent.getBundleExtra("param_control") : null);
        if (strA != null) {
            j.c("first_entrance", strA);
        }
        q.b(this);
        setContentView(AbstractC5033q.inflate(getLayoutInflater()).getRoot());
        VideoTemplateFragment videoTemplateFragment = new VideoTemplateFragment();
        videoTemplateFragment.setArguments(getIntent().getBundleExtra("param_control"));
        getSupportFragmentManager().beginTransaction().add(2131301943, videoTemplateFragment).commit();
        CopyOnWriteArrayList<i.b> copyOnWriteArrayList = i.f105298a;
        getLifecycle().addObserver(new Object());
    }
}
