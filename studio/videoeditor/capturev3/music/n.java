package com.bilibili.studio.videoeditor.capturev3.music;

import J3.a2;
import J3.b2;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.Observer;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import com.bilibili.studio.videoeditor.download.DownloadRequest;
import com.bilibili.studio.videoeditor.downloader.DownloadRequestV1;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/n.class */
public final class n implements g<AB0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f109277a = LazyKt.lazy(new a2(7));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f109278b = LazyKt.lazy(new b2(7));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Job f109279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Job f109280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Job f109281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Job f109282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f109283g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/n$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f109284a;

        public a(h hVar) {
            this.f109284a = hVar;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f109284a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f109284a.invoke(obj);
        }
    }

    public n() {
        r().f189a.observeForever(new a(new h(this)));
    }

    public static final Object i(n nVar, String str, String str2, String str3, Continuation continuation) {
        nVar.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception())));
        } else {
            DownloadRequest.a aVar = new DownloadRequest.a();
            aVar.f109435b = str;
            aVar.f109436c = str2;
            aVar.f109437d = str3;
            DownloadRequest downloadRequestA = aVar.a();
            UB0.b.a(downloadRequestA, new i(cancellableContinuationImpl));
            UB0.b.f(downloadRequestA.taskId);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object j(n nVar, String str, String str2, String str3, Continuation continuation) {
        nVar.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception())));
        } else {
            DownloadRequestV1.a aVar = new DownloadRequestV1.a();
            aVar.f109450b = str;
            aVar.f109451c = str2;
            aVar.f109452d = str3;
            aVar.f109449a = System.nanoTime();
            DownloadRequestV1 downloadRequestV1 = new DownloadRequestV1(aVar);
            VB0.d dVar = (VB0.d) VB0.d.f25301a.getValue();
            j jVar = new j(cancellableContinuationImpl);
            dVar.getClass();
            VB0.d.a(downloadRequestV1, jVar);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r3
  0x0032: PHI (r3v2 java.io.File) = (r3v1 java.io.File), (r3v4 java.io.File) binds: [B:6:0x001f, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String k(com.bilibili.studio.videoeditor.capturev3.music.n r3) {
        /*
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r6 = r0
            r0 = 0
            r4 = r0
            r0 = r6
            if (r0 != 0) goto L14
            r0 = r4
            r3 = r0
            goto L3d
        L14:
            r0 = r6
            java.lang.String r1 = android.os.Environment.DIRECTORY_MUSIC
            java.io.File r0 = r0.getExternalFilesDir(r1)
            r5 = r0
            r0 = r5
            r3 = r0
            r0 = r5
            if (r0 != 0) goto L32
            r0 = r6
            java.io.File r0 = r0.getCacheDir()
            r5 = r0
            r0 = r5
            r3 = r0
            r0 = r5
            if (r0 != 0) goto L32
            r0 = r4
            r3 = r0
            goto L3d
        L32:
            r0 = r3
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = java.io.File.separator
            java.lang.String r0 = G.p.a(r0, r1)
            r3 = r0
        L3d:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.music.n.k(com.bilibili.studio.videoeditor.capturev3.music.n):java.lang.String");
    }

    public static final Object l(n nVar, long j7, Continuation continuation) {
        nVar.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        String accessKey = BiliAccounts.get(BiliContext.application()).getAccessKey();
        HashMap map = new HashMap();
        map.put(EditCustomizeSticker.TAG_MID, String.valueOf(BiliAccounts.get(BiliContext.application()).mid()));
        map.put("songid", String.valueOf(j7));
        map.put("privilege", "1");
        map.put("quality", "1");
        map.put("platform", Constant.SDK_OS);
        TC0.h.b(accessKey, map, new l(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final String m(n nVar) {
        File externalFilesDir;
        nVar.getClass();
        Application application = BiliContext.application();
        String strA = null;
        if (application != null && (externalFilesDir = application.getExternalFilesDir("lrc")) != null && (externalFilesDir.exists() || externalFilesDir.mkdir())) {
            strA = G.p.a(externalFilesDir.getAbsolutePath(), File.separator);
        }
        return strA;
    }

    public static final Object n(n nVar, long j7, Continuation continuation) {
        nVar.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        String accessKey = BiliAccounts.get(BiliContext.application()).getAccessKey();
        ((TC0.a) ServiceGenerator.createService(TC0.a.class)).getMusicDetailsBySid(accessKey, j7).enqueue(new m(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    public final void a() {
        r().f190b.postValue(null);
        g(null);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    public final void b() {
        MusicInfo value = r().f189a.getValue();
        if (value == null) {
            return;
        }
        r rVarP = p();
        String localPath = value.getLocalPath();
        IjkMediaPlayer ijkMediaPlayer = rVarP.f109292a;
        if (ijkMediaPlayer != null) {
            if (Intrinsics.areEqual(ijkMediaPlayer.getDataSource(), localPath)) {
                ijkMediaPlayer.start();
            } else {
                o.a(rVarP, localPath, false, 0L, 14);
            }
        }
        if (this.f109283g) {
            return;
        }
        this.f109283g = true;
        this.f109281e = BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new MusicManagerImpl$startRecord$1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    public final void c(@Nullable Intent intent) {
        Bundle extras;
        String string;
        String string2;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string3 = extras.getString("key_bgm_path");
        if (string3 == null) {
            Bgm bgm = (Bgm) com.bilibili.studio.videoeditor.common.intent.b.f109430a.a("key_bgm_instance");
            if (bgm != null) {
                MusicInfo musicInfo = new MusicInfo(0L, null, 0, null, null, 0L, 0L, 0L, 0, 0, null, 2047, null);
                CB0.a.b(musicInfo, bgm);
                r().f190b.postValue(musicInfo);
                g(musicInfo);
                return;
            }
            return;
        }
        MusicInfo musicInfo2 = new MusicInfo(0L, null, 0, null, null, 0L, 0L, 0L, 0, 0, null, 2047, null);
        musicInfo2.setLocalPath(string3);
        musicInfo2.setType(0);
        musicInfo2.setState(3);
        musicInfo2.setDuration(HC0.a.a(musicInfo2.getLocalPath()) * ((long) 1000));
        if (musicInfo2.getDuration() <= 0) {
            Application application = BiliContext.application();
            if (application == null || (string2 = application.getString(2131841946)) == null || string2.length() == 0) {
                return;
            }
            r().h.postValue(string2);
            return;
        }
        if (musicInfo2.getDuration() >= TransitionInfo.DEFAULT_DURATION) {
            musicInfo2.setStartTime(extras.getLong("key_bgm_start_time", 0L));
            musicInfo2.setName(extras.getString("key_bgm_name", ""));
            r().f190b.postValue(musicInfo2);
            g(musicInfo2);
            return;
        }
        Application application2 = BiliContext.application();
        if (application2 == null || (string = application2.getString(2131842001)) == null || string.length() == 0) {
            return;
        }
        r().h.postValue(string);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    public final void d() {
        p().e();
        this.f109283g = false;
        Job job = this.f109281e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f109281e = null;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    @NotNull
    public final AB0.a e() {
        return r();
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    public final void f(int i7, boolean z6) {
        Integer value = r().f194f.getValue();
        int iIntValue = value != null ? value.intValue() : 0;
        if (iIntValue == i7) {
            return;
        }
        r().f195g.put(Integer.valueOf(iIntValue), r().f189a.getValue());
        r().f194f.postValue(Integer.valueOf(i7));
        if (z6) {
            MusicInfo musicInfo = r().f195g.get(Integer.valueOf(i7));
            MusicInfo value2 = musicInfo;
            if (musicInfo == null) {
                value2 = r().f190b.getValue();
            }
            g(value2);
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    public final void g(@Nullable MusicInfo musicInfo) {
        if (Intrinsics.areEqual(r().f189a.getValue(), musicInfo)) {
            return;
        }
        o(null);
        p().c();
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            r().f189a.setValue(musicInfo);
        } else {
            r().f189a.postValue(musicInfo);
        }
        if (musicInfo != null) {
            Job job = this.f109280d;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            GlobalScope globalScope = GlobalScope.INSTANCE;
            this.f109280d = BuildersKt.launch$default(globalScope, (CoroutineContext) null, (CoroutineStart) null, new MusicManagerImpl$downloadMusicWords$1(this, musicInfo, null), 3, (Object) null);
            if (musicInfo.getBgm() == null) {
                Job job2 = this.f109282f;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                this.f109282f = BuildersKt.launch$default(globalScope, (CoroutineContext) null, (CoroutineStart) null, new MusicManagerImpl$getMusicInfo$1(musicInfo, null), 3, (Object) null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    public final void h(@NotNull IndependentCaptureFragment independentCaptureFragment) {
        BLRouter.routeTo(new RouteRequest.Builder("activity://uper/user_center/bgm_list/").extras(new cD.d(this, 3)).requestCode(18).build(), independentCaptureFragment);
    }

    public final void o(File file) {
        if (Intrinsics.areEqual(r().f191c.getValue(), file)) {
            return;
        }
        r().f191c.postValue(file);
    }

    @NotNull
    public final r p() {
        return (r) this.f109278b.getValue();
    }

    public final long q(long j7) {
        MusicInfo value = r().f189a.getValue();
        if (value == null) {
            return 0L;
        }
        long duration = value.getDuration() - value.getStartTime();
        if (duration == 0) {
            return 0L;
        }
        return (j7 % duration) + value.getStartTime();
    }

    @NotNull
    public final AB0.a r() {
        return (AB0.a) this.f109277a.getValue();
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    public final void release() {
        Job job = this.f109279c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.f109280d;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Job job3 = this.f109282f;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.f109283g = false;
        Job job4 = this.f109281e;
        if (job4 != null) {
            Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
        }
        this.f109281e = null;
        p().c();
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    public final void seekTo(long j7) {
        IjkMediaPlayer ijkMediaPlayer = p().f109292a;
        if (ijkMediaPlayer != null ? ijkMediaPlayer.isPlaying() : false) {
            return;
        }
        long jQ = q(j7);
        p().g(jQ);
        r().f192d.postValue(Long.valueOf(jQ));
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.music.g
    public final void setPlaySpeed(float f7) {
        if (f7 == 0.0f) {
            return;
        }
        float f8 = 1 / f7;
        IjkMediaPlayer ijkMediaPlayer = p().f109292a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setSpeed(f8);
        }
    }
}
