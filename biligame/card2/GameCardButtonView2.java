package com.bilibili.biligame.card2;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.card.GameCardButtonAttribute;
import com.bilibili.biligame.card.GameCardButtonStyle;
import com.bilibili.biligame.card.GameCardTextConfig;
import com.bilibili.biligame.card.config.GameCardButtonConfig;
import com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean;
import com.bilibili.biligame.card.newcard.download.CardDownloadInfo;
import com.bilibili.biligame.gamenewcard.view.GameNewCardDownloadButton;
import com.bilibili.biligame.utils.KotlinExtensionsKt;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonView2.class */
@StabilityInferred(parameters = 0)
public final class GameCardButtonView2 extends TintFrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public GameCardButtonStyle f62887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f62888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public GameCardButtonAttribute f62889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f62890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public GameCardButtonPresentImpV2 f62891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public GameCardTextConfig f62892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TintTextView f62893g;

    @NotNull
    public final GameNewCardDownloadButton h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f62894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Map<String, String> f62895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public BiliGameCardDataBean f62896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f62897l;

    public GameCardButtonView2(Context context, GameCardButtonStyle gameCardButtonStyle, String str, GameCardButtonAttribute gameCardButtonAttribute) {
        super(context, null, 0);
        this.f62887a = gameCardButtonStyle;
        this.f62888b = str;
        this.f62889c = gameCardButtonAttribute;
        this.f62890d = "video_mention";
        this.f62891e = new GameCardButtonPresentImpV2(context, str, "video_mention");
        this.f62892f = new GameCardTextConfig(context);
        setLayoutParams(new FrameLayout.LayoutParams(this.f62889c.getWidth(), this.f62889c.getHeight()));
        FrameLayout.inflate(context, 2131496629, this);
        TintTextView tintTextView = (TintTextView) findViewById(2131310319);
        this.f62893g = tintTextView;
        GameNewCardDownloadButton gameNewCardDownloadButtonFindViewById = findViewById(2131310320);
        this.h = gameNewCardDownloadButtonFindViewById;
        GameCardButtonStyle gameCardButtonStyle2 = this.f62887a;
        GameCardButtonAttribute gameCardButtonAttribute2 = this.f62889c;
        this.f62887a = gameCardButtonStyle2;
        this.f62889c = gameCardButtonAttribute2;
        Integer textColorValue = gameCardButtonAttribute2.getTextColorValue();
        if (textColorValue != null) {
            tintTextView.setTextColor(textColorValue.intValue());
        } else {
            tintTextView.setTextColorById(gameCardButtonAttribute2.getTextColor());
        }
        tintTextView.setTextSize(gameCardButtonAttribute2.getTextSize());
        gameNewCardDownloadButtonFindViewById.setStyle(this.f62887a, gameCardButtonAttribute2);
        tint();
        setClickable(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getButtonName() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.magicasakura.widgets.TintTextView r0 = r0.f62893g
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L27
            r0 = r2
            com.bilibili.magicasakura.widgets.TintTextView r0 = r0.f62893g
            java.lang.CharSequence r0 = r0.getText()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L21
            r0 = r3
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L2f
        L21:
            java.lang.String r0 = ""
            r3 = r0
            goto L2f
        L27:
            r0 = r2
            com.bilibili.biligame.gamenewcard.view.GameNewCardDownloadButton r0 = r0.h
            java.lang.String r0 = r0.getDownloadText()
            r3 = r0
        L2f:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.card2.GameCardButtonView2.getButtonName():java.lang.String");
    }

    @NotNull
    public final GameCardButtonStyle getButtonStyle() {
        return this.f62887a;
    }

    @Nullable
    public final Function0<Unit> getClickCallBack() {
        return this.f62894i;
    }

    @Nullable
    public final Map<String, String> getClickReportParams() {
        return this.f62895j;
    }

    @NotNull
    public final GameCardButtonAttribute getCustomAttribute() {
        return this.f62889c;
    }

    @NotNull
    public final GameCardButtonPresentImpV2 getGameCardButtonPresentImplV2() {
        return this.f62891e;
    }

    @NotNull
    public final GameCardTextConfig getGameCardTextConfigImpl() {
        return this.f62892f;
    }

    public final long getMGameBaseId() {
        return this.f62897l;
    }

    @Nullable
    public final BiliGameCardDataBean getMGameInfo() {
        return this.f62896k;
    }

    @NotNull
    public final String getScenesType() {
        return this.f62890d;
    }

    @NotNull
    public final String getSourceFrom() {
        return this.f62888b;
    }

    @Nullable
    public final Object i(@NotNull GameCardButtonConfig gameCardButtonConfig, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new GameCardButtonView2$bindToView$2(this, gameCardButtonConfig, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final void j(CardDownloadInfo cardDownloadInfo) {
        String androidPkgVer;
        Integer intOrNull;
        int status = cardDownloadInfo.getStatus();
        if (status == 1 || status == 12) {
            this.f62893g.setText(this.f62892f.getDownloadText());
            this.f62893g.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            GameNewCardDownloadButton gameNewCardDownloadButton = this.h;
            BiliGameCardDataBean biliGameCardDataBean = this.f62896k;
            gameNewCardDownloadButton.i(cardDownloadInfo, (biliGameCardDataBean == null || (androidPkgVer = biliGameCardDataBean.getAndroidPkgVer()) == null || (intOrNull = StringsKt.toIntOrNull(androidPkgVer)) == null) ? 0 : intOrNull.intValue());
            this.h.setVisibility(0);
            this.f62893g.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BLog.d("GameCardButtonView2", "onAttachedToWindow");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BLog.d("GameCardButtonView2", "onAttachedFromWindow");
    }

    public final void setButtonStyle(@NotNull GameCardButtonStyle gameCardButtonStyle) {
        this.f62887a = gameCardButtonStyle;
    }

    public final void setClickCallBack(@Nullable Function0<Unit> function0) {
        this.f62894i = function0;
    }

    public final void setClickReportParams(@Nullable Map<String, String> map) {
        this.f62895j = map;
    }

    public final void setCustomAttribute(@NotNull GameCardButtonAttribute gameCardButtonAttribute) {
        this.f62889c = gameCardButtonAttribute;
    }

    public final void setGameCardButtonPresentImplV2(@NotNull GameCardButtonPresentImpV2 gameCardButtonPresentImpV2) {
        this.f62891e = gameCardButtonPresentImpV2;
    }

    public final void setGameCardTextConfigImpl(@NotNull GameCardTextConfig gameCardTextConfig) {
        this.f62892f = gameCardTextConfig;
    }

    public final void setMGameBaseId(long j7) {
        this.f62897l = j7;
    }

    public final void setMGameInfo(@Nullable BiliGameCardDataBean biliGameCardDataBean) {
        this.f62896k = biliGameCardDataBean;
    }

    @Override // com.bilibili.magicasakura.widgets.TintFrameLayout, com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        super.tint();
        TintTextView tintTextView = this.f62893g;
        int themeColorValue = 0;
        int themeColorValue2 = this.f62889c.isFill() ? this.f62889c.getThemeColorValue(getContext()) : 0;
        int cornerRadius = this.f62889c.getCornerRadius();
        if (!this.f62889c.isFill()) {
            themeColorValue = this.f62889c.getThemeColorValue(getContext());
        }
        KotlinExtensionsKt.customViewBackground(tintTextView, themeColorValue2, cornerRadius, themeColorValue, this.f62889c.getBorderWidth());
    }
}
