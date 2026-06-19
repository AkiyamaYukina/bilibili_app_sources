package com.bilibili.pegasus.page;

import androidx.annotation.Keep;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.pegasus.data.base.PegasusResponse;
import com.bilibili.pegasus.data.request.PegasusResponseWrapper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachineActionsKt.class */
@Keep
public final class TimeMachineActionsKt {

    @NotNull
    private static final String TAG = "TimeMachineActions";

    /* JADX INFO: Access modifiers changed from: private */
    public static final PegasusResponseWrapper wrapTm(Resource<PegasusResponse> resource, lp0.c cVar) {
        return new PegasusResponseWrapper((PegasusResponse) resource.getData(), resource.getError(), cVar, false, 8, null);
    }
}
