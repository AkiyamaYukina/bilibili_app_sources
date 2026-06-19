package com.bilibili.pegasus.channelv2.home.center;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.ad.adview.pegasus.banner.toplive.f;
import com.bilibili.lib.arch.lifecycle.Resource;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import po0.C8336a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterViewModel.class */
@StabilityInferred(parameters = 0)
public final class ChannelHomeCenterViewModel extends ViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f75265b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Job f75268e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public ChannelHomeCenterLoadModel f75264a = new ChannelHomeCenterLoadModel("");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap<String, Xn0.b> f75266c = new LinkedHashMap<>(5, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<C8336a<?>>> f75267d = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f75269f = LazyKt.lazy(new f(this, 2));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Wn0.e> f75270g = new MutableLiveData<>();

    public static final Object I0(ChannelHomeCenterViewModel channelHomeCenterViewModel, List list, SuspendLambda suspendLambda) {
        if (channelHomeCenterViewModel.f75265b) {
            channelHomeCenterViewModel.f75266c.clear();
            channelHomeCenterViewModel.f75265b = false;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Xn0.b bVar = (Xn0.b) it.next();
                if (channelHomeCenterViewModel.f75266c.containsKey(bVar.f28253a)) {
                    Xn0.b bVar2 = channelHomeCenterViewModel.f75266c.get(bVar.f28253a);
                    if (bVar2 != null) {
                        bVar2.a(bVar);
                    }
                } else {
                    channelHomeCenterViewModel.f75266c.put(bVar.f28253a, bVar);
                }
            }
        }
        return channelHomeCenterViewModel.J0(suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J0(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel$buildListData$1
            if (r0 == 0) goto L25
            r0 = r7
            com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel$buildListData$1 r0 = (com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel$buildListData$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L2f
        L25:
            com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel$buildListData$1 r0 = new com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel$buildListData$1
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L2f:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L60
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L56
            r0 = r7
            java.lang.Object r0 = r0.L$0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r7 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L92
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r9
            java.util.ArrayList r0 = B0.b.a(r0)
            r9 = r0
            kotlinx.coroutines.CoroutineDispatcher r0 = com.bilibili.lib.coroutineextension.DispatchersKt.getBiliIODispatcher()
            r11 = r0
            com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel$buildListData$2 r0 = new com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel$buildListData$2
            r1 = r0
            r2 = r6
            r3 = r9
            r4 = 0
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r7
            r1 = r9
            r0.L$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r12
            r2 = r7
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            r1 = r10
            if (r0 != r1) goto L90
            r0 = r10
            return r0
        L90:
            r0 = r9
            r7 = r0
        L92:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel.J0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @NotNull
    public final MediatorLiveData<Resource<List<C8336a<?>>>> K0() {
        return (MediatorLiveData) this.f75269f.getValue();
    }

    public final void L0(boolean z6, boolean z7) {
        if (this.f75264a.checkLoadHome(z6)) {
            MediatorLiveData<Resource<List<C8336a<?>>>> mediatorLiveDataK0 = K0();
            Resource.Companion.getClass();
            mediatorLiveDataK0.setValue(Resource.a.b((Object) null));
            this.f75265b = z6;
            Job job = this.f75268e;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ChannelHomeCenterViewModel$loadHomeData$1(this, z6, z7, null), 3, (Object) null);
        }
    }
}
