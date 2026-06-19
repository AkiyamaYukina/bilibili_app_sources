package com.bilibili.netquality;

import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.netquality.a;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/netquality/d.class */
public class d<T extends a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<List<? extends T>, Unit> f67357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<T> f67358d = new LinkedList();

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bilibili.base.connectivity.ConnectivityMonitor$OnNetworkChangedListener, java.lang.Object] */
    public d(int i7, int i8) {
        this.f67355a = i7;
        this.f67356b = i8;
        ConnectivityMonitor.getInstance().register((ConnectivityMonitor.OnNetworkChangedListener) new Object());
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new NetworkQualityAnalyse$setup$1(this, null), 3, (Object) null);
    }
}
