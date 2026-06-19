package com.bilibili.ship.theseus.ogv.intro;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.ogv.activity.ActivityDialogActionType;
import com.bilibili.ship.theseus.ogv.activity.ActivityDialogShowOccasion;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityVo;
import com.bilibili.ship.theseus.ogv.activity.OgvOperationGuideFloatingVo;
import com.bilibili.ship.theseus.ogv.operation.OperationActivityVo;
import com.bilibili.ship.theseus.ogv.operation.OperationContainerViewModel;
import com.bilibili.ship.theseus.ogv.operation.ShowTime;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xl0.C8986a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/UnitedActivityComposeContainerService.class */
@StabilityInferred(parameters = 0)
public final class UnitedActivityComposeContainerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f92280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.activity.c f92281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f92282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f92283e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public com.bilibili.app.comment3.ui.widget.p f92285g;

    @Nullable
    public H01.a h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<OgvActivityVo> f92284f = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final OperationContainerViewModel f92286i = new OperationContainerViewModel(new S(this), new LD.g(this, 3));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.UnitedActivityComposeContainerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/UnitedActivityComposeContainerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UnitedActivityComposeContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.UnitedActivityComposeContainerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/UnitedActivityComposeContainerService$1$1.class */
        public static final class C06881 extends SuspendLambda implements Function2<OgvActivityVo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UnitedActivityComposeContainerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.UnitedActivityComposeContainerService$1$1$3, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/UnitedActivityComposeContainerService$1$1$3.class */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private Object L$0;
                int label;
                final UnitedActivityComposeContainerService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.UnitedActivityComposeContainerService$1$1$3$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/UnitedActivityComposeContainerService$1$1$3$1.class */
                public static final class C06891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final UnitedActivityComposeContainerService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C06891(UnitedActivityComposeContainerService unitedActivityComposeContainerService, Continuation<? super C06891> continuation) {
                        super(2, continuation);
                        this.this$0 = unitedActivityComposeContainerService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C06891(this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            if (((Boolean) this.this$0.f92286i.h.getValue()).booleanValue()) {
                                TheseusFloatLayerService theseusFloatLayerService = this.this$0.f92280b;
                                com.bilibili.ship.theseus.ogv.operation.g gVar = new com.bilibili.ship.theseus.ogv.operation.g(this.this$0.f92286i);
                                this.label = 1;
                                if (theseusFloatLayerService.d(gVar, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(UnitedActivityComposeContainerService unitedActivityComposeContainerService, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = unitedActivityComposeContainerService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
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
                    BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C06891(this.this$0, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06881(UnitedActivityComposeContainerService unitedActivityComposeContainerService, Continuation<? super C06881> continuation) {
                super(2, continuation);
                this.this$0 = unitedActivityComposeContainerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06881 c06881 = new C06881(this.this$0, continuation);
                c06881.L$0 = obj;
                return c06881;
            }

            public final Object invoke(OgvActivityVo ogvActivityVo, Continuation<? super Unit> continuation) {
                return create(ogvActivityVo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v25, types: [com.bilibili.ship.theseus.ogv.intro.T] */
            /* JADX WARN: Type inference failed for: r0v26, types: [com.bilibili.ship.theseus.ogv.intro.U] */
            public final Object invokeSuspend(Object obj) {
                OperationActivityVo operationActivityVo;
                List<OperationActivityVo> listF;
                Object next;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OgvActivityVo ogvActivityVo = (OgvActivityVo) this.L$0;
                    if (ogvActivityVo == null || (listF = ogvActivityVo.f()) == null) {
                        operationActivityVo = null;
                    } else {
                        Iterator<T> it = listF.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((OperationActivityVo) next).e() == ShowTime.INTO_VIEW_PAGE) {
                                break;
                            }
                        }
                        operationActivityVo = (OperationActivityVo) next;
                    }
                    if (operationActivityVo == null) {
                        this.this$0.f92286i.b(null);
                    } else if (!operationActivityVo.f94076q) {
                        this.this$0.f92286i.b(operationActivityVo);
                        OperationActivityVo operationActivityVo2 = (OperationActivityVo) this.this$0.f92286i.f94085g.getValue();
                        if (operationActivityVo2 != null) {
                            operationActivityVo2.f94076q = true;
                        }
                    }
                    OgvOperationGuideFloatingVo ogvOperationGuideFloatingVo = ogvActivityVo != null ? ogvActivityVo.f91423g : null;
                    if ((ogvOperationGuideFloatingVo != null ? ogvOperationGuideFloatingVo.b() : null) != ActivityDialogShowOccasion.IMMEDIATE) {
                        ogvOperationGuideFloatingVo = null;
                    }
                    if (ogvOperationGuideFloatingVo != null) {
                        final UnitedActivityComposeContainerService unitedActivityComposeContainerService = this.this$0;
                        this.label = 1;
                        unitedActivityComposeContainerService.getClass();
                        final OgvOperationGuideFloatingVo ogvOperationGuideFloatingVo2 = ogvOperationGuideFloatingVo;
                        com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u uVar = new com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u(new Function0(ogvOperationGuideFloatingVo, unitedActivityComposeContainerService) { // from class: com.bilibili.ship.theseus.ogv.intro.T

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final OgvOperationGuideFloatingVo f92275a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final UnitedActivityComposeContainerService f92276b;

                            {
                                this.f92275a = ogvOperationGuideFloatingVo;
                                this.f92276b = unitedActivityComposeContainerService;
                            }

                            public final Object invoke() {
                                OgvOperationGuideFloatingVo ogvOperationGuideFloatingVo3 = this.f92275a;
                                boolean needLogin = ogvOperationGuideFloatingVo3.getNeedLogin();
                                UnitedActivityComposeContainerService unitedActivityComposeContainerService2 = this.f92276b;
                                if (!needLogin || com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
                                    String strA = ogvOperationGuideFloatingVo3.a();
                                    String str = ogvOperationGuideFloatingVo3.f91486f.f91354d;
                                    ActivityDialogActionType activityDialogActionType = ActivityDialogActionType.EXEC;
                                    unitedActivityComposeContainerService2.getClass();
                                    BuildersKt.launch$default(unitedActivityComposeContainerService2.f92279a, (CoroutineContext) null, (CoroutineStart) null, new UnitedActivityComposeContainerService$reportAction$1(unitedActivityComposeContainerService2, strA, str, activityDialogActionType, null), 3, (Object) null);
                                    Neurons.reportClick(false, "united.player-video-detail.bottom-leadtab.0.click", ogvOperationGuideFloatingVo3.f91488i);
                                } else {
                                    Qj0.g.e(unitedActivityComposeContainerService2.f92282d, C8986a.a());
                                }
                                return Unit.INSTANCE;
                            }
                        }, new Function0(ogvOperationGuideFloatingVo, unitedActivityComposeContainerService) { // from class: com.bilibili.ship.theseus.ogv.intro.U

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final UnitedActivityComposeContainerService f92277a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final OgvOperationGuideFloatingVo f92278b;

                            {
                                this.f92277a = unitedActivityComposeContainerService;
                                this.f92278b = ogvOperationGuideFloatingVo;
                            }

                            public final Object invoke() {
                                String strA = this.f92278b.a();
                                ActivityDialogActionType activityDialogActionType = ActivityDialogActionType.CLOSE;
                                UnitedActivityComposeContainerService unitedActivityComposeContainerService2 = this.f92277a;
                                unitedActivityComposeContainerService2.getClass();
                                BuildersKt.launch$default(unitedActivityComposeContainerService2.f92279a, (CoroutineContext) null, (CoroutineStart) null, new UnitedActivityComposeContainerService$reportAction$1(unitedActivityComposeContainerService2, strA, null, activityDialogActionType, null), 3, (Object) null);
                                return Unit.INSTANCE;
                            }
                        }, ogvOperationGuideFloatingVo, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Function0(ogvOperationGuideFloatingVo2, unitedActivityComposeContainerService) { // from class: com.bilibili.ship.theseus.ogv.intro.V

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final UnitedActivityComposeContainerService f92288a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final OgvOperationGuideFloatingVo f92289b;

                            {
                                this.f92288a = unitedActivityComposeContainerService;
                                this.f92289b = ogvOperationGuideFloatingVo2;
                            }

                            public final Object invoke() {
                                OgvOperationGuideFloatingVo ogvOperationGuideFloatingVo3 = this.f92289b;
                                String strA = ogvOperationGuideFloatingVo3.a();
                                ActivityDialogActionType activityDialogActionType = ActivityDialogActionType.EXPOSURE;
                                UnitedActivityComposeContainerService unitedActivityComposeContainerService2 = this.f92288a;
                                unitedActivityComposeContainerService2.getClass();
                                BuildersKt.launch$default(unitedActivityComposeContainerService2.f92279a, (CoroutineContext) null, (CoroutineStart) null, new UnitedActivityComposeContainerService$reportAction$1(unitedActivityComposeContainerService2, strA, null, activityDialogActionType, null), 3, (Object) null);
                                Neurons.reportExposure$default(false, "united.player-video-detail.bottom-leadtab.0.show", ogvOperationGuideFloatingVo3.f91488i, (List) null, 8, (Object) null);
                                return Unit.INSTANCE;
                            }
                        }));
                        ArrayList arrayList = new ArrayList();
                        SelectKt$selectCancellingUnselected$scope$1 selectKt$selectCancellingUnselected$scope$1 = new SelectKt$selectCancellingUnselected$scope$1(arrayList);
                        selectKt$selectCancellingUnselected$scope$1.b(new UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$1(uVar, unitedActivityComposeContainerService, null));
                        selectKt$selectCancellingUnselected$scope$1.b(new UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$2(unitedActivityComposeContainerService, uVar, null));
                        selectKt$selectCancellingUnselected$scope$1.b(new UnitedActivityComposeContainerService$handleLimitedTimeFreeTicketsComponent$2$3(uVar, null));
                        Unit unit = Unit.INSTANCE;
                        if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                this.label = 2;
                if (CoroutineScopeKt.coroutineScope(anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnitedActivityComposeContainerService unitedActivityComposeContainerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unitedActivityComposeContainerService;
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
                UnitedActivityComposeContainerService unitedActivityComposeContainerService = this.this$0;
                MutableStateFlow<OgvActivityVo> mutableStateFlow = unitedActivityComposeContainerService.f92284f;
                C06881 c06881 = new C06881(unitedActivityComposeContainerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c06881, this) == coroutine_suspended) {
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

    @Inject
    public UnitedActivityComposeContainerService(@NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.ogv.activity.c cVar, @NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar2) {
        this.f92279a = coroutineScope;
        this.f92280b = theseusFloatLayerService;
        this.f92281c = cVar;
        this.f92282d = context;
        this.f92283e = cVar2;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
