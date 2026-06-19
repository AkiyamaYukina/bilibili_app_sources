package com.bilibili.search2.result.holder.collection;

import DD0.M;
import GA0.a;
import android.view.View;
import com.bilibili.tgwt.im.ui.PlayerChatMsgFragment;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import com.bilibili.upper.module.manuscript.activity.AuditProblemShowActivity;
import com.mall.common.extension.MallKtExtensionKt;
import com.mall.ui.page.newest.MallNewestFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/collection/b.class */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f88058b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f88057a = i7;
        this.f88058b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88057a) {
            case 0:
                ((g) this.f88058b).g(false);
                break;
            case 1:
                PlayerChatMsgFragment playerChatMsgFragment = (PlayerChatMsgFragment) this.f88058b;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatMsgFragment.f111262c;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                ChatService chatService = togetherWatchDetailPageViewModel2.getChatService();
                M m7 = playerChatMsgFragment.f111261b;
                if (m7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    m7 = null;
                }
                chatService.r(m7.f2314A.getText(), playerChatMsgFragment.f111270l);
                break;
            case 2:
                AuditProblemShowActivity auditProblemShowActivity = (AuditProblemShowActivity) this.f88058b;
                int i7 = AuditProblemShowActivity.f113408G;
                com.bilibili.upper.module.manuscript.model.a value = auditProblemShowActivity.Q6().f113661c.getValue();
                if (value != null) {
                    if (value.f113665c == 2) {
                        String str = value.f113664b;
                        if (str.length() > 0) {
                            auditProblemShowActivity.Q6().K0(value.f113663a);
                            a.C0040a.b(GA0.a.f6978a, auditProblemShowActivity, str);
                        }
                    }
                    auditProblemShowActivity.Q6().I0();
                }
                break;
            default:
                MallNewestFragment mallNewestFragment = (MallNewestFragment) this.f88058b;
                gQ0.f.g("MALL_NEWEST_GUIDE_SHOWN", true);
                View view2 = (View) mallNewestFragment.l.getValue();
                if (view2 != null) {
                    MallKtExtensionKt.gone(view2);
                }
                break;
        }
    }
}
