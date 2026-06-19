package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import Vn.A;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6354p;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createFineComponent$1.class */
final class UgcSeasonService$createFineComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<a> $bindView;
    final Ref.ObjectRef<C6355q> $currentEpisode;
    final Ref.IntRef $currentEpisodeIndex;
    final Ref.ObjectRef<Z> $currentSection;
    final Ref.IntRef $currentSectionIndex;
    final Ref.ObjectRef<C6353o> $data;
    final C6353o $seasonData;
    int label;
    final UgcSeasonService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$createFineComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createFineComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<a> $bindView;
        final Ref.ObjectRef<C6355q> $currentEpisode;
        final Ref.IntRef $currentEpisodeIndex;
        final Ref.ObjectRef<Z> $currentSection;
        final Ref.IntRef $currentSectionIndex;
        final Ref.ObjectRef<C6353o> $data;
        final C6353o $seasonData;
        private Object L$0;
        int label;
        final UgcSeasonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$createFineComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createFineComponent$1$1$1.class */
        public static final class C08661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<a> $bindView;
            final Ref.ObjectRef<C6355q> $currentEpisode;
            final Ref.IntRef $currentEpisodeIndex;
            final Ref.ObjectRef<Z> $currentSection;
            final Ref.IntRef $currentSectionIndex;
            final Ref.ObjectRef<C6353o> $data;
            int label;
            final UgcSeasonService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$createFineComponent$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createFineComponent$1$1$1$1.class */
            public static final class C08671 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<a> $bindView;
                final Ref.ObjectRef<C6355q> $currentEpisode;
                final Ref.IntRef $currentEpisodeIndex;
                final Ref.ObjectRef<Z> $currentSection;
                final Ref.IntRef $currentSectionIndex;
                final Ref.ObjectRef<C6353o> $data;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08671(Ref.ObjectRef<C6355q> objectRef, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.ObjectRef<Z> objectRef2, Ref.ObjectRef<a> objectRef3, Ref.ObjectRef<C6353o> objectRef4, Continuation<? super C08671> continuation) {
                    super(2, continuation);
                    this.$currentEpisode = objectRef;
                    this.$currentSectionIndex = intRef;
                    this.$currentEpisodeIndex = intRef2;
                    this.$currentSection = objectRef2;
                    this.$bindView = objectRef3;
                    this.$data = objectRef4;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08671 c08671 = new C08671(this.$currentEpisode, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$bindView, this.$data, continuation);
                    c08671.L$0 = obj;
                    return c08671;
                }

                public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                    return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    C7893a.C1318a.C1319a c1319a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                    if (c1318a == null || (c1319a = c1318a.f123395a) == null) {
                        return Unit.INSTANCE;
                    }
                    Ref.ObjectRef<C6355q> objectRef = this.$currentEpisode;
                    C6355q c6355q = (C6355q) objectRef.element;
                    long j7 = c1319a.f123397a;
                    if (c6355q != null && c6355q.f101682b == j7) {
                        BLog.i("UgcSeasonService$createFineComponent$1$1$1$1-invokeSuspend", "[theseus-ugc-UgcSeasonService$createFineComponent$1$1$1$1-invokeSuspend] current episode is the same");
                        return Unit.INSTANCE;
                    }
                    UgcSeasonService$createFineComponent$1.invokeSuspend$updateEpisode(this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, objectRef, this.$data, j7);
                    int i7 = this.$currentSectionIndex.element;
                    int i8 = this.$currentEpisodeIndex.element;
                    C6355q c6355q2 = (C6355q) this.$currentEpisode.element;
                    Long lBoxLong = null;
                    Long lBoxLong2 = c6355q2 != null ? Boxing.boxLong(c6355q2.f101682b) : null;
                    Z z6 = (Z) this.$currentSection.element;
                    if (z6 != null) {
                        lBoxLong = Boxing.boxLong(z6.f101645a);
                    }
                    StringBuilder sbB = A.b(i7, i8, "update current episode, sectionIndex:", " episodeIndex:", " avid:");
                    sbB.append(lBoxLong2);
                    sbB.append(" playingAvid:");
                    sbB.append(j7);
                    sbB.append(" SectionId:");
                    sbB.append(lBoxLong);
                    defpackage.a.b("[theseus-ugc-UgcSeasonService$createFineComponent$1$1$1$1-invokeSuspend] ", sbB.toString(), "UgcSeasonService$createFineComponent$1$1$1$1-invokeSuspend");
                    a aVar = (a) this.$bindView.element;
                    if (aVar != null) {
                        aVar.a();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08661(UgcSeasonService ugcSeasonService, Ref.ObjectRef<C6355q> objectRef, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.ObjectRef<Z> objectRef2, Ref.ObjectRef<a> objectRef3, Ref.ObjectRef<C6353o> objectRef4, Continuation<? super C08661> continuation) {
                super(2, continuation);
                this.this$0 = ugcSeasonService;
                this.$currentEpisode = objectRef;
                this.$currentSectionIndex = intRef;
                this.$currentEpisodeIndex = intRef2;
                this.$currentSection = objectRef2;
                this.$bindView = objectRef3;
                this.$data = objectRef4;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08661(this.this$0, this.$currentEpisode, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$bindView, this.$data, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<C7893a.C1318a> stateFlow = this.this$0.f97455d.f123393f;
                    C08671 c08671 = new C08671(this.$currentEpisode, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$bindView, this.$data, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c08671, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$createFineComponent$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createFineComponent$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<a> $bindView;
            final Ref.ObjectRef<C6355q> $currentEpisode;
            final Ref.IntRef $currentEpisodeIndex;
            final Ref.ObjectRef<Z> $currentSection;
            final Ref.IntRef $currentSectionIndex;
            final Ref.ObjectRef<C6353o> $data;
            final C6353o $seasonData;
            int label;
            final UgcSeasonService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$createFineComponent$1$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createFineComponent$1$1$2$1.class */
            public static final class C08681 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<a> $bindView;
                final Ref.ObjectRef<C6355q> $currentEpisode;
                final Ref.IntRef $currentEpisodeIndex;
                final Ref.ObjectRef<Z> $currentSection;
                final Ref.IntRef $currentSectionIndex;
                final Ref.ObjectRef<C6353o> $data;
                final C6353o $seasonData;
                boolean Z$0;
                int label;
                final UgcSeasonService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08681(Ref.ObjectRef<C6353o> objectRef, C6353o c6353o, UgcSeasonService ugcSeasonService, Ref.ObjectRef<a> objectRef2, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.ObjectRef<Z> objectRef3, Ref.ObjectRef<C6355q> objectRef4, Continuation<? super C08681> continuation) {
                    super(2, continuation);
                    this.$data = objectRef;
                    this.$seasonData = c6353o;
                    this.this$0 = ugcSeasonService;
                    this.$bindView = objectRef2;
                    this.$currentSectionIndex = intRef;
                    this.$currentEpisodeIndex = intRef2;
                    this.$currentSection = objectRef3;
                    this.$currentEpisode = objectRef4;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08681 c08681 = new C08681(this.$data, this.$seasonData, this.this$0, this.$bindView, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$currentEpisode, continuation);
                    c08681.Z$0 = ((Boolean) obj).booleanValue();
                    return c08681;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z6 = this.Z$0;
                    this.$data.element = z6 ? C6354p.a(this.$seasonData) : this.$seasonData;
                    UgcSeasonService$createFineComponent$1.invokeSuspend$updateEpisode(this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$currentEpisode, this.$data, this.this$0.f97454c.a());
                    a aVar = (a) this.$bindView.element;
                    if (aVar != null) {
                        aVar.a();
                    }
                    a aVar2 = (a) this.$bindView.element;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UgcSeasonService ugcSeasonService, Ref.ObjectRef<C6353o> objectRef, C6353o c6353o, Ref.ObjectRef<a> objectRef2, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.ObjectRef<Z> objectRef3, Ref.ObjectRef<C6355q> objectRef4, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ugcSeasonService;
                this.$data = objectRef;
                this.$seasonData = c6353o;
                this.$bindView = objectRef2;
                this.$currentSectionIndex = intRef;
                this.$currentEpisodeIndex = intRef2;
                this.$currentSection = objectRef3;
                this.$currentEpisode = objectRef4;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$data, this.$seasonData, this.$bindView, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$currentEpisode, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcSeasonService ugcSeasonService = this.this$0;
                    MutableStateFlow mutableStateFlow = ugcSeasonService.h.f101701b;
                    C08681 c08681 = new C08681(this.$data, this.$seasonData, ugcSeasonService, this.$bindView, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$currentEpisode, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, c08681, this) == coroutine_suspended) {
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
        public AnonymousClass1(UgcSeasonService ugcSeasonService, Ref.ObjectRef<C6355q> objectRef, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.ObjectRef<Z> objectRef2, Ref.ObjectRef<a> objectRef3, Ref.ObjectRef<C6353o> objectRef4, C6353o c6353o, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcSeasonService;
            this.$currentEpisode = objectRef;
            this.$currentSectionIndex = intRef;
            this.$currentEpisodeIndex = intRef2;
            this.$currentSection = objectRef2;
            this.$bindView = objectRef3;
            this.$data = objectRef4;
            this.$seasonData = c6353o;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$currentEpisode, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$bindView, this.$data, this.$seasonData, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08661(this.this$0, this.$currentEpisode, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$bindView, this.$data, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$data, this.$seasonData, this.$bindView, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$currentEpisode, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcSeasonService$createFineComponent$1(UgcSeasonService ugcSeasonService, Ref.ObjectRef<C6355q> objectRef, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.ObjectRef<Z> objectRef2, Ref.ObjectRef<a> objectRef3, Ref.ObjectRef<C6353o> objectRef4, C6353o c6353o, Continuation<? super UgcSeasonService$createFineComponent$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcSeasonService;
        this.$currentEpisode = objectRef;
        this.$currentSectionIndex = intRef;
        this.$currentEpisodeIndex = intRef2;
        this.$currentSection = objectRef2;
        this.$bindView = objectRef3;
        this.$data = objectRef4;
        this.$seasonData = c6353o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$updateEpisode(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.ObjectRef<Z> objectRef, Ref.ObjectRef<C6355q> objectRef2, Ref.ObjectRef<C6353o> objectRef3, long j7) {
        intRef.element = 0;
        intRef2.element = 0;
        objectRef.element = null;
        objectRef2.element = null;
        int i7 = 0;
        for (Z z6 : ((C6353o) objectRef3.element).h) {
            int i8 = 0;
            for (C6355q c6355q : z6.f101648d) {
                if (c6355q.f101682b == j7) {
                    intRef2.element = i8;
                    intRef.element = i7;
                    objectRef.element = z6;
                    objectRef2.element = c6355q;
                    return;
                }
                i8++;
            }
            i7++;
        }
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcSeasonService$createFineComponent$1(this.this$0, this.$currentEpisode, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$bindView, this.$data, this.$seasonData, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$currentEpisode, this.$currentSectionIndex, this.$currentEpisodeIndex, this.$currentSection, this.$bindView, this.$data, this.$seasonData, null);
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
