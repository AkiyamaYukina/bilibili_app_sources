package com.bilibili.ogv.misc.sponsor;

import AT0.c;
import NB0.C2691i;
import NB0.C2695m;
import Nl0.h;
import Pb.F;
import Pb.G;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.moduleservice.userfeedback.UserFeedbackService;
import com.bilibili.ogv.misc.sponsor.BangumiSponsorResultActivity;
import com.bilibili.ogv.misc.sponsor.BangumiUniformPayApiService;
import com.bilibili.ogv.pub.sponsor.BangumiPendant;
import com.bilibili.ogv.pub.sponsor.BangumiSponsorEvent;
import com.bilibili.ogv.pub.sponsor.BangumiSponsorResult;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.search2.api.SearchBangumiItem;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.observers.CallbackCompletableObserver;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.util.AppResUtil;
import xk0.m;
import xk0.n;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorResultActivity.class */
public class BangumiSponsorResultActivity extends BaseAppCompatActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f69365Q = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f69366B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ScrollView f69367C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f69368D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f69369E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public BangumiSponsorResult f69370F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public EditText f69371G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CheckBox f69372H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public BiliImageView f69373I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public BiliImageView f69374J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public com.bilibili.bangumi.ui.widget.dialog.a f69375K;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public n f69378N;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f69376L = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f69377M = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final a f69379O = new a(this);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final b f69380P = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorResultActivity$a.class */
    public final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiSponsorResultActivity f69381a;

        public a(BangumiSponsorResultActivity bangumiSponsorResultActivity) {
            this.f69381a = bangumiSponsorResultActivity;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int length;
            if (this.f69381a.f69368D != null) {
                try {
                    length = 50 - editable.toString().getBytes("gbk").length;
                } catch (UnsupportedEncodingException e7) {
                    e7.printStackTrace();
                    length = 0;
                }
                int iRound = length > 0 ? Math.round(length / 2.0f) : (int) Math.floor(length / 2.0f);
                if (iRound < 0) {
                    int iAbs = Math.abs(iRound);
                    int length2 = editable.length();
                    editable.delete(length2 - iAbs, length2);
                    iRound = 0;
                }
                BangumiSponsorResultActivity bangumiSponsorResultActivity = this.f69381a;
                bangumiSponsorResultActivity.f69368D.setText(bangumiSponsorResultActivity.getString(2131857039, new Object[]{String.valueOf(iRound)}));
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorResultActivity$b.class */
    public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiSponsorResultActivity f69382a;

        public b(BangumiSponsorResultActivity bangumiSponsorResultActivity) {
            this.f69382a = bangumiSponsorResultActivity;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f69382a.f69366B.getWindowVisibleDisplayFrame(rect);
            int height = this.f69382a.f69366B.getRootView().getHeight();
            final int i7 = height - rect.bottom;
            this.f69382a.f69369E.setVisibility(!(i7 > height / 3) ? 0 : 8);
            ScrollView scrollView = this.f69382a.f69367C;
            if (scrollView != null) {
                scrollView.post(new Runnable(this, i7) { // from class: xk0.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BangumiSponsorResultActivity.b f129300a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f129301b;

                    {
                        this.f129300a = this;
                        this.f129301b = i7;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f129300a.f69382a.f69367C.smoothScrollBy(0, Math.abs(this.f129301b));
                    }
                });
            }
        }
    }

    public final void P6() {
        com.bilibili.bangumi.ui.widget.dialog.a aVar = this.f69375K;
        if (aVar != null) {
            Contract contractAb = ConfigManager.Companion.ab();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                Thread threadCurrentThread = Thread.currentThread();
                if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                    IllegalStateException illegalStateException = new IllegalStateException(F.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                    Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new c(8));
                }
            }
            aVar.dismiss();
            this.f69375K = null;
        }
    }

    public final void Q6(ImageView imageView) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.topMargin = StatusBarCompat.getStatusBarHeight(this) + layoutParams.topMargin;
        imageView.setLayoutParams(layoutParams);
    }

    public final void R6() {
        String str = this.f69378N.f129306d;
        BangumiSponsorResult bangumiSponsorResult = this.f69370F;
        String str2 = bangumiSponsorResult.f71793c;
        String strValueOf = String.valueOf(bangumiSponsorResult.f71794d);
        boolean z6 = this.f69377M;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        mapCreateMapBuilder.put("season_id", str3);
        String str4 = strValueOf;
        if (strValueOf == null) {
            str4 = "";
        }
        mapCreateMapBuilder.put("season_type", str4);
        mapCreateMapBuilder.put("is_retry", z6 ? "1" : "0");
        Unit unit = Unit.INSTANCE;
        Neurons.reportExposure$default(false, str, MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
        this.f69376L = false;
        setContentView(2131493009);
        View viewFindViewById = findViewById(2131306968);
        this.f69366B = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.f69380P);
        this.f69367C = (ScrollView) findViewById(2131307182);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131296823);
        this.f69373I = findViewById(2131296796);
        this.f69374J = findViewById(2131308809);
        BiliImageView biliImageViewFindViewById = findViewById(2131297025);
        ImageView imageView = (ImageView) findViewById(2131298371);
        imageView.setOnClickListener(this);
        TextView textView = (TextView) findViewById(2131308819);
        this.f69372H = (CheckBox) findViewById(2131298541);
        TextView textView2 = (TextView) findViewById(2131301256);
        TextView textView3 = (TextView) findViewById(2131309156);
        findViewById(2131311108).setOnClickListener(this);
        TextView textView4 = (TextView) findViewById(2131311396);
        this.f69369E = textView4;
        textView4.setOnClickListener(this);
        TextView textView5 = (TextView) findViewById(2131311981);
        BangumiSponsorEvent bangumiSponsorEvent = this.f69370F.f71801l;
        if (bangumiSponsorEvent == null || TextUtils.isEmpty(bangumiSponsorEvent.f71788b)) {
            textView5.setVisibility(8);
        } else {
            textView5.setText(bangumiSponsorEvent.f71788b);
            textView5.setVisibility(0);
            textView5.setOnClickListener(this);
        }
        this.f69368D = (TextView) findViewById(2131313167);
        EditText editText = (EditText) findViewById(2131303758);
        this.f69371G = editText;
        editText.addTextChangedListener(this.f69379O);
        Q6(imageView);
        List<BangumiPendant> list = this.f69370F.f71800k;
        boolean z7 = (list == null || list.isEmpty()) ? false : true;
        if (!z7) {
            BiliImageLoader.INSTANCE.with(this).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(AppResUtil.getImageUrl("bili_2233_bangumi_sponsor_result_ic_success.webp")).into(biliImageViewFindViewById);
        }
        relativeLayout.setVisibility(z7 ? 0 : 8);
        biliImageViewFindViewById.setVisibility(z7 ? 8 : 0);
        textView.setVisibility(z7 ? 0 : 8);
        textView.setText(HtmlCompat.fromHtml(getResources().getString(2131857035, TextUtils.isEmpty(this.f69370F.f71799j) ? getString(2131856755, new Object[]{String.valueOf(this.f69370F.f71798i)}) : this.f69370F.f71799j), 0));
        this.f69372H.setVisibility(z7 ? 0 : 8);
        this.f69372H.setChecked(true);
        List<BangumiPendant> list2 = this.f69370F.f71800k;
        if (list2 != null && !list2.isEmpty()) {
            AccountInfo accountInfoFromCache = BiliAccountInfo.get().getAccountInfoFromCache();
            String avatar = accountInfoFromCache != null ? accountInfoFromCache.getAvatar() : "";
            BangumiPendant bangumiPendant = this.f69370F.f71800k.get(0);
            String str5 = bangumiPendant != null ? bangumiPendant.f71785c : "";
            BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
            biliImageLoader.with(this).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(avatar).into(this.f69373I);
            this.f69374J.setVisibility(0);
            biliImageLoader.with(this).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(str5).into(this.f69374J);
        }
        textView2.setText(HtmlCompat.fromHtml(getString(2131857036, new Object[]{String.valueOf(this.f69370F.f71797g)}), 0));
        textView3.setText(HtmlCompat.fromHtml(getString(2131857037, new Object[]{String.valueOf(this.f69370F.h)}), 0));
        this.f69369E.getPaint().setFlags(8);
        this.f69369E.getPaint().setAntiAlias(true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        List<BangumiPendant> list;
        BangumiPendant bangumiPendant;
        BangumiSponsorEvent bangumiSponsorEvent;
        int id = view.getId();
        str = "";
        if (id != 2131308247) {
            if (id == 2131298371) {
                onBackPressed();
                return;
            }
            if (id != 2131311396 && id != 2131311108) {
                if (id != 2131311981 || (bangumiSponsorEvent = this.f69370F.f71801l) == null || TextUtils.isEmpty(bangumiSponsorEvent.f71789c)) {
                    return;
                }
                h.c(this, this.f69370F.f71801l.f71789c, 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, null);
                return;
            }
            String strTrim = this.f69371G.getText().toString().trim();
            String strValueOf = (!this.f69372H.isChecked() || (list = this.f69370F.f71800k) == null || list.isEmpty() || (bangumiPendant = this.f69370F.f71800k.get(0)) == null) ? "" : String.valueOf(bangumiPendant.f71783a);
            if (TextUtils.isEmpty(strTrim) && TextUtils.isEmpty(strValueOf)) {
                setResult(-1);
                onBackPressed();
                return;
            }
            String str2 = this.f69370F.f71792b;
            if (id == 2131311396) {
                strTrim = "";
            }
            BangumiUniformPayApiService bangumiUniformPayApiService = (BangumiUniformPayApiService) ServiceGenerator.createRetrofitBuilder().baseUrl("https://bangumi.bilibili.com").build().create(BangumiUniformPayApiService.class);
            BangumiSponsorResult bangumiSponsorResult = this.f69370F;
            aY0.a aVarSponsorComment = bangumiUniformPayApiService.sponsorComment(new BangumiUniformPayApiService.SponsorResultParamsMap(bangumiSponsorResult.f71793c, bangumiSponsorResult.f71794d, str2, strTrim, strValueOf));
            Action action = new Action(this) { // from class: xk0.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiSponsorResultActivity f129299a;

                {
                    this.f129299a = this;
                }

                public final void run() {
                    int i7 = BangumiSponsorResultActivity.f69365Q;
                    BangumiSponsorResultActivity bangumiSponsorResultActivity = this.f129299a;
                    bangumiSponsorResultActivity.setResult(-1);
                    bangumiSponsorResultActivity.onBackPressed();
                }
            };
            C2691i c2691i = new C2691i(this);
            aVarSponsorComment.getClass();
            CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(c2691i, action);
            aVarSponsorComment.a(callbackCompletableObserver);
            com.bilibili.okretro.call.rxjava.c.a(callbackCompletableObserver, getLifecycle());
            return;
        }
        if (!this.f69376L || this.f69378N == null) {
            Context context = view.getContext();
            UserFeedbackService userFeedbackService = (UserFeedbackService) BLRouter.INSTANCE.get(UserFeedbackService.class, "default");
            if (userFeedbackService != null) {
                userFeedbackService.startSobot(context, "6bce6de1598f4572b4d0cfed078e1da7", null, null);
            }
            BangumiSponsorResult bangumiSponsorResult2 = this.f69370F;
            String str3 = bangumiSponsorResult2.f71793c;
            String strValueOf2 = String.valueOf(bangumiSponsorResult2.f71794d);
            boolean z6 = this.f69377M;
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            String str4 = str3;
            if (str3 == null) {
                str4 = "";
            }
            mapCreateMapBuilder.put("season_id", str4);
            mapCreateMapBuilder.put("season_type", strValueOf2 != null ? strValueOf2 : "");
            mapCreateMapBuilder.put("is_retry", z6 ? "1" : "0");
            Unit unit = Unit.INSTANCE;
            Neurons.reportClick(false, "pgc.pgc-video-detail.bp-failure.button.click", MapsKt.build(mapCreateMapBuilder));
            return;
        }
        P6();
        String string = getString(2131857040);
        Dialog dialog = new Dialog(this);
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.requestFeature(1);
        View viewInflate = LayoutInflater.from(this).inflate(2131493189, (ViewGroup) null);
        window.setContentView(viewInflate, new WindowManager.LayoutParams(-2, -2));
        ((com.bilibili.bangumi.ui.widget.dialog.a) dialog).a = (ImageView) viewInflate.findViewById(2131301546);
        ((TextView) viewInflate.findViewById(2131304642)).setText(string);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
        this.f69375K = dialog;
        n nVar = this.f69378N;
        BangumiSponsorResult bangumiSponsorResult3 = nVar.f129303a;
        if (bangumiSponsorResult3 != null) {
            Ll.a aVar = Ll.c.a;
            nVar.f129305c.a(Ll.c.a.checkOrder(bangumiSponsorResult3.f71792b, bangumiSponsorResult3.f71794d).map(Ll.b.a).subscribe(new m(nVar), new C2695m(nVar)));
        }
        BangumiSponsorResult bangumiSponsorResult4 = this.f69370F;
        String str5 = bangumiSponsorResult4.f71793c;
        String strValueOf3 = String.valueOf(bangumiSponsorResult4.f71794d);
        Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
        String str6 = str5;
        if (str5 == null) {
            str6 = "";
        }
        mapCreateMapBuilder2.put("season_id", str6);
        mapCreateMapBuilder2.put("season_type", strValueOf3 == null ? str : strValueOf3);
        Unit unit2 = Unit.INSTANCE;
        Neurons.reportClick(false, "pgc.pgc-video-detail.bp-retry.button.click", MapsKt.build(mapCreateMapBuilder2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.sponsor.BangumiSponsorResultActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        View view = this.f69366B;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f69380P);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        StatusBarCompat.immersiveStatusBar(this);
    }
}
