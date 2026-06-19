package com.bilibili.opd.app.bizcommon.sentinel.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import tn0.C8672a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/session/ChildProcessSessionBroadcastReceiver.class */
public class ChildProcessSessionBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C8672a session;
        String stringExtra = intent.getStringExtra("action");
        String stringExtra2 = intent.getStringExtra("moduleName");
        if (TextUtils.isEmpty(stringExtra2) || (session = ModuleSessionSentinel.getSession(stringExtra2)) == null) {
            return;
        }
        if ("resume".equals(stringExtra)) {
            session.d();
            return;
        }
        if ("pause".equals(stringExtra)) {
            session.b();
            return;
        }
        if ("error".equals(stringExtra)) {
            session.a();
        } else if ("crash".equals(stringExtra) && session.f127568i) {
            session.f127562b.isDebug();
            session.a();
            session.c();
        }
    }
}
