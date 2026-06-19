package com.bilibili.ogv.operation3.module.community;

import Da0.C;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import javax.inject.Inject;
import kntr.base.account.AccountState;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qj0.C8441c;
import qj0.InterfaceC8440b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/community/k.class */
@StabilityInferred(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f71195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<a, MutableStateFlow<Boolean>> f71196b = new HashMap<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/community/k$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f71197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f71198b;

        public a(long j7, long j8) {
            this.f71197a = j7;
            this.f71198b = j8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f71197a == aVar.f71197a && this.f71198b == aVar.f71198b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f71198b) + (Long.hashCode(this.f71197a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(upMid=");
            sb.append(this.f71197a);
            sb.append(", mid=");
            return android.support.v4.media.session.a.a(sb, this.f71198b, ")");
        }
    }

    @Inject
    public k(@NotNull c cVar) {
        this.f71195a = cVar;
    }

    public static a a(long j7) {
        AccountState.Logged logged = (AccountState) C.a();
        return new a(j7, logged instanceof AccountState.Logged ? logged.getUserInfo().getMid() : 0L);
    }

    public final void b(long j7, boolean z6) {
        InterfaceC8440b interfaceC8440b = C8441c.f126030a;
        if (interfaceC8440b != null) {
            interfaceC8440b.f(j7, z6);
            return;
        }
        HashMap<a, MutableStateFlow<Boolean>> map = this.f71196b;
        a aVarA = a(j7);
        MutableStateFlow<Boolean> mutableStateFlow = map.get(aVarA);
        MutableStateFlow<Boolean> MutableStateFlow = mutableStateFlow;
        if (mutableStateFlow == null) {
            MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
            map.put(aVarA, MutableStateFlow);
        }
        MutableStateFlow.setValue(Boolean.valueOf(z6));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.module.community.k.c(long, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }
}
