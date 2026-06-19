package com.bilibili.biligame.card2;

import com.bilibili.biligame.card.config.GameCardButtonConfig;
import com.bilibili.biligame.card.newcard.present.GameButtonLoadDataState;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentV2.class */
public interface GameCardButtonPresentV2 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void gameCardExposureEventReport$default(GameCardButtonPresentV2 gameCardButtonPresentV2, String str, int i7, Map map, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gameCardExposureEventReport");
        }
        if ((i8 & 2) != 0) {
            i7 = -1;
        }
        if ((i8 & 4) != 0) {
            map = null;
        }
        gameCardButtonPresentV2.gameCardExposureEventReport(str, i7, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void handleClick$default(GameCardButtonPresentV2 gameCardButtonPresentV2, Map map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleClick");
        }
        if ((i7 & 1) != 0) {
            map = null;
        }
        gameCardButtonPresentV2.handleClick(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object handleClickSus$default(GameCardButtonPresentV2 gameCardButtonPresentV2, Map map, Continuation continuation, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleClickSus");
        }
        if ((i7 & 1) != 0) {
            map = null;
        }
        return gameCardButtonPresentV2.handleClickSus(map, continuation);
    }

    void attach();

    @Nullable
    Object bind(long j7, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object bind(@NotNull GameCardButtonConfig gameCardButtonConfig, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    Map<String, String> buttonInfoParams();

    void detach();

    void gameCardExposureEventReport(@NotNull String str, int i7, @Nullable Map<String, String> map);

    @NotNull
    Flow<String> getGameButtonTextState();

    @NotNull
    Flow<GameButtonLoadDataState> getLoadDataState();

    void handleClick(@Nullable Map<String, String> map);

    @Nullable
    Object handleClickSus(@Nullable Map<String, String> map, @NotNull Continuation<? super Unit> continuation);

    void start(@NotNull GameCardButtonConfig gameCardButtonConfig);
}
