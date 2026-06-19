package com.bilibili.sistersplayer.p2p;

import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import com.bilibili.sistersplayer.p2p.peer.NyaPeer;
import com.bilibili.sistersplayer.p2p.peer.NyaPeerManager;
import com.bilibili.sistersplayer.p2p.peer.PeerRole;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloadP2PRequestFactory2.class */
public final class FragmentDownloadP2PRequestFactory2 {

    @NotNull
    private final LiveFragment frag;

    @NotNull
    private final P2PContext p2pContext;

    @NotNull
    private List<PeerFragWorkerGroup> peerFragWorkers = new ArrayList();

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloadP2PRequestFactory2$startDownload$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloadP2PRequestFactory2$startDownload$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final int $i;
        final PeerFragWorkerGroup[] $workGroups;
        final int $workgrpIdx;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PeerFragWorkerGroup[] peerFragWorkerGroupArr, int i7, int i8, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$workGroups = peerFragWorkerGroupArr;
            this.$workgrpIdx = i7;
            this.$i = i8;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$workGroups, this.$workgrpIdx, this.$i, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PeerFragWorkerGroup peerFragWorkerGroup = this.$workGroups[this.$workgrpIdx];
                if (peerFragWorkerGroup != null) {
                    int i8 = this.$i;
                    this.label = 1;
                    Object objDoDownload = peerFragWorkerGroup.doDownload(i8, 1, this);
                    obj = objDoDownload;
                    if (objDoDownload == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloadP2PRequestFactory2$stopDownload$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloadP2PRequestFactory2$stopDownload$1.class */
    public static final class C64671 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final FragmentDownloadP2PRequestFactory2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64671(FragmentDownloadP2PRequestFactory2 fragmentDownloadP2PRequestFactory2, Continuation<? super C64671> continuation) {
            super(continuation);
            this.this$0 = fragmentDownloadP2PRequestFactory2;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.stopDownload(this);
        }
    }

    public FragmentDownloadP2PRequestFactory2(@NotNull P2PContext p2PContext, @NotNull LiveFragment liveFragment) {
        this.p2pContext = p2PContext;
        this.frag = liveFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownload$lambda$6$lambda$5(Ref.IntRef intRef, List list, FragmentDownloadP2PRequestFactory2 fragmentDownloadP2PRequestFactory2, Throwable th) {
        intRef.element++;
        if (list.size() == intRef.element) {
            if (fragmentDownloadP2PRequestFactory2.p2pContext.isDestroyed()) {
                return Unit.INSTANCE;
            }
            P2PContext.launch$default(fragmentDownloadP2PRequestFactory2.p2pContext, null, new FragmentDownloadP2PRequestFactory2$startDownload$3$1$1(fragmentDownloadP2PRequestFactory2, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final P2PContext getP2pContext() {
        return this.p2pContext;
    }

    public final void startDownload(@NotNull NyaPeerManager nyaPeerManager, @NotNull Function1<? super Set<Integer>, Unit> function1) {
        List<Integer> distance = this.frag.getDistance();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Integer> it = this.frag.getSliceIds().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            linkedHashSet.add(Integer.valueOf(iIntValue));
            Pair<Integer, Integer> sliceBlockRange = this.frag.getSliceBlockRange(iIntValue);
            int iIntValue2 = ((Number) sliceBlockRange.getSecond()).intValue();
            for (int iIntValue3 = ((Number) sliceBlockRange.getFirst()).intValue(); iIntValue3 < iIntValue2; iIntValue3++) {
                distance.set(iIntValue3, Integer.valueOf((distance.get(iIntValue3).intValue() & 128) | 1));
            }
        }
        FragWorkerGroup fragWorkerGroup = new FragWorkerGroup(this.p2pContext, this.frag);
        if (this.frag.getRequestDownloadToSeedbox()) {
            List<NyaPeer> connectedPeers = nyaPeerManager.getConnectedPeers();
            ArrayList arrayList = new ArrayList();
            for (Object obj : connectedPeers) {
                if (((NyaPeer) obj).getExtUserData().getPeerRole() == PeerRole.SEEDBOX) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((NyaPeer) obj2).shouldUsedAsSeed()) {
                    arrayList2.add(obj2);
                }
            }
            int i7 = this.p2pContext.getSistersConfiguration().sliceCount;
            for (int i8 = 0; i8 < i7; i8++) {
                if (this.frag.getSliceIds().contains(Integer.valueOf(i8)) || this.p2pContext.getPeerRole() == PeerRole.LEECH) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (((NyaPeer) obj3).getExtUserData().getSeedSliceIds().contains(Integer.valueOf(i8))) {
                            arrayList3.add(obj3);
                        }
                    }
                    Pair<Integer, Integer> sliceBlockRange2 = this.frag.getSliceBlockRange(i8);
                    if (!arrayList3.isEmpty() && ((Number) sliceBlockRange2.getFirst()).intValue() < ((Number) sliceBlockRange2.getSecond()).intValue()) {
                        linkedHashSet.remove(Integer.valueOf(i8));
                        if (this.p2pContext.getPeerRole() == PeerRole.LEECH) {
                            Pair<Integer, Integer> sliceBlockRange3 = this.frag.getSliceBlockRange(i8);
                            int iIntValue4 = ((Number) sliceBlockRange3.getSecond()).intValue();
                            for (int iIntValue5 = ((Number) sliceBlockRange3.getFirst()).intValue(); iIntValue5 < iIntValue4; iIntValue5++) {
                                distance.set(iIntValue5, Integer.valueOf((distance.get(iIntValue5).intValue() & 128) | 1));
                            }
                        }
                        int size = arrayList3.size();
                        PeerFragWorkerGroup[] peerFragWorkerGroupArr = new PeerFragWorkerGroup[size];
                        for (int i9 = 0; i9 < size; i9++) {
                            peerFragWorkerGroupArr[i9] = null;
                        }
                        int iIntValue6 = ((Number) sliceBlockRange2.getSecond()).intValue();
                        for (int iIntValue7 = ((Number) sliceBlockRange2.getFirst()).intValue(); iIntValue7 < iIntValue6; iIntValue7++) {
                            int size2 = iIntValue7 % arrayList3.size();
                            if (peerFragWorkerGroupArr[size2] == null) {
                                peerFragWorkerGroupArr[size2] = new PeerFragWorkerGroup(fragWorkerGroup, (NyaPeer) arrayList3.get(size2));
                            }
                            P2PContext.launch$default(this.p2pContext, null, new AnonymousClass1(peerFragWorkerGroupArr, size2, iIntValue7, null), 1, null);
                        }
                    }
                }
            }
        }
        function1.invoke(linkedHashSet);
        List<NyaPeer> connectedPeers2 = nyaPeerManager.getConnectedPeers();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : connectedPeers2) {
            if (((NyaPeer) obj4).getExtUserData().getPeerRole() == PeerRole.PEER) {
                arrayList4.add(obj4);
            }
        }
        SistersConfiguration sistersConfiguration = this.p2pContext.getSistersConfiguration();
        int iMin = Math.min(sistersConfiguration.totalDownloadInstances, arrayList4.size());
        int iMin2 = Math.min(sistersConfiguration.totalDownloadInstances, arrayList4.size() * sistersConfiguration.maxDownloadInstancesPerPeer);
        for (int i10 = 0; i10 < iMin; i10++) {
            this.peerFragWorkers.add(new PeerFragWorkerGroup(fragWorkerGroup, (NyaPeer) arrayList4.get(i10)));
        }
        final ArrayList<Job> arrayList5 = new ArrayList();
        for (int i11 = 0; i11 < iMin2; i11++) {
            Job jobLaunchInstance = this.peerFragWorkers.get(i11 % iMin).launchInstance();
            if (jobLaunchInstance != null) {
                arrayList5.add(jobLaunchInstance);
            }
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        for (Job job : arrayList5) {
            job.invokeOnCompletion(new Function1(intRef, arrayList5, this) { // from class: com.bilibili.sistersplayer.p2p.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.IntRef f104918a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final List f104919b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final FragmentDownloadP2PRequestFactory2 f104920c;

                {
                    this.f104918a = intRef;
                    this.f104919b = arrayList5;
                    this.f104920c = this;
                }

                public final Object invoke(Object obj5) {
                    return FragmentDownloadP2PRequestFactory2.startDownload$lambda$6$lambda$5(this.f104918a, this.f104919b, this.f104920c, (Throwable) obj5);
                }
            });
            job.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object stopDownload(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.sistersplayer.p2p.FragmentDownloadP2PRequestFactory2.C64671
            if (r0 == 0) goto L27
            r0 = r6
            com.bilibili.sistersplayer.p2p.FragmentDownloadP2PRequestFactory2$stopDownload$1 r0 = (com.bilibili.sistersplayer.p2p.FragmentDownloadP2PRequestFactory2.C64671) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L27
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L31
        L27:
            com.bilibili.sistersplayer.p2p.FragmentDownloadP2PRequestFactory2$stopDownload$1 r0 = new com.bilibili.sistersplayer.p2p.FragmentDownloadP2PRequestFactory2$stopDownload$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L31:
            r0 = r6
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L65
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L5a
            r0 = r6
            java.lang.Object r0 = r0.L$0
            java.util.Iterator r0 = (java.util.Iterator) r0
            r8 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L74
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L65:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            java.util.List<com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup> r0 = r0.peerFragWorkers
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L74:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La0
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup r0 = (com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup) r0
            r10 = r0
            r0 = r6
            r1 = r8
            r0.L$0 = r1
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r6
            java.lang.Object r0 = r0.stopAllInstance(r1)
            r1 = r9
            if (r0 != r1) goto L74
            r0 = r9
            return r0
        La0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.FragmentDownloadP2PRequestFactory2.stopDownload(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
