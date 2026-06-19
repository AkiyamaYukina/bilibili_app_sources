package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.collection.ArrayMap;
import androidx.collection.ArrayMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.supermenu.core.IMenuPanel;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuItemClickListenerV2;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuVisibilityChangeListenerV2;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.report.PageReportService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.FetchShareMenuCallback;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.bangumi.module.detail.vo.BangumiRouterParams;
import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a;
import com.bilibili.bangumi.ui.page.detail.playerV2.widget.landscape.PgcPlayerSharePopFunctionWidget;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.im.ui.v;
import com.bilibili.tgwt.service.ChatService;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchShareEnterWidget.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchShareEnterWidget extends AppCompatImageView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NewSeasonService f111777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PageReportService f111778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActivityContextParamsService f111779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NewShareService f111780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScreenStateService f111781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ChatService f111782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ChatRoomManagerService f111783g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    private com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.i f111784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f111785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f111786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InjectPlayerService
    private IReporterService f111787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InjectPlayerService
    private DelegateStoreService f111788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final a f111789n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchShareEnterWidget$a.class */
    public static final class a implements com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchShareEnterWidget f111790a;

        public a(TogetherWatchShareEnterWidget togetherWatchShareEnterWidget) {
            this.f111790a = togetherWatchShareEnterWidget;
        }

        public final void a() {
            this.f111790a.z();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.TogetherWatchShareEnterWidget$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchShareEnterWidget$bindToView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final TogetherWatchShareEnterWidget this$0;

        /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.TogetherWatchShareEnterWidget$bindToView$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchShareEnterWidget$bindToView$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<BangumiUniformSeason, Continuation<? super Unit>, Object> {
            int label;
            final TogetherWatchShareEnterWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TogetherWatchShareEnterWidget togetherWatchShareEnterWidget, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = togetherWatchShareEnterWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(BangumiUniformSeason bangumiUniformSeason, Continuation<? super Unit> continuation) {
                return create(bangumiUniformSeason, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TogetherWatchShareEnterWidget togetherWatchShareEnterWidget = this.this$0;
                togetherWatchShareEnterWidget.h = true;
                togetherWatchShareEnterWidget.z();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.TogetherWatchShareEnterWidget$bindToView$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchShareEnterWidget$bindToView$2$2.class */
        public static final class C12202 extends SuspendLambda implements Function2<List<? extends ChatRoomMember>, Continuation<? super Unit>, Object> {
            int label;
            final TogetherWatchShareEnterWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12202(TogetherWatchShareEnterWidget togetherWatchShareEnterWidget, Continuation<? super C12202> continuation) {
                super(2, continuation);
                this.this$0 = togetherWatchShareEnterWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C12202(this.this$0, continuation);
            }

            public final Object invoke(List<ChatRoomMember> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.z();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TogetherWatchShareEnterWidget togetherWatchShareEnterWidget, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchShareEnterWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    TogetherWatchShareEnterWidget togetherWatchShareEnterWidget = this.this$0;
                    DelegateStoreService delegateStoreService = togetherWatchShareEnterWidget.f111788m;
                    DelegateStoreService delegateStoreService2 = delegateStoreService;
                    if (delegateStoreService == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                        delegateStoreService2 = null;
                    }
                    togetherWatchShareEnterWidget.f111777a = (NewSeasonService) dm.d.b(delegateStoreService2, NewSeasonService.class);
                    TogetherWatchShareEnterWidget togetherWatchShareEnterWidget2 = this.this$0;
                    DelegateStoreService delegateStoreService3 = togetherWatchShareEnterWidget2.f111788m;
                    DelegateStoreService delegateStoreService4 = delegateStoreService3;
                    if (delegateStoreService3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                        delegateStoreService4 = null;
                    }
                    togetherWatchShareEnterWidget2.f111778b = (PageReportService) dm.d.b(delegateStoreService4, PageReportService.class);
                    TogetherWatchShareEnterWidget togetherWatchShareEnterWidget3 = this.this$0;
                    DelegateStoreService delegateStoreService5 = togetherWatchShareEnterWidget3.f111788m;
                    DelegateStoreService delegateStoreService6 = delegateStoreService5;
                    if (delegateStoreService5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                        delegateStoreService6 = null;
                    }
                    togetherWatchShareEnterWidget3.f111779c = (ActivityContextParamsService) dm.d.b(delegateStoreService6, ActivityContextParamsService.class);
                    TogetherWatchShareEnterWidget togetherWatchShareEnterWidget4 = this.this$0;
                    DelegateStoreService delegateStoreService7 = togetherWatchShareEnterWidget4.f111788m;
                    DelegateStoreService delegateStoreService8 = delegateStoreService7;
                    if (delegateStoreService7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                        delegateStoreService8 = null;
                    }
                    togetherWatchShareEnterWidget4.f111780d = (NewShareService) dm.d.b(delegateStoreService8, NewShareService.class);
                    TogetherWatchShareEnterWidget togetherWatchShareEnterWidget5 = this.this$0;
                    DelegateStoreService delegateStoreService9 = togetherWatchShareEnterWidget5.f111788m;
                    DelegateStoreService delegateStoreService10 = delegateStoreService9;
                    if (delegateStoreService9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                        delegateStoreService10 = null;
                    }
                    togetherWatchShareEnterWidget5.f111781e = (ScreenStateService) dm.d.b(delegateStoreService10, ScreenStateService.class);
                    TogetherWatchShareEnterWidget togetherWatchShareEnterWidget6 = this.this$0;
                    DelegateStoreService delegateStoreService11 = togetherWatchShareEnterWidget6.f111788m;
                    DelegateStoreService delegateStoreService12 = delegateStoreService11;
                    if (delegateStoreService11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                        delegateStoreService12 = null;
                    }
                    togetherWatchShareEnterWidget6.f111782f = (ChatService) dm.d.b(delegateStoreService12, ChatService.class);
                    TogetherWatchShareEnterWidget togetherWatchShareEnterWidget7 = this.this$0;
                    DelegateStoreService delegateStoreService13 = togetherWatchShareEnterWidget7.f111788m;
                    DelegateStoreService delegateStoreService14 = delegateStoreService13;
                    if (delegateStoreService13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                        delegateStoreService14 = null;
                    }
                    togetherWatchShareEnterWidget7.f111783g = (ChatRoomManagerService) dm.d.b(delegateStoreService14, ChatRoomManagerService.class);
                    this.this$0.z();
                    com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.i iVar = this.this$0.f111784i;
                    com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.i iVar2 = iVar;
                    if (iVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerWidgetConfigService");
                        iVar2 = null;
                    }
                    iVar2.c(this.this$0.f111789n);
                    NewSeasonService newSeasonService = this.this$0.f111777a;
                    NewSeasonService newSeasonService2 = newSeasonService;
                    if (newSeasonService == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("seasonService");
                        newSeasonService2 = null;
                    }
                    FlowKt.launchIn(FlowKt.onEach(newSeasonService2.getSeasonObservable(), new AnonymousClass1(this.this$0, null)), coroutineScope);
                    ChatService chatService = this.this$0.f111782f;
                    ChatService chatService2 = chatService;
                    if (chatService == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chatService");
                        chatService2 = null;
                    }
                    if (chatService2.f111872U) {
                        ChatRoomManagerService chatRoomManagerService = this.this$0.f111783g;
                        ChatRoomManagerService chatRoomManagerService2 = chatRoomManagerService;
                        if (chatRoomManagerService == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
                            chatRoomManagerService2 = null;
                        }
                        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(chatRoomManagerService2.f110925r), new C12202(this.this$0, null)), coroutineScope);
                    }
                    TogetherWatchShareEnterWidget togetherWatchShareEnterWidget8 = this.this$0;
                    togetherWatchShareEnterWidget8.setOnClickListener(togetherWatchShareEnterWidget8);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.i iVar3 = this.this$0.f111784i;
                if (iVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerWidgetConfigService");
                    iVar3 = null;
                }
                iVar3.d.remove(this.this$0.f111789n);
                throw th;
            }
        }
    }

    @JvmOverloads
    public TogetherWatchShareEnterWidget(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public TogetherWatchShareEnterWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f111789n = new a(this);
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
    }

    @Nullable
    public final Object bindToView(@NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(this, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        ChatRoomConfig chatRoomConfigS;
        ChatRoomInfo chatRoomInfo;
        ActivityContextParamsService activityContextParamsService = this.f111779c;
        ActivityContextParamsService activityContextParamsService2 = activityContextParamsService;
        if (activityContextParamsService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityContextParamsService");
            activityContextParamsService2 = null;
        }
        if (activityContextParamsService2.getImmutable().getSeasonMode() == BangumiRouterParams.SeasonMode.CHATROOM) {
            NewSeasonService newSeasonService = this.f111777a;
            NewSeasonService newSeasonService2 = newSeasonService;
            if (newSeasonService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seasonService");
                newSeasonService2 = null;
            }
            BangumiUniformSeason season = newSeasonService2.getSeason();
            if (season == null || (chatRoomInfo = season.E) == null || chatRoomInfo.u() != 1) {
                NewSeasonService newSeasonService3 = this.f111777a;
                NewSeasonService newSeasonService4 = newSeasonService3;
                if (newSeasonService3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("seasonService");
                    newSeasonService4 = null;
                }
                BangumiUniformSeason season2 = newSeasonService4.getSeason();
                if (season2 != null) {
                    ChatRoomInfo chatRoomInfo2 = season2.E;
                    ChatRoomConfigValue chatRoomConfigValueF = (chatRoomInfo2 == null || (chatRoomConfigS = chatRoomInfo2.s()) == null) ? null : chatRoomConfigS.f();
                    if ((chatRoomConfigValueF != null ? chatRoomConfigValueF.a() : null) != null && chatRoomConfigValueF.a() != ChatConfigType.AVAILABLE_AND_VISIBLE) {
                        Context context = getContext();
                        String strB = chatRoomConfigValueF.b();
                        String str = strB;
                        if (strB == null) {
                            str = "";
                        }
                        ToastHelper.showToastShort(context, str);
                        return;
                    }
                    Context context2 = getContext();
                    NewShareService newShareService = this.f111780d;
                    NewShareService newShareService2 = newShareService;
                    if (newShareService == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shareService");
                        newShareService2 = null;
                    }
                    new v(context2, "ogv_video_detail_together_watch_full_share", newShareService2).show();
                    Neurons.reportClick$default(false, "pgc.watch-together-fullscreen-cinema.player.share.click", (Map) null, 4, (Object) null);
                    return;
                }
                return;
            }
        }
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -2);
        layoutParams.setLayoutType(8);
        layoutParams.setFunctionType(3);
        layoutParams.setEnterAnim(-1);
        layoutParams.setExitAnim(-1);
        IControlContainerService iControlContainerService = this.f111785j;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
        if (screenModeType == ScreenModeType.VERTICAL_FULLSCREEN || screenModeType == ScreenModeType.THUMB) {
            NewShareService newShareService3 = this.f111780d;
            if (newShareService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareService");
                newShareService3 = null;
            }
            NewShareService.showMenu$default(newShareService3, getContext(), "ogv_video_detail_player_vertical_full_normal_share", (FetchShareMenuCallback) null, (OnMenuItemClickListenerV2) null, (IMenuPanel) null, (OnMenuVisibilityChangeListenerV2) null, 60, (Object) null);
        } else {
            AbsFunctionWidgetService absFunctionWidgetService = this.f111786k;
            AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService2 = null;
            }
            absFunctionWidgetService2.showWidget(PgcPlayerSharePopFunctionWidget.class, layoutParams, new PgcPlayerSharePopFunctionWidget.a());
        }
        ScreenStateService screenStateService = this.f111781e;
        ScreenStateService screenStateService2 = screenStateService;
        if (screenStateService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenStateService");
            screenStateService2 = null;
        }
        a.b bVarA = screenStateService2.getScreenStateHelper().a();
        boolean zAreEqual = Intrinsics.areEqual(screenStateService2.getScreenStateHelper().d(), Boolean.TRUE);
        ArrayMap arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(TuplesKt.to("state", !bVarA.b ? zAreEqual ? "3" : "1" : zAreEqual ? "4" : "2"));
        PageReportService pageReportService = this.f111778b;
        PageReportService pageReportService2 = pageReportService;
        if (pageReportService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageReportService");
            pageReportService2 = null;
        }
        pageReportService2.d(arrayMapArrayMapOf);
        NeuronsEvents.b bVar = new NeuronsEvents.b("player.player.share.0.player", arrayMapArrayMapOf);
        IReporterService iReporterService = this.f111787l;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reporterService");
            iReporterService = null;
        }
        iReporterService.report(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.widget.TogetherWatchShareEnterWidget.z():void");
    }
}
