package com.bilibili.search2.share;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.ui.mixin.IFragmentShowHideKt;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.search2.result.repo.SearchInlineRepository;
import dt0.AbstractC6840c;
import dt0.AbstractC6841d;
import dt0.AbstractC6842e;
import java.lang.ref.WeakReference;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/share/t.class */
public final class t extends BiliApiDataCallback<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Fragment> f88717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC6842e<?, ?> f88718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f88720e;

    public t(Fragment fragment, AbstractC6842e<?, ?> abstractC6842e, long j7, boolean z6) {
        this.f88718c = abstractC6842e;
        this.f88719d = j7;
        this.f88720e = z6;
        this.f88717b = new WeakReference<>(fragment);
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(JSONObject jSONObject) {
        Context context;
        SearchInlineRepository searchInlineRepository;
        AbstractC6842e<?, ?> abstractC6842e = this.f88718c;
        AbstractC6841d abstractC6841d = (AbstractC6841d) abstractC6842e.getBindData();
        boolean z6 = this.f88720e;
        if (abstractC6841d != null && abstractC6841d.getAvId() == this.f88719d) {
            AbstractC6841d abstractC6841d2 = (AbstractC6841d) abstractC6842e.getBindData();
            if (abstractC6841d2 != null) {
                abstractC6841d2.setFavorite(z6);
            }
            Object data = abstractC6842e.getData();
            AbstractC6840c abstractC6840c = data instanceof AbstractC6840c ? (AbstractC6840c) data : null;
            if (abstractC6840c != null && (searchInlineRepository = abstractC6842e.f116703b) != null) {
                searchInlineRepository.updateRepositoryData(abstractC6840c);
            }
        }
        Fragment fragment = this.f88717b.get();
        if (fragment == null || (context = fragment.getContext()) == null) {
            return;
        }
        if (z6) {
            PromoToast.showBottomToast(context, 2131847716);
        } else {
            PromoToast.showBottomToast(context, 2131847707);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Context context;
        AbstractC6841d abstractC6841d;
        AbstractC6842e<?, ?> abstractC6842e = this.f88718c;
        AbstractC6841d abstractC6841d2 = (AbstractC6841d) abstractC6842e.getBindData();
        if (abstractC6841d2 != null && abstractC6841d2.getAvId() == this.f88719d && (abstractC6841d = (AbstractC6841d) abstractC6842e.getBindData()) != null) {
            abstractC6841d.setFavorite(!this.f88720e);
        }
        Fragment fragment = this.f88717b.get();
        if (fragment == null || (context = fragment.getContext()) == null) {
            return;
        }
        FragmentActivity fragmentActivityP3 = fragment.p3();
        if (!(th instanceof BiliApiException)) {
            PromoToast.showBottomToast(context, 2131841502);
            return;
        }
        BiliApiException biliApiException = (BiliApiException) th;
        int i7 = biliApiException.mCode;
        String message = biliApiException.getMessage();
        if (message != null && !StringsKt.isBlank(message)) {
            PromoToast.showBottomToast(fragmentActivityP3, message);
            return;
        }
        if (i7 == -106) {
            r.f88699a.getClass();
            final FragmentActivity fragmentActivityP32 = fragment.p3();
            if (fragmentActivityP32 == null || !IFragmentShowHideKt.isFragmentShown(fragment) || fragmentActivityP32.isFinishing()) {
                return;
            }
            new AlertDialog.Builder(fragmentActivityP32).setMessage(fragmentActivityP32.getString(2131846926)).setNegativeButton(2131841464, (DialogInterface.OnClickListener) null).setPositiveButton(2131847182, new DialogInterface.OnClickListener(fragmentActivityP32) { // from class: com.bilibili.search2.share.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FragmentActivity f88678a;

                {
                    this.f88678a = fragmentActivityP32;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    FragmentActivity fragmentActivity = this.f88678a;
                    AccountService accountService = (AccountService) w8.d.a(BLRouter.INSTANCE, AccountService.class, "default");
                    if (accountService != null) {
                        accountService.bindPhone(fragmentActivity);
                    }
                    dialogInterface.cancel();
                }
            }).create().show();
            return;
        }
        if (i7 == -102) {
            r.f88699a.getClass();
            FragmentActivity fragmentActivityP33 = fragment.p3();
            if (fragmentActivityP33 == null || !IFragmentShowHideKt.isFragmentShown(fragment) || fragmentActivityP33.isFinishing()) {
                return;
            }
            new AlertDialog.Builder(fragmentActivityP33).setMessage(fragmentActivityP33.getString(2131846723)).create().show();
            return;
        }
        if (i7 == 11005) {
            PromoToast.showBottomToast(context, 2131845713);
            return;
        }
        if (i7 == 11007) {
            PromoToast.showBottomToast(context, 2131846790);
            return;
        }
        if (i7 == 11010) {
            PromoToast.showBottomToast(context, 2131845631);
            return;
        }
        PromoToast.showBottomToast(context, "[error:" + i7 + "]");
    }
}
