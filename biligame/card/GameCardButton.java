package com.bilibili.biligame.card;

import android.content.Context;
import android.util.AttributeSet;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.card.config.GameCardButtonConfig;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/GameCardButton.class */
public abstract class GameCardButton extends TintFrameLayout {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String extraAvid = "avid";

    @NotNull
    public static final String extraParamSource = "source";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public GameBookListener f62798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public GameCardButtonActionCallBack f62799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public JSONObject f62800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f62802e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/GameCardButton$GameBookListener.class */
    public interface GameBookListener {
        void onBook(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/GameCardButton$a.class */
    public static final class a {
    }

    @JvmOverloads
    public GameCardButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public GameCardButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public GameCardButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    public /* synthetic */ GameCardButton(Context context, AttributeSet attributeSet, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    public static /* synthetic */ void gameCardExposureEventReport$default(GameCardButton gameCardButton, String str, int i7, Map map, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gameCardExposureEventReport");
        }
        if ((i8 & 1) != 0) {
            str = "";
        }
        if ((i8 & 2) != 0) {
            i7 = -1;
        }
        gameCardButton.gameCardExposureEventReport(str, i7, map);
    }

    public static /* synthetic */ void gameCardGiftClickEventReport$default(GameCardButton gameCardButton, String str, Map map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gameCardGiftClickEventReport");
        }
        if ((i7 & 1) != 0) {
            str = "";
        }
        gameCardButton.gameCardGiftClickEventReport(str, map);
    }

    public static /* synthetic */ void gameCardViewClickEventReport$default(GameCardButton gameCardButton, String str, Map map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gameCardViewClickEventReport");
        }
        if ((i7 & 1) != 0) {
            str = "";
        }
        gameCardButton.gameCardViewClickEventReport(str, map);
    }

    public static /* synthetic */ void setStyle$default(GameCardButton gameCardButton, GameCardButtonStyle gameCardButtonStyle, GameCardButtonAttribute gameCardButtonAttribute, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStyle");
        }
        if ((i7 & 1) != 0) {
            gameCardButtonStyle = GameCardButtonStyle.STYLE_CUSTOM;
        }
        gameCardButton.setStyle(gameCardButtonStyle, gameCardButtonAttribute);
    }

    public void gameCardExposureEventReport(@NotNull String str, int i7, @Nullable Map<String, String> map) {
    }

    public void gameCardGiftClickEventReport(@NotNull String str, @Nullable Map<String, String> map) {
    }

    public void gameCardViewClickEventReport(@NotNull String str, @Nullable Map<String, String> map) {
    }

    @Nullable
    public final GameBookListener getBookListener() {
        return this.f62798a;
    }

    @NotNull
    public abstract String getButtonName();

    @Nullable
    public final GameCardButtonActionCallBack getCallBack() {
        return this.f62799b;
    }

    @Nullable
    public final String getDefaultButtonName() {
        return this.f62802e;
    }

    @Nullable
    public final JSONObject getExtraPrams() {
        return this.f62800c;
    }

    public abstract int getGameStatus();

    public final boolean getShowDefaultUI() {
        return this.f62801d;
    }

    public final void setActionCallBack(@NotNull GameCardButtonActionCallBack gameCardButtonActionCallBack) {
        this.f62799b = gameCardButtonActionCallBack;
    }

    public final void setBookListener(@Nullable GameBookListener gameBookListener) {
        this.f62798a = gameBookListener;
    }

    public final void setCallBack(@Nullable GameCardButtonActionCallBack gameCardButtonActionCallBack) {
        this.f62799b = gameCardButtonActionCallBack;
    }

    public abstract void setClickEventId(@NotNull String str);

    public final void setDefaultButtonName(@Nullable String str) {
        this.f62802e = str;
    }

    public final void setExtraPrams(@Nullable JSONObject jSONObject) {
        this.f62800c = jSONObject;
    }

    @Deprecated(message = "use setGameId(gameId: Long)")
    public abstract void setGameId(int i7);

    public abstract void setGameId(long j7);

    @Deprecated(message = "use setGameId(gameId: Long)")
    public abstract void setGameId(@Nullable String str);

    public abstract void setLiveCpsData(@Nullable String str, @Nullable String str2);

    public abstract void setRouterExtraParams(@Nullable Map<String, String> map);

    public final void setShowDefaultUI(boolean z6) {
        this.f62801d = z6;
    }

    public void setStyle(@NotNull GameCardButtonStyle gameCardButtonStyle, @NotNull GameCardButtonAttribute gameCardButtonAttribute) {
    }

    public abstract void start(@NotNull GameCardButtonConfig gameCardButtonConfig);
}
