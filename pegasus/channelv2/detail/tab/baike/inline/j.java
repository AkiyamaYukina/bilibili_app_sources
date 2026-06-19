package com.bilibili.pegasus.channelv2.detail.tab.baike.inline;

import androidx.annotation.AnyThread;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Named;
import javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/inline/j.class */
@Singleton
@StabilityInferred(parameters = 0)
@Named("channel_baike_inline_volume_key")
public final class j implements IInlineVolumeService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f75161a = new AtomicBoolean(true);

    @Override // com.bilibili.moduleservice.list.IInlineVolumeService
    @AnyThread
    public final boolean isMuteState() {
        return this.f75161a.get();
    }

    @Override // com.bilibili.moduleservice.list.IInlineVolumeService
    @AnyThread
    public final void setInlineMute(boolean z6) {
        AtomicBoolean atomicBoolean = this.f75161a;
        atomicBoolean.compareAndSet(atomicBoolean.get(), z6);
    }

    @Override // com.bilibili.moduleservice.list.IInlineVolumeService
    @AnyThread
    public final boolean toggleInlineMute() {
        boolean z6 = this.f75161a.get();
        this.f75161a.compareAndSet(z6, !z6);
        return !z6;
    }
}
