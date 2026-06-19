package com.bilibili.studio.videoeditor.capturev3.logic;

import com.bilibili.studio.videoeditor.capturev3.data.VideoClipRecordInfo;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel;
import com.bilibili.studio.videoeditor.util.I;
import com.bilibili.studio.videoeditor.util.J;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/CaptureRecordManager.class */
public final class CaptureRecordManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public VideoClipRecordInfo f109188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public J f109189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public I f109190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f109191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f109192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f109193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f109194g;

    @Nullable
    public IndependentCaptureViewModel h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f109195i;

    public final long a() {
        VideoClipRecordInfo videoClipRecordInfo = this.f109188a;
        return videoClipRecordInfo != null ? videoClipRecordInfo.getTotalVideoLen() : 0L;
    }

    public final void b(boolean z6, boolean z7, @NotNull CoroutineScope coroutineScope) {
        this.f109188a = new VideoClipRecordInfo();
        this.f109189b = new J();
        this.f109190c = new I();
        BuildersKt.launch$default(coroutineScope, Dispatchers.getIO(), (CoroutineStart) null, new CaptureRecordManager$initData$1(this, z6, z7, null), 2, (Object) null);
    }

    public final void c(boolean z6, boolean z7) {
        this.f109191d = z6 ? z7 ? this.f109191d & 2 : this.f109191d | 2 : z7 ? this.f109191d & 1 : this.f109191d | 1;
    }
}
