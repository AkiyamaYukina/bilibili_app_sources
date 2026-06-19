package com.bilibili.ship.theseus.ogv.chathall;

import android.content.Context;
import com.bilibili.droid.ToastHelper;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/n.class */
public final class n implements com.bilibili.chatroom.widget.userDialog.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatHallService f91787a;

    public n(ChatHallService chatHallService) {
        this.f91787a = chatHallService;
    }

    public final void a(long j7) {
        fV.i iVar = this.f91787a.f91717o;
        fV.i iVar2 = iVar;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatExternalService");
            iVar2 = null;
        }
        iVar2.p.put(Long.valueOf(j7), Boolean.FALSE);
        Context context = iVar2.a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        ToastHelper.showToastShort(context, 2131824437);
    }

    public final void b(long j7) {
        fV.i iVar = this.f91787a.f91717o;
        fV.i iVar2 = iVar;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatExternalService");
            iVar2 = null;
        }
        iVar2.p.put(Long.valueOf(j7), Boolean.TRUE);
        Context context = iVar2.a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        ToastHelper.showToastShort(context, 2131824438);
    }

    public final boolean c(long j7) {
        fV.i iVar = this.f91787a.f91717o;
        fV.i iVar2 = iVar;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatExternalService");
            iVar2 = null;
        }
        return Intrinsics.areEqual(((LinkedHashMap) iVar2.p).get(Long.valueOf(j7)), Boolean.TRUE);
    }
}
