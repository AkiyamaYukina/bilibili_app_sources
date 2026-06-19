package com.bilibili.music.podcast.legacy.base;

import androidx.annotation.Keep;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/base/LifecyclePresenter.class */
@Keep
public interface LifecyclePresenter extends LifecycleObserver {
    public static final int LIFECYCLE_ATTACHED = 0;
    public static final int LIFECYCLE_DETACHED = 1;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void attach();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void detach();

    @Deprecated
    default int getPresenterLifecycle() {
        return 0;
    }
}
