package com.bilibili.upper.module.gamemaker;

import J1.z;
import K7.L;
import L50.a;
import MF0.p;
import NY.f;
import R50.r;
import Xz0.g;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.core.content.d;
import bolts.Task;
import bw0.InterfaceC5167a;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.PermissionRequestUtils;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.centerplus.model.h;
import com.bilibili.studio.centerplus.model.l;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import com.bilibili.studio.centerplus.network.entity.UploadInfo;
import com.bilibili.studio.config.UpperGrayConfig;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.G;
import com.bilibili.studio.videoeditor.exception.FileNotExistedError;
import com.bilibili.studio.videoeditor.gamemaker.GameSchemeBean;
import com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager;
import com.bilibili.studio.videoeditor.util.X;
import eJ0.C6929g;
import eJ0.v;
import j4.t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kntr.base.utils.foundation.CpuUtils;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qw0.C8488a;
import rw0.C8554a;
import tv.danmaku.android.log.BLog;
import vC0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/gamemaker/GameMakerRouterActivity.class */
public class GameMakerRouterActivity extends com.bilibili.lib.spy.generated.a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f113149R = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f113153D;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f113158I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f113159J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f113160K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f113161L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f113162M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f113163N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ProgressBar f113164O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public TextView f113165P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public a f113166Q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GameMakerRouterActivity f113168y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f113169z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f113167x = 10000;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f113150A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f113151B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f113152C = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f113154E = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f113155F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f113156G = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f113157H = 7;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/gamemaker/GameMakerRouterActivity$a.class */
    public final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GameMakerRouterActivity f113170a;

        /* JADX INFO: renamed from: com.bilibili.upper.module.gamemaker.GameMakerRouterActivity$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/gamemaker/GameMakerRouterActivity$a$a.class */
        public final class C1227a implements Function2<Boolean, PreviewData, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f113171a;

            public C1227a(a aVar) {
                this.f113171a = aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                PreviewData previewData = (PreviewData) obj2;
                if (previewData != null) {
                    try {
                        p.a.f16039a.f16038a = previewData.partitionShowType;
                        UpperGrayConfig.INSTANCE.saveInLocal();
                        Task.callInBackground(new v(previewData));
                        UploadInfo uploadInfo = previewData.uploadInfo;
                        if (uploadInfo != null && uploadInfo.info == 1) {
                            BLog.i("GameMakerRouterActivity", "checkArchiveResult SUCCESS");
                            Message message = new Message();
                            message.what = 15;
                            GameMakerRouterActivity gameMakerRouterActivity = this.f113171a.f113170a;
                            int i7 = GameMakerRouterActivity.f113149R;
                            gameMakerRouterActivity.S6(message);
                            return null;
                        }
                        BLog.i("PreviewDataRepository", "clearPreviewData");
                        Application application = BiliContext.application();
                        if (application != null) {
                            l.f105185b = null;
                            BiliGlobalPreferenceHelper.getInstance(application).setString("upper_preview_data_v2", "");
                        }
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
                BLog.i("GameMakerRouterActivity", "checkArchiveResult FAIL, recheck !");
                Message message2 = new Message();
                message2.what = 16;
                GameMakerRouterActivity gameMakerRouterActivity2 = this.f113171a.f113170a;
                int i8 = GameMakerRouterActivity.f113149R;
                gameMakerRouterActivity2.S6(message2);
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GameMakerRouterActivity gameMakerRouterActivity, Looper looper) {
            super(looper);
            this.f113170a = gameMakerRouterActivity;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Uri uriQ6;
            boolean z6;
            super.handleMessage(message);
            if (message.what != 10) {
                Z.b(message.what, "GameMakerRouterActivity", new StringBuilder("handleMessage msg.what ="));
            }
            int i7 = message.what;
            GameMakerRouterActivity gameMakerRouterActivity = this.f113170a;
            try {
                switch (i7) {
                    case 10:
                        int i8 = gameMakerRouterActivity.f113154E;
                        if (i8 <= 90) {
                            gameMakerRouterActivity.f113154E = i8 + 2;
                            gameMakerRouterActivity.f113165P.setText("加载中 " + Math.min(gameMakerRouterActivity.f113154E, 90) + "%");
                            Message message2 = new Message();
                            message2.what = 10;
                            gameMakerRouterActivity.T6(message2, (long) 100);
                            return;
                        }
                        return;
                    case 11:
                        int i9 = GameMakerRouterActivity.f113149R;
                        gameMakerRouterActivity.getClass();
                        try {
                            Long.parseLong(gameMakerRouterActivity.f113163N);
                            List list = b.a().a;
                            boolean z7 = false;
                            if (list != null) {
                                z7 = false;
                                if (((ArrayList) list).size() != 0) {
                                    z7 = true;
                                }
                            }
                            t.a("checkInSharingProcess result = ", "GameMakerRouterActivity", z7);
                            if (z7) {
                                BLog.i("GameMakerRouterActivity", "checkInSharingProcess 用户当前处于发布流程");
                                ToastHelper.showToastLong(gameMakerRouterActivity.getApplicationContext(), gameMakerRouterActivity.getResources().getString(2131851468));
                                gameMakerRouterActivity.R6(2);
                                return;
                            } else {
                                BLog.i("GameMakerRouterActivity", "checkInSharingProcess 用户当前未处于发布流程");
                                Message message3 = new Message();
                                message3.what = 12;
                                gameMakerRouterActivity.S6(message3);
                                return;
                            }
                        } catch (Exception e7) {
                            BLog.i("GameMakerRouterActivity", "checkParamsValid 参数违法");
                            ToastHelper.showToastLong(gameMakerRouterActivity.getApplicationContext(), gameMakerRouterActivity.getResources().getString(2131851455));
                            gameMakerRouterActivity.R6(10);
                            return;
                        }
                    case 12:
                        String str = gameMakerRouterActivity.f113161L;
                        defpackage.a.b("checkManuscriptLegal START filePath：", str, "GameMakerRouterActivity");
                        int i10 = 2131851422;
                        int i11 = 2131851422;
                        try {
                            z6 = !TextUtils.isEmpty(str);
                            File file = new File(str);
                            if (!file.exists() || !X.a(str, "GameMakerRouterActivity")) {
                                z6 = false;
                            }
                            R50.a aVarS = null;
                            r rVarU = a.a.a.a != null ? r.u() : null;
                            if (rVarU != null) {
                                aVarS = rVarU.s(str);
                            }
                            if (aVarS == null) {
                                i10 = 2131851441;
                                z6 = false;
                            }
                            int i12 = i10;
                            if (aVarS.a.getDuration() < 3000000) {
                                StringBuilder sb = new StringBuilder("media duration = ");
                                sb.append(aVarS.a.getDuration() / 1000);
                                sb.append("ms");
                                BLog.d("GameMakerRouterActivity", sb.toString());
                                i12 = 2131851034;
                                z6 = false;
                            }
                            i11 = i12;
                            if (file.length() > 8589934592L) {
                                i11 = 2131851458;
                                z6 = false;
                            } else {
                                i11 = i12;
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            z6 = false;
                        }
                        bilibili.live.app.service.resolver.b.a(d.b("checkManuscriptLegal return ", ", msg:", z6), z6 ? "" : gameMakerRouterActivity.getResources().getString(i11), "GameMakerRouterActivity");
                        if (!z6) {
                            ToastHelper.showToastLong(gameMakerRouterActivity.getApplicationContext(), gameMakerRouterActivity.getResources().getString(i11));
                            gameMakerRouterActivity.R6(4);
                        }
                        if (!z6) {
                            BLog.i("GameMakerRouterActivity", "checkManuscriptLegal 用户分享稿件异常");
                            return;
                        }
                        BLog.i("GameMakerRouterActivity", "checkManuscriptLegal SUCCESS");
                        Message message4 = new Message();
                        message4.what = 13;
                        gameMakerRouterActivity.S6(message4);
                        return;
                    case 13:
                        int i13 = GameMakerRouterActivity.f113149R;
                        gameMakerRouterActivity.getClass();
                        if (BiliAccounts.get(gameMakerRouterActivity).isLogin()) {
                            Message message5 = new Message();
                            message5.what = 14;
                            gameMakerRouterActivity.S6(message5);
                            return;
                        } else {
                            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://main/login/")).addFlag(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT).requestCode(25889).build(), gameMakerRouterActivity);
                            BLog.i("GameMakerRouterActivity", "goLogin()");
                            gameMakerRouterActivity.f113151B = true;
                            return;
                        }
                    case 14:
                        BLog.i("GameMakerRouterActivity", "checkArchiveResult START");
                        Task.callInBackground(new h(true, false, new C1227a(this)));
                        return;
                    case 15:
                        int i14 = GameMakerRouterActivity.f113149R;
                        gameMakerRouterActivity.getClass();
                        BLog.i("GameMakerRouterActivity", "checkMeiSheSDK START");
                        int i15 = 2131850725;
                        try {
                            EditorEngineSDKLoadManager.init(gameMakerRouterActivity.getApplicationContext(), "GameMakerRouterActivity");
                            C6929g.b("1", "");
                            gameMakerRouterActivity.f113169z = true;
                            gameMakerRouterActivity.f113150A = false;
                            break;
                        } catch (FileNotExistedError e9) {
                            gameMakerRouterActivity.f113150A = true;
                            gameMakerRouterActivity.f113169z = false;
                            BLog.e("GameMakerRouterActivity", e9.getMessage());
                            C6929g.b("0", "");
                        } catch (NullPointerException e10) {
                            gameMakerRouterActivity.f113169z = false;
                            BLog.e("GameMakerRouterActivity", "onCreate start ms init sdk streamingContext null");
                            i15 = 2131850732;
                        } catch (UnsatisfiedLinkError e11) {
                            gameMakerRouterActivity.f113169z = false;
                            i15 = CpuUtils.isX86(gameMakerRouterActivity) ? 2131850729 : 2131856244;
                            BLog.e("GameMakerRouterActivity", "onCreate start ms init sdk error: " + e11.getLocalizedMessage());
                        }
                        if (!gameMakerRouterActivity.f113169z && !gameMakerRouterActivity.f113150A) {
                            ToastHelper.showToastLong(gameMakerRouterActivity.getApplicationContext(), gameMakerRouterActivity.getResources().getString(i15));
                            gameMakerRouterActivity.R6(6);
                        }
                        StringBuilder sb2 = new StringBuilder("checkMeiSheSDK return ");
                        sb2.append(gameMakerRouterActivity.f113169z);
                        sb2.append(", mModDownloading:");
                        sb2.append(gameMakerRouterActivity.f113150A);
                        sb2.append(",msg:");
                        bilibili.live.app.service.resolver.b.a(sb2, gameMakerRouterActivity.f113169z ? "" : gameMakerRouterActivity.getResources().getString(i15), "GameMakerRouterActivity");
                        if (gameMakerRouterActivity.f113169z) {
                            BLog.i("GameMakerRouterActivity", "checkMeiSheSDK SDK OK!");
                            Message message6 = new Message();
                            message6.what = 18;
                            gameMakerRouterActivity.S6(message6);
                            return;
                        }
                        if (gameMakerRouterActivity.f113150A) {
                            BLog.i("GameMakerRouterActivity", "checkMeiSheSDK SDK NOT OK, RECHECK!");
                            Message message7 = new Message();
                            message7.what = 17;
                            gameMakerRouterActivity.S6(message7);
                            return;
                        }
                        return;
                    case 16:
                        BLog.i("GameMakerRouterActivity", "checkArchiveResult recheck START");
                        if (gameMakerRouterActivity.f113155F == 0) {
                            gameMakerRouterActivity.f113153D = System.currentTimeMillis();
                        }
                        gameMakerRouterActivity.f113155F++;
                        if (GameMakerRouterActivity.P6(gameMakerRouterActivity)) {
                            BLog.i("GameMakerRouterActivity", "checkArchiveResult recheck 超时 !!!");
                            ToastHelper.showToastLong(gameMakerRouterActivity.getApplicationContext(), gameMakerRouterActivity.getResources().getString(2131851169));
                            Message message8 = new Message();
                            message8.what = 19;
                            gameMakerRouterActivity.T6(message8, 1000L);
                            return;
                        }
                        BLog.i("GameMakerRouterActivity", "checkArchiveResult recheck 未超时，recheck(" + gameMakerRouterActivity.f113155F + ")!!!");
                        Message message9 = new Message();
                        message9.what = 14;
                        gameMakerRouterActivity.T6(message9, 1000L);
                        return;
                    case 17:
                        BLog.i("GameMakerRouterActivity", "checkMeiSheSDK recheck START");
                        if (gameMakerRouterActivity.f113156G == 0) {
                            gameMakerRouterActivity.f113153D = System.currentTimeMillis();
                            gameMakerRouterActivity.f113167x = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE;
                        }
                        gameMakerRouterActivity.f113156G++;
                        if (GameMakerRouterActivity.P6(gameMakerRouterActivity)) {
                            BLog.i("GameMakerRouterActivity", "checkMeiSheSDK recheck 超时 !!!");
                            ToastHelper.showToastLong(gameMakerRouterActivity.getApplicationContext(), gameMakerRouterActivity.getResources().getString(2131851169));
                            Message message10 = new Message();
                            message10.what = 19;
                            gameMakerRouterActivity.T6(message10, 1000L);
                            return;
                        }
                        BLog.i("GameMakerRouterActivity", "checkMeiSheSDK recheck 未超时，recheck(" + gameMakerRouterActivity.f113156G + ")!!!");
                        Message message11 = new Message();
                        message11.what = 15;
                        gameMakerRouterActivity.T6(message11, 1000L);
                        return;
                    case 18:
                        gameMakerRouterActivity.f113165P.setText("加载中 100%");
                        BLog.i("GameMakerRouterActivity", "handleRouterToArchivePage START");
                        try {
                            GameSchemeBean gameSchemeBean = new GameSchemeBean();
                            gameSchemeBean.callback = gameMakerRouterActivity.f113162M;
                            gameSchemeBean.company = gameMakerRouterActivity.f113158I;
                            gameSchemeBean.gn = gameMakerRouterActivity.f113160K;
                            gameSchemeBean.gc = gameMakerRouterActivity.f113159J;
                            gameSchemeBean.uri = gameMakerRouterActivity.f113161L;
                            gameSchemeBean.tm = TextUtils.isEmpty(gameMakerRouterActivity.f113163N) ? 0L : Long.parseLong(gameMakerRouterActivity.f113163N);
                            if (G.b().c(gameMakerRouterActivity.f113168y, gameSchemeBean)) {
                                g.e(gameMakerRouterActivity, "游戏一键投稿", "game_contribute");
                                ArrayMap arrayMap = new ArrayMap();
                                arrayMap.put("request_code", gameMakerRouterActivity.f113159J);
                                arrayMap.put("request_result", "1");
                                Neurons.reportClick(true, "creation.transfer.all.request.click", arrayMap);
                                WE0.a.a().getClass();
                                WE0.a.b("game", "视频编辑页");
                                gameMakerRouterActivity.finish();
                                return;
                            }
                            try {
                                gameMakerRouterActivity.R6(6);
                                return;
                            } catch (Exception e12) {
                            }
                        } catch (Exception e13) {
                        }
                        gameMakerRouterActivity.R6(6);
                        return;
                    case 19:
                        BLog.i("GameMakerRouterActivity", " CHECKING OUT OF TIME");
                        int i16 = GameMakerRouterActivity.f113149R;
                        gameMakerRouterActivity.R6(8);
                        return;
                    case 20:
                        try {
                            ArrayMap arrayMap2 = new ArrayMap();
                            arrayMap2.put("request_code", gameMakerRouterActivity.f113159J);
                            arrayMap2.put("request_result", "0");
                            Neurons.reportClick(true, "creation.transfer.all.request.click", arrayMap2);
                            if (!TextUtils.isEmpty(gameMakerRouterActivity.f113162M)) {
                                int i17 = gameMakerRouterActivity.f113157H;
                                if (9 == i17 && (uriQ6 = gameMakerRouterActivity.Q6(i17, gameMakerRouterActivity.f113162M)) != null) {
                                    BLog.i("GameMakerRouterActivity", "jumpBack to " + uriQ6.toString());
                                    Intent intent = new Intent("android.intent.action.VIEW", uriQ6);
                                    intent.setFlags(270532608);
                                    List<ResolveInfo> listQueryIntentActivities = gameMakerRouterActivity.getPackageManager().queryIntentActivities(intent, 0);
                                    if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
                                        BLog.i("GameMakerRouterActivity", "jumpBack FAILED!!! ");
                                    } else {
                                        ProgressBar progressBar = gameMakerRouterActivity.f113164O;
                                        if (progressBar != null) {
                                            progressBar.setVisibility(4);
                                        }
                                        gameMakerRouterActivity.startActivity(intent);
                                    }
                                }
                            }
                        } catch (Exception e14) {
                            e14.printStackTrace();
                        }
                        BLog.i("GameMakerRouterActivity", "finish !!!");
                        gameMakerRouterActivity.finish();
                        return;
                    default:
                        return;
                }
            } catch (Throwable th) {
                BLog.i("GameMakerRouterActivity", "finish !!!");
                gameMakerRouterActivity.finish();
                throw th;
            }
            BLog.i("GameMakerRouterActivity", "finish !!!");
            gameMakerRouterActivity.finish();
            throw th;
        }
    }

    public static boolean P6(GameMakerRouterActivity gameMakerRouterActivity) {
        gameMakerRouterActivity.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z6 = jCurrentTimeMillis > gameMakerRouterActivity.f113167x + gameMakerRouterActivity.f113153D;
        StringBuilder sbB = d.b("checkOutOfTime outOfTime:", ", currentTime - mStartTime =", z6);
        sbB.append(jCurrentTimeMillis - gameMakerRouterActivity.f113153D);
        z.a(jCurrentTimeMillis, ", currentTime:", ",mStartTime:", sbB);
        androidx.recyclerview.widget.v.a(sbB, gameMakerRouterActivity.f113153D, "GameMakerRouterActivity");
        return z6;
    }

    public final Uri Q6(int i7, String str) {
        int i8;
        String str2;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        switch (i7) {
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i8 = 202;
                str2 = "分享失败";
                break;
            case 3:
            default:
                i8 = 201;
                str2 = "分享取消";
                break;
        }
        builderBuildUpon.appendQueryParameter("code", String.valueOf(i8));
        builderBuildUpon.appendQueryParameter(NotificationCompat.CATEGORY_MESSAGE, str2);
        builderBuildUpon.appendQueryParameter("tm", String.valueOf(this.f113163N));
        return builderBuildUpon.build();
    }

    public final void R6(int i7) {
        this.f113157H = i7;
        BLog.i("GameMakerRouterActivity", "jumpBack!");
        Message message = new Message();
        message.what = 20;
        T6(message, 1000L);
    }

    public final void S6(Message message) {
        a aVar = this.f113166Q;
        if (aVar != null) {
            aVar.sendMessage(message);
        }
    }

    public final void T6(Message message, long j7) {
        a aVar = this.f113166Q;
        if (aVar != null) {
            aVar.sendMessageDelayed(message, j7);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setContentView(2131493791);
        this.f113168y = this;
        String dataString = getIntent().getDataString();
        if (dataString == null) {
            BLog.i("GameMakerRouterActivity", "厂商提供schema为null，返回！");
            R6(10);
            return;
        }
        Uri uri = Uri.parse(dataString);
        this.f113158I = uri.getQueryParameter("company");
        this.f113159J = uri.getQueryParameter("gc");
        this.f113160K = uri.getQueryParameter("gn");
        this.f113161L = uri.getQueryParameter(EditCustomizeSticker.TAG_URI);
        this.f113162M = uri.getQueryParameter("callback");
        this.f113163N = uri.getQueryParameter("tm");
        BLog.i("GameMakerRouterActivity", "parseParam : mCompanyCode = " + this.f113158I + ", mGCCode =" + this.f113159J + ", mGNCode =" + this.f113160K + ", mResourceUriInfo =" + this.f113161L + ", mCallbackUrl = " + this.f113162M + ", mTm =" + this.f113163N);
        ProgressBar progressBar = (ProgressBar) findViewById(2131297510);
        this.f113164O = progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f113165P = (TextView) findViewById(2131297511);
        ((ImageView) findViewById(2131297509)).setOnClickListener(new f(this, 1));
        Lazy lazy = zw0.b.f130950a;
        if (Intrinsics.areEqual(Contract.get$default(ConfigManager.Companion.ab(), "uper.enable_get_profiles", (Object) null, 2, (Object) null), Boolean.TRUE)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            BLog.wfmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{"开始拉 x/app/v1/user/profiles接口"});
            ((InterfaceC5167a) ServiceGenerator.createService(InterfaceC5167a.class)).getUserProfiles().enqueue(new com.bilibili.studio.comm.manager.t(jCurrentTimeMillis));
        }
        Lazy<C8554a> lazy2 = C8554a.f127050c;
        C8554a.C1351a.a().a();
        Lazy<C8488a> lazy3 = C8488a.f126360e;
        C8488a.C1345a.a().a();
        this.f113166Q = new a(this, getMainLooper());
        String[] strArr = PermissionsChecker.STORAGE_WITH_AUDIO_PERMISSIONS;
        if (PermissionsChecker.checkSelfPermissions(this, strArr)) {
            this.f113152C = false;
        } else {
            this.f113152C = true;
            PermissionRequestUtils.requestPermissionWithTip(this, getLifecycle(), strArr, 21, getString(2131851394));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Lazy<C8488a> lazy = C8488a.f126360e;
        C8488a.C1345a.a().b();
        a aVar = this.f113166Q;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onRequestPermissionsResult(int i7, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (i7 == 21) {
            boolean z6 = true;
            for (int i8 = 0; i8 < strArr.length; i8++) {
                if (iArr[i8] != 0) {
                    z6 = false;
                }
            }
            if (z6) {
                this.f113152C = false;
            } else {
                ToastHelper.showToastLong(getApplicationContext(), getResources().getString(Build.VERSION.SDK_INT >= 33 ? 2131850710 : 2131841602));
                R6(1);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        StringBuilder sb = new StringBuilder("onResume mRouterToLogin:");
        sb.append(this.f113151B);
        sb.append(", mPermissionRequired:");
        L.a(sb, this.f113152C, "GameMakerRouterActivity");
        if (this.f113152C) {
            return;
        }
        if (!this.f113151B) {
            BLog.i("GameMakerRouterActivity", "onResume START");
            Message message = new Message();
            message.what = 11;
            S6(message);
            Message message2 = new Message();
            message2.what = 10;
            T6(message2, 100L);
            return;
        }
        this.f113151B = false;
        if (!BiliAccounts.get(this).isLogin()) {
            BLog.i("GameMakerRouterActivity", "afterRouterToLogin LOGIN FAIL! jumpBack");
            R6(3);
            return;
        }
        this.f113154E = 0;
        BLog.i("GameMakerRouterActivity", "afterRouterToLogin LOGIN SUCCESS! reset,mProgress:" + this.f113154E);
        Message message3 = new Message();
        message3.what = 14;
        S6(message3);
        Message message4 = new Message();
        message4.what = 10;
        T6(message4, 100L);
    }
}
