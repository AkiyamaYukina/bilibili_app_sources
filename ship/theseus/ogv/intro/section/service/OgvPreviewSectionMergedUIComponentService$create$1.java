package com.bilibili.ship.theseus.ogv.intro.section.service;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import java.util.List;
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
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$create$1.class */
public final class OgvPreviewSectionMergedUIComponentService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final RunningUIComponent $episodeListRunningUIComponent;
    final List<Hu0.c> $previewRelatedToFeature;
    final List<EpisodeSection> $sections;
    final RunningUIComponent $titlesRunningUIComponent;
    int label;
    final OgvPreviewSectionMergedUIComponentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RunningUIComponent $episodeListRunningUIComponent;
        final List<Hu0.c> $previewRelatedToFeature;
        final List<EpisodeSection> $sections;
        final RunningUIComponent $titlesRunningUIComponent;
        private Object L$0;
        int label;
        final OgvPreviewSectionMergedUIComponentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$create$1$1$1.class */
        public static final class C07171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final RunningUIComponent $episodeListRunningUIComponent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07171(RunningUIComponent runningUIComponent, Continuation<? super C07171> continuation) {
                super(2, continuation);
                this.$episodeListRunningUIComponent = runningUIComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07171(this.$episodeListRunningUIComponent, continuation);
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$create$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$create$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final RunningUIComponent $titlesRunningUIComponent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RunningUIComponent runningUIComponent, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$titlesRunningUIComponent = runningUIComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$titlesRunningUIComponent, continuation);
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
                    RunningUIComponent runningUIComponent = this.$titlesRunningUIComponent;
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$create$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$create$1$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final List<Hu0.c> $previewRelatedToFeature;
            final List<EpisodeSection> $sections;
            int label;
            final OgvPreviewSectionMergedUIComponentService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$create$1$1$3$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$create$1$1$3$1.class */
            public static final class C07181 extends SuspendLambda implements Function2<OgvEpisode, Continuation<? super Unit>, Object> {
                final List<Hu0.c> $previewRelatedToFeature;
                final List<EpisodeSection> $sections;
                Object L$0;
                int label;
                final OgvPreviewSectionMergedUIComponentService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07181(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, List<Hu0.c> list, List<EpisodeSection> list2, Continuation<? super C07181> continuation) {
                    super(2, continuation);
                    this.this$0 = ogvPreviewSectionMergedUIComponentService;
                    this.$previewRelatedToFeature = list;
                    this.$sections = list2;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07181 c07181 = new C07181(this.this$0, this.$previewRelatedToFeature, this.$sections, continuation);
                    c07181.L$0 = obj;
                    return c07181;
                }

                public final Object invoke(OgvEpisode ogvEpisode, Continuation<? super Unit> continuation) {
                    return create(ogvEpisode, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x0148  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        Method dump skipped, instruction units count: 467
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$create$1.AnonymousClass1.AnonymousClass3.C07181.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, List<Hu0.c> list, List<EpisodeSection> list2, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = ogvPreviewSectionMergedUIComponentService;
                this.$previewRelatedToFeature = list;
                this.$sections = list2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$previewRelatedToFeature, this.$sections, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = this.this$0;
                    OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = ogvPreviewSectionMergedUIComponentService.f93750c.f92119v;
                    C07181 c07181 = new C07181(ogvPreviewSectionMergedUIComponentService, this.$previewRelatedToFeature, this.$sections, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(ogvCurrentEpisodeRepository$special$$inlined$map$1, c07181, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RunningUIComponent runningUIComponent, RunningUIComponent runningUIComponent2, OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, List<Hu0.c> list, List<EpisodeSection> list2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$episodeListRunningUIComponent = runningUIComponent;
            this.$titlesRunningUIComponent = runningUIComponent2;
            this.this$0 = ogvPreviewSectionMergedUIComponentService;
            this.$previewRelatedToFeature = list;
            this.$sections = list2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$episodeListRunningUIComponent, this.$titlesRunningUIComponent, this.this$0, this.$previewRelatedToFeature, this.$sections, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07171(this.$episodeListRunningUIComponent, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$titlesRunningUIComponent, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$previewRelatedToFeature, this.$sections, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPreviewSectionMergedUIComponentService$create$1(RunningUIComponent runningUIComponent, RunningUIComponent runningUIComponent2, OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, List<Hu0.c> list, List<EpisodeSection> list2, Continuation<? super OgvPreviewSectionMergedUIComponentService$create$1> continuation) {
        super(1, continuation);
        this.$episodeListRunningUIComponent = runningUIComponent;
        this.$titlesRunningUIComponent = runningUIComponent2;
        this.this$0 = ogvPreviewSectionMergedUIComponentService;
        this.$previewRelatedToFeature = list;
        this.$sections = list2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvPreviewSectionMergedUIComponentService$create$1(this.$episodeListRunningUIComponent, this.$titlesRunningUIComponent, this.this$0, this.$previewRelatedToFeature, this.$sections, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$episodeListRunningUIComponent, this.$titlesRunningUIComponent, this.this$0, this.$previewRelatedToFeature, this.$sections, null);
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
