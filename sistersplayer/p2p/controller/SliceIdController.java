package com.bilibili.sistersplayer.p2p.controller;

import Cc.h;
import androidx.appcompat.widget.C3259x;
import b70.i;
import com.bilibili.bililive.room.ui.roomv3.tab.interaction.b;
import com.bilibili.sistersplayer.p2p.P2PContext;
import com.bilibili.sistersplayer.p2p.fragment.DataRoleType;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import com.bilibili.sistersplayer.p2p.peer.NyaPeer;
import com.bilibili.sistersplayer.p2p.peer.NyaPeerManager;
import com.bilibili.sistersplayer.p2p.peer.PeerRole;
import com.bilibili.sistersplayer.p2p.utils.LimitedQueue;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/controller/SliceIdController.class */
public final class SliceIdController {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "SliceIdController";

    @NotNull
    private final LimitedQueue<Float> currentShareDataLMQueue;

    @Nullable
    private Job fetchControlJob;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final P2PContext p2pContext;

    @NotNull
    private final NyaPeerManager sched;

    @Nullable
    private Job shareControlJob;

    @NotNull
    private final List<LimitedQueue<Float>> lackedDataArray = new ArrayList();

    @NotNull
    private final List<LimitedQueue<Float>> recentShareDataArray = new ArrayList();

    @NotNull
    private Set<Integer> lastestShareSliceIds = new LinkedHashSet();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/controller/SliceIdController$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.controller.SliceIdController$startSliceIdControl$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/controller/SliceIdController$startSliceIdControl$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SliceIdController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SliceIdController sliceIdController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sliceIdController;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:14:0x0049). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r9 = r0
                r0 = r4
                int r0 = r0.label
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L24
                r0 = r6
                r1 = 1
                if (r0 != r1) goto L1a
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
                goto L49
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L24:
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
            L28:
                r0 = r4
                com.bilibili.sistersplayer.p2p.controller.SliceIdController r0 = r0.this$0
                com.bilibili.sistersplayer.p2p.P2PContext r0 = com.bilibili.sistersplayer.p2p.controller.SliceIdController.access$getP2pContext$p(r0)
                com.bilibili.sistersplayer.p2p.SistersConfiguration r0 = r0.getSistersConfiguration()
                int r0 = r0.p2pSliceIdControlFetchCheckIntervalMs
                long r0 = (long) r0
                r7 = r0
                r0 = r4
                r1 = 1
                r0.label = r1
                r0 = r7
                r1 = r4
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
                r1 = r9
                if (r0 != r1) goto L49
                r0 = r9
                return r0
            L49:
                r0 = r4
                com.bilibili.sistersplayer.p2p.controller.SliceIdController r0 = r0.this$0
                com.bilibili.sistersplayer.p2p.controller.SliceIdController.access$checkFetch(r0)
                goto L28
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.controller.SliceIdController.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.controller.SliceIdController$startSliceIdControl$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/controller/SliceIdController$startSliceIdControl$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SliceIdController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SliceIdController sliceIdController, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = sliceIdController;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:14:0x0049). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r9 = r0
                r0 = r4
                int r0 = r0.label
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L24
                r0 = r6
                r1 = 1
                if (r0 != r1) goto L1a
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
                goto L49
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L24:
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
            L28:
                r0 = r4
                com.bilibili.sistersplayer.p2p.controller.SliceIdController r0 = r0.this$0
                com.bilibili.sistersplayer.p2p.P2PContext r0 = com.bilibili.sistersplayer.p2p.controller.SliceIdController.access$getP2pContext$p(r0)
                com.bilibili.sistersplayer.p2p.SistersConfiguration r0 = r0.getSistersConfiguration()
                int r0 = r0.p2pSliceIdControlShareCheckIntervalMs
                long r0 = (long) r0
                r7 = r0
                r0 = r4
                r1 = 1
                r0.label = r1
                r0 = r7
                r1 = r4
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
                r1 = r9
                if (r0 != r1) goto L49
                r0 = r9
                return r0
            L49:
                r0 = r4
                com.bilibili.sistersplayer.p2p.controller.SliceIdController r0 = r0.this$0
                com.bilibili.sistersplayer.p2p.controller.SliceIdController.access$checkShare(r0)
                goto L28
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.controller.SliceIdController.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.FALSE);
    }

    public SliceIdController(@NotNull P2PContext p2PContext, @NotNull NyaPeerManager nyaPeerManager) {
        this.p2pContext = p2PContext;
        this.sched = nyaPeerManager;
        this.logger = p2PContext.getLogger();
        this.currentShareDataLMQueue = new LimitedQueue<>(p2PContext.getSistersConfiguration().p2pFetchDataObCycleCount);
        int i7 = p2PContext.getSistersConfiguration().sliceCount;
        for (int i8 = 0; i8 < i7; i8++) {
            this.lackedDataArray.add(i8, new LimitedQueue<>(this.p2pContext.getSistersConfiguration().p2pFetchDataObCycleCount));
            this.recentShareDataArray.add(i8, new LimitedQueue<>(this.p2pContext.getSistersConfiguration().p2pShareDataObCycleCount));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkFetch() {
        P2PLogger.logI$default(this.logger, TAG, "checkFetch", null, 4, null);
        if (this.sched.getConnectedPeers().isEmpty()) {
            this.sched.getSliceIds().clear();
            return;
        }
        if (((LimitedQueue) CollectionsKt.first(this.lackedDataArray)).size() < this.p2pContext.getSistersConfiguration().p2pFetchDataObCycleCount) {
            P2PLogger.logI$default(this.logger, TAG, C3259x.a(((LimitedQueue) CollectionsKt.first(this.lackedDataArray)).size(), "checkFetch return by size: "), null, 4, null);
            return;
        }
        int i7 = this.p2pContext.getSistersConfiguration().sliceCount;
        for (int i8 = 0; i8 < i7; i8++) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            this.lackedDataArray.get(i8).forEach(new h(floatRef, 5));
            floatRef.element /= this.lackedDataArray.get(i8).size();
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            this.currentShareDataLMQueue.forEach(new i(floatRef2, 4));
            floatRef2.element /= this.currentShareDataLMQueue.size();
            if (!this.sched.getSliceIds().contains(Integer.valueOf(i8)) && floatRef2.element < this.p2pContext.getSistersConfiguration().p2pShareLargestAllowedFetchRatio * this.p2pContext.getSistersConfiguration().fragmentShareOverride && floatRef.element >= this.p2pContext.getSistersConfiguration().p2pFetchLowestRatio) {
                P2PLogger.logI$default(this.logger, TAG, "want to add slice id " + i8 + ", lackRatio%: " + floatRef.element + ", ids last: " + CollectionsKt.p(this.sched.getSliceIds(), (CharSequence) null, (CharSequence) null, (CharSequence) null, (Function1) null, 63), null, 4, null);
                if (Math.random() < this.p2pContext.getSistersConfiguration().p2pAddSliceProbability) {
                    this.sched.addSliceId(i8);
                }
                P2PLogger.logI$default(this.logger, TAG, "want to add slice id " + i8 + ", lackRatio%: " + floatRef.element + ", ids now: " + CollectionsKt.p(this.sched.getSliceIds(), (CharSequence) null, (CharSequence) null, (CharSequence) null, (Function1) null, 63), null, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkFetch$lambda$1(Ref.FloatRef floatRef, float f7) {
        floatRef.element += f7;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkFetch$lambda$2(Ref.FloatRef floatRef, float f7) {
        floatRef.element += f7;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkShare() {
        P2PLogger.logI$default(this.logger, TAG, "checkShare", null, 4, null);
        if (this.p2pContext.getRtcManager() != null && this.sched.getConnectedPeers().isEmpty()) {
            this.p2pContext.getRtcManager().getSliceIds().clear();
            return;
        }
        if (this.p2pContext.getRtcManager() != null) {
            List<NyaPeer> connectedPeers = this.sched.getConnectedPeers();
            if (!(connectedPeers instanceof Collection) || !connectedPeers.isEmpty()) {
                Iterator<T> it = connectedPeers.iterator();
                while (it.hasNext()) {
                    if (((NyaPeer) it.next()).getExtUserData().getPeerRole() != PeerRole.SEEDBOX) {
                    }
                }
            }
            P2PLogger.logI$default(this.logger, TAG, "checkShare return by all peers are seedbox", null, 4, null);
            return;
        }
        if (((LimitedQueue) CollectionsKt.first(this.recentShareDataArray)).size() < this.p2pContext.getSistersConfiguration().p2pShareDataObCycleCount) {
            P2PLogger.logI$default(this.logger, TAG, C3259x.a(((LimitedQueue) CollectionsKt.first(this.recentShareDataArray)).size(), "checkShare return by size: "), null, 4, null);
            return;
        }
        int i7 = this.p2pContext.getSistersConfiguration().sliceCount;
        for (int i8 = 0; i8 < i7; i8++) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            this.recentShareDataArray.get(i8).forEach(new b(floatRef, 1));
            floatRef.element /= this.recentShareDataArray.get(i8).size();
            if (this.lastestShareSliceIds.contains(Integer.valueOf(i8)) && floatRef.element <= this.p2pContext.getSistersConfiguration().p2pShareLowestRatio) {
                P2PLogger.logI$default(this.logger, TAG, "want to delete slice id " + i8 + ", shareRatio%: " + floatRef.element + ", ids last: " + CollectionsKt.p(this.sched.getSliceIds(), (CharSequence) null, (CharSequence) null, (CharSequence) null, (Function1) null, 63), null, 4, null);
                if (Math.random() < this.p2pContext.getSistersConfiguration().p2pDeleteSliceProbability) {
                    this.sched.removeSliceId(i8);
                }
                P2PLogger.logI$default(this.logger, TAG, "want to delete slice id " + i8 + ", shareRatio%: " + floatRef.element + ", ids now: " + CollectionsKt.p(this.sched.getSliceIds(), (CharSequence) null, (CharSequence) null, (CharSequence) null, (Function1) null, 63), null, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkShare$lambda$4(Ref.FloatRef floatRef, float f7) {
        floatRef.element += f7;
        return Unit.INSTANCE;
    }

    private final boolean isSame(Set<? extends Object> set, Set<? extends Object> set2) {
        boolean z6 = false;
        if (set.size() == set2.size()) {
            Iterator<T> it = set.iterator();
            z6 = true;
            while (it.hasNext()) {
                if (!set2.contains(it.next())) {
                    z6 = false;
                }
            }
        }
        return z6;
    }

    private final void stopSliceIdControl() {
        Job job;
        Job job2;
        Job job3 = this.fetchControlJob;
        if (job3 != null && job3.isActive() && (job2 = this.fetchControlJob) != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.fetchControlJob = null;
        Job job4 = this.shareControlJob;
        if (job4 != null && job4.isActive() && (job = this.shareControlJob) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.shareControlJob = null;
        this.currentShareDataLMQueue.clear();
        int i7 = this.p2pContext.getSistersConfiguration().sliceCount;
        for (int i8 = 0; i8 < i7; i8++) {
            this.lackedDataArray.get(i8).clear();
            this.recentShareDataArray.get(i8).clear();
        }
    }

    public final void addFragmentFetchData(@NotNull LiveFragment liveFragment) {
        if (this.p2pContext.getRtcManager() != null && this.sched.getConnectedPeers().isEmpty()) {
            this.p2pContext.getRtcManager().getSliceIds().clear();
            return;
        }
        if (!isSame(this.sched.getSliceIds(), liveFragment.getSliceIds())) {
            Job job = this.fetchControlJob;
            if (job != null && job.isActive()) {
                checkFetch();
            }
            int i7 = this.p2pContext.getSistersConfiguration().sliceCount;
            for (int i8 = 0; i8 < i7; i8++) {
                this.lackedDataArray.get(i8).clear();
                this.currentShareDataLMQueue.clear();
            }
        }
        int i9 = this.p2pContext.getSistersConfiguration().sliceCount;
        for (int i10 = 0; i10 < i9; i10++) {
            this.lackedDataArray.get(i10).push(Float.valueOf(liveFragment.getRoleRatioForSlice(DataRoleType.LACKED, i10)));
        }
        this.currentShareDataLMQueue.push(Float.valueOf(liveFragment.getSharedRatio()));
    }

    public final void addFragmentShareData(@NotNull LiveFragment liveFragment) {
        if (this.p2pContext.getRtcManager() != null && this.sched.getConnectedPeers().isEmpty()) {
            this.p2pContext.getRtcManager().getSliceIds().clear();
            return;
        }
        if (!isSame(this.lastestShareSliceIds, liveFragment.getSliceIds())) {
            Job job = this.shareControlJob;
            if (job != null && job.isActive()) {
                checkShare();
            }
            int i7 = this.p2pContext.getSistersConfiguration().sliceCount;
            for (int i8 = 0; i8 < i7; i8++) {
                this.recentShareDataArray.get(i8).clear();
            }
        }
        int i9 = this.p2pContext.getSistersConfiguration().sliceCount;
        for (int i10 = 0; i10 < i9; i10++) {
            this.recentShareDataArray.get(i10).push(Float.valueOf(liveFragment.getSliceSharedRatio(i10)));
        }
        this.lastestShareSliceIds = liveFragment.getSliceIds();
    }

    public final void destroy() {
        stopSliceIdControl();
    }

    public final void startSliceIdControl() {
        stopSliceIdControl();
        this.fetchControlJob = P2PContext.launch$default(this.p2pContext, null, new AnonymousClass1(this, null), 1, null);
        this.shareControlJob = P2PContext.launch$default(this.p2pContext, null, new AnonymousClass2(this, null), 1, null);
    }
}
