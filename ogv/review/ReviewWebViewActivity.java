package com.bilibili.ogv.review;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.bhwebview.api.IWebContainerMonitor;
import com.bilibili.common.webview.js.JsbProxy;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.fasthybrid.w;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.jsbridge.legacy.WebBehavior;
import com.bilibili.lib.jsbridge.legacy.WebProxyV2;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.lib.ui.webview2.WebSuicide;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ogv.pub.review.bean.ReviewMediaBase;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;
import com.bilibili.ogv.review.data.ReviewLongDetail;
import com.bilibili.ogv.review.web.BangumiJsBridgeReviewBehavior;
import java.util.regex.Pattern;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.LoadingImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/ReviewWebViewActivity.class */
@StabilityInferred(parameters = 0)
public final class ReviewWebViewActivity extends BaseToolbarActivity implements PassportObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f72181p0 = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public BiliWebView f72182D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public a f72183E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public Dl0.m f72184F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public WebProxyV2 f72185G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public BiliWebViewConfigHolderV2 f72186H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public JsbProxy f72187I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public LoadingImageView f72188J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public ImageView f72189K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public ImageView f72190L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public Drawable f72191M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f72192N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f72193O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f72194P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public String f72195Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public ReviewLongDetail f72196R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f72197S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f72198T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f72199U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f72200V;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public d f72205a0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final Pattern f72201W = Pattern.compile("https://bangumi.bilibili.com/review/extra/rules");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final Pattern f72202X = Pattern.compile("https://bangumi.bilibili.com/review/extra/opening");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Pattern f72203Y = Pattern.compile("/review/media/(\\d+)/long/(\\d+)", 2);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @NotNull
    public final IWebContainerMonitor f72204Z = BiliWebView.Companion.createPageMonitor();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final w f72206c0 = new w(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/ReviewWebViewActivity$a.class */
    public final class a extends BiliWebViewConfigHolderV2.BiliWebChromeClient {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ReviewWebViewActivity f72207g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ReviewWebViewActivity reviewWebViewActivity, BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2) {
            super(biliWebViewConfigHolderV2);
            this.f72207g = reviewWebViewActivity;
        }

        public final void onReceivedTitle(@Nullable BiliWebView biliWebView, @Nullable String str) {
            this.f72207g.setTitle(str);
        }

        public final void onShowWarningWhenProgressMax(@NotNull Uri uri) {
        }

        public final void onStartFileChooserForResult(@NotNull Intent intent) {
            this.f72207g.startActivityForResult(intent, 255);
        }
    }

    public final void Q6() {
        Integer intOrNull;
        Bundle bundleExtra = getIntent().getBundleExtra("default_extra_bundle");
        if (getIntent() == null) {
            return;
        }
        ReviewPublishInfo reviewPublishInfo = bundleExtra != null ? (ReviewPublishInfo) bundleExtra.getParcelable("REVIEW_PUBLISH_INFO") : null;
        Boolean boolValueOf = Boolean.valueOf(getIntent().getStringExtra("HAS_LONG"));
        if (reviewPublishInfo == null) {
            String stringExtra = getIntent().getStringExtra("REVIEW_TYPE");
            if (((stringExtra == null || (intOrNull = StringsKt.toIntOrNull(stringExtra)) == null) ? 0 : intOrNull.intValue()) != 1) {
                return;
            }
            String stringExtra2 = getIntent().getStringExtra("MEDIA_ID");
            Bundle bundle = new Bundle();
            bundle.putString("MEDIA_ID", stringExtra2);
            bundle.putInt("from", 0);
            RouteRequest.Builder builder = new RouteRequest.Builder("activity://bangumi/review/short-review-publish");
            builder.getExtras().put("default_extra_bundle", bundle);
            Qj0.g.c(this, builder.build());
        } else {
            int i7 = reviewPublishInfo.f71725c.h;
            if (i7 == 2) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("REVIEW_PUBLISH_INFO", reviewPublishInfo);
                bundle2.putInt("from", 0);
                RouteRequest.Builder builder2 = new RouteRequest.Builder("activity://bangumi/review/long-review-publish");
                builder2.getExtras().put("default_extra_bundle", bundle2);
                Qj0.g.c(this, builder2.build());
            } else if (i7 == 1) {
                boolean zBooleanValue = boolValueOf.booleanValue();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("REVIEW_PUBLISH_INFO", reviewPublishInfo);
                bundle3.putInt("from", 0);
                bundle3.putBoolean("HAS_LONG", zBooleanValue);
                RouteRequest.Builder builder3 = new RouteRequest.Builder("activity://bangumi/review/short-review-publish");
                builder3.getExtras().put("default_extra_bundle", bundle3);
                Qj0.g.c(this, builder3.build());
            }
        }
        finish();
    }

    public final void R6(long j7, long j8) {
        ReviewMediaBase reviewMediaBase;
        ReviewLongDetail reviewLongDetail = this.f72196R;
        if (reviewLongDetail == null || (reviewMediaBase = reviewLongDetail.f72219e) == null || j8 <= 0) {
            return;
        }
        long j9 = reviewMediaBase.f71703a;
        RouteRequest.Builder builder = new RouteRequest.Builder("activity://bangumi/review/comment/");
        Qj0.g.b(builder, "MEDIA_ID", String.valueOf(j7));
        Qj0.g.b(builder, "SEASON_ID", String.valueOf(j9));
        Qj0.g.b(builder, "REVIEW_ID", String.valueOf(j8));
        Qj0.g.b(builder, "from", String.valueOf(31));
        Qj0.g.c(this, builder.build());
    }

    public final void S6(long j7) {
        if (j7 > 0) {
            RouteRequest.Builder builder = new RouteRequest.Builder("activity://bangumi/review/review-detail/");
            Qj0.g.b(builder, "MEDIA_ID", String.valueOf(j7));
            Qj0.g.b(builder, "from", String.valueOf(31));
            Qj0.g.c(this, builder.build());
        }
    }

    public final void T6(boolean z6) {
        this.f72198T = z6;
        supportInvalidateOptionsMenu();
        if (this.f72199U == 1) {
            this.f72189K.setOnClickListener(new com.bilibili.lib.fasthybrid.uimodule.widget.playet.card.w(this));
            this.f72190L.setOnClickListener(new com.bilibili.bangumi.ui.page.detail.playerV2.widget.quality.p(this, 2));
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final void U6(@Nullable String str) {
        if (str != null) {
            if (this.f72202X.matcher(str).find()) {
                this.f72199U = 2;
            }
            if (this.f72201W.matcher(str).find()) {
                this.f72199U = 3;
            }
            if (this.f72203Y.matcher(str).find()) {
                this.f72199U = 1;
            }
        }
        if (getToolbar() == null) {
            return;
        }
        if (this.f72199U == 1) {
            getToolbar().setBackgroundColor(ThemeUtils.getColorById(this, 2131103971));
            ImageView imageView = this.f72189K;
            imageView.setImageDrawable(ThemeUtils.tintDrawable(imageView.getDrawable(), ThemeUtils.getColorById(this, 2131103911)));
            ImageView imageView2 = this.f72190L;
            imageView2.setImageDrawable(ThemeUtils.tintDrawable(imageView2.getDrawable(), ThemeUtils.getColorById(this, 2131103911)));
            getToolbar().setTitleTextColor(ThemeUtils.getColorById(this, 2131103914));
        }
        int i7 = this.f72199U;
        if (i7 == 3 || i7 == 2) {
            getToolbar().setBackgroundColor(ThemeUtils.getColorById(this, 2131103971));
            getToolbar().setTitleTextColor(ThemeUtils.getColorById(this, 2131103914));
        }
        this.f72191M.setColorFilter(ThemeUtils.getColorById(this, 2131103911), PorterDuff.Mode.SRC_ATOP);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeAsUpIndicator(this.f72191M);
        }
        tintSystemBar();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        WebProxyV2 webProxyV2 = this.f72185G;
        if (webProxyV2 == null || !webProxyV2.onActivityResult(i7, i8, intent)) {
            JsbProxy jsbProxy = this.f72187I;
            if (jsbProxy == null || !jsbProxy.onActivityResult(i7, i8, intent)) {
                if (i7 == 255) {
                    this.f72183E.onReceiveFile(i8, intent);
                    return;
                }
                if (i7 != 666 || i8 != -1) {
                    super.onActivityResult(i7, i8, intent);
                    return;
                }
                BiliWebView biliWebView = this.f72182D;
                if (biliWebView != null) {
                    biliWebView.reload();
                }
                setResult(-1);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        WebProxyV2 webProxyV2 = this.f72185G;
        if (webProxyV2 == null || !webProxyV2.onBackPressed()) {
            BiliWebView biliWebView = this.f72182D;
            if (biliWebView == null || !biliWebView.canGoBack()) {
                super.onBackPressed();
            } else {
                this.f72182D.goBack();
            }
        }
    }

    public final void onChange(@NotNull Topic topic) {
        if (topic == Topic.SIGN_IN || topic == Topic.SIGN_OUT) {
            this.f72182D.reload();
        }
    }

    /* JADX WARN: Type inference failed for: r0v118, types: [Dl0.m, com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2$BiliWebViewClient] */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Long longOrNull;
        Long longOrNull2;
        Integer intOrNull;
        Integer intOrNull2;
        IWebContainerMonitor iWebContainerMonitor = this.f72204Z;
        iWebContainerMonitor.init();
        iWebContainerMonitor.setContainerInitStart(SystemClock.elapsedRealtime());
        WebSuicide.enter("ReviewWebViewActivity");
        super.onCreate(bundle);
        this.f72192N = MultipleThemeUtils.isNightTheme(this);
        getDelegate().setLocalNightMode(this.f72192N ? 2 : 1);
        iWebContainerMonitor.setLogicStart(SystemClock.elapsedRealtime());
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
        } else {
            String string = extras.getString("WEB_TYPE");
            this.f72199U = (string == null || (intOrNull2 = StringsKt.toIntOrNull(string)) == null) ? 0 : intOrNull2.intValue();
            String string2 = extras.getString("from");
            this.f72197S = (string2 == null || (intOrNull = StringsKt.toIntOrNull(string2)) == null) ? 0 : intOrNull.intValue();
            int i7 = this.f72199U;
            if (i7 == 2) {
                this.f72195Q = Dl0.l.a(this, "https://bangumi.bilibili.com/review/extra/opening");
            } else if (i7 == 3) {
                this.f72195Q = Dl0.l.a(this, "https://bangumi.bilibili.com/review/extra/rules");
            } else if (i7 == 1) {
                String string3 = extras.getString("MEDIA_ID");
                this.f72193O = (string3 == null || (longOrNull2 = StringsKt.toLongOrNull(string3)) == null) ? 0L : longOrNull2.longValue();
                String string4 = extras.getString("REVIEW_ID");
                long jLongValue = (string4 == null || (longOrNull = StringsKt.toLongOrNull(string4)) == null) ? 0L : longOrNull.longValue();
                this.f72194P = jLongValue;
                long j7 = this.f72193O;
                if (j7 <= 0 || jLongValue <= 0) {
                    finish();
                } else {
                    StringBuilder sbA = z.a(j7, "https://bangumi.bilibili.com/review/media/", "/long/");
                    sbA.append(jLongValue);
                    String strA = Dl0.l.a(this, sbA.toString());
                    this.f72195Q = strA;
                    if (this.f72197S == 12) {
                        this.f72195Q = com.bilibili.ad.adview.pegasus.holders.inline.pegasus.m.a(strA, "url_from_h5", "1");
                    }
                }
            }
            String str = this.f72195Q;
            if (str == null || str.length() == 0) {
                finish();
            }
        }
        String str2 = this.f72195Q;
        if (str2 == null || str2.length() == 0) {
            BLog.w("ReviewWebViewActivity-onCreate", "[ogv-review-ReviewWebViewActivity-onCreate] web url is empty!!!", (Throwable) null);
            return;
        }
        iWebContainerMonitor.setLogicEnd(SystemClock.elapsedRealtime());
        setContentView(2131499773);
        ensureToolbar();
        showBackButton();
        this.f72191M = AppCompatResources.getDrawable(this, 2131230780);
        this.f72188J = findViewById(2131303626);
        this.f72189K = (ImageView) findViewById(2131307359);
        this.f72190L = (ImageView) findViewById(2131311173);
        BiliWebView biliWebViewFindViewById = findViewById(2131311551);
        this.f72182D = biliWebViewFindViewById;
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = new BiliWebViewConfigHolderV2(biliWebViewFindViewById, (ProgressBar) null);
        this.f72186H = biliWebViewConfigHolderV2;
        biliWebViewConfigHolderV2.configBiliWebSettings(Uri.parse(this.f72195Q), FoundationAlias.getFapps().getVersionCode(), false);
        this.f72186H.configBiliWebCookie();
        this.f72186H.enableWebContentDebug(false);
        BiliWebView biliWebView = this.f72182D;
        a aVar = new a(this, this.f72186H);
        this.f72183E = aVar;
        biliWebView.setWebChromeClient(aVar);
        ?? biliWebViewClient = new BiliWebViewConfigHolderV2.BiliWebViewClient(this.f72186H);
        biliWebViewClient.f2986c = false;
        this.f72184F = biliWebViewClient;
        if (FreeDataManager.getInstance().isTf()) {
            FreeDataManager.getInstance().initWebView(true, this.f72182D, this.f72184F);
        } else {
            this.f72182D.setWebViewClient(this.f72184F);
        }
        BiliWebView biliWebView2 = this.f72182D;
        if (biliWebView2 != null) {
            JsbProxy jsbProxy = biliWebView2.getJsbProxy();
            this.f72187I = jsbProxy;
            if (jsbProxy != null) {
                biliWebView2.registerAbilityOpenSchemeBehavior(new n(this, jsbProxy.getJsbContext()));
                biliWebView2.registerAuthLoginBehavior(new o(this, jsbProxy.getJsbContext()));
                biliWebView2.registerGlobalGetContainerInfoBehavior(new p(this));
                com.bilibili.ogv.infra.jsb.d dVar = new com.bilibili.ogv.infra.jsb.d();
                dVar.a(new BangumiJsBridgeReviewBehavior(this), "pgc");
                dVar.b(jsbProxy);
            }
            this.f72185G = new WebProxyV2.Builder(this, this.f72182D).setJavaScriptBridge(new Dl0.j()).of(Uri.parse(this.f72195Q)).with(new WebBehavior(this)).build();
            this.f72184F.f2985b = new q(this);
        }
        iWebContainerMonitor.setContainerInitEnd(SystemClock.elapsedRealtime());
        LoadingImageView loadingImageView = this.f72188J;
        if (loadingImageView != null) {
            loadingImageView.setVisibility(0);
            this.f72188J.setRefreshing();
            this.f72188J.setOnClickListener(null);
        }
        Dl0.m mVar = this.f72184F;
        if (mVar != null) {
            mVar.f2986c = true;
        }
        this.f72182D.loadUrl(this.f72195Q);
        U6(this.f72195Q);
        com.bilibili.ogv.infra.account.a.f67852b.subscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        if (this.f72182D != null) {
            this.f72204Z.report("error_user_abort");
        }
        JsbProxy jsbProxy = this.f72187I;
        if (jsbProxy != null) {
            jsbProxy.onDestroy();
        }
        WebProxyV2 webProxyV2 = this.f72185G;
        if (webProxyV2 != null) {
            webProxyV2.onDestroy();
        }
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = this.f72186H;
        if (biliWebViewConfigHolderV2 != null) {
            biliWebViewConfigHolderV2.destroyWebView();
        }
        Dl0.m mVar = this.f72184F;
        if (mVar != null && mVar.f2985b != null) {
            mVar.f2985b = null;
        }
        super.onDestroy();
        this.f72182D = null;
        WebSuicide.leave("ReviewWebViewActivity");
        com.bilibili.ogv.infra.account.a.f67852b.unsubscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        if (this.f72199U != 1) {
            this.f72190L.setVisibility(8);
            this.f72189K.setVisibility(8);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f72200V) {
            this.f72200V = false;
            this.f72182D.reload();
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final void tintSystemBar() {
        if (this.f72199U == 1) {
            StatusBarCompat.tintStatusBar(this, ThemeUtils.getThemeAttrColor(this, 2130968986));
        }
        int i7 = this.f72199U;
        if (i7 == 3 || i7 == 2) {
            super.tintSystemBar();
        }
    }
}
