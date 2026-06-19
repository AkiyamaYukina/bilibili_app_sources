package com.bilibili.lib.push;

import android.content.Context;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.service.CompatibleDataMessageCallbackService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/PushMessageService.class */
public class PushMessageService extends CompatibleDataMessageCallbackService {
    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final void processMessage(Context context, DataMessage dataMessage) {
        super.processMessage(context.getApplicationContext(), dataMessage);
    }
}
