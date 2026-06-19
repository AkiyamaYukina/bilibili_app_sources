package com.bilibili.pegasus.channelv2.base;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bilibili.lib.ui.BaseFragment;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/base/BaseLifecycleFragment.class */
@StabilityInferred(parameters = 0)
public class BaseLifecycleFragment extends BaseFragment {
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
        super.onPause();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
        super.onStop();
    }
}
