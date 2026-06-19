package com.bilibili.studio.videocompile.internal.sdk.meicam;

import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.bilibili.studio.kaleidoscope.sdk.AVFileInfo;
import com.bilibili.studio.videocompile.IBVideoCompileCallback;
import com.bilibili.studio.videocompile.IBVideoCompileLogger;
import com.bilibili.studio.videocompile.util.BVideoCompileUtil;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/sdk/meicam/MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1.class */
final class MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final IBVideoCompileCallback $callback;
    final boolean $isSkipTranscode;
    int I$0;
    int I$1;
    int I$2;
    boolean Z$0;
    int label;
    final g this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.videocompile.internal.sdk.meicam.MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/sdk/meicam/MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IBVideoCompileCallback $callback;
        final boolean $isSkipTranscode;
        int label;
        final g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IBVideoCompileCallback iBVideoCompileCallback, g gVar, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = iBVideoCompileCallback;
            this.this$0 = gVar;
            this.$isSkipTranscode = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.this$0, this.$isSkipTranscode, continuation);
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
            this.$callback.onCompileFinished(this.this$0.f108779a.getOutputFilePath(), null, this.$isSkipTranscode);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.videocompile.internal.sdk.meicam.MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/sdk/meicam/MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IBVideoCompileCallback $callback;
        int label;
        final g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IBVideoCompileCallback iBVideoCompileCallback, g gVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = iBVideoCompileCallback;
            this.this$0 = gVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$callback, this.this$0, continuation);
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
            this.$callback.onCompileFailed(ErrorCode.E_VOS_UPDATE_TRUSTTIME, "outputPath : " + this.this$0.f108779a.getOutputFilePath());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.videocompile.internal.sdk.meicam.MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/sdk/meicam/MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IBVideoCompileCallback $callback;
        int label;
        final g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(IBVideoCompileCallback iBVideoCompileCallback, g gVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$callback = iBVideoCompileCallback;
            this.this$0 = gVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$callback, this.this$0, continuation);
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
            this.$callback.onCompileFailed(ErrorCode.E_BUSY, "outputPath : " + this.this$0.f108779a.getOutputFilePath());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.videocompile.internal.sdk.meicam.MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/sdk/meicam/MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IBVideoCompileCallback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(IBVideoCompileCallback iBVideoCompileCallback, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$callback = iBVideoCompileCallback;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$callback, continuation);
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
            this.$callback.onCompileFailed(300, "unknown fail");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1(g gVar, IBVideoCompileCallback iBVideoCompileCallback, boolean z6, Continuation<? super MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$callback = iBVideoCompileCallback;
        this.$isSkipTranscode = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1(this.this$0, this.$callback, this.$isSkipTranscode, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i7;
        int i8;
        boolean z6;
        int i9;
        int i10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            LA0.d dVar = LA0.d.f14467l;
            if (dVar == null) {
                QA0.a.b("please call BVideoCompiler.init() first!!!", null);
                IBVideoCompileLogger iBVideoCompileLogger = QA0.b.f19715a;
                if (iBVideoCompileLogger != null) {
                    iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
                }
                throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
            }
            String config = dVar.d().getConfig("video_compile_module.finished_video_check_max_count", "50");
            i7 = config != null ? Integer.parseInt(config) : 50;
            i8 = 0;
            z6 = false;
            i9 = 0;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    File file = new File(this.this$0.f108779a.getOutputFilePath());
                    g gVar = this.this$0;
                    OA0.b.c(gVar, androidx.core.content.c.b(file.length(), "montage compile success path is ", gVar.f108779a.getOutputFilePath(), ", len="));
                    return Unit.INSTANCE;
                }
                if (i11 == 3) {
                    ResultKt.throwOnFailure(obj);
                    OA0.b.b(this.this$0, "montage compile products file no existent");
                    return Unit.INSTANCE;
                }
                if (i11 == 4) {
                    ResultKt.throwOnFailure(obj);
                    OA0.b.b(this.this$0, "montage compile products duration invalid");
                    return Unit.INSTANCE;
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OA0.b.b(this.this$0, "montage compile products unknown fail");
                return Unit.INSTANCE;
            }
            i9 = this.I$2;
            z6 = this.Z$0;
            i8 = this.I$1;
            i7 = this.I$0;
            ResultKt.throwOnFailure(obj);
        }
        while (true) {
            i10 = i8 + 1;
            if (i8 >= i7) {
                break;
            }
            boolean zIsFileExists = BVideoCompileUtil.isFileExists(this.this$0.f108779a.getOutputFilePath());
            g gVar2 = this.this$0;
            AVFileInfo aVFileInfo = gVar2.f108780b.getAVFileInfo(gVar2.f108779a.getOutputFilePath());
            int i12 = (aVFileInfo != null ? aVFileInfo.getDuration() : 0L) > 0 ? 1 : 0;
            if (zIsFileExists && i12 != 0) {
                int i13 = i12;
                z6 = zIsFileExists;
                i9 = i13;
                break;
            }
            OA0.b.c(this.this$0, "montage compile products checked!!!currentCheckCount=" + i10);
            this.I$0 = i7;
            this.I$1 = i10;
            this.Z$0 = zIsFileExists;
            this.I$2 = i12;
            this.label = 1;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            int i14 = i12;
            i8 = i10;
            z6 = zIsFileExists;
            i9 = i14;
        }
        if (i10 < i7) {
            MainCoroutineDispatcher mainCoroutineDispatcher = gA0.a.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, this.this$0, this.$isSkipTranscode, null);
            this.label = 2;
            if (BuildersKt.withContext(mainCoroutineDispatcher, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            File file2 = new File(this.this$0.f108779a.getOutputFilePath());
            g gVar3 = this.this$0;
            OA0.b.c(gVar3, androidx.core.content.c.b(file2.length(), "montage compile success path is ", gVar3.f108779a.getOutputFilePath(), ", len="));
            return Unit.INSTANCE;
        }
        if (!z6) {
            MainCoroutineDispatcher mainCoroutineDispatcher2 = gA0.a.b;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$callback, this.this$0, null);
            this.label = 3;
            if (BuildersKt.withContext(mainCoroutineDispatcher2, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            OA0.b.b(this.this$0, "montage compile products file no existent");
            return Unit.INSTANCE;
        }
        if (i9 == 0) {
            MainCoroutineDispatcher mainCoroutineDispatcher3 = gA0.a.b;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$callback, this.this$0, null);
            this.label = 4;
            if (BuildersKt.withContext(mainCoroutineDispatcher3, anonymousClass3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            OA0.b.b(this.this$0, "montage compile products duration invalid");
            return Unit.INSTANCE;
        }
        MainCoroutineDispatcher mainCoroutineDispatcher4 = gA0.a.b;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$callback, null);
        this.label = 5;
        if (BuildersKt.withContext(mainCoroutineDispatcher4, anonymousClass4, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        OA0.b.b(this.this$0, "montage compile products unknown fail");
        return Unit.INSTANCE;
    }
}
