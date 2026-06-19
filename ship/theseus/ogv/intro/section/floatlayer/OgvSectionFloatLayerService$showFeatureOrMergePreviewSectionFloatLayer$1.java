package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.h;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.o;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.u;
import com.bilibili.ship.theseus.ogv.intro.section.ui.u;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1.class */
public final class OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final u.a $caVm;
    final boolean $clickCalendar;
    final Hu0.b $data;
    final com.bilibili.ship.theseus.ogv.intro.section.ui.u $seasonListUIComponent;
    final Ref.ObjectRef<u.c> $seasonListVm;
    final boolean $shouldMergePreview;
    final o.b $vm;
    final h.a $wrapVm;
    private Object L$0;
    Object L$1;
    int label;
    final OgvSectionFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Hu0.b $data;
        final boolean $shouldMergePreview;
        final o.b $vm;
        final h.a $wrapVm;
        int label;
        final OgvSectionFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z6, Hu0.b bVar, OgvSectionFloatLayerService ogvSectionFloatLayerService, o.b bVar2, h.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$shouldMergePreview = z6;
            this.$data = bVar;
            this.this$0 = ogvSectionFloatLayerService;
            this.$vm = bVar2;
            this.$wrapVm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$shouldMergePreview, this.$data, this.this$0, this.$vm, this.$wrapVm, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            List<Hu0.c> list;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.$shouldMergePreview || (this.$data.f8794d.isEmpty() && ((list = this.$data.f8796f) == null || list.isEmpty()))) {
                OgvSectionFloatLayerService ogvSectionFloatLayerService = this.this$0;
                Hu0.b bVar = this.$data;
                ogvSectionFloatLayerService.d(bVar.f8792b, bVar.f8793c.f8799a, ogvSectionFloatLayerService.f93623e, this.$vm, this.$wrapVm);
            } else {
                ArrayList arrayList = new ArrayList();
                List<Hu0.c> list2 = this.$data.f8796f;
                if (list2 != null && !list2.isEmpty()) {
                    List<Hu0.c> list3 = this.$data.f8796f;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((Hu0.c) it.next()).f8798b);
                    }
                    arrayList.addAll(arrayList2);
                }
                arrayList.addAll(this.$data.f8794d);
                OgvSectionFloatLayerService ogvSectionFloatLayerService2 = this.this$0;
                Hu0.b bVar2 = this.$data;
                ogvSectionFloatLayerService2.c(bVar2.f8792b, arrayList, bVar2.f8795e, bVar2.f8793c.f8799a, ogvSectionFloatLayerService2.f93623e, this.$vm, this.$wrapVm);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final u.a $caVm;
        final o.b $vm;
        final h.a $wrapVm;
        int label;
        final OgvSectionFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
            final u.a $caVm;
            final o.b $vm;
            final h.a $wrapVm;
            long J$0;
            int label;
            final OgvSectionFloatLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvSectionFloatLayerService ogvSectionFloatLayerService, o.b bVar, h.a aVar, u.a aVar2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvSectionFloatLayerService;
                this.$vm = bVar;
                this.$wrapVm = aVar;
                this.$caVm = aVar2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, this.$wrapVm, this.$caVm, continuation);
                anonymousClass1.J$0 = ((Number) obj).longValue();
                return anonymousClass1;
            }

            public final Object invoke(long j7, Continuation<? super Unit> continuation) {
                return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j7 = this.J$0;
                    OgvSectionFloatLayerService ogvSectionFloatLayerService = this.this$0;
                    o.b bVar = this.$vm;
                    h.a aVar = this.$wrapVm;
                    u.a aVar2 = this.$caVm;
                    this.label = 1;
                    if (OgvSectionFloatLayerService.b(ogvSectionFloatLayerService, j7, bVar, aVar, aVar2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.$vm.n(false);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(o.b bVar, OgvSectionFloatLayerService ogvSectionFloatLayerService, h.a aVar, u.a aVar2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$vm = bVar;
            this.this$0 = ogvSectionFloatLayerService;
            this.$wrapVm = aVar;
            this.$caVm = aVar2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$vm, this.this$0, this.$wrapVm, this.$caVm, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                o.b bVar = this.$vm;
                MutableSharedFlow<Long> mutableSharedFlow = bVar.f93703m;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, bVar, this.$wrapVm, this.$caVm, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableSharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
        final Hu0.b $data;
        long J$0;
        int label;
        final OgvSectionFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(OgvSectionFloatLayerService ogvSectionFloatLayerService, Hu0.b bVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = ogvSectionFloatLayerService;
            this.$data = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$data, continuation);
            anonymousClass4.J$0 = ((Number) obj).longValue();
            return anonymousClass4;
        }

        public final Object invoke(long j7, Continuation<? super Unit> continuation) {
            return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long j7 = this.J$0;
            this.this$0.f93620b.getClass();
            boolean zO = Gu0.a.o(j7);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("click_status", zO ? "0" : "1");
            Map<String, String> map = this.$data.f8792b.f93532k;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            PageReportService.g(this.this$0.f93625g, "united.player-video-detail.episode.reverse.click", linkedHashMap, 4);
            boolean z6 = !zO;
            this.this$0.f93620b.p(j7, z6);
            this.this$0.f93629l.setValue(Boxing.boxBoolean(z6));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final o.b $vm;
        final h.a $wrapVm;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(o.b bVar, h.a aVar, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$vm = bVar;
            this.$wrapVm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$vm, this.$wrapVm, continuation);
            anonymousClass5.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass5;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int iNextIndex;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z6 = this.Z$0;
            o.b bVar = this.$vm;
            if (bVar.f93696e != z6) {
                MutableStateFlow<List<UIComponent<?>>> mutableStateFlow = bVar.f93692a;
                List list = (List) mutableStateFlow.getValue();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = -1;
                            break;
                        }
                        if (((UIComponent) it.next()) instanceof com.bilibili.ship.theseus.ogv.intro.section.ui.l) {
                            break;
                        }
                        i7++;
                    }
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iNextIndex = -1;
                            break;
                        }
                        if (((UIComponent) listIterator.previous()) instanceof com.bilibili.ship.theseus.ogv.intro.section.ui.l) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (i7 != -1 && iNextIndex != -1) {
                        ArrayList arrayList = new ArrayList(list);
                        CollectionsKt.reverse(arrayList.subList(i7, iNextIndex + 1));
                        if (z6 != bVar.f93696e) {
                            bVar.f93696e = z6;
                            bVar.notifyPropertyChanged(140);
                        }
                        mutableStateFlow.setValue(arrayList);
                    }
                }
            }
            h.a aVar = this.$wrapVm;
            boolean z7 = aVar.f93673g;
            if (z7 != z6 && z6 != z7) {
                aVar.f93673g = z6;
                aVar.notifyPropertyChanged(140);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<u.c> $seasonListVm;
        final o.b $vm;
        int label;
        final OgvSectionFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$6$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$6$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvSectionFloatLayerService f93630a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.ObjectRef<u.c> f93631b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o.b f93632c;

            public a(OgvSectionFloatLayerService ogvSectionFloatLayerService, Ref.ObjectRef<u.c> objectRef, o.b bVar) {
                this.f93630a = ogvSectionFloatLayerService;
                this.f93631b = objectRef;
                this.f93632c = bVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iA = com.bilibili.ship.theseus.united.page.intro.a.a((WindowSizeClass) obj, this.f93630a.f93628k.f(), 12);
                u.c cVar = (u.c) this.f93631b.element;
                if (cVar != null && iA != cVar.f93891b) {
                    cVar.f93891b = iA;
                    cVar.notifyPropertyChanged(285);
                }
                o.b bVar = this.f93632c;
                if (iA != bVar.f93702l) {
                    bVar.f93702l = iA;
                    bVar.notifyPropertyChanged(285);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(OgvSectionFloatLayerService ogvSectionFloatLayerService, Ref.ObjectRef<u.c> objectRef, o.b bVar, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = ogvSectionFloatLayerService;
            this.$seasonListVm = objectRef;
            this.$vm = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, this.$seasonListVm, this.$vm, continuation);
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
                OgvSectionFloatLayerService ogvSectionFloatLayerService = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = ogvSectionFloatLayerService.f93628k.f102939c;
                a aVar = new a(ogvSectionFloatLayerService, this.$seasonListVm, this.$vm);
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
    public OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1(OgvSectionFloatLayerService ogvSectionFloatLayerService, o.b bVar, Hu0.b bVar2, boolean z6, u.a aVar, h.a aVar2, com.bilibili.ship.theseus.ogv.intro.section.ui.u uVar, boolean z7, Ref.ObjectRef<u.c> objectRef, Continuation<? super OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvSectionFloatLayerService;
        this.$vm = bVar;
        this.$data = bVar2;
        this.$clickCalendar = z6;
        this.$caVm = aVar;
        this.$wrapVm = aVar2;
        this.$seasonListUIComponent = uVar;
        this.$shouldMergePreview = z7;
        this.$seasonListVm = objectRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope) {
        CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1 ogvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1 = new OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1(this.this$0, this.$vm, this.$data, this.$clickCalendar, this.$caVm, this.$wrapVm, this.$seasonListUIComponent, this.$shouldMergePreview, this.$seasonListVm, continuation);
        ogvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1.L$0 = obj;
        return ogvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        UIComponent uIComponentA;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        Throwable th;
        UIComponent uIComponent;
        List<u.a> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uIComponent = (h) this.L$1;
            gVar = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                uIComponentA = uIComponent;
                gVar.j(uIComponentA);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                gVar.j(uIComponent);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        uIComponentA = OgvSectionFloatLayerService.a(this.this$0, new Function0(coroutineScope) { // from class: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CoroutineScope f93682a;

            {
                this.f93682a = coroutineScope;
            }

            public final Object invoke() {
                return OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1.invokeSuspend$lambda$0(this.f93682a);
            }
        }, this.$vm.f93694c, this.$data.f8792b.b(), this.$clickCalendar ? 1 : 0, this.$vm, this.$caVm, this.$wrapVm, this.$seasonListUIComponent);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$shouldMergePreview, this.$data, this.this$0, this.$vm, this.$wrapVm, null), 3, (Object) null);
        com.bilibili.ship.theseus.ogv.intro.section.ui.u uVar = this.$seasonListUIComponent;
        if (uVar != null && (list = uVar.f93884b) != null) {
            OgvSectionFloatLayerService ogvSectionFloatLayerService = this.this$0;
            o.b bVar = this.$vm;
            h.a aVar = this.$wrapVm;
            u.a aVar2 = this.$caVm;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1$2$1((u.a) it.next(), uVar, ogvSectionFloatLayerService, bVar, aVar, aVar2, null), 3, (Object) null);
            }
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$vm, this.this$0, this.$wrapVm, this.$caVm, null), 3, (Object) null);
        FlowKt.launchIn(FlowKt.onEach(this.$vm.f93704n, new AnonymousClass4(this.this$0, this.$data, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(this.this$0.f93629l, new AnonymousClass5(this.$vm, this.$wrapVm, null)), coroutineScope);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, this.$seasonListVm, this.$vm, null), 3, (Object) null);
        OgvSectionFloatLayerService ogvSectionFloatLayerService2 = this.this$0;
        gVar = ogvSectionFloatLayerService2.f93626i;
        gVar.f(uIComponentA);
        try {
            TheseusFloatLayerService theseusFloatLayerService = ogvSectionFloatLayerService2.f93627j;
            this.L$0 = gVar;
            this.L$1 = uIComponentA;
            this.label = 1;
            if (theseusFloatLayerService.h(uIComponentA, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gVar.j(uIComponentA);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            uIComponent = uIComponentA;
            gVar.j(uIComponent);
            throw th;
        }
    }
}
