package com.bilibili.studio.comm.ab;

import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.comm.api.bean.ABData;
import iw0.InterfaceC7621a;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yw0.C9103a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/ab/c.class */
public final class c {
    @Nullable
    public static Object a(@NotNull List list, @NotNull ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuationImpl), 1);
        cancellableContinuationImpl.initCancellability();
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(str);
        }
        long jMid = BiliAccounts.get(BiliContext.application()).mid();
        String str2 = C9103a.f129912a;
        String strA = C9103a.C1393a.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        BiliCall<GeneralResponse<ABData>> aBData = ((InterfaceC7621a) ServiceGenerator.createService(InterfaceC7621a.class)).getABData(sb.toString(), String.valueOf(jMid), strA);
        if (aBData != null) {
            aBData.enqueue(new b(jCurrentTimeMillis, list, strA, cancellableContinuationImpl));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return result;
    }
}
