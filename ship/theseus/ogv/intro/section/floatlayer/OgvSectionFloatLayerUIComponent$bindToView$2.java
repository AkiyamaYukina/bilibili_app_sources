package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.o;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import zu0.c1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerUIComponent$bindToView$2.class */
final class OgvSectionFloatLayerUIComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final c1 $binding;
    final o.a<UIComponent.ViewEntry> $viewEntry;
    private Object L$0;
    int label;
    final o<UIComponent.ViewEntry> this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerUIComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerUIComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final o.a<UIComponent.ViewEntry> $viewEntry;
        int label;
        final o<UIComponent.ViewEntry> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o<UIComponent.ViewEntry> oVar, o.a<UIComponent.ViewEntry> aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oVar;
            this.$viewEntry = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$viewEntry, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                com.bilibili.ship.theseus.ogv.intro.section.ui.u uVar = this.this$0.f93685b;
                if (uVar != null) {
                    com.bilibili.app.gemini.ui.d dVar = this.$viewEntry.f93690b;
                    this.label = 1;
                    if (uVar.c(dVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerUIComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerUIComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final c1 $binding;
        int label;
        final o<UIComponent.ViewEntry> this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerUIComponent$bindToView$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerUIComponent$bindToView$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends UIComponent<?>>, Continuation<? super Unit>, Object> {
            final c1 $binding;
            Object L$0;
            int label;
            final o<UIComponent.ViewEntry> this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerUIComponent$bindToView$2$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerUIComponent$bindToView$2$2$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final List<UIComponent<?>> f93635a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final o<UIComponent.ViewEntry> f93636b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final c1 f93637c;

                public a(List<? extends UIComponent<?>> list, o<UIComponent.ViewEntry> oVar, c1 c1Var) {
                    this.f93635a = list;
                    this.f93636b = oVar;
                    this.f93637c = c1Var;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    Unit unit;
                    Long l7;
                    OgvEpisode ogvEpisode = (OgvEpisode) obj;
                    if (ogvEpisode == null) {
                        unit = Unit.INSTANCE;
                    } else {
                        Iterator<UIComponent<?>> it = this.f93635a.iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i7 = -1;
                                break;
                            }
                            com.bilibili.ship.theseus.ogv.intro.section.ui.l lVar = (UIComponent) it.next();
                            if ((lVar instanceof com.bilibili.ship.theseus.ogv.intro.section.ui.l) && (l7 = lVar.a().f93840d) != null) {
                                if (ogvEpisode.f93555a == l7.longValue()) {
                                    break;
                                }
                            }
                            i7++;
                        }
                        if (i7 != -1) {
                            o.b bVar = this.f93636b.f93684a;
                            Pair<Integer, Integer> pair = new Pair<>(Boxing.boxInt(i7), Boxing.boxInt((int) Uj0.c.a(48, this.f93637c.getRoot().getContext())));
                            if (!Intrinsics.areEqual(pair, bVar.f93697f)) {
                                bVar.f93697f = pair;
                                bVar.notifyPropertyChanged(528);
                            }
                        }
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(c1 c1Var, o<UIComponent.ViewEntry> oVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c1Var;
                this.this$0 = oVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(List<? extends UIComponent<?>> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.L$0;
                    this.$binding.f130656E.getAdapter().N(list);
                    o<UIComponent.ViewEntry> oVar = this.this$0;
                    OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = oVar.f93686c;
                    a aVar = new a(list, oVar, this.$binding);
                    this.label = 1;
                    if (ogvCurrentEpisodeRepository$special$$inlined$map$1.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass2(o<UIComponent.ViewEntry> oVar, c1 c1Var, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = oVar;
            this.$binding = c1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                o<UIComponent.ViewEntry> oVar = this.this$0;
                MutableStateFlow mutableStateFlow = oVar.f93684a.f93693b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, oVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerUIComponent$bindToView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerUIComponent$bindToView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final c1 $binding;
        int label;
        final o<UIComponent.ViewEntry> this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerUIComponent$bindToView$2$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerUIComponent$bindToView$2$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c1 f93638a;

            public a(c1 c1Var) {
                this.f93638a = c1Var;
            }

            public final Object emit(Object obj, Continuation continuation) {
                WindowSizeClass windowSizeClass = (WindowSizeClass) obj;
                c1 c1Var = this.f93638a;
                ((GridLayoutManager) c1Var.f130656E.getLayoutManager()).setSpanSizeLookup(new p(c1Var.f130656E.getAdapter(), com.bilibili.ship.theseus.united.page.screensize.b.c(windowSizeClass) || com.bilibili.ship.theseus.united.page.screensize.b.b(windowSizeClass)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(o<UIComponent.ViewEntry> oVar, c1 c1Var, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = oVar;
            this.$binding = c1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$binding, continuation);
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
                StateFlow<WindowSizeClass> stateFlow = this.this$0.f93687d;
                a aVar = new a(this.$binding);
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
    public OgvSectionFloatLayerUIComponent$bindToView$2(o<UIComponent.ViewEntry> oVar, o.a<UIComponent.ViewEntry> aVar, c1 c1Var, Continuation<? super OgvSectionFloatLayerUIComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.this$0 = oVar;
        this.$viewEntry = aVar;
        this.$binding = c1Var;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvSectionFloatLayerUIComponent$bindToView$2 ogvSectionFloatLayerUIComponent$bindToView$2 = new OgvSectionFloatLayerUIComponent$bindToView$2(this.this$0, this.$viewEntry, this.$binding, continuation);
        ogvSectionFloatLayerUIComponent$bindToView$2.L$0 = obj;
        return ogvSectionFloatLayerUIComponent$bindToView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$viewEntry, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
