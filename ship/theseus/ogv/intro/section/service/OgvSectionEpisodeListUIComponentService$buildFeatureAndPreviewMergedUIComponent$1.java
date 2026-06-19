package com.bilibili.ship.theseus.ogv.intro.section.service;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.intro.section.ui.m;
import com.bilibili.ship.theseus.ogv.intro.section.ui.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1.class */
final class OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final ArrayList<UIComponent<?>> $mergedUIComponentList;
    final n.a $mergedVm;
    int label;
    final e this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ArrayList<UIComponent<?>> $mergedUIComponentList;
        final n.a $mergedVm;
        private Object L$0;
        int label;
        final e this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1$1$1.class */
        public static final class C07201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final ArrayList<UIComponent<?>> $mergedUIComponentList;
            final n.a $mergedVm;
            int label;
            final e this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1$1$1$1.class */
            public static final class C07211 extends SuspendLambda implements Function2<OgvEpisode, Continuation<? super Unit>, Object> {
                final ArrayList<UIComponent<?>> $mergedUIComponentList;
                final n.a $mergedVm;
                Object L$0;
                int label;
                final e this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07211(ArrayList<UIComponent<?>> arrayList, n.a aVar, e eVar, Continuation<? super C07211> continuation) {
                    super(2, continuation);
                    this.$mergedUIComponentList = arrayList;
                    this.$mergedVm = aVar;
                    this.this$0 = eVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07211 c07211 = new C07211(this.$mergedUIComponentList, this.$mergedVm, this.this$0, continuation);
                    c07211.L$0 = obj;
                    return c07211;
                }

                public final Object invoke(OgvEpisode ogvEpisode, Continuation<? super Unit> continuation) {
                    return create(ogvEpisode, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Long l7;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OgvEpisode ogvEpisode = (OgvEpisode) this.L$0;
                    if (ogvEpisode == null) {
                        return Unit.INSTANCE;
                    }
                    ArrayList<UIComponent<?>> arrayList = this.$mergedUIComponentList;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.bilibili.ship.theseus.ogv.intro.section.ui.l lVar = (UIComponent) it.next();
                        m mVarA = null;
                        com.bilibili.ship.theseus.ogv.intro.section.ui.l lVar2 = lVar instanceof com.bilibili.ship.theseus.ogv.intro.section.ui.l ? lVar : null;
                        if (lVar2 != null) {
                            mVarA = lVar2.a();
                        }
                        arrayList2.add(mVarA);
                    }
                    Iterator it2 = arrayList2.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i7 = -1;
                            break;
                        }
                        m mVar = (m) it2.next();
                        if (mVar != null && (l7 = mVar.f93840d) != null) {
                            if (ogvEpisode.f93555a == l7.longValue()) {
                                break;
                            }
                        }
                        i7++;
                    }
                    if (i7 != -1) {
                        n.a aVar = this.$mergedVm;
                        Jj0.h hVar = new Jj0.h();
                        e eVar = this.this$0;
                        hVar.f11485a = i7;
                        hVar.f11486b = (int) Uj0.c.a(48, eVar.f93789e);
                        if (!Intrinsics.areEqual(hVar, aVar.f93863a)) {
                            aVar.f93863a = hVar;
                            aVar.notifyPropertyChanged(530);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07201(e eVar, ArrayList<UIComponent<?>> arrayList, n.a aVar, Continuation<? super C07201> continuation) {
                super(2, continuation);
                this.this$0 = eVar;
                this.$mergedUIComponentList = arrayList;
                this.$mergedVm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07201(this.this$0, this.$mergedUIComponentList, this.$mergedVm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    e eVar = this.this$0;
                    OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = eVar.f93787c.f92119v;
                    C07211 c07211 = new C07211(this.$mergedUIComponentList, this.$mergedVm, eVar, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(ogvCurrentEpisodeRepository$special$$inlined$map$1, c07211, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final n.a $mergedVm;
            int label;
            final e this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final n.a f93772a;

                public a(n.a aVar) {
                    this.f93772a = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    n.a aVar = this.f93772a;
                    if (iIntValue != aVar.f93864b) {
                        aVar.f93864b = iIntValue;
                        aVar.notifyPropertyChanged(285);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(e eVar, n.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = eVar;
                this.$mergedVm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$mergedVm, continuation);
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
                    StateFlow<Integer> stateFlow = this.this$0.f93788d.f100020a;
                    a aVar = new a(this.$mergedVm);
                    this.label = 1;
                    if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(e eVar, ArrayList<UIComponent<?>> arrayList, n.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$mergedUIComponentList = arrayList;
            this.$mergedVm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$mergedUIComponentList, this.$mergedVm, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07201(this.this$0, this.$mergedUIComponentList, this.$mergedVm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$mergedVm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1(e eVar, ArrayList<UIComponent<?>> arrayList, n.a aVar, Continuation<? super OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1> continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$mergedUIComponentList = arrayList;
        this.$mergedVm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1(this.this$0, this.$mergedUIComponentList, this.$mergedVm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$mergedUIComponentList, this.$mergedVm, null);
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
