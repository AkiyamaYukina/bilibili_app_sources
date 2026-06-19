package com.bilibili.ship.theseus.united.page.weblayer;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.IJsBridgeBehavior;
import com.bilibili.app.provider.IUiObserveContainerStatusBehavior;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.jsbridge.common.BaseJsBridgeCallHandlerV2;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.core.sender.DanmakuSendParams;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService.class */
@StabilityInferred(parameters = 0)
public final class BgmFloatLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f104132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f104133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f104134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.autofloat.a f104135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final RelationRepository f104136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f104137g;

    @NotNull
    public final C6452a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f104138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final DanmakuCompoundRepository f104139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f104140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f104141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f104142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f104143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Context f104144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final IToastService f104145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.activitywindow.m f104146q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f104147r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f104148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f104149t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f104150u = new HashMap<>();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.BgmFloatLayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BgmFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.BgmFloatLayerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService$1$1.class */
        public static final class C11561 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final BgmFloatLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11561(BgmFloatLayerService bgmFloatLayerService, Continuation<? super C11561> continuation) {
                super(2, continuation);
                this.this$0 = bgmFloatLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11561 c11561 = new C11561(this.this$0, continuation);
                c11561.L$0 = obj;
                return c11561;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    BgmFloatLayerService bgmFloatLayerService = this.this$0;
                    this.label = 1;
                    bgmFloatLayerService.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new BgmFloatLayerService$showSlangPediaPanel$2(bgmFloatLayerService, str, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
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
        public AnonymousClass1(BgmFloatLayerService bgmFloatLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bgmFloatLayerService;
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
                BgmFloatLayerService bgmFloatLayerService = this.this$0;
                SharedFlow<String> sharedFlow = bgmFloatLayerService.h.f104245b;
                C11561 c11561 = new C11561(bgmFloatLayerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c11561, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.BgmFloatLayerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BgmFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.BgmFloatLayerService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final BgmFloatLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BgmFloatLayerService bgmFloatLayerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = bgmFloatLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    BgmFloatLayerService bgmFloatLayerService = this.this$0;
                    this.label = 1;
                    bgmFloatLayerService.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new BgmFloatLayerService$showSlangPediaPanel$2(bgmFloatLayerService, str, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
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
        public AnonymousClass2(BgmFloatLayerService bgmFloatLayerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = bgmFloatLayerService;
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
                BgmFloatLayerService bgmFloatLayerService = this.this$0;
                SharedFlow<String> sharedFlow = bgmFloatLayerService.f104135e.f98980d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(bgmFloatLayerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService$a.class */
    public final class a implements IUiObserveContainerStatusBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BgmFloatLayerService f104151a;

        public a(BgmFloatLayerService bgmFloatLayerService) {
            this.f104151a = bgmFloatLayerService;
        }

        @NotNull
        public final Map<String, String> getCallbackIdMap() {
            return MapsKt.toMap(this.f104151a.f104150u);
        }

        public final int getContainerStatus() {
            return this.f104151a.f104149t;
        }

        public final boolean getContainerStatusSwitch() {
            return this.f104151a.f104147r;
        }

        public final boolean isDestroyed() {
            return this.f104151a.f104148s;
        }

        public final void release() {
        }

        public final void saveCallbackIdMap(@Nullable String str, @Nullable String str2) {
            if (str == null || str2 == null) {
                return;
            }
            this.f104151a.f104150u.put(str, str2);
        }

        public final void setContainerStatusSwitch(boolean z6) {
            this.f104151a.f104147r = z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService$b.class */
    public final class b extends BaseJsBridgeCallHandlerV2<IJsBridgeBehavior> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BgmFloatLayerService f104152a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@Nullable BgmFloatLayerService bgmFloatLayerService, c cVar) {
            super(cVar);
            this.f104152a = bgmFloatLayerService;
        }

        @NotNull
        public final String[] getSupportFunctions() {
            return new String[]{"syncFollowStatus", "syncFavoriteStatus"};
        }

        @NotNull
        public final String getTag() {
            return "JsBridgeCallHandlerUgcBgmCustom";
        }

        public final void invokeNative(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable String str2) {
            String string;
            int iHashCode = str.hashCode();
            long jL = 0;
            BgmFloatLayerService bgmFloatLayerService = this.f104152a;
            if (iHashCode == -1834611394) {
                if (str.equals("syncFollowStatus") && jSONObject != null) {
                    try {
                        Boolean bool = jSONObject.getBoolean("isFollow");
                        Long l7 = jSONObject.getLong(EditCustomizeSticker.TAG_MID);
                        if (l7.longValue() >= 0 && l7.longValue() == bgmFloatLayerService.f104134d.f()) {
                            long jLongValue = l7.longValue();
                            bool.booleanValue();
                            com.bilibili.community.follow.f fVar = com.bilibili.community.follow.f.a;
                            com.bilibili.community.follow.f.c.a(com.bilibili.community.follow.f.f(jLongValue), bool);
                            if (str2 == null || !(!StringsKt.isBlank(str2))) {
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("code", 0);
                            jSONObject2.put("message", "");
                            callbackToJs(new Object[]{str2, jSONObject2});
                            return;
                        }
                        return;
                    } catch (Exception e7) {
                        BLog.i("BgmFloatLayerService", e7.getMessage());
                        return;
                    }
                }
                return;
            }
            if (iHashCode != 1174542439) {
                if (iHashCode == 1971756073 && str.equals("syncFavoriteStatus") && jSONObject != null) {
                    try {
                        Boolean bool2 = jSONObject.getBoolean("isFavorite");
                        Long l8 = jSONObject.getLong(GameCardButton.extraAvid);
                        if (l8.longValue() >= 0 && l8.longValue() == bgmFloatLayerService.f104137g.a()) {
                            bgmFloatLayerService.f104136f.n(bool2.booleanValue());
                            if (str2 == null || !(!StringsKt.isBlank(str2))) {
                                return;
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("code", 0);
                            jSONObject3.put("message", "");
                            callbackToJs(new Object[]{str2, jSONObject3});
                            return;
                        }
                        return;
                    } catch (Exception e8) {
                        BLog.i("BgmFloatLayerService", e8.getMessage());
                        return;
                    }
                }
                return;
            }
            if (str.equals("sendDanmaku")) {
                try {
                    BLog.i("BgmFloatLayerService", "h5 send danmaku -> " + JsonUtilKt.toJson(jSONObject));
                    IInteractLayerService iInteractLayerService = bgmFloatLayerService.f104138i;
                    com.bilibili.ship.theseus.united.page.view.a aVar = bgmFloatLayerService.f104137g;
                    if (!iInteractLayerService.isDanmakuForbidden() && !bgmFloatLayerService.f104139j.c()) {
                        if (jSONObject != null && (string = jSONObject.getString(TextSource.CFG_CONTENT)) != null && !StringsKt.isBlank(string)) {
                            Integer integer = jSONObject.getInteger("type");
                            int iIntValue = integer != null ? integer.intValue() : 1;
                            Integer integer2 = jSONObject.getInteger(TextSource.CFG_SIZE);
                            int iIntValue2 = integer2 != null ? integer2.intValue() : 25;
                            Integer integer3 = jSONObject.getInteger("color");
                            int iIntValue3 = integer3 != null ? integer3.intValue() : 16777215;
                            IInteractLayerService iInteractLayerService2 = bgmFloatLayerService.f104138i;
                            Context context = bgmFloatLayerService.f104144o;
                            long jA = aVar.a();
                            long jC = aVar.c();
                            com.bilibili.ship.theseus.keel.player.j jVarJ = bgmFloatLayerService.f104143n.j();
                            if (jVarJ != null) {
                                jL = jVarJ.L();
                            }
                            iInteractLayerService2.sendDanmaku(context, new DanmakuSendParams(string, iIntValue, iIntValue2, iIntValue3, (String) null, (String) null, false, 0, false, (Boolean) null, (Long) null, false, (String) null, (Integer) null, (Integer) null, jA, jC, jL, (String) null, 294896, (DefaultConstructorMarker) null));
                            if (str2 == null || !(!StringsKt.isBlank(str2))) {
                                return;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("code", 0);
                            jSONObject4.put("message", "");
                            callbackToJs(new Object[]{str2, jSONObject4});
                            return;
                        }
                        return;
                    }
                    bgmFloatLayerService.f104145p.showToast(new PlayerToast.Builder().location(32).setExtraString("extra_title", bgmFloatLayerService.f104144o.getString(2131847286)).toastItemType(17).duration(5000L).build());
                } catch (Exception e9) {
                    BLog.i("BgmFloatLayerService", e9.getMessage());
                }
            }
        }
    }

    @Inject
    public BgmFloatLayerService(@NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.autofloat.a aVar, @NotNull RelationRepository relationRepository, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull C6452a c6452a, @NotNull IInteractLayerService iInteractLayerService, @NotNull DanmakuCompoundRepository danmakuCompoundRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar3, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull Context context, @NotNull IToastService iToastService, @NotNull com.bilibili.ship.theseus.united.page.activitywindow.m mVar) {
        this.f104131a = coroutineScope;
        this.f104132b = theseusFloatLayerService;
        this.f104133c = gVar;
        this.f104134d = dVar;
        this.f104135e = aVar;
        this.f104136f = relationRepository;
        this.f104137g = aVar2;
        this.h = c6452a;
        this.f104138i = iInteractLayerService;
        this.f104139j = danmakuCompoundRepository;
        this.f104140k = aVar3;
        this.f104141l = cVar;
        this.f104142m = backActionRepository;
        this.f104143n = hVar;
        this.f104144o = context;
        this.f104145p = iToastService;
        this.f104146q = mVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
