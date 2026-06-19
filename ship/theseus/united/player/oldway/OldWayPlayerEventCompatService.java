package com.bilibili.ship.theseus.united.player.oldway;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.Observer;
import bi0.AbstractC5109a;
import com.bilibili.app.authorspace.ui.k;
import com.bilibili.app.authorspace.ui.l;
import com.bilibili.biligame.api.BiliGameCardInfo;
import com.bilibili.biligame.web2.bridge.GameActionJsBridgeHandler;
import com.bilibili.bus.ChannelOperation;
import com.bilibili.bus.Violet;
import com.bilibili.comm.charge.data.ChargePlusMessage;
import com.bilibili.community.like.LikeRepository;
import com.bilibili.pegasus.components.K;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import com.bilibili.ship.theseus.united.page.charge.ChargeRepository;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import ev0.InterfaceC7008a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerEventCompatService.class */
@StabilityInferred(parameters = 0)
public final class OldWayPlayerEventCompatService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f104688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f104689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f104690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final RelationRepository f104691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ChargeRepository f104692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f104693g;

    @NotNull
    public final Lifecycle h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f104694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f104695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Observer<Mq0.e> f104696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Observer<Mq0.c> f104697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Observer<Mq0.d> f104698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Observer<Mq0.a> f104699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Observer<ChargePlusMessage> f104700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Observer<AbstractC5109a.c> f104701p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Observer<AbstractC5109a.f> f104702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Observer<AbstractC5109a.e> f104703r;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerEventCompatService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerEventCompatService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayPlayerEventCompatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OldWayPlayerEventCompatService oldWayPlayerEventCompatService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oldWayPlayerEventCompatService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final OldWayPlayerEventCompatService oldWayPlayerEventCompatService = this.this$0;
                    oldWayPlayerEventCompatService.getClass();
                    Violet violet = Violet.INSTANCE;
                    ChannelOperation channelOperationOfChannel = violet.ofChannel(Mq0.e.class);
                    final int i8 = 0;
                    Observer observer = new Observer(oldWayPlayerEventCompatService, i8) { // from class: com.bilibili.ship.theseus.united.player.oldway.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f104727a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f104728b;

                        {
                            this.f104727a = i8;
                            this.f104728b = oldWayPlayerEventCompatService;
                        }

                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            OldWayPlayerEventCompatService oldWayPlayerEventCompatService2;
                            Object objPrevious;
                            switch (this.f104727a) {
                                case 0:
                                    List list = (List) obj2;
                                    if (!list.isEmpty()) {
                                        ListIterator listIterator = list.listIterator(list.size());
                                        while (true) {
                                            boolean zHasPrevious = listIterator.hasPrevious();
                                            oldWayPlayerEventCompatService2 = (OldWayPlayerEventCompatService) this.f104728b;
                                            if (zHasPrevious) {
                                                objPrevious = listIterator.previous();
                                                if (((Mq0.e) objPrevious).f16325a == oldWayPlayerEventCompatService2.f104690d.a()) {
                                                }
                                            } else {
                                                objPrevious = null;
                                            }
                                        }
                                        Mq0.e eVar = (Mq0.e) objPrevious;
                                        if (eVar != null) {
                                            RelationRepository relationRepository = oldWayPlayerEventCompatService2.f104691e;
                                            boolean z6 = eVar.f16326b;
                                            relationRepository.y(z6);
                                            RelationRepository relationRepository2 = oldWayPlayerEventCompatService2.f104691e;
                                            long jA = relationRepository2.f103995c.a();
                                            LikeRepository.a.getClass();
                                            LikeRepository.e(jA, eVar.f16327c);
                                            if (z6) {
                                                relationRepository2.v(false);
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    GameActionJsBridgeHandler gameActionJsBridgeHandler = (GameActionJsBridgeHandler) this.f104728b;
                                    st.b bVar = gameActionJsBridgeHandler.a;
                                    Iterator it = bVar.d.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        int i9 = ((BiliGameCardInfo) entry.getValue()).gameBaseId;
                                        bVar.b0(String.valueOf(i9), ((BiliGameCardInfo) entry.getValue()).channelId, ((BiliGameCardInfo) entry.getValue()).channelExtra, (String) bVar.f.get(String.valueOf(i9)), gameActionJsBridgeHandler, true);
                                    }
                                    break;
                            }
                        }
                    };
                    ComponentActivity componentActivity = oldWayPlayerEventCompatService.f104688b;
                    oldWayPlayerEventCompatService.f104696k = channelOperationOfChannel.observeCachedInactiveUnSticky(componentActivity, observer);
                    oldWayPlayerEventCompatService.f104697l = violet.ofChannel(Mq0.c.class).observeCachedInactiveUnSticky(componentActivity, new Observer(oldWayPlayerEventCompatService) { // from class: com.bilibili.ship.theseus.united.player.oldway.d

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final OldWayPlayerEventCompatService f104729a;

                        {
                            this.f104729a = oldWayPlayerEventCompatService;
                        }

                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            OldWayPlayerEventCompatService oldWayPlayerEventCompatService2;
                            Object objPrevious;
                            List list = (List) obj2;
                            if (list.isEmpty()) {
                                return;
                            }
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                boolean zHasPrevious = listIterator.hasPrevious();
                                oldWayPlayerEventCompatService2 = this.f104729a;
                                if (!zHasPrevious) {
                                    objPrevious = null;
                                    break;
                                } else {
                                    objPrevious = listIterator.previous();
                                    if (((Mq0.c) objPrevious).f16318a == oldWayPlayerEventCompatService2.f104690d.a()) {
                                        break;
                                    }
                                }
                            }
                            Mq0.c cVar = (Mq0.c) objPrevious;
                            if (cVar == null) {
                                return;
                            }
                            oldWayPlayerEventCompatService2.f104691e.v(cVar.f16319b);
                        }
                    });
                    oldWayPlayerEventCompatService.f104698m = violet.ofChannel(Mq0.d.class).observeCachedInactiveUnSticky(componentActivity, new k(oldWayPlayerEventCompatService, 1));
                    oldWayPlayerEventCompatService.f104699n = violet.ofChannel(Mq0.a.class).observeCachedInactiveUnSticky(componentActivity, new com.bilibili.bililive.room.ui.roomv3.superchat.a(oldWayPlayerEventCompatService, 1));
                    oldWayPlayerEventCompatService.f104700o = violet.ofChannel(ChargePlusMessage.class).observeCachedInactiveUnSticky(componentActivity, new l(oldWayPlayerEventCompatService, 2));
                    oldWayPlayerEventCompatService.f104701p = violet.ofChannel(AbstractC5109a.c.class).observeCachedInactiveUnSticky(componentActivity, new com.bilibili.bililive.room.ui.roomv3.superchat.b(oldWayPlayerEventCompatService, 1));
                    oldWayPlayerEventCompatService.f104702q = violet.ofChannel(AbstractC5109a.f.class).observeCachedInactiveUnSticky(componentActivity, new K(oldWayPlayerEventCompatService, 1));
                    oldWayPlayerEventCompatService.f104703r = violet.ofChannel(AbstractC5109a.e.class).observeCachedInactiveUnSticky(componentActivity, new Observer(oldWayPlayerEventCompatService) { // from class: com.bilibili.ship.theseus.united.player.oldway.e

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final OldWayPlayerEventCompatService f104730a;

                        {
                            this.f104730a = oldWayPlayerEventCompatService;
                        }

                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            List list = (List) obj2;
                            if (list.isEmpty() || ((AbstractC5109a.e) CollectionsKt.lastOrNull(list)) == null) {
                                return;
                            }
                            this.f104730a.f104695j.dispatchSubtitleDragChanged();
                        }
                    });
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
                OldWayPlayerEventCompatService oldWayPlayerEventCompatService2 = this.this$0;
                Observer<Mq0.e> observer2 = oldWayPlayerEventCompatService2.f104696k;
                if (observer2 != null) {
                    Violet.INSTANCE.ofChannel(Mq0.e.class).removeObserver(observer2);
                }
                Observer<Mq0.c> observer3 = oldWayPlayerEventCompatService2.f104697l;
                if (observer3 != null) {
                    Violet.INSTANCE.ofChannel(Mq0.c.class).removeObserver(observer3);
                }
                Observer<Mq0.d> observer4 = oldWayPlayerEventCompatService2.f104698m;
                if (observer4 != null) {
                    Violet.INSTANCE.ofChannel(Mq0.d.class).removeObserver(observer4);
                }
                Observer<Mq0.a> observer5 = oldWayPlayerEventCompatService2.f104699n;
                if (observer5 != null) {
                    Violet.INSTANCE.ofChannel(Mq0.a.class).removeObserver(observer5);
                }
                Observer<ChargePlusMessage> observer6 = oldWayPlayerEventCompatService2.f104700o;
                if (observer6 != null) {
                    Violet.INSTANCE.ofChannel(ChargePlusMessage.class).removeObserver(observer6);
                }
                Observer<AbstractC5109a.c> observer7 = oldWayPlayerEventCompatService2.f104701p;
                if (observer7 != null) {
                    Violet.INSTANCE.ofChannel(AbstractC5109a.c.class).removeObserver(observer7);
                }
                Observer<AbstractC5109a.f> observer8 = oldWayPlayerEventCompatService2.f104702q;
                if (observer8 != null) {
                    Violet.INSTANCE.ofChannel(AbstractC5109a.f.class).removeObserver(observer8);
                }
                Observer<AbstractC5109a.e> observer9 = oldWayPlayerEventCompatService2.f104703r;
                if (observer9 != null) {
                    Violet.INSTANCE.ofChannel(AbstractC5109a.e.class).removeObserver(observer9);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerEventCompatService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerEventCompatService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayPlayerEventCompatService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerEventCompatService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerEventCompatService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OldWayPlayerEventCompatService f104704a;

            public a(OldWayPlayerEventCompatService oldWayPlayerEventCompatService) {
                this.f104704a = oldWayPlayerEventCompatService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                if (((Lifecycle.Event) obj) == Lifecycle.Event.ON_PAUSE) {
                    OldWayPlayerEventCompatService oldWayPlayerEventCompatService = this.f104704a;
                    long jA = oldWayPlayerEventCompatService.f104690d.a();
                    RelationRepository relationRepository = oldWayPlayerEventCompatService.f104691e;
                    Violet.INSTANCE.sendMsg(new VideoStatusMessage(jA, relationRepository.g(), relationRepository.j(), relationRepository.i(), relationRepository.a(), relationRepository.l(), relationRepository.f(), relationRepository.b()));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OldWayPlayerEventCompatService oldWayPlayerEventCompatService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = oldWayPlayerEventCompatService;
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
                Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.h);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (eventFlow.collect(aVar, this) == coroutine_suspended) {
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
    public OldWayPlayerEventCompatService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull RelationRepository relationRepository, @NotNull ChargeRepository chargeRepository, @NotNull rW0.a<InterfaceC7008a> aVar2, @NotNull Lifecycle lifecycle, @NotNull IRenderContainerService iRenderContainerService, @NotNull IInteractLayerService iInteractLayerService) {
        this.f104687a = coroutineScope;
        this.f104688b = componentActivity;
        this.f104689c = dVar;
        this.f104690d = aVar;
        this.f104691e = relationRepository;
        this.f104692f = chargeRepository;
        this.f104693g = aVar2;
        this.h = lifecycle;
        this.f104694i = iRenderContainerService;
        this.f104695j = iInteractLayerService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
