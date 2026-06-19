package com.bilibili.biligame.card.newcard.present;

import com.bilibili.biligame.card.GameCardTextConfig;
import com.bilibili.biligame.card.config.GameCardButtonConfig;
import com.bilibili.biligame.card.newcard.action.GameCardButtonBookListener;
import com.bilibili.biligame.card.newcard.action.GameCardButtonClickListener;
import com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean;
import com.bilibili.biligame.card.newcard.download.CardDownloadInfo;
import com.bilibili.biligame.card.newcard.download.GameCardDownloadCallBack;
import com.bilibili.okretro.GeneralResponse;
import io.reactivex.rxjava3.core.Observable;
import java.util.Map;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/present/GameCardButtonPresent.class */
public interface GameCardButtonPresent {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void cardButtonClick$default(GameCardButtonPresent gameCardButtonPresent, String str, Map map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cardButtonClick");
        }
        if ((i7 & 1) != 0) {
            str = "";
        }
        if ((i7 & 2) != 0) {
            map = null;
        }
        gameCardButtonPresent.cardButtonClick(str, map);
    }

    static /* synthetic */ void gameCardExposureEventReport$default(GameCardButtonPresent gameCardButtonPresent, String str, int i7, Map map, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gameCardExposureEventReport");
        }
        if ((i8 & 1) != 0) {
            str = "";
        }
        if ((i8 & 2) != 0) {
            i7 = -1;
        }
        gameCardButtonPresent.gameCardExposureEventReport(str, i7, map);
    }

    static /* synthetic */ void gameCardGiftClickEventReport$default(GameCardButtonPresent gameCardButtonPresent, String str, Map map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gameCardGiftClickEventReport");
        }
        if ((i7 & 1) != 0) {
            str = "";
        }
        gameCardButtonPresent.gameCardGiftClickEventReport(str, map);
    }

    static /* synthetic */ void gameCardViewClickEventReport$default(GameCardButtonPresent gameCardButtonPresent, String str, Map map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gameCardViewClickEventReport");
        }
        if ((i7 & 1) != 0) {
            str = "";
        }
        gameCardButtonPresent.gameCardViewClickEventReport(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setRouterExtraParams$default(GameCardButtonPresent gameCardButtonPresent, Map map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRouterExtraParams");
        }
        if ((i7 & 1) != 0) {
            map = null;
        }
        gameCardButtonPresent.setRouterExtraParams(map);
    }

    void attach();

    void cardButtonClick(@Nullable String str, @Nullable Map<String, String> map);

    void detach();

    void gameCardExposureEventReport(@NotNull String str, int i7, @Nullable Map<String, String> map);

    void gameCardGiftClickEventReport(@NotNull String str, @Nullable Map<String, String> map);

    void gameCardViewClickEventReport(@NotNull String str, @Nullable Map<String, String> map);

    @NotNull
    Flow<String> getGameButtonTextState();

    @NotNull
    Observable<GeneralResponse<BiliGameCardDataBean>> getGameDataObserver();

    @NotNull
    CardDownloadInfo getGameDownloadInfo();

    void registerDownloadCallBack(@NotNull GameCardDownloadCallBack gameCardDownloadCallBack);

    void setButtonBookListener(@Nullable GameCardButtonBookListener gameCardButtonBookListener);

    void setButtonClickListener(@Nullable GameCardButtonClickListener gameCardButtonClickListener);

    void setLiveCpsData(@Nullable String str, @Nullable String str2);

    void setNewGameCardTextConfig(@NotNull GameCardTextConfig gameCardTextConfig);

    void setRouterExtraParams(@Nullable Map<String, String> map);

    void start(long j7);

    void start(@NotNull GameCardButtonConfig gameCardButtonConfig);

    void unRegisterDownloadCallBack(@NotNull GameCardDownloadCallBack gameCardDownloadCallBack);
}
