package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.intro.section.bean.MoreLeft;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.h;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.o;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.u;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.List;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1.class */
public final class OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final u.a $caVm;
    final boolean $clickCalendar;
    final Hu0.c $data;
    final List<UIComponent<?>> $episodeUIComponentList;
    final o.b $vm;
    final h.a $wrapVm;
    private Object L$0;
    Object L$1;
    int label;
    final OgvSectionFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final o.b $vm;
        int label;
        final OgvSectionFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvSectionFloatLayerService f93633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final o.b f93634b;

            public a(OgvSectionFloatLayerService ogvSectionFloatLayerService, o.b bVar) {
                this.f93633a = ogvSectionFloatLayerService;
                this.f93634b = bVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iA = com.bilibili.ship.theseus.united.page.intro.a.a((WindowSizeClass) obj, this.f93633a.f93628k.f(), 12);
                o.b bVar = this.f93634b;
                if (iA != bVar.f93702l) {
                    bVar.f93702l = iA;
                    bVar.notifyPropertyChanged(285);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvSectionFloatLayerService ogvSectionFloatLayerService, o.b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvSectionFloatLayerService;
            this.$vm = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$vm, continuation);
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
                a aVar = new a(ogvSectionFloatLayerService, this.$vm);
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
    public OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1(OgvSectionFloatLayerService ogvSectionFloatLayerService, o.b bVar, Hu0.c cVar, boolean z6, u.a aVar, h.a aVar2, List<UIComponent<?>> list, Continuation<? super OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvSectionFloatLayerService;
        this.$vm = bVar;
        this.$data = cVar;
        this.$clickCalendar = z6;
        this.$caVm = aVar;
        this.$wrapVm = aVar2;
        this.$episodeUIComponentList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope) {
        CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1 ogvSectionFloatLayerService$showPreviewSectionFloatLayer$1 = new OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1(this.this$0, this.$vm, this.$data, this.$clickCalendar, this.$caVm, this.$wrapVm, this.$episodeUIComponentList, continuation);
        ogvSectionFloatLayerService$showPreviewSectionFloatLayer$1.L$0 = obj;
        return ogvSectionFloatLayerService$showPreviewSectionFloatLayer$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        UIComponent uIComponentA;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UIComponent uIComponent = (h) this.L$1;
            gVar = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                uIComponentA = uIComponent;
                gVar.j(uIComponentA);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                uIComponentA = uIComponent;
                gVar.j(uIComponentA);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        OgvSectionFloatLayerService ogvSectionFloatLayerService = this.this$0;
        Function0 function0 = new Function0(coroutineScope) { // from class: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CoroutineScope f93683a;

            {
                this.f93683a = coroutineScope;
            }

            public final Object invoke() {
                return OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1.invokeSuspend$lambda$0(this.f93683a);
            }
        };
        String str = this.$vm.f93694c;
        MoreLeft moreLeftB = this.$data.f8798b.b();
        boolean z6 = this.$clickCalendar;
        uIComponentA = OgvSectionFloatLayerService.a(ogvSectionFloatLayerService, function0, str, moreLeftB, z6 ? 1 : 0, this.$vm, this.$caVm, this.$wrapVm, null);
        o.b bVar = this.$vm;
        bVar.f93692a.setValue(this.$episodeUIComponentList);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$vm, null), 3, (Object) null);
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
        } catch (Throwable th2) {
            th = th2;
            gVar.j(uIComponentA);
            throw th;
        }
    }
}
