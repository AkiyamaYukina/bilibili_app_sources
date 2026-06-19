package com.bilibili.lib.projection.internal.search.searchv2;

import By0.C1510y0;
import De0.C1572e;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.I;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.projection.ProjectionClientConfig;
import com.bilibili.lib.projection.internal.api.model.ListUiBean;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.api.model.TextUrlBean;
import com.bilibili.lib.projection.internal.api.model.YstUiBean;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import he0.C7432a;
import ie0.C7564c;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/SearchBottomArea.class */
public final class SearchBottomArea extends FrameLayout {
    public static final int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f63748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f63749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final SearchTips f63750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final BiliImageView f63751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TintImageView f63752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final ConstraintLayout f63753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f63754g;

    @JvmOverloads
    public SearchBottomArea(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchBottomArea(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchBottomArea(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.searchv2.SearchBottomArea.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void a(@Nullable ProjectionClientConfig projectionClientConfig, final int i7, boolean z6, @NotNull final Function0<Unit> function0) {
        if (z6) {
            BLog.i("SearchBottomArea", "hasOperationClosed=true");
            setOperationVisible(false);
            return;
        }
        Lazy lazy = he0.e.f120842a;
        ProjectionOperationConfig projectionOperationConfigB = he0.e.b(String.valueOf(he0.e.f(projectionClientConfig)));
        ProjectionOperationConfig.DeviceBannerConfig deviceBanner = projectionOperationConfigB != null ? projectionOperationConfigB.getDeviceBanner() : null;
        String darkExpand = deviceBanner != null ? deviceBanner.getDarkExpand() : null;
        String lightExpand = deviceBanner != null ? deviceBanner.getLightExpand() : null;
        StringBuilder sb = new StringBuilder("bannerConfig == ");
        sb.append(deviceBanner);
        sb.append(", dark: ");
        sb.append(darkExpand);
        sb.append(", light: ");
        bilibili.live.app.service.resolver.b.a(sb, lightExpand, "SearchBottomArea");
        if (deviceBanner == null) {
            ConstraintLayout constraintLayout = this.f63753f;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
                return;
            }
            return;
        }
        String darkExpand2 = MultipleThemeUtils.isNightTheme(getContext()) ? deviceBanner.getDarkExpand() : deviceBanner.getLightExpand();
        if (darkExpand2 == null || darkExpand2.length() == 0) {
            ConstraintLayout constraintLayout2 = this.f63753f;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
                return;
            }
            return;
        }
        C1572e.f2836a.getClass();
        Boolean bool = (Boolean) ((ConcurrentHashMap) C1572e.f2838c).get("8");
        if (!(bool != null ? bool.booleanValue() : false)) {
            InterfaceC7845m interfaceC7845mH = C7564c.f121625a.h(i7);
            C1572e.a(deviceBanner);
            com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
            String id = deviceBanner.getId();
            IProjectionItem iProjectionItemN = interfaceC7845mH != null ? interfaceC7845mH.n(false) : null;
            StandardProjectionItem standardProjectionItem = null;
            if (iProjectionItemN instanceof StandardProjectionItem) {
                standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
            }
            aVar.getClass();
            he0.j.f120871a.d("main.public-community.screencast-floats.banner.show", null, standardProjectionItem, aVar.f63524a, new C1510y0(id, 3));
            ((ConcurrentHashMap) C1572e.f2838c).put("8", Boolean.TRUE);
        }
        BiliImageView biliImageView = this.f63751d;
        if (biliImageView != null) {
            BiliImageLoader.INSTANCE.with(getContext()).url(darkExpand2).roundingParams(RoundingParams.Companion.fromCornersRadii(C7432a.a(getContext(), 8.0f), C7432a.a(getContext(), 8.0f), C7432a.a(getContext(), 8.0f), C7432a.a(getContext(), 8.0f))).into(biliImageView);
        }
        BiliImageView biliImageView2 = this.f63751d;
        if (biliImageView2 != null) {
            final ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfig = deviceBanner;
            biliImageView2.setOnClickListener(new View.OnClickListener(deviceBannerConfig, this, i7) { // from class: com.bilibili.lib.projection.internal.search.searchv2.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionOperationConfig.DeviceBannerConfig f63789a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SearchBottomArea f63790b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f63791c;

                {
                    this.f63789a = deviceBannerConfig;
                    this.f63790b = this;
                    this.f63791c = i7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfig2 = this.f63789a;
                    SearchBottomArea searchBottomArea = this.f63790b;
                    int i8 = this.f63791c;
                    int i9 = SearchBottomArea.h;
                    String url = deviceBannerConfig2.getUrl();
                    String str = "https://www.bilibili.com/blackboard/activity-Ud7nkGPbaa.html";
                    if (url != null) {
                        str = url;
                        if (StringsKt.isBlank(url)) {
                            str = "https://www.bilibili.com/blackboard/activity-Ud7nkGPbaa.html";
                        }
                    }
                    Context context = searchBottomArea.getContext();
                    if (!StringsKt.isBlank(str)) {
                        BLRouter.routeTo(RouteRequestKt.toRouteRequest(Uri.parse(str).buildUpon().appendQueryParameter("wbType", "common").build()), context);
                    }
                    InterfaceC7845m interfaceC7845mH2 = C7564c.f121625a.h(i8);
                    com.bilibili.lib.projection.internal.reporter.a aVar2 = C7564c.f121634k;
                    String id2 = deviceBannerConfig2.getId();
                    StandardProjectionItem standardProjectionItem2 = null;
                    IProjectionItem iProjectionItemN2 = interfaceC7845mH2 != null ? interfaceC7845mH2.n(false) : null;
                    if (iProjectionItemN2 instanceof StandardProjectionItem) {
                        standardProjectionItem2 = (StandardProjectionItem) iProjectionItemN2;
                    }
                    aVar2.getClass();
                    he0.j.f120871a.b("main.public-community.screencast-floats.banner.click", null, standardProjectionItem2, aVar2.f63524a, new T9.g(id2, 4));
                }
            });
        }
        TintImageView tintImageView = this.f63752e;
        if (tintImageView != null) {
            final ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfig2 = deviceBanner;
            tintImageView.setOnClickListener(new View.OnClickListener(this, function0, i7, deviceBannerConfig2) { // from class: com.bilibili.lib.projection.internal.search.searchv2.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchBottomArea f63792a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f63793b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f63794c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final ProjectionOperationConfig.DeviceBannerConfig f63795d;

                {
                    this.f63792a = this;
                    this.f63793b = function0;
                    this.f63794c = i7;
                    this.f63795d = deviceBannerConfig2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchBottomArea searchBottomArea = this.f63792a;
                    Function0 function02 = this.f63793b;
                    int i8 = this.f63794c;
                    ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfig3 = this.f63795d;
                    ConstraintLayout constraintLayout3 = searchBottomArea.f63753f;
                    if (constraintLayout3 != null) {
                        constraintLayout3.setVisibility(8);
                    }
                    function02.invoke();
                    InterfaceC7845m interfaceC7845mH2 = C7564c.f121625a.h(i8);
                    com.bilibili.lib.projection.internal.reporter.a aVar2 = C7564c.f121634k;
                    String id2 = deviceBannerConfig3.getId();
                    StandardProjectionItem standardProjectionItem2 = null;
                    IProjectionItem iProjectionItemN2 = interfaceC7845mH2 != null ? interfaceC7845mH2.n(false) : null;
                    if (iProjectionItemN2 instanceof StandardProjectionItem) {
                        standardProjectionItem2 = (StandardProjectionItem) iProjectionItemN2;
                    }
                    aVar2.getClass();
                    he0.j.f120871a.b("main.public.screencast-panel.promo-close.click", null, standardProjectionItem2, aVar2.f63524a, new I(id2, 2));
                }
            });
        }
        ConstraintLayout constraintLayout3 = this.f63753f;
        if (constraintLayout3 != null) {
            constraintLayout3.setVisibility(0);
        }
    }

    @NotNull
    public final Function0<Unit> getKnownMoreClickCallback() {
        return this.f63749b;
    }

    @NotNull
    public final Function0<Unit> getKnownMoreShowCallback() {
        return this.f63748a;
    }

    public final void setCastTipVisible(boolean z6) {
        if (z6) {
            SearchTips searchTips = this.f63750c;
            if (searchTips != null) {
                searchTips.setVisibility(0);
                return;
            }
            return;
        }
        SearchTips searchTips2 = this.f63750c;
        if (searchTips2 != null) {
            searchTips2.setVisibility(8);
        }
    }

    public final void setKnownMoreClickCallback(@NotNull Function0<Unit> function0) {
        this.f63749b = function0;
    }

    public final void setKnownMoreShowCallback(@NotNull Function0<Unit> function0) {
        this.f63748a = function0;
    }

    public final void setKnownMoreUrl(@Nullable ListUiBean listUiBean) {
        String lightUrl;
        if (MultipleThemeUtils.isNightTheme(getContext())) {
            lightUrl = null;
            if (listUiBean != null) {
                YstUiBean ystUi = listUiBean.getYstUi();
                lightUrl = null;
                if (ystUi != null) {
                    TextUrlBean help = ystUi.getHelp();
                    lightUrl = null;
                    if (help != null) {
                        lightUrl = help.getDarkUrl();
                    }
                }
            }
        } else {
            lightUrl = null;
            if (listUiBean != null) {
                YstUiBean ystUi2 = listUiBean.getYstUi();
                lightUrl = null;
                if (ystUi2 != null) {
                    TextUrlBean help2 = ystUi2.getHelp();
                    lightUrl = null;
                    if (help2 != null) {
                        lightUrl = help2.getLightUrl();
                    }
                }
            }
        }
        String str = lightUrl;
        if (lightUrl == null) {
            str = "";
        }
        this.f63754g = str;
    }

    public final void setOperationVisible(boolean z6) {
        ConstraintLayout constraintLayout = this.f63753f;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(z6 ? 0 : 8);
        }
    }
}
