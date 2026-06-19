package com.bilibili.ship.theseus.ugc.miniplayer;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mini.player.biz.d;
import com.bilibili.mini.player.common.utils.i;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import com.bilibili.ship.theseus.united.page.miniplayer.f;
import com.bilibili.ship.theseus.united.page.tab.u;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import ev0.InterfaceC7008a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/miniplayer/UGCRestoreSharedPlayService.class */
@StabilityInferred(parameters = 0)
public final class UGCRestoreSharedPlayService implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f97961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f97962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f97963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f97964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f97965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<Av0.a> f97966g;

    @NotNull
    public final TheseusCommentService.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final u f97967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f97968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C7893a.C1318a> f97969k = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f97970l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.miniplayer.UGCRestoreSharedPlayService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/miniplayer/UGCRestoreSharedPlayService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCRestoreSharedPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.miniplayer.UGCRestoreSharedPlayService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/miniplayer/UGCRestoreSharedPlayService$1$1.class */
        public static final class C09001 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UGCRestoreSharedPlayService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09001(UGCRestoreSharedPlayService uGCRestoreSharedPlayService, Continuation<? super C09001> continuation) {
                super(2, continuation);
                this.this$0 = uGCRestoreSharedPlayService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09001 c09001 = new C09001(this.this$0, continuation);
                c09001.L$0 = obj;
                return c09001;
            }

            public final Object invoke(Lifecycle.Event event, Continuation<? super Unit> continuation) {
                return create(event, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_START && this.this$0.f97969k.getValue() != null) {
                    UGCRestoreSharedPlayService uGCRestoreSharedPlayService = this.this$0;
                    if (uGCRestoreSharedPlayService.f97970l) {
                        uGCRestoreSharedPlayService.f97970l = false;
                        Integer numBoxInt = null;
                        d dVar = (d) BLRouter.get$default(BLRouter.INSTANCE, d.class, (String) null, 2, (Object) null);
                        Bundle bundleB = dVar != null ? dVar.b() : null;
                        i.a();
                        if (bundleB != null) {
                            numBoxInt = Boxing.boxInt(bundleB.getInt("mini_player_shared_record_id"));
                        }
                        long j7 = 0;
                        long j8 = bundleB != null ? bundleB.getLong("mini_player_shared_avid") : 0L;
                        if (bundleB != null) {
                            j7 = bundleB.getLong("mini_player_shared_cid");
                        }
                        this.this$0.b(numBoxInt, j8, j7, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCRestoreSharedPlayService uGCRestoreSharedPlayService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCRestoreSharedPlayService;
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
                Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f97961b);
                C09001 c09001 = new C09001(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, c09001, this) == coroutine_suspended) {
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
    public UGCRestoreSharedPlayService(@NotNull CoroutineScope coroutineScope, @NotNull Lifecycle lifecycle, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull PlayerContainer playerContainer, @NotNull rW0.a<InterfaceC7008a> aVar, @NotNull C8043a c8043a, @NotNull List<Av0.a> list, @NotNull TheseusCommentService.c cVar, @NotNull u uVar, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository) {
        this.f97960a = coroutineScope;
        this.f97961b = lifecycle;
        this.f97962c = uGCPlaybackRepository;
        this.f97963d = playerContainer;
        this.f97964e = aVar;
        this.f97965f = c8043a;
        this.f97966g = list;
        this.h = cVar;
        this.f97967i = uVar;
        this.f97968j = theseusPageUIStyleRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.ship.theseus.united.page.miniplayer.f
    public final void a() {
        this.f97970l = true;
    }

    @Override // com.bilibili.ship.theseus.united.page.miniplayer.f
    public final void b(@Nullable Integer num, long j7, long j8, @Nullable Bundle bundle) {
        Object next;
        IPlayerContainer.SharedRecord sharedRecordRetrieveSharedRecord;
        MutableStateFlow<C7893a.C1318a> mutableStateFlow = this.f97969k;
        try {
            Iterator<T> it = this.f97966g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Av0.a aVar = (Av0.a) next;
                C7893a.C1318a c1318a = (C7893a.C1318a) mutableStateFlow.getValue();
                if (c1318a != null && aVar.f591b == c1318a.f123395a.f123398b) {
                    break;
                }
            }
            Av0.a aVar2 = (Av0.a) next;
            if (aVar2 == null) {
                BLog.i("UGCRestoreSharedPlayService-tryToRestorePlay", ("[theseus-ugc-UGCRestoreSharedPlayService-tryToRestorePlay] ") + "unnecessary restore to play, because last episode is null");
                if (num != null) {
                    IPlayerContainer.Companion.forceDestroyShareRecord(num.intValue());
                }
                return;
            }
            if (num != null) {
                sharedRecordRetrieveSharedRecord = IPlayerContainer.Companion.retrieveSharedRecord(num.intValue());
            } else {
                sharedRecordRetrieveSharedRecord = null;
            }
            if (j7 == 0 || j8 == 0) {
                BLog.i("UGCRestoreSharedPlayService-tryToRestorePlay", ("[theseus-ugc-UGCRestoreSharedPlayService-tryToRestorePlay] ") + "restore to play but no play id");
                this.f97963d.attachByShared(PlayerSharingType.NORMAL, (PlayerSharingBundle) null);
                this.f97962c.f(aVar2, null, null, 0);
            } else {
                d(sharedRecordRetrieveSharedRecord, aVar2, j7, j8, bundle);
            }
        } finally {
            mutableStateFlow.setValue((Object) null);
        }
    }

    @Override // com.bilibili.ship.theseus.united.page.miniplayer.f
    public final void c(@Nullable C7893a.C1318a c1318a) {
        this.f97969k.setValue(c1318a);
        Long lValueOf = null;
        Long lValueOf2 = c1318a != null ? Long.valueOf(c1318a.f123395a.f123397a) : null;
        if (c1318a != null) {
            lValueOf = Long.valueOf(c1318a.f123395a.f123398b);
        }
        defpackage.a.b("[theseus-ugc-UGCRestoreSharedPlayService-leavePageAndSaveLast] ", "leave page and save last ugc ep, avid:" + lValueOf2 + ", cid:" + lValueOf, "UGCRestoreSharedPlayService-leavePageAndSaveLast");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(tv.danmaku.biliplayerv2.IPlayerContainer.SharedRecord r24, Av0.a r25, long r26, long r28, android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.miniplayer.UGCRestoreSharedPlayService.d(tv.danmaku.biliplayerv2.IPlayerContainer$SharedRecord, Av0.a, long, long, android.os.Bundle):void");
    }
}
