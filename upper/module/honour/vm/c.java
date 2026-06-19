package com.bilibili.upper.module.honour.vm;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkAssetUpdateReason;
import tv.danmaku.ijk.media.player.IjkMediaAsset;
import tv.danmaku.ijk.media.player.IjkMediaPlayerItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/vm/c.class */
@StabilityInferred(parameters = 0)
public final class c extends ZA0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NI0.d f113381b = new NI0.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f113382c = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f113383d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f113384e = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f113385f = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f113386g = true;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f113387i;

    public final boolean I0() {
        Integer value = this.f113382c.getValue();
        boolean z6 = false;
        if ((value != null ? value.intValue() : 0) == 3) {
            z6 = true;
        }
        return z6;
    }

    public final void J0(int i7) {
        MutableLiveData<Integer> mutableLiveData = this.f113382c;
        Integer value = mutableLiveData.getValue();
        if (((value != null ? value.intValue() : 0) & i7) != i7) {
            Integer value2 = mutableLiveData.getValue();
            int iIntValue = 0;
            if (value2 != null) {
                iIntValue = value2.intValue();
            }
            mutableLiveData.setValue(Integer.valueOf(i7 | iIntValue));
        }
    }

    public final void K0() {
        if (this.f113386g) {
            this.f113383d.setValue(3);
            this.h = false;
            Job job = this.f113387i;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                this.f113387i = null;
            }
            if (I0()) {
                this.f113381b.f17106a.pause();
            }
        }
    }

    public final void L0(@Nullable String str) {
        if (str == null) {
            return;
        }
        MutableLiveData<Integer> mutableLiveData = this.f113383d;
        Integer value = mutableLiveData.getValue();
        if (value == null || value.intValue() != 4) {
            mutableLiveData.postValue(4);
        }
        ZF0.a.f29540a.remove(str);
        IjkMediaPlayerItem ijkMediaPlayerItemC = ZF0.a.c(str);
        if (ijkMediaPlayerItemC == null) {
            return;
        }
        ijkMediaPlayerItemC.setAssetUpdateListener(new IjkMediaPlayerItem.IjkMediaPlayerItemAssetUpdateListener(this) { // from class: com.bilibili.upper.module.honour.vm.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f113379a;

            {
                this.f113379a = this;
            }

            public final IjkMediaAsset onAssetUpdate(IjkAssetUpdateReason ijkAssetUpdateReason) {
                int reason = ijkAssetUpdateReason.getReason();
                if (reason != 3 && reason != 4) {
                    return null;
                }
                this.f113379a.f113383d.postValue(5);
                return null;
            }
        });
        Function1<? super Boolean, Unit> bVar = new com.bilibili.bililive.infra.hierarchy.b<>(this, 1);
        NI0.d dVar = this.f113381b;
        dVar.c(ijkMediaPlayerItemC, bVar);
        dVar.f17106a.setOnInfoListener(new IMediaPlayer.OnInfoListener(this) { // from class: com.bilibili.upper.module.honour.vm.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f113380a;

            {
                this.f113380a = this;
            }

            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i7, int i8, Bundle bundle) {
                Integer value2;
                if (i7 != 702) {
                    return true;
                }
                c cVar = this.f113380a;
                MutableLiveData<Integer> mutableLiveData2 = cVar.f113383d;
                Integer value3 = mutableLiveData2.getValue();
                if ((value3 == null || value3.intValue() != 4) && ((value2 = mutableLiveData2.getValue()) == null || value2.intValue() != 2)) {
                    return true;
                }
                cVar.M0();
                return true;
            }
        });
    }

    public final void M0() {
        if (this.f113386g) {
            this.f113383d.setValue(2);
            if (!this.h) {
                this.h = true;
                this.f113387i = BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new KingHonourPreviewModel$startLoopForProgress$1(this, null), 3, (Object) null);
            }
            if (!this.f113381b.f17106a.isPlaying() && I0()) {
                this.f113381b.f17106a.start();
            }
        }
    }

    @Override // ZA0.a, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.f113381b.a();
        super.onCleared();
    }
}
