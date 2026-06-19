package com.bilibili.ship.theseus.ugc.play.schedule;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.play.schedule.PlaybackMode;
import com.bilibili.ship.theseus.ugc.play.schedule.e;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/UGCEpisodeListRepository.class */
@StabilityInferred(parameters = 0)
public final class UGCEpisodeListRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f98170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f98171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<e>> f98172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<e>> f98173d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/UGCEpisodeListRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final List<Av0.a> $unitedEpisodes;
        int label;
        final UGCEpisodeListRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/UGCEpisodeListRepository$1$1.class */
        public static final class C09101 extends SuspendLambda implements Function2<List<? extends C6353o>, Continuation<? super Unit>, Object> {
            final List<Av0.a> $unitedEpisodes;
            Object L$0;
            int label;
            final UGCEpisodeListRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09101(UGCEpisodeListRepository uGCEpisodeListRepository, List<Av0.a> list, Continuation<? super C09101> continuation) {
                super(2, continuation);
                this.this$0 = uGCEpisodeListRepository;
                this.$unitedEpisodes = list;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09101 c09101 = new C09101(this.this$0, this.$unitedEpisodes, continuation);
                c09101.L$0 = obj;
                return c09101;
            }

            public final Object invoke(List<C6353o> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                if (list.isEmpty()) {
                    MutableStateFlow<List<e>> mutableStateFlow = this.this$0.f98172c;
                    List<Av0.a> list2 = this.$unitedEpisodes;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new e((Av0.a) it.next(), e.a.c.f98184a));
                    }
                    List listListOf = CollectionsKt.listOf(new d(arrayList));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = listListOf.iterator();
                    while (it2.hasNext()) {
                        arrayList2.addAll(((d) it2.next()).f98179a);
                    }
                    mutableStateFlow.setValue(arrayList2);
                } else {
                    MutableStateFlow<List<e>> mutableStateFlow2 = this.this$0.f98172c;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Iterator<T> it4 = ((C6353o) it3.next()).h.iterator();
                        while (it4.hasNext()) {
                            Iterator<T> it5 = ((Z) it4.next()).f101648d.iterator();
                            while (it5.hasNext()) {
                                Iterator<T> it6 = ((C6355q) it5.next()).f101689j.iterator();
                                while (it6.hasNext()) {
                                    arrayList3.add(new e((Av0.a) it6.next(), e.a.c.f98184a));
                                }
                            }
                        }
                    }
                    mutableStateFlow2.setValue(arrayList3);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCEpisodeListRepository uGCEpisodeListRepository, List<Av0.a> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCEpisodeListRepository;
            this.$unitedEpisodes = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$unitedEpisodes, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UGCEpisodeListRepository uGCEpisodeListRepository = this.this$0;
                StateFlow<List<C6353o>> stateFlow = uGCEpisodeListRepository.f98170a.f101572c;
                C09101 c09101 = new C09101(uGCEpisodeListRepository, this.$unitedEpisodes, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c09101, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/UGCEpisodeListRepository$a.class */
    public interface a {
        @Nullable
        e a(@NotNull List<e> list, @Nullable Av0.a aVar) throws IllegalArgumentException;
    }

    @Inject
    public UGCEpisodeListRepository(@NotNull CoroutineScope coroutineScope, @NotNull List<Av0.a> list, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull IPlayerSettingService iPlayerSettingService) {
        this.f98170a = unitedSeasonDetailRepository;
        this.f98171b = iPlayerSettingService;
        MutableStateFlow<List<e>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f98172c = MutableStateFlow;
        this.f98173d = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, list, null), 3, (Object) null);
    }

    @NotNull
    public final List<e> a() {
        return (List) this.f98173d.getValue();
    }

    @NotNull
    public final PlaybackMode b() {
        PlaybackMode.a aVar = PlaybackMode.Companion;
        int i7 = this.f98171b.getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        aVar.getClass();
        return PlaybackMode.a.a(i7);
    }

    @Nullable
    public final e c(@Nullable Av0.a aVar) {
        e eVarA;
        try {
            eVarA = b().toStrategy().a(a(), aVar);
        } catch (IllegalArgumentException e7) {
            Long lValueOf = aVar != null ? Long.valueOf(aVar.f590a) : null;
            Long lValueOf2 = aVar != null ? Long.valueOf(aVar.f591b) : null;
            String message = e7.getMessage();
            StringBuilder sbA = Mj.b.a("ugc auto play next error avid:", lValueOf, lValueOf2, " cid:", " error_message:");
            sbA.append(message);
            BLog.e(sbA.toString());
            eVarA = null;
        }
        return eVarA;
    }
}
