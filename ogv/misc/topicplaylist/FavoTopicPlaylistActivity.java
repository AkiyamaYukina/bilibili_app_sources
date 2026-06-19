package com.bilibili.ogv.misc.topicplaylist;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.lib.tribe.core.internal.Hooks;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/FavoTopicPlaylistActivity.class */
@StabilityInferred(parameters = 0)
public final class FavoTopicPlaylistActivity extends com.bilibili.lib.spy.generated.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public FavoTopicPlayListSubFragment f69626x;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492912);
        this.f69626x = new FavoTopicPlayListSubFragment();
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(2131299392, this.f69626x, "bangumi_favo_topic_playlist");
        fragmentTransactionBeginTransaction.commit();
        getSupportFragmentManager().executePendingTransactions();
    }
}
