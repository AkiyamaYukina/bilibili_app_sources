package com.bilibili.socialize.share.core.ui;

import Dv0.c;
import Ev0.f;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.sharewrapper.basic.BiliExtraBuilder;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.socialize.share.core.BiliShareConfiguration;
import com.bilibili.socialize.share.core.SocializeMedia;
import com.bilibili.socialize.share.core.error.ShareException;
import com.bilibili.socialize.share.core.shareparam.BaseShareParam;
import lf0.ActivityC7846a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/ui/BiliShareDelegateActivity.class */
public class BiliShareDelegateActivity extends ActivityC7846a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f105032A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final a f105033B = new a(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BaseShareParam f105034x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public BiliShareConfiguration f105035y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SocializeMedia f105036z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/ui/BiliShareDelegateActivity$a.class */
    public final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliShareDelegateActivity f105037a;

        public a(BiliShareDelegateActivity biliShareDelegateActivity) {
            this.f105037a = biliShareDelegateActivity;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra("share_action", 0);
            if (intExtra == 1) {
                BiliShareDelegateActivity biliShareDelegateActivity = this.f105037a;
                SocializeMedia socializeMedia = biliShareDelegateActivity.f105036z;
                Pv0.b.c("BShare.delegate.act", "on inner share start");
                f fVarU6 = biliShareDelegateActivity.u6();
                if (fVarU6 != null) {
                    Pv0.b.c(fVarU6.i(), "on share start");
                    c cVar = fVarU6.f4784c;
                    if (cVar == null) {
                        return;
                    }
                    cVar.x0(socializeMedia);
                    return;
                }
                return;
            }
            if (intExtra == 2) {
                String stringExtra = intent.getStringExtra("share_extra");
                BiliShareDelegateActivity biliShareDelegateActivity2 = this.f105037a;
                SocializeMedia socializeMedia2 = biliShareDelegateActivity2.f105036z;
                Pv0.b.c("BShare.delegate.act", "on inner share progress");
                f fVarU62 = biliShareDelegateActivity2.u6();
                if (fVarU62 != null) {
                    Pv0.b.c(fVarU62.i(), "on share progress");
                    c cVar2 = fVarU62.f4784c;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.x(socializeMedia2, stringExtra);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/ui/BiliShareDelegateActivity$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f105038a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:39:0x009d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.socialize.share.core.SocializeMedia[] r0 = com.bilibili.socialize.share.core.SocializeMedia.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.f105038a = r0
                r0 = r4
                com.bilibili.socialize.share.core.SocializeMedia r1 = com.bilibili.socialize.share.core.SocializeMedia.SINA     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L14:
                int[] r0 = com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.f105038a     // Catch: java.lang.NoSuchFieldError -> L7d java.lang.NoSuchFieldError -> L81
                com.bilibili.socialize.share.core.SocializeMedia r1 = com.bilibili.socialize.share.core.SocializeMedia.WEIXIN     // Catch: java.lang.NoSuchFieldError -> L81
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L81
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L81
            L1f:
                int[] r0 = com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.f105038a     // Catch: java.lang.NoSuchFieldError -> L81 java.lang.NoSuchFieldError -> L85
                com.bilibili.socialize.share.core.SocializeMedia r1 = com.bilibili.socialize.share.core.SocializeMedia.WEIXIN_MONMENT     // Catch: java.lang.NoSuchFieldError -> L85
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L85
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L85
            L2a:
                int[] r0 = com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.f105038a     // Catch: java.lang.NoSuchFieldError -> L85 java.lang.NoSuchFieldError -> L89
                com.bilibili.socialize.share.core.SocializeMedia r1 = com.bilibili.socialize.share.core.SocializeMedia.QQ     // Catch: java.lang.NoSuchFieldError -> L89
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L89
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L89
            L35:
                int[] r0 = com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.f105038a     // Catch: java.lang.NoSuchFieldError -> L89 java.lang.NoSuchFieldError -> L8d
                com.bilibili.socialize.share.core.SocializeMedia r1 = com.bilibili.socialize.share.core.SocializeMedia.QZONE     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
            L40:
                int[] r0 = com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.f105038a     // Catch: java.lang.NoSuchFieldError -> L8d java.lang.NoSuchFieldError -> L91
                com.bilibili.socialize.share.core.SocializeMedia r1 = com.bilibili.socialize.share.core.SocializeMedia.FACEBOOK     // Catch: java.lang.NoSuchFieldError -> L91
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L91
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L91
            L4c:
                int[] r0 = com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.f105038a     // Catch: java.lang.NoSuchFieldError -> L91 java.lang.NoSuchFieldError -> L95
                com.bilibili.socialize.share.core.SocializeMedia r1 = com.bilibili.socialize.share.core.SocializeMedia.TWITTER     // Catch: java.lang.NoSuchFieldError -> L95
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L95
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L95
            L58:
                int[] r0 = com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.f105038a     // Catch: java.lang.NoSuchFieldError -> L95 java.lang.NoSuchFieldError -> L99
                com.bilibili.socialize.share.core.SocializeMedia r1 = com.bilibili.socialize.share.core.SocializeMedia.WHATSAPP     // Catch: java.lang.NoSuchFieldError -> L99
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L99
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L99
            L64:
                int[] r0 = com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.f105038a     // Catch: java.lang.NoSuchFieldError -> L99 java.lang.NoSuchFieldError -> L9d
                com.bilibili.socialize.share.core.SocializeMedia r1 = com.bilibili.socialize.share.core.SocializeMedia.MESSENGER     // Catch: java.lang.NoSuchFieldError -> L9d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9d
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9d
            L70:
                int[] r0 = com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.f105038a     // Catch: java.lang.NoSuchFieldError -> L9d java.lang.NoSuchFieldError -> La1
                com.bilibili.socialize.share.core.SocializeMedia r1 = com.bilibili.socialize.share.core.SocializeMedia.LINE     // Catch: java.lang.NoSuchFieldError -> La1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La1
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La1
            L7c:
                return
            L7d:
                r4 = move-exception
                goto L14
            L81:
                r4 = move-exception
                goto L1f
            L85:
                r4 = move-exception
                goto L2a
            L89:
                r4 = move-exception
                goto L35
            L8d:
                r4 = move-exception
                goto L40
            L91:
                r4 = move-exception
                goto L4c
            L95:
                r4 = move-exception
                goto L58
            L99:
                r4 = move-exception
                goto L64
            L9d:
                r4 = move-exception
                goto L70
            La1:
                r4 = move-exception
                goto L7c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.socialize.share.core.ui.BiliShareDelegateActivity.b.m9807clinit():void");
        }
    }

    public static Intent s6(int i7, @Nullable String str) {
        Intent intent = new Intent();
        intent.putExtra(BiliExtraBuilder.KEY_RESULT, i7);
        intent.putExtra("share_extra", str);
        return intent;
    }

    public static void w6(Activity activity, BaseShareParam baseShareParam, BiliShareConfiguration biliShareConfiguration, SocializeMedia socializeMedia, String str) {
        Intent intent = new Intent(activity, (Class<?>) BiliShareDelegateActivity.class);
        intent.putExtra("share_param", baseShareParam);
        intent.putExtra("share_config", biliShareConfiguration);
        intent.putExtra("share_type", socializeMedia.name());
        intent.putExtra(ThirdPartyExtraBuilder.CLIENT_NAME, str);
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
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
        if (i7 == 1024 && intent != null) {
            int intExtra = intent.getIntExtra(BiliExtraBuilder.KEY_RESULT, 0);
            if (intExtra == 1) {
                Pv0.b.c("BShare.delegate.act", "act result: success");
                SocializeMedia socializeMedia = this.f105036z;
                Pv0.b.c("BShare.delegate.act", "----->on inner share success<-----");
                f fVarU6 = u6();
                if (fVarU6 != null) {
                    Pv0.b.c(fVarU6.i(), "on share success");
                    c cVar = fVarU6.f4784c;
                    if (cVar != null) {
                        cVar.T0(socializeMedia);
                    }
                }
                finish();
                return;
            }
            if (intExtra == 2) {
                String stringExtra = intent.getStringExtra("share_extra");
                Pv0.b.b("BShare.delegate.act", "act result: failed, msg: " + stringExtra, null);
                SocializeMedia socializeMedia2 = this.f105036z;
                ShareException shareException = new ShareException(stringExtra);
                Pv0.b.b("BShare.delegate.act", "----->on inner share fail<-----", null);
                f fVarU62 = u6();
                if (fVarU62 != null) {
                    Pv0.b.b(fVarU62.i(), "on share failed, code = 202", null);
                    c cVar2 = fVarU62.f4784c;
                    if (cVar2 != null) {
                        cVar2.e4(socializeMedia2, 202, shareException);
                    }
                }
                finish();
                return;
            }
            if (intExtra == 0) {
                Pv0.b.c("BShare.delegate.act", "act result: cancel");
                t6();
                return;
            }
        }
        Pv0.b.c("BShare.delegate.act", "act result: finish with unexpected result");
        SocializeMedia socializeMedia3 = this.f105036z;
        Pv0.b.c("BShare.delegate.act", "----->on inner share unknown<-----");
        f fVarU63 = u6();
        if (fVarU63 != null) {
            Pv0.b.c(fVarU63.i(), "on share release");
            c cVar3 = fVarU63.f4784c;
            if (cVar3 != null) {
                cVar3.g3(socializeMedia3);
            }
        }
        finish();
    }

    @Override // lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f105034x = (BaseShareParam) intent.getParcelableExtra("share_param");
        this.f105035y = (BiliShareConfiguration) intent.getParcelableExtra("share_config");
        String stringExtra = intent.getStringExtra("share_type");
        this.f105032A = intent.getStringExtra(ThirdPartyExtraBuilder.CLIENT_NAME);
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f105036z = SocializeMedia.valueOf(stringExtra);
        }
        SocializeMedia socializeMedia = this.f105036z;
        if (socializeMedia == null) {
            Pv0.b.b("BShare.delegate.act", "finish due to null socialize media", null);
            t6();
            return;
        }
        if (bundle == null) {
            switch (b.f105038a[socializeMedia.ordinal()]) {
                case 1:
                    Pv0.b.c("BShare.delegate.act", "gonna start sina assist act");
                    BaseShareParam baseShareParam = this.f105034x;
                    BiliShareConfiguration biliShareConfiguration = this.f105035y;
                    Intent intent2 = new Intent(this, (Class<?>) SinaAssistActivity.class);
                    intent2.putExtra("share_param", baseShareParam);
                    intent2.putExtra("share_config", biliShareConfiguration);
                    intent2.putExtra("share_type", SocializeMedia.SINA.name());
                    startActivityForResult(intent2, 1024);
                    overridePendingTransition(0, 0);
                    break;
                case 2:
                case 3:
                    Pv0.b.c("BShare.delegate.act", "gonna start wx assist act");
                    BaseShareParam baseShareParam2 = this.f105034x;
                    BiliShareConfiguration biliShareConfiguration2 = this.f105035y;
                    SocializeMedia socializeMedia2 = this.f105036z;
                    Intent intent3 = new Intent(this, (Class<?>) WxAssistActivity.class);
                    intent3.putExtra("share_param", baseShareParam2);
                    intent3.putExtra("share_config", biliShareConfiguration2);
                    intent3.putExtra("share_type", socializeMedia2.name());
                    startActivityForResult(intent3, 1024);
                    overridePendingTransition(0, 0);
                    break;
                case 4:
                case 5:
                    Pv0.b.c("BShare.delegate.act", "gonna start qq assist act");
                    BaseShareParam baseShareParam3 = this.f105034x;
                    BiliShareConfiguration biliShareConfiguration3 = this.f105035y;
                    SocializeMedia socializeMedia3 = this.f105036z;
                    Intent intent4 = new Intent(this, (Class<?>) QQAssistActivity.class);
                    intent4.putExtra("share_param", baseShareParam3);
                    intent4.putExtra("share_config", biliShareConfiguration3);
                    intent4.putExtra("share_type", socializeMedia3.name());
                    startActivityForResult(intent4, 1024);
                    overridePendingTransition(0, 0);
                    break;
                case 6:
                    Pv0.b.c("BShare.delegate.act", "gonna start qq assist act");
                    BaseShareParam baseShareParam4 = this.f105034x;
                    BiliShareConfiguration biliShareConfiguration4 = this.f105035y;
                    SocializeMedia socializeMedia4 = this.f105036z;
                    Intent intent5 = new Intent(this, (Class<?>) FacebookAssistActivity.class);
                    intent5.putExtra("share_param", baseShareParam4);
                    intent5.putExtra("share_config", biliShareConfiguration4);
                    intent5.putExtra("share_type", socializeMedia4.name());
                    startActivityForResult(intent5, 1024);
                    overridePendingTransition(0, 0);
                    break;
                case 7:
                    Pv0.b.c("BShare.delegate.act", "gonna start qq assist act");
                    BaseShareParam baseShareParam5 = this.f105034x;
                    BiliShareConfiguration biliShareConfiguration5 = this.f105035y;
                    SocializeMedia socializeMedia5 = this.f105036z;
                    Intent intent6 = new Intent(this, (Class<?>) XAssistActivity.class);
                    intent6.putExtra("share_param", baseShareParam5);
                    intent6.putExtra("share_config", biliShareConfiguration5);
                    intent6.putExtra("share_type", socializeMedia5.name());
                    startActivityForResult(intent6, 1024);
                    overridePendingTransition(0, 0);
                    break;
                case 8:
                    Pv0.b.c("BShare.delegate.act", "gonna start qq assist act");
                    BaseShareParam baseShareParam6 = this.f105034x;
                    BiliShareConfiguration biliShareConfiguration6 = this.f105035y;
                    SocializeMedia socializeMedia6 = this.f105036z;
                    Intent intent7 = new Intent(this, (Class<?>) WhatsAppAssistActivity.class);
                    intent7.putExtra("share_param", baseShareParam6);
                    intent7.putExtra("share_config", biliShareConfiguration6);
                    intent7.putExtra("share_type", socializeMedia6.name());
                    startActivityForResult(intent7, 1024);
                    overridePendingTransition(0, 0);
                    break;
                case 9:
                    Pv0.b.c("BShare.delegate.act", "gonna start qq assist act");
                    BaseShareParam baseShareParam7 = this.f105034x;
                    BiliShareConfiguration biliShareConfiguration7 = this.f105035y;
                    SocializeMedia socializeMedia7 = this.f105036z;
                    Intent intent8 = new Intent(this, (Class<?>) MessengerAssistActivity.class);
                    intent8.putExtra("share_param", baseShareParam7);
                    intent8.putExtra("share_config", biliShareConfiguration7);
                    intent8.putExtra("share_type", socializeMedia7.name());
                    startActivityForResult(intent8, 1024);
                    overridePendingTransition(0, 0);
                    break;
                case 10:
                    Pv0.b.c("BShare.delegate.act", "gonna start qq assist act");
                    BaseShareParam baseShareParam8 = this.f105034x;
                    BiliShareConfiguration biliShareConfiguration8 = this.f105035y;
                    SocializeMedia socializeMedia8 = this.f105036z;
                    Intent intent9 = new Intent(this, (Class<?>) LineAssistActivity.class);
                    intent9.putExtra("share_param", baseShareParam8);
                    intent9.putExtra("share_config", biliShareConfiguration8);
                    intent9.putExtra("share_type", socializeMedia8.name());
                    startActivityForResult(intent9, 1024);
                    overridePendingTransition(0, 0);
                    break;
                default:
                    t6();
                    return;
            }
        }
        try {
            ContextCompat.registerReceiver(this, this.f105033B, new IntentFilter("bilishare.delegate.assist.action"), 4);
        } catch (Exception e7) {
            Pv0.b.b("BShare.delegate.act", "register receiver error", e7);
        }
    }

    @Override // lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            unregisterReceiver(this.f105033B);
        } catch (Exception e7) {
            Pv0.b.b("BShare.delegate.act", "unregister receiver error", e7);
        }
    }

    public final void t6() {
        SocializeMedia socializeMedia = this.f105036z;
        Pv0.b.c("BShare.delegate.act", "----->on inner share cancel<-----");
        f fVarU6 = u6();
        if (fVarU6 != null) {
            Pv0.b.c(fVarU6.i(), "on share cancel");
            c cVar = fVarU6.f4784c;
            if (cVar != null) {
                cVar.x4(socializeMedia);
            }
        }
        finish();
    }

    @Nullable
    public final f u6() {
        if (TextUtils.isEmpty(this.f105032A)) {
            Pv0.b.b("BShare.delegate.act", "null client name", null);
            return null;
        }
        Ev0.a aVar = Dv0.a.a(this.f105032A).f3224a;
        if (aVar == null) {
            Pv0.b.b("BShare.delegate.act", "null handler", null);
            return null;
        }
        if (aVar instanceof f) {
            return (f) aVar;
        }
        Pv0.b.b("BShare.delegate.act", "wrong handler type", null);
        return null;
    }
}
