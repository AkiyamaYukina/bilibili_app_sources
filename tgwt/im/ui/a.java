package com.bilibili.tgwt.im.ui;

import DD0.AbstractC1534g;
import com.bilibili.app.comm.emoticon.model.EmoticonBadgeStatus;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.tgwt.im.widget.RealInputBar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/a.class */
public final class a extends BiliApiDataCallback<EmoticonBadgeStatus> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatMsgFragment f111292b;

    public a(ChatMsgFragment chatMsgFragment) {
        this.f111292b = chatMsgFragment;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(EmoticonBadgeStatus emoticonBadgeStatus) {
        EmoticonBadgeStatus emoticonBadgeStatus2 = emoticonBadgeStatus;
        if (emoticonBadgeStatus2 == null || !emoticonBadgeStatus2.active) {
            return;
        }
        ChatMsgFragment chatMsgFragment = this.f111292b;
        chatMsgFragment.f111218c = true;
        AbstractC1534g abstractC1534g = chatMsgFragment.f111219d;
        AbstractC1534g abstractC1534g2 = abstractC1534g;
        if (abstractC1534g == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g2 = null;
        }
        abstractC1534g2.f2507x.setEmoticonBadgeVisible(true);
        com.bilibili.tgwt.im.widget.m mVar = chatMsgFragment.f111217b;
        if (mVar != null) {
            mVar.f111444j = true;
            RealInputBar realInputBar = mVar.f111442g;
            if (realInputBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                realInputBar = null;
            }
            realInputBar.setEmoticonBadgeVisible(true);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
    }
}
