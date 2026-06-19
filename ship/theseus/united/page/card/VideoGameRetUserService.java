package com.bilibili.ship.theseus.united.page.card;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.videocard.GameRetUserCard;
import com.bilibili.ship.theseus.united.page.view.a;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/card/VideoGameRetUserService.class */
@StabilityInferred(parameters = 0)
public final class VideoGameRetUserService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f99079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f99081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f99082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f99083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public GameRetUserCard f99084f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.card.VideoGameRetUserService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/card/VideoGameRetUserService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final VideoGameRetUserService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.card.VideoGameRetUserService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/card/VideoGameRetUserService$1$1.class */
        public static final class C09491 extends SuspendLambda implements Function3<C7893a.C1318a, C7893a.C1318a, Continuation<? super C7893a.C1318a>, Object> {
            Object L$0;
            Object L$1;
            int label;
            final VideoGameRetUserService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09491(VideoGameRetUserService videoGameRetUserService, Continuation<? super C09491> continuation) {
                super(3, continuation);
                this.this$0 = videoGameRetUserService;
            }

            public final Object invoke(C7893a.C1318a c1318a, C7893a.C1318a c1318a2, Continuation<? super C7893a.C1318a> continuation) {
                C09491 c09491 = new C09491(this.this$0, continuation);
                c09491.L$0 = c1318a;
                c09491.L$1 = c1318a2;
                return c09491.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                C7893a.C1318a c1318a2 = (C7893a.C1318a) this.L$1;
                if (Intrinsics.areEqual(c1318a != null ? Boxing.boxLong(c1318a.f123395a.f123398b) : null, c1318a2 != null ? Boxing.boxLong(c1318a2.f123395a.f123398b) : null)) {
                    return c1318a2;
                }
                VideoGameRetUserService videoGameRetUserService = this.this$0;
                GameRetUserCard gameRetUserCard = videoGameRetUserService.f99084f;
                if (gameRetUserCard != null) {
                    gameRetUserCard.detach();
                }
                videoGameRetUserService.f99084f = null;
                return c1318a2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VideoGameRetUserService videoGameRetUserService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = videoGameRetUserService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                VideoGameRetUserService videoGameRetUserService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = videoGameRetUserService.f99083e.f123393f;
                C09491 c09491 = new C09491(videoGameRetUserService, null);
                this.label = 1;
                if (FlowKt.reduce(stateFlow, c09491, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.card.VideoGameRetUserService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/card/VideoGameRetUserService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final VideoGameRetUserService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VideoGameRetUserService videoGameRetUserService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = videoGameRetUserService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new VideoGameRetUserService$2$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public VideoGameRetUserService(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull a aVar, @NotNull C8043a c8043a, @NotNull C7893a c7893a) {
        this.f99079a = context;
        this.f99080b = coroutineScope;
        this.f99081c = aVar;
        this.f99082d = c8043a;
        this.f99083e = c7893a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
