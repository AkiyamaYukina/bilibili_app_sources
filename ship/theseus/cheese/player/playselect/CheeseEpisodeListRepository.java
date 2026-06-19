package com.bilibili.ship.theseus.cheese.player.playselect;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.player.playselect.c;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import eu0.C6985d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
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
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playselect/CheeseEpisodeListRepository.class */
@StabilityInferred(parameters = 0)
public final class CheeseEpisodeListRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f90736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f90737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<c>> f90738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<c>> f90739d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playselect.CheeseEpisodeListRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playselect/CheeseEpisodeListRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final List<C6985d> $cheeseEpisodes;
        int label;
        final CheeseEpisodeListRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playselect.CheeseEpisodeListRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playselect/CheeseEpisodeListRepository$1$1.class */
        public static final class C06681 extends SuspendLambda implements Function2<List<? extends C6353o>, Continuation<? super Unit>, Object> {
            final List<C6985d> $cheeseEpisodes;
            Object L$0;
            int label;
            final CheeseEpisodeListRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06681(CheeseEpisodeListRepository cheeseEpisodeListRepository, List<C6985d> list, Continuation<? super C06681> continuation) {
                super(2, continuation);
                this.this$0 = cheeseEpisodeListRepository;
                this.$cheeseEpisodes = list;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06681 c06681 = new C06681(this.this$0, this.$cheeseEpisodes, continuation);
                c06681.L$0 = obj;
                return c06681;
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
                    MutableStateFlow<List<c>> mutableStateFlow = this.this$0.f90738c;
                    List<C6985d> list2 = this.$cheeseEpisodes;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new c.a((C6985d) it.next()));
                    }
                    mutableStateFlow.setValue(arrayList);
                } else {
                    MutableStateFlow<List<c>> mutableStateFlow2 = this.this$0.f90738c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Iterator<T> it3 = ((C6353o) it2.next()).h.iterator();
                        while (it3.hasNext()) {
                            Iterator<T> it4 = ((Z) it3.next()).f101648d.iterator();
                            while (it4.hasNext()) {
                                Iterator<T> it5 = ((C6355q) it4.next()).f101689j.iterator();
                                while (it5.hasNext()) {
                                    arrayList2.add((Av0.a) it5.next());
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        arrayList3.add(new c.b((Av0.a) it6.next()));
                    }
                    mutableStateFlow2.setValue(arrayList3);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseEpisodeListRepository cheeseEpisodeListRepository, List<C6985d> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseEpisodeListRepository;
            this.$cheeseEpisodes = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$cheeseEpisodes, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseEpisodeListRepository cheeseEpisodeListRepository = this.this$0;
                StateFlow<List<C6353o>> stateFlow = cheeseEpisodeListRepository.f90736a.f101572c;
                C06681 c06681 = new C06681(cheeseEpisodeListRepository, this.$cheeseEpisodes, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06681, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playselect/CheeseEpisodeListRepository$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f90740a;

        static {
            int[] iArr = new int[PlaybackMode.values().length];
            try {
                iArr[PlaybackMode.AUTO_CONTINUOUS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlaybackMode.SINGLE_EPISODE_LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PlaybackMode.LIST_LOOP.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f90740a = iArr;
        }
    }

    @Inject
    public CheeseEpisodeListRepository(@NotNull CoroutineScope coroutineScope, @NotNull List<C6985d> list, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull IPlayerSettingService iPlayerSettingService) {
        this.f90736a = unitedSeasonDetailRepository;
        this.f90737b = iPlayerSettingService;
        MutableStateFlow<List<c>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f90738c = MutableStateFlow;
        this.f90739d = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, list, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:? A[PHI: r7
  PHI (r7v5 int) = (r7v4 int), (r7v10 int), (r7v11 int) binds: [B:25:0x0089, B:27:0x0094, B:29:0x009e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.ship.theseus.cheese.player.playselect.c a(@org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.cheese.player.playselect.c.a r6) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.playselect.CheeseEpisodeListRepository.a(com.bilibili.ship.theseus.cheese.player.playselect.c$a):com.bilibili.ship.theseus.cheese.player.playselect.c");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final c b(int i7, boolean z6) throws NoWhenBranchMatchedException {
        if (i7 == -1) {
            return null;
        }
        int i8 = 0;
        if (z6) {
            ArrayList<c> arrayList = new ArrayList();
            arrayList.addAll(c().subList(Math.min(i7 + 1, c().size()), c().size()));
            arrayList.addAll(c().subList(0, i7));
            for (c cVar : arrayList) {
                if (!(cVar instanceof c.a)) {
                    if (cVar instanceof c.b) {
                        return cVar;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (((c.a) cVar).f90747a.f117517m) {
                    return cVar;
                }
            }
            return null;
        }
        for (Object obj : c()) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            c cVar2 = (c) obj;
            if (cVar2 instanceof c.a) {
                if (i8 > i7 && ((c.a) cVar2).f90747a.f117517m) {
                    return cVar2;
                }
            } else {
                if (!(cVar2 instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (i8 > i7) {
                    return cVar2;
                }
            }
            i8++;
        }
        return null;
    }

    @NotNull
    public final List<c> c() {
        return (List) this.f90739d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.ship.theseus.cheese.player.playselect.c d(@org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.cheese.player.playselect.c.a r6, boolean r7) {
        /*
            r5 = this;
            r0 = r5
            java.util.List r0 = r0.c()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r8 = r0
        L10:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L38
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.bilibili.ship.theseus.cheese.player.playselect.c r0 = (com.bilibili.ship.theseus.cheese.player.playselect.c) r0
            long r0 = com.bilibili.ship.theseus.cheese.player.playselect.a.b(r0)
            r1 = r6
            long r1 = com.bilibili.ship.theseus.cheese.player.playselect.a.b(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
            goto L3a
        L32:
            int r8 = r8 + 1
            goto L10
        L38:
            r0 = -1
            r8 = r0
        L3a:
            r0 = r7
            if (r0 == 0) goto L43
        L3e:
            r0 = 1
            r7 = r0
            goto L6b
        L43:
            com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode$a r0 = com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.Companion
            r6 = r0
            r0 = r5
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.f90737b
            java.lang.String r1 = "pref_player_completion_action_key3"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            r9 = r0
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r0 = r10
            r7 = r0
            r0 = r9
            com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode r0 = com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.a.a(r0)
            com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode r1 = com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.LIST_LOOP
            if (r0 != r1) goto L6b
            goto L3e
        L6b:
            r0 = r5
            r1 = r8
            r2 = r7
            com.bilibili.ship.theseus.cheese.player.playselect.c r0 = r0.b(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.playselect.CheeseEpisodeListRepository.d(com.bilibili.ship.theseus.cheese.player.playselect.c$a, boolean):com.bilibili.ship.theseus.cheese.player.playselect.c");
    }
}
