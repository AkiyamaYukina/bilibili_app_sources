package com.bilibili.pegasus.components;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import ap0.C4823a;
import com.bilibili.app.comm.list.common.feed.PegasusExposeConfig;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.app.comm.list.common.utils.ListDeviceInfoKt;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.inline.reporter.AutoPlayTriggerType;
import com.bilibili.inline.reporter.InlinePlayReporterKt;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.gripper.api.GripperKt;
import com.bilibili.lib.gripper.api.ProducerContainer;
import com.bilibili.lib.gripper.api.SuspendProducer;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusAutoRefreshMode;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusInlineVolumeMode;
import com.bilibili.pegasus.PegasusVideoMode;
import com.bilibili.pegasus.PegasusVideoModeService;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.compat.PegasusCoverStyle;
import com.bilibili.pegasus.data.ToastConfig;
import com.bilibili.pegasus.data.request.LoadMoreCompleteAction;
import com.bilibili.pegasus.data.request.PegasusResponseWrapper;
import com.bilibili.pegasus.data.request.RefreshCompleteAction;
import com.bilibili.pegasus.vm.C5769d;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.google.android.material.snackbar.Snackbar;
import dp0.C6828a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import q4.C8380C;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/CommonConfigComponent.class */
@StabilityInferred(parameters = 0)
public final class CommonConfigComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75717k = "PegasusCommonConfigPlugin";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75718l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f75719m = ListExtentionsKt.lazyUnsafe(new F3.S(12));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/CommonConfigComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CommonConfigComponent f75720a;

        public a(CommonConfigComponent commonConfigComponent) {
            this.f75720a = commonConfigComponent;
        }

        public final Object invoke() {
            return this.f75720a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/CommonConfigComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CommonConfigComponent f75721a;

        public b(CommonConfigComponent commonConfigComponent) {
            this.f75721a = commonConfigComponent;
        }

        public final Object invoke() {
            return this.f75721a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/CommonConfigComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CommonConfigComponent f75722a;

        public c(CommonConfigComponent commonConfigComponent) {
            this.f75722a = commonConfigComponent;
        }

        public final Object invoke() {
            return this.f75722a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.CommonConfigComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/CommonConfigComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CommonConfigComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.CommonConfigComponent$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/CommonConfigComponent$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CommonConfigComponent f75723a;

            public a(CommonConfigComponent commonConfigComponent) {
                this.f75723a = commonConfigComponent;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit(Object obj, Continuation continuation) {
                PegasusVideoModeService pegasusVideoModeService;
                PegasusAutoRefreshMode pegasusAutoRefreshMode;
                Object obj2;
                PegasusInlineVolumeMode pegasusInlineVolumeMode;
                C6828a c6828a = (C6828a) obj;
                PegasusCoverStyle.INSTANCE.setCoverRatio(c6828a.K());
                SuspendProducer suspendProducer = ProducerContainer.get$default(GripperKt.getGripper(FoundationAlias.getFapp()).getContainer(), u00.o.class, (String) null, 2, (Object) null);
                u00.o oVar = suspendProducer != null ? (u00.o) suspendProducer.get() : null;
                com.bilibili.pegasus.common.k kVar = oVar instanceof com.bilibili.pegasus.common.k ? (com.bilibili.pegasus.common.k) oVar : null;
                if (kVar != null) {
                    kVar.f75653a = c6828a.O() == 1;
                }
                this.f75723a.getClass();
                BLRouter bLRouter = BLRouter.INSTANCE;
                Object obj3 = bLRouter.get(IInlineVolumeService.class, "pegasus_inline_volume_key");
                O00.c cVar = obj3 instanceof O00.c ? (O00.c) obj3 : null;
                if (cVar != null) {
                    com.bilibili.pegasus.b bVar = (com.bilibili.pegasus.b) BLRouter.get$default(bLRouter, com.bilibili.pegasus.b.class, (String) null, 2, (Object) null);
                    if (com.bilibili.pegasus.request.b.f78805b) {
                        cVar.c(c6828a.x());
                    } else if (!cVar.b) {
                        cVar.c(0);
                    }
                    if (Yh.l.a("PEGASUS_INLINE_VOLUME_MODE_MIGRATION") || EnvironmentManager.getInstance().isFirstStart()) {
                        BLog.i("PegasusInlineVolume", "use Remote VolumeMode");
                        obj2 = new Object();
                    } else {
                        BLog.i("PegasusInlineVolume", "use Local VolumeMode");
                        obj2 = new Lh.d();
                    }
                    EnumEntries entries = PegasusInlineVolumeMode.getEntries();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
                    Iterator<T> it = entries.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((PegasusInlineVolumeMode) it.next()).getValue()));
                    }
                    if (arrayList.contains(Integer.valueOf(c6828a.v()))) {
                        int iV = c6828a.v();
                        if (iV == 1) {
                            pegasusInlineVolumeMode = PegasusInlineVolumeMode.MODE_SERVER_OPEN;
                        } else if (iV == 2) {
                            pegasusInlineVolumeMode = PegasusInlineVolumeMode.MODE_SERVER_CLOSE;
                        } else if (iV == 3) {
                            if (bVar != null) {
                                bVar.a();
                            }
                            pegasusInlineVolumeMode = PegasusInlineVolumeMode.MODE_USER_OPEN;
                        } else if (iV == 4) {
                            if (bVar != null) {
                                bVar.a();
                            }
                            pegasusInlineVolumeMode = PegasusInlineVolumeMode.MODE_USER_CLOSE;
                        }
                        BLog.i("PegasusCommonConfigPlugin", "inlineSoundColdState:" + pegasusInlineVolumeMode);
                        if (obj2.a() != pegasusInlineVolumeMode) {
                            obj2.b(pegasusInlineVolumeMode);
                        }
                    }
                }
                this.f75723a.getClass();
                com.bilibili.pegasus.f fVar = (com.bilibili.pegasus.f) BLRouter.get$default(BLRouter.INSTANCE, com.bilibili.pegasus.f.class, (String) null, 2, (Object) null);
                if (fVar != null) {
                    EnumEntries entries2 = PegasusAutoRefreshMode.getEntries();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
                    Iterator<T> it2 = entries2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((PegasusAutoRefreshMode) it2.next()).getValue()));
                    }
                    if (arrayList2.contains(Integer.valueOf(c6828a.d()))) {
                        int iD = c6828a.d();
                        if (iD == 1) {
                            pegasusAutoRefreshMode = PegasusAutoRefreshMode.MODE_SERVER_OPEN;
                        } else if (iD == 2) {
                            pegasusAutoRefreshMode = PegasusAutoRefreshMode.MODE_SERVER_CLOSE;
                        } else if (iD == 3) {
                            pegasusAutoRefreshMode = PegasusAutoRefreshMode.MODE_USER_OPEN;
                        } else if (iD == 4) {
                            pegasusAutoRefreshMode = PegasusAutoRefreshMode.MODE_USER_CLOSE;
                        }
                        if (fVar.b() != pegasusAutoRefreshMode) {
                            fVar.a(pegasusAutoRefreshMode);
                        }
                    }
                }
                if (!Lh.i.b()) {
                    CommonConfigComponent.b(this.f75723a, c6828a);
                }
                int iM = c6828a.M();
                if (iM != 0) {
                    boolean z6 = Lh.r.a;
                    bilibili.live.app.service.resolver.c.a(iM, "tryUpdateVideoMode value:", "PegasusVideoMode");
                }
                PegasusVideoMode pegasusVideoModeC = Lh.r.c(iM);
                if (pegasusVideoModeC != null && ((!com.bilibili.pegasus.l.a(pegasusVideoModeC) || !com.bilibili.pegasus.l.a(Lh.r.a())) && ((!com.bilibili.pegasus.l.b(pegasusVideoModeC) || !com.bilibili.pegasus.l.b(Lh.r.a())) && (pegasusVideoModeService = (PegasusVideoModeService) BLRouter.get$default(BLRouter.INSTANCE, PegasusVideoModeService.class, (String) null, 2, (Object) null)) != null))) {
                    pegasusVideoModeService.setVideoMode(pegasusVideoModeC);
                }
                dp0.d dVarZ = c6828a.z();
                boolean z7 = dVarZ != null && dVarZ.a();
                KProperty[] kPropertyArr = Lh.h.a;
                KProperty kProperty = kPropertyArr[0];
                com.bilibili.app.comm.list.widget.utils.D d7 = Lh.h.b;
                if (((Boolean) d7.a()).booleanValue() != z7) {
                    KProperty kProperty2 = kPropertyArr[0];
                    d7.b(Boolean.valueOf(z7));
                    u00.l lVar = (u00.l) BLRouter.INSTANCE.get(u00.l.class, "HOME_TAB_SERVICE");
                    if (lVar != null) {
                        lVar.t();
                    }
                }
                C4823a.a(c6828a.j(), "pegasus");
                PegasusExposeConfig.INSTANCE.setExposeMinReportTimeMs(c6828a.o());
                Lh.n.i = c6828a.F();
                if (GarbManager.getCurGarb().isWhite()) {
                    CommonConfigComponent commonConfigComponent = this.f75723a;
                    commonConfigComponent.getClass();
                    SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
                    if (bLKVSharedPreference != null) {
                        int versionCode = FoundationAlias.getFapps().getVersionCode();
                        if (versionCode <= bLKVSharedPreference.getInt("pegasus_night_follow_system_ab_version", 0)) {
                            com.bilibili.ad.adview.pegasus.banner.toplive.b.a(versionCode, "nightFollowSystemAb already set for version ", ", skip", "PegasusCommonConfigPlugin");
                        } else if (c6828a.C() == 1 || c6828a.C() == 2) {
                            BLog.i("PegasusCommonConfigPlugin", "nightFollowSystemAb: " + c6828a.C() + ", setNightFollowSystem to true");
                            MultipleThemeUtils.setNightFollowSystem(commonConfigComponent.getContext(), true);
                            bLKVSharedPreference.edit().putInt("pegasus_night_follow_system_ab_version", versionCode).apply();
                            if (!PegasusVisibleState.isVisible-impl(BasePegasusComponent.access$getVisibleState-XRWi58s(commonConfigComponent))) {
                                commonConfigComponent.addVisibleStateChangeListener(new C5599g(commonConfigComponent, c6828a, commonConfigComponent));
                            } else if (c6828a.C() == 2) {
                                BLog.i("PegasusCommonConfigPlugin", "page visible, showNightFollowSystemSnackbar");
                                if (MultipleThemeUtils.isContextModeNight(BiliContext.application()) != MultipleThemeUtils.isNightTheme(BiliContext.application())) {
                                    MainCommonService mainCommonService = (MainCommonService) w8.d.a(BLRouter.INSTANCE, MainCommonService.class, "default");
                                    if (mainCommonService != null) {
                                        mainCommonService.changeNightMode(commonConfigComponent.getContext(), true);
                                    }
                                    CommonConfigComponent.c(commonConfigComponent);
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommonConfigComponent commonConfigComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = commonConfigComponent;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(((PegasusViewModel) this.this$0.f75718l.getValue()).f79027t);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowFilterNotNull.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.CommonConfigComponent$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/CommonConfigComponent$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CommonConfigComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.CommonConfigComponent$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/CommonConfigComponent$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CommonConfigComponent f75724a;

            public a(CommonConfigComponent commonConfigComponent) {
                this.f75724a = commonConfigComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                String toastMessage;
                ToastConfig toastConfig = (ToastConfig) obj;
                if (toastConfig.getHasToast() && (toastMessage = toastConfig.getToastMessage()) != null && !StringsKt.isBlank(toastMessage)) {
                    CommonConfigComponent commonConfigComponent = this.f75724a;
                    if (PegasusVisibleState.isVisible-impl(BasePegasusComponent.access$getVisibleState-XRWi58s(commonConfigComponent))) {
                        PromoToast.showTopToast(commonConfigComponent.getContext(), toastConfig.getToastMessage());
                        PegasusViewModel pegasusViewModel = (PegasusViewModel) commonConfigComponent.f75718l.getValue();
                        pegasusViewModel.getClass();
                        pegasusViewModel.z(pegasusViewModel, new C5769d(0));
                    } else {
                        commonConfigComponent.addVisibleStateChangeListener(new C5625h(commonConfigComponent, commonConfigComponent, toastConfig));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommonConfigComponent commonConfigComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = commonConfigComponent;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(((PegasusViewModel) this.this$0.f75718l.getValue()).f79028u);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowFilterNotNull.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.CommonConfigComponent$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/CommonConfigComponent$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CommonConfigComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.CommonConfigComponent$onViewCreated$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/CommonConfigComponent$onViewCreated$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Action, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CommonConfigComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CommonConfigComponent commonConfigComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = commonConfigComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Action action, Continuation<? super Unit> continuation) {
                return create(action, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                C6828a config;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Action action = (Action) this.L$0;
                if (action instanceof LoadMoreCompleteAction) {
                    PegasusResponseWrapper response = ((LoadMoreCompleteAction) action).getResponse();
                    if (response.getItems().isEmpty()) {
                        response = null;
                    }
                    config = null;
                    if (response != null) {
                        config = response.getConfig();
                    }
                } else {
                    config = null;
                    if (action instanceof RefreshCompleteAction) {
                        PegasusResponseWrapper response2 = ((RefreshCompleteAction) action).getResponse();
                        if (response2.getItems().isEmpty()) {
                            response2 = null;
                        }
                        config = null;
                        if (response2 != null) {
                            config = response2.getConfig();
                        }
                    }
                }
                if (config != null) {
                    CommonConfigComponent.b(this.this$0, config);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CommonConfigComponent commonConfigComponent, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = commonConfigComponent;
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
                if (Lh.i.b()) {
                    SharedFlow<Action> sharedFlow = ((PegasusViewModel) this.this$0.f75718l.getValue()).f79014f;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    public static final void b(CommonConfigComponent commonConfigComponent, C6828a c6828a) {
        commonConfigComponent.getClass();
        int iB = c6828a.b();
        boolean zA = c6828a.A();
        C8380C.a(iB, "save pegasus auto play state = ", ", forceFlush: ", "PegasusCommonConfigPlugin", zA);
        if (iB <= 0) {
            return;
        }
        PegasusInlineSwitchState pegasusInlineSwitchState = iB != 1 ? iB != 2 ? iB != 11 ? null : PegasusInlineSwitchState.ALL_NETWORK : PegasusInlineSwitchState.OFF : PegasusInlineSwitchState.WIFI_ONLY;
        if (pegasusInlineSwitchState != null) {
            InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.PEGASUS_CONFIG, (String) null, PegasusInlineConfigKt.isAutoPlayEnable(pegasusInlineSwitchState), 2, (Object) null);
            IPegasusInlineConfig iPegasusInlineConfig = (IPegasusInlineConfig) commonConfigComponent.f75719m.getValue();
            if (iPegasusInlineConfig != null) {
                iPegasusInlineConfig.setInlineSwitchState(pegasusInlineSwitchState, false, zA);
            }
        }
    }

    public static final void c(final CommonConfigComponent commonConfigComponent) {
        Snackbar snackbar;
        Fragment fragment = commonConfigComponent.getFragment();
        if (fragment == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(commonConfigComponent.getContext()).inflate(2131503034, (ViewGroup) commonConfigComponent.getView(), false);
        View viewA = rp0.j.a(fragment.requireView().getRootView());
        if (viewA == null) {
            snackbar = null;
        } else {
            Snackbar snackbarMake = Snackbar.make(viewA, "", -2);
            View view = snackbarMake.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null) {
                snackbar = null;
            } else {
                viewGroup.setPadding(0, 0, 0, 0);
                viewGroup.removeAllViews();
                viewGroup.setBackgroundColor(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                marginLayoutParams.bottomMargin = viewGroup.getResources().getDimensionPixelSize(2131166100);
                viewGroup.setLayoutParams(marginLayoutParams);
                viewGroup.addView(viewInflate);
                snackbarMake.show();
                snackbar = snackbarMake;
            }
        }
        if (snackbar == null) {
            BLog.w("PegasusCommonConfigPlugin", "showNightFollowSystemSnackbar: snackbar create failed");
            return;
        }
        BLog.i("PegasusCommonConfigPlugin", "showNightFollowSystemSnackbar: snackbar shown");
        Neurons.reportExposure$default(true, "app.night-follow.notify.snackbar.show", MapsKt.emptyMap(), (List) null, 8, (Object) null);
        View viewFindViewById = viewInflate.findViewById(2131298028);
        if (viewFindViewById != null) {
            final Snackbar snackbar2 = snackbar;
            viewFindViewById.setOnClickListener(new View.OnClickListener(commonConfigComponent, snackbar2) { // from class: com.bilibili.pegasus.components.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CommonConfigComponent f75949a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Snackbar f75950b;

                {
                    this.f75949a = commonConfigComponent;
                    this.f75950b = snackbar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CommonConfigComponent commonConfigComponent2 = this.f75949a;
                    Snackbar snackbar3 = this.f75950b;
                    BLog.i("PegasusCommonConfigPlugin", "showNightFollowSystemSnackbar: btn_close clicked, route to dark-mode setting");
                    Neurons.reportClick(false, "app.night-follow.notify.snackbar.click", MapsKt.mapOf(TuplesKt.to("button", "setting")));
                    BLRouter.routeTo(new RouteRequest.Builder("bilibili://preference/dark-mode").build(), commonConfigComponent2.getContext());
                    snackbar3.dismiss();
                }
            });
        }
        View viewFindViewById2 = viewInflate.findViewById(2131321973);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC5597e(snackbar, 0));
        }
        View view2 = commonConfigComponent.getView();
        if (view2 != null) {
            final Snackbar snackbar3 = snackbar;
            view2.postDelayed(new Runnable(snackbar3) { // from class: com.bilibili.pegasus.components.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Snackbar f75957a;

                {
                    this.f75957a = snackbar3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Snackbar snackbar4 = this.f75957a;
                    BLog.i("PegasusCommonConfigPlugin", "showNightFollowSystemSnackbar: auto dismiss after 5min");
                    snackbar4.dismiss();
                }
            }, 5000L);
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f75717k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        int px;
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        if (!ListDeviceInfoKt.isHdApp()) {
            if (PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE)) {
                RecyclerView recyclerView2 = getRecyclerView();
                if (recyclerView2 != null) {
                    px = recyclerView2.getPaddingTop();
                }
            } else {
                px = ListExtentionsKt.toPx(4.0f);
            }
            RecyclerView recyclerView3 = getRecyclerView();
            if (recyclerView3 != null) {
                recyclerView3.setPadding(recyclerView3.getPaddingLeft(), px, recyclerView3.getPaddingRight(), recyclerView3.getResources().getDimensionPixelOffset(2131165959));
            }
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
