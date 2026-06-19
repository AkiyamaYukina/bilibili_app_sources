package com.bilibili.lib.sharewrapper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bilibili.app.comm.webview.message.WebBusModel;
import com.bilibili.bus.ChannelOperation;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.sharewrapper.Bshare.ShareBLog;
import com.bilibili.lib.sharewrapper.basic.BiliExtraBuilder;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.moduleservice.share.DynamicCallbackService;
import com.bilibili.moduleservice.share.ShareService;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import ff0.C7052a;
import hf0.C7436a;
import hf0.C7438c;
import java.util.HashMap;
import java.util.Map;
import lf0.ActivityC7846a;
import w8.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/BiliSharePlatformTransferActivity.class */
public class BiliSharePlatformTransferActivity extends ActivityC7846a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Map<String, String> f64396B;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f64397A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f64398x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C7438c f64399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f64400z;

    static {
        HashMap map = new HashMap();
        f64396B = map;
        map.put(SocializeMedia.BILI_DYNAMIC, "action://following/share-to-dynamic");
        map.put(SocializeMedia.BILI_IM, "action://im/share-to-im");
        map.put(SocializeMedia.BILI_LIVE, "action://live/share-to-live");
    }

    @Override // lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 != 5210) {
            if (i7 == 1002) {
                Bundle bundle = new Bundle();
                bundle.putInt(BiliExtraBuilder.KEY_RESULT, 3);
                s6(bundle);
                finish();
                return;
            }
            ShareBLog.i("BiliSharePlatformTransferActivity", "onActivityResult -> cancel");
            Bundle bundle2 = new Bundle();
            bundle2.putInt(BiliExtraBuilder.KEY_RESULT, 0);
            s6(bundle2);
            finish();
            return;
        }
        Bundle extras = intent != null ? intent.getExtras() : null;
        Bundle bundle3 = extras;
        if (extras == null) {
            bundle3 = new Bundle();
        }
        if (bundle3.containsKey(BiliExtraBuilder.KEY_RESULT)) {
            ShareBLog.i("BiliSharePlatformTransferActivity", "onActivityResult -> result : " + bundle3.getInt(BiliExtraBuilder.KEY_RESULT) + ", msg : " + bundle3.getString(BiliExtraBuilder.KEY_RESULT_MESSAGE));
        } else {
            bundle3.putInt(BiliExtraBuilder.KEY_RESULT, i8);
        }
        s6(bundle3);
        finish();
    }

    @Override // lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f64397A = intent.getStringExtra(ThirdPartyExtraBuilder.CALLBACK_URL);
        String stringExtra = intent.getStringExtra("media");
        this.f64400z = stringExtra;
        if (SocializeMedia.BILI_LIVE.equals(stringExtra)) {
            C7438c c7438c = new C7438c(this, new C7052a(this));
            this.f64399y = c7438c;
            c7438c.a();
            c7438c.f120876c = new ChannelOperation(WebBusModel.class).observeForeverUnSticky(new C7436a(c7438c, 0));
            ShareBLog.d("ShareResultHandler", "Share result observer set up successfully");
            ShareBLog.i("BiliSharePlatformTransferActivity", "ShareResultHandler set up for BILI_LIVE share");
        }
        if (bundle == null) {
            Bundle bundleExtra = intent.getBundleExtra(CaptureSchema.JUMP_PARAMS_EXTRA);
            Bundle bundle2 = bundleExtra;
            if (bundleExtra == null) {
                bundle2 = new Bundle();
            }
            bundle2.putInt(BiliExtraBuilder.SHARE_REQUEST_CODE, 5210);
            String str = (String) ((HashMap) f64396B).get(this.f64400z);
            if (TextUtils.isEmpty(str)) {
                finish();
                return;
            }
            ShareService shareService = (ShareService) d.a(BLRouter.INSTANCE, ShareService.class, str);
            if (shareService == null) {
                finish();
                return;
            }
            ShareBLog.i("BiliSharePlatformTransferActivity", "shareTo -> shareService : " + shareService);
            shareService.shareTo(this, bundle2);
        }
    }

    @Override // lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C7438c c7438c = this.f64399y;
        if (c7438c != null) {
            c7438c.a();
            this.f64399y = null;
        }
        if (this.f64398x) {
            return;
        }
        ShareBLog.i("BiliSharePlatformTransferActivity", "onDestroy -> cancel");
        Bundle bundle = new Bundle();
        bundle.putInt(BiliExtraBuilder.KEY_RESULT, 0);
        s6(bundle);
    }

    public final void s6(Bundle bundle) {
        this.f64398x = true;
        DynamicCallbackService dynamicCallbackService = (DynamicCallbackService) d.a(BLRouter.INSTANCE, DynamicCallbackService.class, "default");
        if (dynamicCallbackService != null) {
            dynamicCallbackService.onCallback(this.f64397A, bundle);
        }
    }
}
