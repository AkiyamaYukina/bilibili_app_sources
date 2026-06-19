package com.bilibili.upper.module.partitionTag.partitionTopic.activity;

import AI0.i;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import bF0.F3;
import com.bilibili.bililive.biz.interactionpanel.pk.widget.o;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicRequestParam;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.UpperTopicChooseFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.TouchTitleView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/UpperTopicChooseActivity.class */
@StabilityInferred(parameters = 0)
public final class UpperTopicChooseActivity extends a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f113735M = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public i f113736K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public F3 f113737L;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        i iVar;
        super.onCreate(bundle);
        F3 f3Inflate = F3.inflate(LayoutInflater.from(this));
        this.f113737L = f3Inflate;
        setContentView(f3Inflate != null ? f3Inflate.f54753a : null);
        View view = this.f113740D;
        if (view != null) {
            view.setBackgroundResource(2131104211);
        }
        this.f113736K = (i) new ViewModelProvider(this).get(i.class);
        Bundle bundleExtra = getIntent().getBundleExtra(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE);
        if (bundleExtra != null && (iVar = this.f113736K) != null) {
            iVar.f260f = (UpperTopicRequestParam) bundleExtra.getSerializable("TOPIC_REQUEST_PARAM");
        }
        F3 f32 = this.f113737L;
        if (f32 != null) {
            TouchTitleView touchTitleView = f32.f54754b;
            int i7 = this.f113743G;
            int i8 = this.f113744H;
            touchTitleView.b(i7, i8, (int) ((i8 * 1.0f) / 4));
        }
        F3 f33 = this.f113737L;
        if (f33 != null) {
            f33.f54754b.setCallback(new tI0.i(this));
        }
        F3 f34 = this.f113737L;
        if (f34 != null) {
            f34.f54755c.setOnClickListener(new o(this, 4));
        }
        F3 f35 = this.f113737L;
        if (f35 != null) {
            f35.f54756d.setOnClickListener(new IS.a(this, 3));
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        UpperTopicChooseFragment upperTopicChooseFragment = new UpperTopicChooseFragment();
        upperTopicChooseFragment.setArguments(new Bundle());
        fragmentTransactionBeginTransaction.add(2131313700, upperTopicChooseFragment, "UpperTopicChooseFragment").commitAllowingStateLoss();
    }
}
