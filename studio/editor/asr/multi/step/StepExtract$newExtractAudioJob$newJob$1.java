package com.bilibili.studio.editor.asr.multi.step;

import androidx.fragment.app.z;
import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.editor.asr.cache.AsrResultCacheV3;
import com.bilibili.studio.editor.asr.multi.step.b;
import j4.o;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepExtract$newExtractAudioJob$newJob$1.class */
final class StepExtract$newExtractAudioJob$newJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super b.a>, Object> {
    final AudioInfo $audioInfo;
    Object L$0;
    Object L$1;
    int label;
    final com.bilibili.studio.editor.asr.multi.step.b this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepExtract$newExtractAudioJob$newJob$1$a.class */
    public static final class a implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.studio.editor.asr.multi.step.b f105655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioInfo f105656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CancellableContinuationImpl f105657c;

        public a(com.bilibili.studio.editor.asr.multi.step.b bVar, AudioInfo audioInfo, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f105655a = bVar;
            this.f105656b = audioInfo;
            this.f105657c = cancellableContinuationImpl;
        }

        public final Object invoke(Object obj) {
            String str = this.f105655a.f105670a;
            AudioInfo audioInfo = this.f105656b;
            o.a("newExtractAudioJob onSuccess id=", str, " path=", audioInfo.getAudioFilePath(), "BiliEditorMultiAsrManager");
            AsrResultCacheV3 asrResultCacheV3 = AsrResultCacheV3.f105530a;
            AsrResultCacheV3.f105534e.add(audioInfo.getAudioFilePath());
            CancellableContinuationImpl cancellableContinuationImpl = this.f105657c;
            if (cancellableContinuationImpl.isActive()) {
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(new b.a()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepExtract$newExtractAudioJob$newJob$1$b.class */
    public static final class b implements Function1<Exception, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.studio.editor.asr.multi.step.b f105658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f105659b;

        public b(com.bilibili.studio.editor.asr.multi.step.b bVar, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f105658a = bVar;
            this.f105659b = cancellableContinuationImpl;
        }

        public final Object invoke(Object obj) {
            Exception exc = (Exception) obj;
            BLog.e("BiliEditorMultiAsrManager", z.a("newExtractAudioJob onFailed id=", this.f105658a.f105670a, " error=", exc.getMessage()), exc);
            CancellableContinuationImpl cancellableContinuationImpl = this.f105659b;
            if (cancellableContinuationImpl.isActive()) {
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(new b.a("failed", exc)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepExtract$newExtractAudioJob$newJob$1$c.class */
    public static final class c implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.studio.editor.asr.multi.step.b f105660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f105661b;

        public c(com.bilibili.studio.editor.asr.multi.step.b bVar, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f105660a = bVar;
            this.f105661b = cancellableContinuationImpl;
        }

        public final Object invoke() {
            defpackage.a.b("newExtractAudioJob onCancel id=", this.f105660a.f105670a, "BiliEditorMultiAsrManager");
            CancellableContinuationImpl cancellableContinuationImpl = this.f105661b;
            if (cancellableContinuationImpl.isActive()) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(new b.a("cancel", new Exception("canceled"))));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepExtract$newExtractAudioJob$newJob$1$d.class */
    public static final class d implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f105662a = new Object();

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepExtract$newExtractAudioJob$newJob$1(com.bilibili.studio.editor.asr.multi.step.b bVar, AudioInfo audioInfo, Continuation<? super StepExtract$newExtractAudioJob$newJob$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$audioInfo = audioInfo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StepExtract$newExtractAudioJob$newJob$1(this.this$0, this.$audioInfo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super b.a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.studio.editor.asr.multi.step.b bVar = this.this$0;
            AudioInfo audioInfo = this.$audioInfo;
            this.L$0 = bVar;
            this.L$1 = audioInfo;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            BLog.i("BiliEditorMultiAsrManager", "newExtractAudioJob start converter id=" + bVar.f105670a);
            bVar.f105671b.b(audioInfo, new a(bVar, audioInfo, cancellableContinuationImpl), new b(bVar, cancellableContinuationImpl), new c(bVar, cancellableContinuationImpl), d.f105662a);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
