package com.bilibili.ship.theseus.united.page.intro.module.owner;

import android.app.Application;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.playerbizcommonv2.widget.popup.FollowPopupUtil;
import com.bilibili.relation.utils.FollowFlowHelper;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.popupwindow.PopupWindowRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.d;
import com.bilibili.ship.theseus.united.page.view.t;
import javax.inject.Inject;
import kntr.base.utils.foundation.RomUtils;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService.class */
@StabilityInferred(parameters = 0)
public final class OwnerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f100612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C8043a f100613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f100614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BusinessType f100615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final RelationRepository f100616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C7893a f100617g;

    @NotNull
    public final r h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f100618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f100619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PageReportService f100620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final t f100621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f100622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f100623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lifecycle f100624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.intro.module.owner.a f100625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f100626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final PopupWindowRepository f100627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f100628s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f100629t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f100630u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f100631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f100632w = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OwnerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$1$1.class */
        public static final class C10241 extends SuspendLambda implements Function2<com.bilibili.playerbizcommonv2.utils.i, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OwnerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10241(OwnerService ownerService, Continuation<? super C10241> continuation) {
                super(2, continuation);
                this.this$0 = ownerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10241 c10241 = new C10241(this.this$0, continuation);
                c10241.L$0 = obj;
                return c10241;
            }

            public final Object invoke(com.bilibili.playerbizcommonv2.utils.i iVar, Continuation<? super Unit> continuation) {
                return create(iVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.bilibili.playerbizcommonv2.utils.i iVar = (com.bilibili.playerbizcommonv2.utils.i) this.L$0;
                    OwnerService ownerService = this.this$0;
                    this.label = 1;
                    if (OwnerService.b(ownerService, iVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(OwnerService ownerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ownerService;
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
                OwnerService ownerService = this.this$0;
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(ownerService.h.f100677g, ownerService.f100624o, Lifecycle.State.RESUMED);
                C10241 c10241 = new C10241(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowWithLifecycle, c10241, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OwnerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final OwnerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OwnerService ownerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ownerService;
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
                    if (!this.Z$0) {
                        OwnerService ownerService = this.this$0;
                        this.label = 1;
                        if (OwnerService.c(ownerService, this) == coroutine_suspended) {
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
        public AnonymousClass2(OwnerService ownerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ownerService;
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
                OwnerService ownerService = this.this$0;
                MutableStateFlow<Boolean> mutableStateFlow = ownerService.f100632w;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ownerService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$a.class */
    public static final class a extends FollowFlowHelper.SimpleCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OwnerService f100633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<f> f100634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f100635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.BooleanRef f100636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Ref.BooleanRef f100637e;

        public a(OwnerService ownerService, Ref.ObjectRef<f> objectRef, long j7, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2) {
            this.f100633a = ownerService;
            this.f100634b = objectRef;
            this.f100635c = j7;
            this.f100636d = booleanRef;
            this.f100637e = booleanRef2;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final boolean isCancel() {
            return !CoroutineScopeKt.isActive(this.f100633a.f100611a);
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final boolean isLogin() {
            Application fapp = FoundationAlias.getFapp();
            return sh1.o.b(fapp, fapp.getString(2131846702), (String) null, 28, (String) null);
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final boolean onFollowError(Throwable th) {
            Application fapp = FoundationAlias.getFapp();
            Ref.BooleanRef booleanRef = this.f100637e;
            Ref.BooleanRef booleanRef2 = this.f100636d;
            long j7 = this.f100635c;
            OwnerService.a(j7, this.f100633a, booleanRef2, booleanRef, j7, false);
            if (!sh1.h.a(th)) {
                return false;
            }
            sh1.o.e(fapp, "OwnerService_onFollowError");
            return true;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final boolean onFollowSuccess() {
            OwnerService ownerService = this.f100633a;
            ownerService.f100612b.i(true);
            Ref.ObjectRef<f> objectRef = this.f100634b;
            f fVar = (f) objectRef.element;
            if (fVar != null) {
                fVar.c();
            }
            Ref.BooleanRef booleanRef = this.f100637e;
            Ref.BooleanRef booleanRef2 = this.f100636d;
            long j7 = this.f100635c;
            OwnerService.a(j7, this.f100633a, booleanRef2, booleanRef, j7, true);
            com.bilibili.ship.theseus.united.page.view.j jVar = ownerService.f100616f.f104016y;
            if (jVar != null) {
                jVar.f104095c = true;
            }
            f fVar2 = (f) objectRef.element;
            if (fVar2 != null) {
                fVar2.a();
            }
            ownerService.h.f100674d.tryEmit(Boolean.TRUE);
            Lazy lazy = FollowPopupUtil.f82614a;
            FollowPopupUtil.Scene scene = FollowPopupUtil.Scene.Detail;
            if (com.bilibili.playerbizcommonv2.utils.p.d()) {
                Log.i("FollowPopupUtil-showPopup", "[playerbizcommonv2-FollowPopupUtil-showPopup] HD platform, ignore.");
                return false;
            }
            if (!RomUtils.isOppoRom()) {
                Log.i("FollowPopupUtil-showPopup", "[playerbizcommonv2-FollowPopupUtil-showPopup] Not oppo device, ignore.");
                return false;
            }
            if (!((Boolean) com.bilibili.playerbizcommonv2.widget.popup.b.f82626c.getValue()).booleanValue()) {
                Log.i("FollowPopupUtil-showPopup", "[playerbizcommonv2-FollowPopupUtil-showPopup] Not hit follow popup dd, ignore.");
                return false;
            }
            Duration.Companion companion = Duration.Companion;
            long j8 = FollowPopupUtil.a().a.getLong("follow_popup_last_stamp", 0L);
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            long duration = DurationKt.toDuration(j8, durationUnit);
            long duration2 = DurationKt.toDuration(System.currentTimeMillis(), durationUnit);
            int i7 = FollowPopupUtil.a().a.getInt("follow_popup_count", 0);
            int i8 = Duration.compareTo-LRDsOJo(Duration.minus-LRDsOJo(duration2, duration), ((Duration) com.bilibili.playerbizcommonv2.widget.popup.b.f82624a.getValue()).unbox-impl());
            ComponentActivity componentActivity = ownerService.f100622m;
            if (i8 > 0) {
                FollowPopupUtil.a().o("follow_popup_last_stamp", System.currentTimeMillis());
                FollowPopupUtil.a().n("follow_popup_count", 0);
                FollowPopupUtil.a().n("follow_popup_count", 1);
                FollowPopupUtil.b(componentActivity, scene);
                return false;
            }
            if (i7 >= ((Number) com.bilibili.playerbizcommonv2.widget.popup.b.f82625b.getValue()).intValue()) {
                com.bilibili.biligame.ui.feed.preload.b.a("[playerbizcommonv2-FollowPopupUtil-showPopup] ", C4277b.a(i7, ", ignore.", G0.b.a("last: ", Duration.toString-impl(duration), ", current: ", Duration.toString-impl(duration2), ", count: ")), "FollowPopupUtil-showPopup");
                return false;
            }
            FollowPopupUtil.a().n("follow_popup_count", 1 + i7);
            FollowPopupUtil.b(componentActivity, scene);
            return false;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final boolean onUnFollowError(Throwable th) {
            Application fapp = FoundationAlias.getFapp();
            Ref.BooleanRef booleanRef = this.f100637e;
            Ref.BooleanRef booleanRef2 = this.f100636d;
            long j7 = this.f100635c;
            OwnerService.a(j7, this.f100633a, booleanRef2, booleanRef, j7, false);
            if (!sh1.h.a(th)) {
                return false;
            }
            sh1.o.e(fapp, "OwnerService_onUnFollowError");
            return true;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final boolean onUnFollowSuccess() {
            Ref.BooleanRef booleanRef = this.f100637e;
            long j7 = this.f100635c;
            OwnerService.a(j7, this.f100633a, this.f100636d, booleanRef, j7, false);
            f fVar = (f) this.f100634b.element;
            if (fVar == null) {
                return false;
            }
            fVar.a();
            return false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.ObjectRef<f> f100638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OwnerService f100639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f100640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.BooleanRef f100641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Ref.BooleanRef f100642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Ref.BooleanRef f100643f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Ref.BooleanRef f100644g;

        public b(Ref.ObjectRef<f> objectRef, OwnerService ownerService, a aVar, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, Ref.BooleanRef booleanRef4) {
            this.f100638a = objectRef;
            this.f100639b = ownerService;
            this.f100640c = aVar;
            this.f100641d = booleanRef;
            this.f100642e = booleanRef2;
            this.f100643f = booleanRef3;
            this.f100644g = booleanRef4;
        }

        public final String a() {
            return this.f100639b.f100625p.getCount();
        }

        public final String b() {
            d.a aVar = (d.a) this.f100639b.f100612b.f104057d.getValue();
            return aVar != null ? aVar.f104063f : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00cd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.bilibili.relation.widget.FollowButtonConfig c() {
            /*
                Method dump skipped, instruction units count: 353
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService.b.c():com.bilibili.relation.widget.FollowButtonConfig");
        }

        public final com.bilibili.ship.theseus.united.page.view.j d() {
            return this.f100639b.f100616f.f104016y;
        }

        public final boolean e() {
            return this.f100639b.f100618i.f99182c;
        }

        public final boolean f() {
            OwnerService ownerService = this.f100639b;
            return ((Boolean) ownerService.f100616f.f104011t.getValue()).booleanValue() && (ownerService.f100612b.d() || this.f100642e.element || ownerService.d());
        }

        public final String g() {
            return this.f100639b.f100612b.g();
        }

        public final boolean h() {
            return this.f100643f.element && !this.f100639b.d();
        }

        public final void i() {
            this.f100639b.f100625p.b();
        }

        public final String j() {
            d.a aVar = (d.a) this.f100639b.f100612b.f104057d.getValue();
            return aVar != null ? aVar.f104066j : null;
        }
    }

    @Inject
    public OwnerService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull BusinessType businessType, @NotNull RelationRepository relationRepository, @NotNull C7893a c7893a, @NotNull r rVar, @NotNull ActivityColorRepository activityColorRepository, @NotNull IControlContainerService iControlContainerService, @NotNull PageReportService pageReportService, @NotNull t tVar, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull Lifecycle lifecycle, @NotNull com.bilibili.ship.theseus.united.page.intro.module.owner.a aVar2, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull PopupWindowRepository popupWindowRepository, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar3, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f100611a = coroutineScope;
        this.f100612b = dVar;
        this.f100613c = c8043a;
        this.f100614d = aVar;
        this.f100615e = businessType;
        this.f100616f = relationRepository;
        this.f100617g = c7893a;
        this.h = rVar;
        this.f100618i = activityColorRepository;
        this.f100619j = iControlContainerService;
        this.f100620k = pageReportService;
        this.f100621l = tVar;
        this.f100622m = componentActivity;
        this.f100623n = hVar;
        this.f100624o = lifecycle;
        this.f100625p = aVar2;
        this.f100626q = cVar;
        this.f100627r = popupWindowRepository;
        this.f100628s = theseusFloatLayerService;
        this.f100629t = iPlayerCoreService;
        this.f100630u = aVar3;
        this.f100631v = introContentSizeRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    public static final void a(long j7, OwnerService ownerService, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, long j8, boolean z6) {
        if (j7 != j8 || ownerService.f100612b.d() == z6) {
            return;
        }
        if (z6) {
            booleanRef.element = true;
            if (ownerService.f100619j.getScreenModeType() != ScreenModeType.THUMB) {
                booleanRef2.element = false;
            }
        }
        ownerService.f100612b.i(z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService r5, com.bilibili.playerbizcommonv2.utils.i r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService.b(com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService, com.bilibili.playerbizcommonv2.utils.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService.c(com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean d() {
        com.bilibili.ship.theseus.united.page.view.d dVar = this.f100612b;
        boolean z6 = false;
        if (dVar.f() <= 0) {
            return false;
        }
        if (com.bilibili.ship.theseus.united.utils.e.c() == dVar.f()) {
            z6 = true;
        }
        return z6;
    }

    @Nullable
    public final RunningUIComponent e() {
        if (this.f100621l.f104125a.f104105b.f104092a) {
            return null;
        }
        com.bilibili.ship.theseus.united.page.view.d dVar = this.f100612b;
        long jF = dVar.f();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        booleanRef3.element = dVar.d();
        Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
        booleanRef4.element = !booleanRef3.element;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return new RunningUIComponent(new OwnerComponent(new b(objectRef, this, new a(this, objectRef, jF, booleanRef3, booleanRef4), booleanRef2, booleanRef3, booleanRef4, booleanRef), this.f100631v.f100020a, this.f100630u), 0, new OwnerService$create$1(objectRef, this, jF, booleanRef3, booleanRef4, null), 2);
    }
}
