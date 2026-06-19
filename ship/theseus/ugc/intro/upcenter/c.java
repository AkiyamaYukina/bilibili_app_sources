package com.bilibili.ship.theseus.ugc.intro.upcenter;

import G.p;
import Vu0.x;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.BiliConfig;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.bhwebview.api.IBiliWebSettings;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/c.class */
@StabilityInferred(parameters = 0)
public final class c implements UIComponent<n<x>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f97552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f97553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public BiliWebViewConfigHolderV2 f97554c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/c$a.class */
    public final class a extends BiliWebViewConfigHolderV2.BiliWebChromeClient {
        public final void onShowWarningWhenProgressMax(@Nullable Uri uri) {
        }

        public final void onStartFileChooserForResult(@NotNull Intent intent) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/c$b.class */
    public final class b extends BiliWebViewConfigHolderV2.BiliWebViewClient {
        public final boolean customOverrideUrlLoading(@Nullable BiliWebView biliWebView, @Nullable String str) {
            return false;
        }

        public final void onShowWarningWhenPageFinished(@Nullable Uri uri) {
        }
    }

    public final void a(BiliWebView biliWebView) {
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = new BiliWebViewConfigHolderV2(biliWebView, (ProgressBar) null);
        this.f97554c = biliWebViewConfigHolderV2;
        biliWebViewConfigHolderV2.configBiliWebSettings(Uri.EMPTY, BiliConfig.getBiliVersionCode(), false);
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV22 = this.f97554c;
        if (biliWebViewConfigHolderV22 != null) {
            biliWebViewConfigHolderV22.configBiliWebCookie();
        }
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV23 = this.f97554c;
        if (biliWebViewConfigHolderV23 != null) {
            biliWebViewConfigHolderV23.enableWebContentDebug(false);
        }
        IBiliWebSettings iBiliWebSettings = biliWebView.getIBiliWebSettings();
        if (iBiliWebSettings != null) {
            iBiliWebSettings.setAllowFileAccess(true);
            iBiliWebSettings.setSupportZoom(true);
            iBiliWebSettings.setDatabaseEnabled(true);
            iBiliWebSettings.setAllowFileAccess(true);
            iBiliWebSettings.setDomStorageEnabled(true);
        }
        biliWebView.setWebViewClient(new BiliWebViewConfigHolderV2.BiliWebViewClient(this.f97554c));
        biliWebView.setWebChromeClient(new BiliWebViewConfigHolderV2.BiliWebChromeClient(this.f97554c));
        this.f97553b = true;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        x xVar = (x) ((n) viewEntry).a;
        if (MultipleThemeUtils.isNightTheme(xVar.f25989d.getContext())) {
            xVar.f25988c.setBackgroundResource(2131241028);
            xVar.f25987b.setBackgroundResource(2131240758);
            this.f97552a = p.a(this.f97552a, "?night=1");
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcUpCenterFloatLayerUiComponent$bindToView$2(this, xVar, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        x xVarInflate = x.inflate(LayoutInflater.from(context), viewGroup, false);
        a(xVarInflate.f25990e);
        return new n(xVarInflate);
    }
}
