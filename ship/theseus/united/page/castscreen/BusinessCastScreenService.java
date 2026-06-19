package com.bilibili.ship.theseus.united.page.castscreen;

import Pe0.C2775a;
import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import c6.Q;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.ProjectionClientConfig;
import com.bilibili.lib.projection.ProjectionTheme;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.selector.ProjectionSelectorContainer;
import com.bilibili.ogv.infra.widget.RatioLayout;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.backpress.c;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import com.bilibili.ship.theseus.united.page.playingarea.l;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.mall.ui.page.base.MallComposeBindBaseFragment;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService.class */
@StabilityInferred(parameters = 0)
public final class BusinessCastScreenService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BusinessType f99085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f99088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final h f99089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f99090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f99091g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final g f99092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final i f99093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f99094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Flow<l> f99095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.backpress.c f99096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f99097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f99098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f99099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ProjectionSelectorContainer f99100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final f f99101r;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BusinessCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<c, l, Continuation<? super Pair<? extends c, ? extends l>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(c cVar, l lVar, Continuation<? super Pair<c, l>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(cVar, lVar, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends c, ? extends l>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final BusinessCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(BusinessCastScreenService businessCastScreenService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = businessCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<c, l> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                c cVar = (c) pair.component1();
                l lVar = (l) pair.component2();
                if (lVar != null && cVar != null) {
                    final BusinessCastScreenService businessCastScreenService = this.this$0;
                    final RatioLayout ratioLayout = lVar.f102371a;
                    businessCastScreenService.getClass();
                    b bVar = cVar.f99103a;
                    com.bilibili.ship.theseus.united.page.castscreen.c cVar2 = new com.bilibili.ship.theseus.united.page.castscreen.c(bVar);
                    TheseusCastScreenRepository theseusCastScreenRepository = businessCastScreenService.f99090f;
                    final ProjectionClient projectionClientA = theseusCastScreenRepository.a();
                    if (projectionClientA != null) {
                        projectionClientA.setCallback(businessCastScreenService.f99101r);
                        businessCastScreenService.f99100q = businessCastScreenService.f99085a == BusinessType.UGC ? new Pe0.d(projectionClientA) : new C2775a(projectionClientA);
                        if (!theseusCastScreenRepository.c() && !bVar.c()) {
                            projectionClientA.setPlaySpeed(businessCastScreenService.f99089e.f91108b.b(), true);
                        }
                        projectionClientA.setDataSource(cVar2);
                        boolean zC = bVar.c();
                        MutableStateFlow<Boolean> mutableStateFlow = theseusCastScreenRepository.f99129f;
                        if (zC || ((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                            projectionClientA.attach(ratioLayout, businessCastScreenService.f99087c);
                        } else {
                            boolean zC2 = bVar.c();
                            boolean zA = bVar.a();
                            ProjectionItemData item = bVar.getItem(bVar.getStartIndex());
                            StringBuilder sbA = Q.a("try to play -> ", " || ", "|| ", zC2, zA);
                            sbA.append(item);
                            BLog.i("BusinessCastScreenService-startCast", "[theseus-united-BusinessCastScreenService-startCast] " + sbA.toString());
                            final int i7 = 0;
                            ProjectionClient.play$default(projectionClientA, bVar.getStartIndex(), cVar.f99104b.f99105a, false, true, bVar.a(), new Function0(projectionClientA, i7, ratioLayout, businessCastScreenService) { // from class: com.bilibili.ship.theseus.united.page.castscreen.a

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f99140a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Object f99141b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final Object f99142c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final Object f99143d;

                                {
                                    this.f99140a = i7;
                                    this.f99141b = projectionClientA;
                                    this.f99142c = ratioLayout;
                                    this.f99143d = businessCastScreenService;
                                }

                                public final Object invoke() {
                                    switch (this.f99140a) {
                                        case 0:
                                            ((ProjectionClient) this.f99141b).attach((RatioLayout) this.f99142c, ((BusinessCastScreenService) this.f99143d).f99087c);
                                            break;
                                        default:
                                            String str = "pdp_push_" + System.currentTimeMillis();
                                            ((Function1) this.f99141b).invoke(str);
                                            Fragment fragment = (Fragment) this.f99142c;
                                            if (fragment.isAdded()) {
                                                fragment.getParentFragmentManager().beginTransaction().remove(fragment).commitNowAllowingStateLoss();
                                            }
                                            MallComposeBindBaseFragment mallComposeBindBaseFragment = (MallComposeBindBaseFragment) this.f99143d;
                                            mallComposeBindBaseFragment.getChildFragmentManager().beginTransaction().setReorderingAllowed(true).replace(mallComposeBindBaseFragment.n, fragment, str).addToBackStack(str).commitAllowingStateLoss();
                                            mallComposeBindBaseFragment.uf("purchasePageStart", MapsKt.mapOf(TuplesKt.to("token", str)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, 4, null);
                        }
                        mutableStateFlow.setValue(Boolean.FALSE);
                    }
                    theseusCastScreenRepository.d(bVar.getItem(bVar.getStartIndex()));
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BusinessCastScreenService businessCastScreenService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = businessCastScreenService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(c cVar, l lVar, Continuation continuation) {
            return new Pair(cVar, lVar);
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
                BusinessCastScreenService businessCastScreenService = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(businessCastScreenService.f99099p, businessCastScreenService.f99095l, AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BusinessCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final BusinessCastScreenService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$2$1$1.class */
            public static final class C09501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final boolean $inCast;
                private Object L$0;
                int label;
                final BusinessCastScreenService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$2$1$1$1.class */
                public static final class C09511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final BusinessCastScreenService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09511(BusinessCastScreenService businessCastScreenService, Continuation<? super C09511> continuation) {
                        super(2, continuation);
                        this.this$0 = businessCastScreenService;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final boolean invokeSuspend$lambda$0(BusinessCastScreenService businessCastScreenService, KeyEvent keyEvent) {
                        boolean zBooleanValue = false;
                        if (businessCastScreenService.f99090f.c()) {
                            zBooleanValue = false;
                            if (keyEvent != null) {
                                ProjectionClient projectionClientA = businessCastScreenService.f99090f.a();
                                Boolean boolValueOf = projectionClientA != null ? Boolean.valueOf(projectionClientA.onKeyEvent(keyEvent)) : null;
                                zBooleanValue = false;
                                if (boolValueOf != null) {
                                    zBooleanValue = boolValueOf.booleanValue();
                                }
                            }
                        }
                        return zBooleanValue;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C09511(this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            final BusinessCastScreenService businessCastScreenService = this.this$0;
                            com.bilibili.ship.theseus.united.page.backpress.c cVar = businessCastScreenService.f99096m;
                            c.a aVar = new c.a(new Function1(businessCastScreenService) { // from class: com.bilibili.ship.theseus.united.page.castscreen.b

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final BusinessCastScreenService f99144a;

                                {
                                    this.f99144a = businessCastScreenService;
                                }

                                public final Object invoke(Object obj2) {
                                    return Boolean.valueOf(BusinessCastScreenService.AnonymousClass2.AnonymousClass1.C09501.C09511.invokeSuspend$lambda$0(this.f99144a, (KeyEvent) obj2));
                                }
                            });
                            this.label = 1;
                            if (cVar.b(aVar, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService$2$1$1$2, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$2$1$1$2.class */
                public static final class C09522 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    Object L$0;
                    Object L$1;
                    int label;
                    final BusinessCastScreenService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09522(BusinessCastScreenService businessCastScreenService, Continuation<? super C09522> continuation) {
                        super(2, continuation);
                        this.this$0 = businessCastScreenService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C09522(this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) throws Throwable {
                        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
                        String str;
                        String str2;
                        com.bilibili.ship.theseus.united.page.screenstate.c cVar2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            cVar = this.this$0.h;
                            cVar.b("CastScreenState", true);
                            try {
                                this.L$0 = cVar;
                                this.L$1 = "CastScreenState";
                                this.label = 1;
                                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str2 = "CastScreenState";
                            } catch (Throwable th) {
                                th = th;
                                str = "CastScreenState";
                                cVar.b(str, false);
                                throw th;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str2 = (String) this.L$1;
                            com.bilibili.ship.theseus.united.page.screenstate.c cVar3 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
                            str = str2;
                            cVar2 = cVar3;
                            try {
                                ResultKt.throwOnFailure(obj);
                                cVar = cVar3;
                            } catch (Throwable th2) {
                                cVar = cVar2;
                                th = th2;
                                cVar.b(str, false);
                                throw th;
                            }
                        }
                        str = str2;
                        cVar2 = cVar;
                        throw new KotlinNothingValueException();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09501(boolean z6, BusinessCastScreenService businessCastScreenService, Continuation<? super C09501> continuation) {
                    super(2, continuation);
                    this.$inCast = z6;
                    this.this$0 = businessCastScreenService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C09501 c09501 = new C09501(this.$inCast, this.this$0, continuation);
                    c09501.L$0 = obj;
                    return c09501;
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
                    if (this.$inCast) {
                        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09511(this.this$0, null), 3, (Object) null);
                        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09522(this.this$0, null), 3, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BusinessCastScreenService businessCastScreenService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = businessCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C09501 c09501 = new C09501(this.Z$0, this.this$0, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(c09501, this) == coroutine_suspended) {
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
        public AnonymousClass2(BusinessCastScreenService businessCastScreenService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = businessCastScreenService;
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
                BusinessCastScreenService businessCastScreenService = this.this$0;
                TheseusCastScreenRepository$special$$inlined$map$1 theseusCastScreenRepository$special$$inlined$map$1 = new TheseusCastScreenRepository$special$$inlined$map$1(businessCastScreenService.f99090f.f99126c);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(businessCastScreenService, null);
                this.label = 1;
                if (FlowKt.collectLatest(theseusCastScreenRepository$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ProjectionItemData f99102a;

        public a(@NotNull ProjectionItemData projectionItemData) {
            this.f99102a = projectionItemData;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f99102a, ((a) obj).f99102a);
        }

        public final int hashCode() {
            return this.f99102a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "CastScreenItemChange(item=" + this.f99102a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$b.class */
    public interface b {
        boolean a();

        boolean b(int i7);

        boolean c();

        @NotNull
        ProjectionItemData getItem(int i7);

        int getItemCount();

        int getStartIndex();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final b f99103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final d f99104b;

        public c(@NotNull b bVar, @NotNull d dVar) {
            this.f99103a = bVar;
            this.f99104b = dVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f99105a;

        public d(long j7) {
            this.f99105a = j7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$e.class */
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f99106a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BusinessType.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BusinessType.CHEESE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f99106a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/BusinessCastScreenService$f.class */
    public static final class f implements ProjectionClient.ClientCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BusinessCastScreenService f99107a;

        public f(BusinessCastScreenService businessCastScreenService) {
            this.f99107a = businessCastScreenService;
        }

        @Override // com.bilibili.lib.projection.ProjectionClient.ClientCallback
        public final void onDanmakuVisibleChanged(boolean z6) {
            defpackage.a.b("[theseus-united-BusinessCastScreenService$callback$1-onDanmakuVisibleChanged] ", com.bilibili.app.comm.bh.x5.b.a("on cast screen danmaku changed ", z6), "BusinessCastScreenService$callback$1-onDanmakuVisibleChanged");
            this.f99107a.f99090f.e(z6);
        }

        @Override // com.bilibili.lib.projection.ProjectionClient.ClientCallback
        public final void onItemChange(IProjectionItem iProjectionItem, int i7, boolean z6) {
            if (iProjectionItem instanceof ProjectionItemData) {
                BusinessCastScreenService businessCastScreenService = this.f99107a;
                if (Intrinsics.areEqual(iProjectionItem, businessCastScreenService.f99090f.b())) {
                    return;
                }
                businessCastScreenService.f99090f.f99129f.setValue(Boolean.valueOf(z6));
                if (z6) {
                    BLog.i("BusinessCastScreenService$callback$1-onItemChange", "[theseus-united-BusinessCastScreenService$callback$1-onItemChange] " + ("cast item change to " + iProjectionItem));
                    businessCastScreenService.f99097n.tryEmit(new a((ProjectionItemData) iProjectionItem));
                }
            }
        }

        @Override // com.bilibili.lib.projection.ProjectionClient.ClientCallback
        public final void onPanelShow(boolean z6, boolean z7, ProjectionClient.ClientPanel clientPanel) {
            long duration;
            ProjectionClient.a clientState;
            boolean zIsRoot = clientPanel.isRoot();
            BusinessCastScreenService businessCastScreenService = this.f99107a;
            if (zIsRoot && z6) {
                businessCastScreenService.f99089e.h("BusinessCastScreenService");
                businessCastScreenService.f99091g.a("BusinessCastScreenService");
                businessCastScreenService.f99092i.f("BusinessCastScreenService");
                businessCastScreenService.f99093j.a("BusinessCastScreenService");
                businessCastScreenService.f99094k.f103498g.a("BusinessCastScreenService");
                TheseusCastScreenRepository.b.a aVar = TheseusCastScreenRepository.b.a.f99136a;
                TheseusCastScreenRepository theseusCastScreenRepository = businessCastScreenService.f99090f;
                theseusCastScreenRepository.f99125b.setValue(aVar);
                theseusCastScreenRepository.f99127d.tryEmit(new TheseusCastScreenRepository.a.C0954a(theseusCastScreenRepository.b()));
                return;
            }
            if (!clientPanel.isRoot() || z6) {
                return;
            }
            businessCastScreenService.f99089e.i("BusinessCastScreenService");
            businessCastScreenService.f99091g.b("BusinessCastScreenService");
            businessCastScreenService.f99092i.j("BusinessCastScreenService");
            businessCastScreenService.f99093j.c("BusinessCastScreenService");
            businessCastScreenService.f99094k.f103498g.b("BusinessCastScreenService");
            TheseusCastScreenRepository theseusCastScreenRepository2 = businessCastScreenService.f99090f;
            ProjectionClient projectionClientA = theseusCastScreenRepository2.a();
            Long lValueOf = (projectionClientA == null || (clientState = projectionClientA.getClientState()) == null) ? null : Long.valueOf(clientState.getCurrentProgress());
            theseusCastScreenRepository2.f99125b.setValue(TheseusCastScreenRepository.b.C0955b.f99137a);
            if (lValueOf != null) {
                Duration.Companion companion = Duration.Companion;
                duration = DurationKt.toDuration(lValueOf.longValue(), DurationUnit.MILLISECONDS);
            } else {
                duration = Duration.Companion.getZERO-UwyO8pc();
            }
            theseusCastScreenRepository2.f99127d.tryEmit(new TheseusCastScreenRepository.a.b(duration));
        }

        @Override // com.bilibili.lib.projection.ProjectionClient.ClientCallback
        public final void onProjectionCompleted(IProjectionPlayableItem iProjectionPlayableItem, int i7) {
            defpackage.a.b("[theseus-united-BusinessCastScreenService$callback$1-onProjectionCompleted] ", "on projection item completed " + iProjectionPlayableItem + ", index = " + i7, "BusinessCastScreenService$callback$1-onProjectionCompleted");
        }

        @Override // com.bilibili.lib.projection.ProjectionClient.ClientCallback
        public final void onResolveFailed(Throwable th) {
            com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-united-BusinessCastScreenService$callback$1-onResolveFailed] ", O4.d.a("try to cast screen but failed, ", th), "BusinessCastScreenService$callback$1-onResolveFailed", (Throwable) null);
            ToastHelper.showToast(this.f99107a.f99088d, th.getMessage(), 17, 0);
        }

        @Override // com.bilibili.lib.projection.ProjectionClient.ClientCallback
        public final void onShowSearchFragment(boolean z6, boolean z7) {
            BusinessCastScreenService businessCastScreenService = this.f99107a;
            if (!businessCastScreenService.f99090f.c() && z6) {
                businessCastScreenService.f99099p.setValue((Object) null);
            }
            if (!businessCastScreenService.f99090f.c() && z6 && z7) {
                businessCastScreenService.f99089e.h("BusinessCastScreenService");
            } else {
                if (businessCastScreenService.f99090f.c() || z6 || !z7) {
                    return;
                }
                businessCastScreenService.f99089e.i("BusinessCastScreenService");
            }
        }

        @Override // com.bilibili.lib.projection.ProjectionClient.ClientCallback
        public final ProjectionSelectorContainer onShowSelector() {
            return this.f99107a.f99100q;
        }

        @Override // com.bilibili.lib.projection.ProjectionClient.ClientCallback
        public final void updateTopBarState(ProjectionClient.ClientCallback.TopBarState topBarState) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Inject
    public BusinessCastScreenService(long j7, @NotNull BusinessType businessType, @NotNull CoroutineScope coroutineScope, int i7, @NotNull Context context, @NotNull h hVar, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull ToolbarRepository toolbarRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull g gVar, @NotNull i iVar, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull Flow<l> flow, @NotNull com.bilibili.ship.theseus.united.page.backpress.c cVar2, @NotNull wv0.a aVar) throws NoWhenBranchMatchedException {
        this.f99085a = businessType;
        this.f99086b = coroutineScope;
        this.f99087c = i7;
        this.f99088d = context;
        this.f99089e = hVar;
        this.f99090f = theseusCastScreenRepository;
        this.f99091g = toolbarRepository;
        this.h = cVar;
        this.f99092i = gVar;
        this.f99093j = iVar;
        this.f99094k = theseusPageUIStyleRepository;
        this.f99095l = flow;
        this.f99096m = cVar2;
        int i8 = 1;
        MutableSharedFlow<a> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 1, BufferOverflow.DROP_OLDEST);
        this.f99097n = MutableSharedFlow;
        this.f99098o = FlowKt.asSharedFlow(MutableSharedFlow);
        ProjectionClientConfig.Companion companion = ProjectionClientConfig.Companion;
        if (aVar.a()) {
            i8 = 5;
        } else {
            int i9 = e.f99106a[businessType.ordinal()];
            if (i9 != 1) {
                i8 = 2;
                if (i9 != 2) {
                    i8 = 3;
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        ProjectionClientConfig projectionClientConfigTheme = companion.obtain(i8).theme(ProjectionTheme.PINK);
        projectionClientConfigTheme.setOperationId(Long.valueOf(j7));
        this.f99099p = StateFlowKt.MutableStateFlow((Object) null);
        this.f99101r = new f(this);
        ProjectionClient projectionClientA = theseusCastScreenRepository.a();
        ProjectionClientConfig config = projectionClientA != null ? projectionClientA.getConfig() : null;
        if (config == null || projectionClientConfigTheme.getClientType$biliscreencast_release() != config.getClientType$biliscreencast_release()) {
            theseusCastScreenRepository.h.setValue(theseusCastScreenRepository.f99130g.newClient(projectionClientConfigTheme));
        } else {
            ProjectionClient projectionClientA2 = theseusCastScreenRepository.a();
            if (projectionClientA2 != null) {
                projectionClientA2.setConfig(projectionClientConfigTheme);
            }
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
