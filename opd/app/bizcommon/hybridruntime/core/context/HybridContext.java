package com.bilibili.opd.app.bizcommon.hybridruntime.core.context;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bilibili.opd.app.bizcommon.context.ActivityLifecycleListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/core/context/HybridContext.class */
public abstract class HybridContext extends ContextWrapper {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/core/context/HybridContext$LifecycleListener.class */
    public interface LifecycleListener extends ActivityLifecycleListener {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/core/context/HybridContext$a.class */
    public static class a implements LifecycleListener {
        @Override // com.bilibili.opd.app.bizcommon.context.ActivityLifecycleListener
        public final void onCreate(Activity activity, Bundle bundle) {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.ActivityLifecycleListener
        public void onDestroy(Activity activity) {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.ActivityLifecycleListener
        public final void onPause(Activity activity) {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.ActivityLifecycleListener
        public final void onResume(Activity activity) {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.ActivityLifecycleListener
        public final void onSaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.ActivityLifecycleListener
        public final void onStart(Activity activity) {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.ActivityLifecycleListener
        public final void onStop(Activity activity) {
        }
    }

    public HybridContext(Context context) {
        super(context);
    }

    public abstract boolean checkLifecycle();

    public abstract Object getAttachOwner();

    public abstract Uri getCurUri();

    public abstract String getModule();

    public abstract void hideTitleBar();

    public abstract void loadNewUrl(Uri uri, boolean z6);

    public abstract void registerLifecycleListener(LifecycleListener lifecycleListener);

    public abstract void setResult(int i7, Intent intent);

    public abstract void setTitle(CharSequence charSequence);

    public abstract void startActivityForResult(Intent intent, int i7);

    public abstract void unregisterLifecycleListener(LifecycleListener lifecycleListener);
}
