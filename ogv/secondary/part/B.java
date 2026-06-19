package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.internal.StabilityInferred;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.operation3.module.list.MoreLoadingState;
import fl0.C7124a;
import io.ktor.client.HttpClient;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/B.class */
@StabilityInferred(parameters = 0)
public final class B implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HttpClient f72718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final u f72719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<MoreLoadingState> f72720c = StateFlowKt.MutableStateFlow(MoreLoadingState.IDLE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f72721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f72722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f72723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f72724g;

    @Inject
    public B(@NotNull HttpClient httpClient, @NotNull com.bilibili.ogv.secondary.api.c cVar, @NotNull u uVar) {
        Map<String, String> map;
        List<Long> list;
        Long l7;
        this.f72718a = httpClient;
        this.f72719b = uVar;
        com.bilibili.ogv.secondary.api.a aVar = cVar.f72640e;
        this.f72721d = (aVar == null || (list = aVar.f72627b) == null || (l7 = (Long) CollectionsKt.firstOrNull(list)) == null) ? -1L : l7.longValue();
        this.f72722e = true;
        Iterator<T> it = cVar.f72636a.iterator();
        do {
            map = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC5118d interfaceC5118d = (InterfaceC5118d) it.next();
            C7124a c7124a = interfaceC5118d instanceof C7124a ? (C7124a) interfaceC5118d : null;
            map = c7124a != null ? c7124a.f118437a : null;
        } while (map == null);
        this.f72724g = map == null ? MapsKt.emptyMap() : map;
    }

    @Override // com.bilibili.ogv.secondary.part.D
    @NotNull
    public final MutableStateFlow<MoreLoadingState> a() {
        return this.f72720c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.bilibili.ogv.secondary.part.D
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.part.B.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:7))(0)|8|57|(2:10|(2:12|(4:14|15|44|(3:46|51|52)(2:47|48))(2:20|21))(3:22|23|24))(6:25|26|27|28|29|(2:31|32)(1:33))|34|35|55|36|39|40|(2:42|43)|44|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0220, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ae A[Catch: Exception -> 0x007b, CancellationException -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0080, Exception -> 0x007b, blocks: (B:15:0x0073, B:46:0x02ae, B:47:0x02b8, B:48:0x02c7, B:23:0x00f6, B:34:0x01f4, B:39:0x0223, B:26:0x0111, B:28:0x01a0), top: B:57:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b8 A[Catch: Exception -> 0x007b, CancellationException -> 0x0080, TRY_ENTER, TryCatch #3 {CancellationException -> 0x0080, Exception -> 0x007b, blocks: (B:15:0x0073, B:46:0x02ae, B:47:0x02b8, B:48:0x02c7, B:23:0x00f6, B:34:0x01f4, B:39:0x0223, B:26:0x0111, B:28:0x01a0), top: B:57:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(final long r8, final boolean r10, final long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.part.B.c(long, boolean, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
