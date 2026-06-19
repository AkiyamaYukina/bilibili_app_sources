package com.bilibili.pegasus.channelv3.feed.inline;

import androidx.annotation.AnyThread;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Named;
import javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/inline/h.class */
@Singleton
@StabilityInferred(parameters = 0)
@Named("channel_movie_inline_volume_key")
public final class h implements IInlineVolumeService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f75332a = new AtomicBoolean(true);

    @Override // com.bilibili.moduleservice.list.IInlineVolumeService
    @AnyThread
    public final boolean isMuteState() {
        return this.f75332a.get();
    }

    @Override // com.bilibili.moduleservice.list.IInlineVolumeService
    @AnyThread
    public final void setInlineMute(boolean z6) {
        AtomicBoolean atomicBoolean = this.f75332a;
        atomicBoolean.compareAndSet(atomicBoolean.get(), z6);
    }

    @Override // com.bilibili.moduleservice.list.IInlineVolumeService
    @AnyThread
    public final boolean toggleInlineMute() {
        boolean z6 = this.f75332a.get();
        this.f75332a.compareAndSet(z6, !z6);
        return !z6;
    }
}
