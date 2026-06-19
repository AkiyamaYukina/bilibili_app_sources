package com.bilibili.studio.editor.asr.multi;

import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.okdownloader.BiliDownloader;
import com.bilibili.studio.editor.asr.core.remote.AsrResultDownload;
import com.bilibili.studio.editor.asr.multi.step.a;
import com.bilibili.studio.editor.asr.multi.step.b;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrSingleTask.class */
public final class AsrSingleTask implements Jw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f105602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.asr.multi.step.b f105603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.asr.multi.step.a f105604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AsrResultDownload f105605d = new AsrResultDownload();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f105606e = "BiliEditorMultiAsrManager";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Mutex f105607f = MutexKt.Mutex$default(false, 1, (Object) null);

    /* JADX INFO: renamed from: com.bilibili.studio.editor.asr.multi.AsrSingleTask$cancel$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrSingleTask$cancel$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AsrSingleTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AsrSingleTask asrSingleTask, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = asrSingleTask;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.studio.editor.asr.multi.step.b bVar = this.this$0.f105603b;
            bVar.f105671b.a();
            Deferred<b.a> deferred = bVar.f105672c;
            if (deferred != null) {
                deferred.cancel(new CancellationException("cancel extra"));
            }
            com.bilibili.studio.editor.asr.multi.step.a aVar = this.this$0.f105604c;
            Deferred<a.C1187a> deferred2 = aVar.f105665c;
            if (deferred2 != null) {
                deferred2.cancel(new CancellationException("cancel fast asr"));
            }
            aVar.f105664b.cancel();
            AsrResultDownload asrResultDownload = this.this$0.f105605d;
            asrResultDownload.getClass();
            BiliDownloader.Companion.getInstance(Foundation.Companion.instance().getApp()).cancel(asrResultDownload.f105538a);
            return Unit.INSTANCE;
        }
    }

    public AsrSingleTask(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Iw0.a aVar) {
        this.f105602a = str;
        this.f105603b = new com.bilibili.studio.editor.asr.multi.step.b(str, aVar);
        this.f105604c = new com.bilibili.studio.editor.asr.multi.step.a(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.studio.editor.asr.bean.AudioInfo r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.multi.AsrSingleTask.a(com.bilibili.studio.editor.asr.bean.AudioInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // Jw0.a
    public final void cancel() {
        BuildersKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), (CoroutineStart) null, new AnonymousClass1(this, null), 2, (Object) null);
    }
}
