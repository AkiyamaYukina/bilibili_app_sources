package com.bilibili.pegasus.common.inline;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.ui.mixin.IFragmentShowHideKt;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.videodownloader.model.VideoDownloadEntry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.text.StringsKt;
import tv.danmaku.bili.ui.offline.DownloadingActivity;
import tv.danmaku.bili.ui.offline.j0;

/* JADX INFO: renamed from: com.bilibili.pegasus.common.inline.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/h.class */
public final class C5589h extends BiliApiDataCallback<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Fragment> f75566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5583b<?> f75567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f75568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f75569e;

    public C5589h(Fragment fragment, InterfaceC5583b<?> interfaceC5583b, long j7, boolean z6) {
        this.f75567c = interfaceC5583b;
        this.f75568d = j7;
        this.f75569e = z6;
        this.f75566b = new WeakReference<>(fragment);
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(JSONObject jSONObject) {
        Context context;
        InterfaceC5583b<?> interfaceC5583b = this.f75567c;
        long j7 = this.f75568d;
        boolean z6 = this.f75569e;
        interfaceC5583b.c(j7, z6);
        Fragment fragment = this.f75566b.get();
        if (fragment == null || (context = fragment.getContext()) == null) {
            return;
        }
        if (z6) {
            PromoToast.showBottomToast(context, 2131845202);
        } else {
            PromoToast.showBottomToast(context, 2131845089);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Context context;
        this.f75567c.c(this.f75568d, !this.f75569e);
        Fragment fragment = this.f75566b.get();
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
            final FragmentActivity fragmentActivityP32 = fragment.p3();
            if (fragmentActivityP32 == null || !IFragmentShowHideKt.isFragmentShown(fragment) || fragmentActivityP32.isFinishing()) {
                return;
            }
            final int i8 = 0;
            new AlertDialog.Builder(fragmentActivityP32).setMessage(fragmentActivityP32.getString(2131846926)).setNegativeButton(2131841464, (DialogInterface.OnClickListener) null).setPositiveButton(2131847182, new DialogInterface.OnClickListener(fragmentActivityP32, i8) { // from class: com.bilibili.pegasus.common.inline.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f75564a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f75565b;

                {
                    this.f75564a = i8;
                    this.f75565b = fragmentActivityP32;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    switch (this.f75564a) {
                        case 0:
                            FragmentActivity fragmentActivity = (FragmentActivity) this.f75565b;
                            AccountService accountService = (AccountService) BLRouter.get$default(BLRouter.INSTANCE, AccountService.class, (String) null, 2, (Object) null);
                            if (accountService != null) {
                                accountService.bindPhone(fragmentActivity);
                            }
                            dialogInterface.cancel();
                            break;
                        default:
                            DownloadingActivity.d dVar = (DownloadingActivity.d) this.f75565b;
                            dVar.getClass();
                            int i10 = DownloadingActivity.d.e + 1;
                            DownloadingActivity.d.e = i10;
                            if (i10 >= 2) {
                                new SharedPreferencesHelper(dVar.c).setBoolean("sp_key_free_data_video_download_forbade", true);
                            }
                            for (kj0.g gVar : (ArrayList) dVar.a) {
                                int networkWithoutCache = ConnectivityMonitor.getInstance().getNetworkWithoutCache();
                                tv.danmaku.bili.ui.offline.v vVar = dVar.d;
                                vVar.getClass();
                                kj0.l lVar = gVar.h;
                                if (lVar == null || lVar.f122841a != 3) {
                                    j0 j0Var = vVar.a;
                                    VideoDownloadEntry videoDownloadEntryE = j0Var.e(gVar);
                                    if (videoDownloadEntryE != null) {
                                        String str = videoDownloadEntryE.e;
                                        j0.b bVar = j0Var.d;
                                        Messenger messenger = ((SJ0.a) bVar).c;
                                        if (messenger != null) {
                                            try {
                                                Message messageObtain = Message.obtain((Handler) null, 1021);
                                                messageObtain.replyTo = ((SJ0.a) bVar).d;
                                                messageObtain.arg1 = networkWithoutCache;
                                                Bundle data = messageObtain.getData();
                                                data.putString("entry_key", str);
                                                data.putBoolean("entry_fd", false);
                                                messenger.send(messageObtain);
                                            } catch (RemoteException e7) {
                                                iK0.a.e(e7);
                                            }
                                        }
                                    }
                                }
                            }
                            ((ArrayList) dVar.a).clear();
                            break;
                    }
                }
            }).create().show();
            return;
        }
        if (i7 == -102) {
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
