package com.bilibili.pegasus.channelv2.home.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bilibili.lib.ui.BaseFragment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/utils/FragmentShowHideLifecycleWrapper.class */
@StabilityInferred(parameters = 0)
public final class FragmentShowHideLifecycleWrapper extends LifecycleRegistry implements LifecycleObserver {
    public static final int $stable = 8;

    @NotNull
    private final BaseFragment fragment;
    private boolean fragmentShow;

    @NotNull
    private final Lifecycle lifecycle;

    public FragmentShowHideLifecycleWrapper(@NotNull BaseFragment baseFragment) {
        super(baseFragment);
        this.fragment = baseFragment;
        Lifecycle lifecycle = baseFragment.getLifecycle();
        this.lifecycle = lifecycle;
        lifecycle.addObserver(this);
    }

    @NotNull
    public final BaseFragment getFragment() {
        return this.fragment;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    public final void onFragmentVisible(boolean z6) {
        this.fragmentShow = z6;
        if (z6) {
            handleLifecycleEvent(Lifecycle.Event.ON_START);
        } else {
            handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.fragmentShow) {
            handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.fragmentShow) {
            handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        if (this.fragmentShow) {
            handleLifecycleEvent(Lifecycle.Event.ON_START);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (this.fragmentShow) {
            handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
    }
}
