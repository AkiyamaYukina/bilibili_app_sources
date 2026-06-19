package com.bilibili.ship.theseus.ogv.intro.section.service;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewEpisodeUIComponentService$create$1.class */
public final class OgvPreviewEpisodeUIComponentService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final RunningUIComponent $episodeListRunningUIComponent;
    final RunningUIComponent $sectionTitleRunningUIComponent;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewEpisodeUIComponentService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewEpisodeUIComponentService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RunningUIComponent $episodeListRunningUIComponent;
        final RunningUIComponent $sectionTitleRunningUIComponent;
        private Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewEpisodeUIComponentService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewEpisodeUIComponentService$create$1$1$1.class */
        public static final class C07121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final RunningUIComponent $sectionTitleRunningUIComponent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07121(RunningUIComponent runningUIComponent, Continuation<? super C07121> continuation) {
                super(2, continuation);
                this.$sectionTitleRunningUIComponent = runningUIComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07121(this.$sectionTitleRunningUIComponent, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    RunningUIComponent runningUIComponent = this.$sectionTitleRunningUIComponent;
                    this.label = 1;
                    if (runningUIComponent.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewEpisodeUIComponentService$create$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewEpisodeUIComponentService$create$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final RunningUIComponent $episodeListRunningUIComponent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RunningUIComponent runningUIComponent, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$episodeListRunningUIComponent = runningUIComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$episodeListRunningUIComponent, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    RunningUIComponent runningUIComponent = this.$episodeListRunningUIComponent;
                    this.label = 1;
                    if (runningUIComponent.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RunningUIComponent runningUIComponent, RunningUIComponent runningUIComponent2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sectionTitleRunningUIComponent = runningUIComponent;
            this.$episodeListRunningUIComponent = runningUIComponent2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sectionTitleRunningUIComponent, this.$episodeListRunningUIComponent, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07121(this.$sectionTitleRunningUIComponent, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$episodeListRunningUIComponent, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPreviewEpisodeUIComponentService$create$1(RunningUIComponent runningUIComponent, RunningUIComponent runningUIComponent2, Continuation<? super OgvPreviewEpisodeUIComponentService$create$1> continuation) {
        super(1, continuation);
        this.$sectionTitleRunningUIComponent = runningUIComponent;
        this.$episodeListRunningUIComponent = runningUIComponent2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvPreviewEpisodeUIComponentService$create$1(this.$sectionTitleRunningUIComponent, this.$episodeListRunningUIComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sectionTitleRunningUIComponent, this.$episodeListRunningUIComponent, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
