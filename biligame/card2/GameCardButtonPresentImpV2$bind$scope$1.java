package com.bilibili.biligame.card2;

import com.bilibili.biligame.card.config.GameCardButtonConfig;
import com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean;
import com.bilibili.biligame.card.newcard.present.GameButtonLoadDataState;
import com.bilibili.game.service.util.DownloadUtilsBase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$bind$scope$1.class */
public final class GameCardButtonPresentImpV2$bind$scope$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final GameCardButtonConfig $gameButtonConfig;
    private Object L$0;
    int label;
    final GameCardButtonPresentImpV2 this$0;

    /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$bind$scope$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$bind$scope$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final GameCardButtonConfig $gameButtonConfig;
        private Object L$0;
        int label;
        final GameCardButtonPresentImpV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2, GameCardButtonConfig gameCardButtonConfig, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = gameCardButtonPresentImpV2;
            this.$gameButtonConfig = gameCardButtonConfig;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$gameButtonConfig, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 376
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$bind$scope$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$bind$scope$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$bind$scope$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final GameCardButtonPresentImpV2 this$0;

        /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$bind$scope$1$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$bind$scope$1$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final GameCardButtonPresentImpV2 f62885a;

            public a(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2) {
                this.f62885a = gameCardButtonPresentImpV2;
            }

            public final Object emit(Object obj, Continuation continuation) {
                GameCardButtonPresentImpV2 gameCardButtonPresentImpV2 = this.f62885a;
                gameCardButtonPresentImpV2.f62879p = (String) obj;
                gameCardButtonPresentImpV2.c();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = gameCardButtonPresentImpV2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f62868d.u);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlowAsStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$bind$scope$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$bind$scope$1$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final GameCardButtonPresentImpV2 this$0;

        /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$bind$scope$1$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$bind$scope$1$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final GameCardButtonPresentImpV2 f62886a;

            public a(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2) {
                this.f62886a = gameCardButtonPresentImpV2;
            }

            public final Object emit(Object obj, Continuation continuation) {
                GameButtonLoadDataState gameButtonLoadDataState = (GameButtonLoadDataState) obj;
                GameCardButtonPresentImpV2 gameCardButtonPresentImpV2 = this.f62886a;
                gameCardButtonPresentImpV2.f62871g = gameButtonLoadDataState;
                if (gameButtonLoadDataState instanceof GameButtonLoadDataState.Complete) {
                    Iterator it = ((ArrayList) gameCardButtonPresentImpV2.f62882s).iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                    ((ArrayList) gameCardButtonPresentImpV2.f62882s).clear();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = gameCardButtonPresentImpV2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<GameButtonLoadDataState> loadDataState = this.this$0.getLoadDataState();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (loadDataState.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$bind$scope$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$bind$scope$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final GameCardButtonPresentImpV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = gameCardButtonPresentImpV2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
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
                    this.this$0.attach();
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
                GameCardButtonPresentImpV2 gameCardButtonPresentImpV2 = this.this$0;
                gameCardButtonPresentImpV2.f62881r = null;
                gameCardButtonPresentImpV2.f62878o = null;
                gameCardButtonPresentImpV2.detach();
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCardButtonPresentImpV2$bind$scope$1(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2, GameCardButtonConfig gameCardButtonConfig, Continuation<? super GameCardButtonPresentImpV2$bind$scope$1> continuation) {
        super(2, continuation);
        this.this$0 = gameCardButtonPresentImpV2;
        this.$gameButtonConfig = gameCardButtonConfig;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GameCardButtonPresentImpV2$bind$scope$1 gameCardButtonPresentImpV2$bind$scope$1 = new GameCardButtonPresentImpV2$bind$scope$1(this.this$0, this.$gameButtonConfig, continuation);
        gameCardButtonPresentImpV2$bind$scope$1.L$0 = obj;
        return gameCardButtonPresentImpV2$bind$scope$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            this.this$0.f62873j = this.$gameButtonConfig.getChannelId();
            this.this$0.f62874k = this.$gameButtonConfig.getChannelExtra();
            this.this$0.h = this.$gameButtonConfig.getData();
            GameCardButtonPresentImpV2 gameCardButtonPresentImpV2 = this.this$0;
            BiliGameCardDataBean biliGameCardDataBean = gameCardButtonPresentImpV2.h;
            if (biliGameCardDataBean == null) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(gameCardButtonPresentImpV2, this.$gameButtonConfig, null), 3, (Object) null);
            } else {
                gameCardButtonPresentImpV2.f62877n = DownloadUtilsBase.isApkInstalled(gameCardButtonPresentImpV2.f62865a, biliGameCardDataBean != null ? biliGameCardDataBean.getAndroidPkgName() : null);
                this.this$0.f62868d.start(this.$gameButtonConfig);
                this.this$0.c();
                MutableStateFlow<GameButtonLoadDataState> mutableStateFlow = this.this$0.f62870f;
                GameButtonLoadDataState.Complete complete = GameButtonLoadDataState.Complete.INSTANCE;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (mutableStateFlow.emit(complete, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
    }
}
