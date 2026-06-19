package com.bilibili.tgwt.detail.chat;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.droid.ToastHelper;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/k.class */
public final class k implements MD0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatFragment f111066a;

    public k(ChatFragment chatFragment) {
        this.f111066a = chatFragment;
    }

    @Override // MD0.b
    public final void a() {
        ChatFragment chatFragment = this.f111066a;
        p pVar = chatFragment.f111021k;
        p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar2 = null;
        }
        ChatRoomConfig chatRoomConfig = pVar2.f111109U;
        ChatRoomConfigValue chatRoomConfigValueB = chatRoomConfig != null ? chatRoomConfig.b() : null;
        if ((chatRoomConfigValueB != null ? chatRoomConfigValueB.a() : null) != ChatConfigType.UNAVAILABLE_AND_VISIBLE) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(chatFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new ChatFragment$switchRoom$1(chatFragment, null), 3, (Object) null);
            return;
        }
        Context context = chatFragment.getContext();
        String strB = chatRoomConfigValueB.b();
        String str = strB;
        if (strB == null) {
            str = "";
        }
        ToastHelper.showToastShort(context, str);
    }
}
