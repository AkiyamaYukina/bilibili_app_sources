package com.bilibili.lib.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.facebook.litho.widget.EditTextWithKeyboard;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.mall.ui.page.create2.OrderSubmitFragmentV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HmsPushService.class */
public class HmsPushService extends HmsMessageService {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f64216e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f64217d = new Handler(Looper.getMainLooper());

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        super/*android.app.Service*/.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public final void onMessageSent(String str) {
    }

    public final void onNewToken(final String str) {
        BPushLog.i("PushDemoLog", "HmsInstanceId onToken called " + str);
        final int i7 = 0;
        this.f64217d.post(new Runnable(str, i7) { // from class: com.bilibili.lib.push.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f64254a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f64255b;

            {
                this.f64254a = i7;
                this.f64255b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f64254a) {
                    case 0:
                        String str2 = (String) this.f64255b;
                        int i8 = HmsPushService.f64216e;
                        try {
                            IPushRegistry pushRegistry = BPushManagerServiceProvider.INSTANCE.get().getPushRegistry();
                            if (!TextUtils.isEmpty(str2) || (pushRegistry instanceof HuaweiNewPushRegistry)) {
                                ((HuaweiNewPushRegistry) pushRegistry).setToken(BPushFoundation.getApp(), str2);
                            }
                        } catch (Throwable th) {
                            return;
                        }
                        break;
                    case 1:
                        EditTextWithKeyboard.f((com.bilibili.bililive.room.biz.reverse.manager.d) this.f64255b);
                        break;
                    default:
                        CR0.r rVar = ((OrderSubmitFragmentV2) this.f64255b).c0;
                        if (rVar != null) {
                            rVar.a();
                        }
                        break;
                }
            }
        });
    }

    public final void onSendError(String str, Exception exc) {
    }
}
