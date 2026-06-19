package com.bilibili.ship.theseus.united.page.videopiece;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.danmaku.postpanel.DanmakuTimerService;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/DanmakuTimerDelegateService.class */
@StabilityInferred(parameters = 1)
public final class DanmakuTimerDelegateService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.DanmakuTimerDelegateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/DanmakuTimerDelegateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final DanmakuTimerService $danmakuTimerService;
        final VideoPieceProgressRepository $videoPieceProgressRepository;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.DanmakuTimerDelegateService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/DanmakuTimerDelegateService$1$a.class */
        public static final class a implements com.bilibili.playerbizcommonv2.danmaku.postpanel.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StateFlow f103671a;

            public a(VideoPieceProgressRepository videoPieceProgressRepository) {
                this.f103671a = videoPieceProgressRepository.f103678c;
            }

            @Override // com.bilibili.playerbizcommonv2.danmaku.postpanel.a
            public final StateFlow a() {
                return this.f103671a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DanmakuTimerService danmakuTimerService, VideoPieceProgressRepository videoPieceProgressRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$danmakuTimerService = danmakuTimerService;
            this.$videoPieceProgressRepository = videoPieceProgressRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$danmakuTimerService, this.$videoPieceProgressRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$danmakuTimerService.f81218j = new a(this.$videoPieceProgressRepository);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.$danmakuTimerService.f81218j = null;
                throw th;
            }
        }
    }

    @Inject
    public DanmakuTimerDelegateService(@NotNull CoroutineScope coroutineScope, @NotNull VideoPieceProgressRepository videoPieceProgressRepository, @NotNull DanmakuTimerService danmakuTimerService) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(danmakuTimerService, videoPieceProgressRepository, null), 3, (Object) null);
    }
}
