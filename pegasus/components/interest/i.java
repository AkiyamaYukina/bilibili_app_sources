package com.bilibili.pegasus.components.interest;

import com.bilibili.lib.fasthybrid.ability.file.FileBaseException;
import com.bilibili.ogv.misc.sponsor.BangumiSponsorRankFragment;
import com.bilibili.opd.app.bizcommon.ui.widget.MallDialog;
import com.mall.ui.page.shop.call.BuyerFragment;
import i60.y0;
import io.reactivex.rxjava3.functions.Consumer;
import rx.functions.Action1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/i.class */
public final /* synthetic */ class i implements Action1, MallDialog.DialogOkClickListener, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f76337a;

    public void accept(Object obj) {
        BangumiSponsorRankFragment bangumiSponsorRankFragment = (BangumiSponsorRankFragment) this.f76337a;
        bangumiSponsorRankFragment.f69352j = false;
        if (!bangumiSponsorRankFragment.f69347d) {
            bangumiSponsorRankFragment.showErrorTips();
        } else {
            bangumiSponsorRankFragment.f69351i--;
            bangumiSponsorRankFragment.f69346c.showFooterError();
        }
    }

    public void call(Object obj) {
        FileBaseException fileBaseException = (Throwable) obj;
        boolean z6 = fileBaseException instanceof FileBaseException;
        i60.n nVar = (i60.n) this.f76337a;
        if (!z6) {
            nVar.invoke(new y0(900, "fail file operate error", (Object) null));
        } else {
            FileBaseException fileBaseException2 = fileBaseException;
            nVar.invoke(new y0(fileBaseException2.getCode(), fileBaseException2.getReason(), (Object) null));
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.widget.MallDialog.DialogOkClickListener
    public void onDialogClick(int i7) {
        BuyerFragment buyerFragment = (BuyerFragment) this.f76337a;
        buyerFragment.T = null;
        buyerFragment.finishAttachActivity();
    }
}
