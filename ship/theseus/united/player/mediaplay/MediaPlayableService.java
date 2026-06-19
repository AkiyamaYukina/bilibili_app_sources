package com.bilibili.ship.theseus.united.player.mediaplay;

import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.playershared.PlayArc;
import com.bilibili.ship.theseus.united.bean.VideoDimension;
import com.bilibili.ship.theseus.united.page.AutoPlayService;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import ev0.j;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import lv0.C7893a;
import mv0.C8043a;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableService.class */
@StabilityInferred(parameters = 0)
public final class MediaPlayableService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f104493a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayableService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.keel.player.j $playable;
        final com.bilibili.ship.theseus.keel.player.h $player;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.keel.player.h hVar, com.bilibili.ship.theseus.keel.player.j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$player = hVar;
            this.$playable = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$player, this.$playable, continuation);
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
                com.bilibili.ship.theseus.keel.player.h hVar = this.$player;
                com.bilibili.ship.theseus.keel.player.j jVar = this.$playable;
                this.label = 1;
                if (hVar.q(jVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayableService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final j.a $initial;
        final com.bilibili.ship.theseus.keel.player.h $player;
        int label;
        final MediaPlayableService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(j.a aVar, MediaPlayableService mediaPlayableService, com.bilibili.ship.theseus.keel.player.h hVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$initial = aVar;
            this.this$0 = mediaPlayableService;
            this.$player = hVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$initial, this.this$0, this.$player, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x012c A[EDGE_INSN: B:62:0x012c->B:38:0x012c BREAK  A[LOOP:0: B:31:0x00e2->B:63:?]] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01ad  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 520
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayableService.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayableService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayableService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final j.a $initial;
        final n $pageRunningMediaService;
        final f $playInitial;
        final com.bilibili.ship.theseus.keel.player.j $playable;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(j.a aVar, com.bilibili.ship.theseus.keel.player.j jVar, f fVar, n nVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$initial = aVar;
            this.$playable = jVar;
            this.$playInitial = fVar;
            this.$pageRunningMediaService = nVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$initial, this.$playable, this.$playInitial, this.$pageRunningMediaService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            n nVar;
            Throwable th;
            n nVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                j.a aVar = this.$initial;
                l lVar = new l(aVar.f117658b, aVar.f117659c, this.$playable, this.$playInitial);
                nVar = this.$pageRunningMediaService;
                nVar.f104531a.setValue(lVar);
                try {
                    this.L$0 = nVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    nVar2 = nVar;
                    nVar2.f104531a.setValue((Object) null);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n nVar3 = (n) this.L$0;
                nVar2 = nVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    nVar = nVar3;
                } catch (Throwable th3) {
                    th = th3;
                    nVar2.f104531a.setValue((Object) null);
                    throw th;
                }
            }
            nVar2 = nVar;
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public MediaPlayableService(@NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull n nVar, @NotNull AutoPlayService autoPlayService, @NotNull C7893a c7893a, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull CoroutineScope coroutineScope, @NotNull j.a aVar, @NotNull IPlayerCoreService iPlayerCoreService) {
        MutableStateFlow<C8044b> mutableStateFlow;
        Object value;
        C8044b c8044b;
        String str;
        String str2;
        this.f104493a = iPlayerCoreService;
        boolean z6 = aVar.f117660d instanceof f.e;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass1(hVar, jVar, null), 1, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(aVar, this, hVar, null), 3, (Object) null);
        f fVar = aVar.f117660d;
        if (!(fVar instanceof f.e) && autoPlayService.h) {
            hVar.p();
        }
        if (fVar instanceof f.c) {
            PlayArc playArc = ((f.c) fVar).f104516a.getPlayArc();
            c7893a.e(new C7893a.C1318a(playArc.getAid(), playArc.getCid()));
            Pair<Long, Float> pair = c7893a.f123390c;
            if (pair == null || playArc.getCid() != ((Number) pair.getFirst()).longValue()) {
                c7893a.f123390c = null;
            }
            Parcelable.Creator<PlayingAreaDescription> creator = PlayingAreaDescription.CREATOR;
            Parcelable.Creator<VideoDimension> creator2 = VideoDimension.CREATOR;
            c7893a.d(PlayingAreaDescription.a.a(com.bilibili.ship.theseus.united.bean.i.b(playArc.getDimension())));
        } else {
            c7893a.e(new C7893a.C1318a(aVar.f117658b, aVar.f117659c));
        }
        do {
            mutableStateFlow = c8043a.f123876a;
            value = mutableStateFlow.getValue();
            c8044b = (C8044b) value;
            str = aVar.f117664i;
            str = str == null ? "" : str;
            str2 = aVar.f117665j;
        } while (!mutableStateFlow.compareAndSet(value, C8044b.a(c8044b, aVar.h, aVar.f117663g, str, str2 == null ? "" : str2, 0, 82)));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass4(aVar, jVar, fVar, nVar, null), 1, (Object) null);
    }
}
