package com.bilibili.tgwt.im.widget;

import android.content.Context;
import android.text.Editable;
import com.bilibili.app.comm.emoticon.model.Emote;
import com.bilibili.app.comm.emoticon.ui.y;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/o.class */
public final class o implements y.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f111464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f111465b;

    public o(m mVar, Context context) {
        this.f111464a = mVar;
        this.f111465b = context;
    }

    public final void a() {
        m mVar = this.f111464a;
        RealInputBar realInputBar = mVar.f111442g;
        RealInputBar realInputBar2 = realInputBar;
        if (realInputBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar2 = null;
        }
        int selectionStart = realInputBar2.getSelectionStart();
        if (selectionStart <= 0) {
            return;
        }
        RealInputBar realInputBar3 = mVar.f111442g;
        if (realInputBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar3 = null;
        }
        Editable text = realInputBar3.getText();
        if (text != null) {
            text.delete(selectionStart - 1, selectionStart);
        }
    }

    public final void b(Emote emote) {
        VipUserInfo vipInfo;
        int i7 = emote.type;
        m mVar = this.f111464a;
        if (i7 != 2) {
            m.j(mVar, emote);
            return;
        }
        BiliAccountInfo biliAccountInfo = com.bilibili.ogv.infra.account.a.f67851a;
        if (biliAccountInfo.isEffectiveVip()) {
            m.j(mVar, emote);
            return;
        }
        AccountInfo accountInfoFromCache = biliAccountInfo.getAccountInfoFromCache();
        if (accountInfoFromCache == null || (vipInfo = accountInfoFromCache.getVipInfo()) == null || !vipInfo.isFrozen()) {
            return;
        }
        ToastHelper.showToastLong(this.f111465b, this.f111465b.getString(2131836317));
    }

    public final void c(Emote emote) {
        m.j(this.f111464a, emote);
    }
}
