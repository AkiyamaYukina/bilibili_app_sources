package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.bilibili.app.comm.BiliJsbPvCallback;
import com.bilibili.lib.jsbridge.special.PvInfo;
import com.bilibili.opd.app.bizcommon.hybridruntime.core.context.HybridContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/HybridWebContext.class */
public abstract class HybridWebContext extends HybridContext implements BiliJsbPvCallback {
    public HybridWebContext(Context context) {
        super(context);
    }

    public abstract AppCompatActivity getActivity();

    @Override // com.bilibili.opd.app.bizcommon.hybridruntime.core.context.HybridContext
    @NotNull
    public Object getAttachOwner() {
        return getActivity();
    }

    public abstract void onReceivePVInfo(PvInfo pvInfo);
}
