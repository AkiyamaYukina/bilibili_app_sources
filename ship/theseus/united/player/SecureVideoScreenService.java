package com.bilibili.ship.theseus.united.player;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.ArcConf;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/SecureVideoScreenService.class */
@StabilityInferred(parameters = 1)
public final class SecureVideoScreenService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.SecureVideoScreenService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/SecureVideoScreenService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Activity $activity;
        final PlayViewUniteReply $playViewUniteReply;
        final IRenderContainerService $renderContainerService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayViewUniteReply playViewUniteReply, IRenderContainerService iRenderContainerService, Activity activity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playViewUniteReply = playViewUniteReply;
            this.$renderContainerService = iRenderContainerService;
            this.$activity = activity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playViewUniteReply, this.$renderContainerService, this.$activity, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                try {
                    if (i7 != 0) {
                        if (i7 == 1) {
                            ResultKt.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        }
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    ResultKt.throwOnFailure(obj);
                    ArcConf arcConf = (ArcConf) this.$playViewUniteReply.getPlayArcConf().getArcConfsMap().get(Boxing.boxInt(38));
                    boolean z6 = (arcConf == null || arcConf.getIsSupport()) ? false : true;
                    if (this.$renderContainerService.enableSecureVideoScreen()) {
                        this.$renderContainerService.secureVideoScreen(z6);
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    }
                    if (!z6) {
                        return Unit.INSTANCE;
                    }
                    this.$activity.getWindow().addFlags(8192);
                    this.label = 2;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    this.$activity.getWindow().clearFlags(8192);
                    throw th;
                }
            } catch (Throwable th2) {
                this.$renderContainerService.secureVideoScreen(false);
                throw th2;
            }
        }
    }

    @Inject
    public SecureVideoScreenService(@NotNull IRenderContainerService iRenderContainerService, @NotNull PlayViewUniteReply playViewUniteReply, @NotNull CoroutineScope coroutineScope, @NotNull Activity activity) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(playViewUniteReply, iRenderContainerService, activity, null), 3, (Object) null);
    }
}
