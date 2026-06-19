package com.bilibili.biligame;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.biligame.card.GameCardButtonAttribute;
import com.bilibili.biligame.card.GameCardButtonStyle;
import com.bilibili.biligame.card.newcard.present.GameCardButtonPresent;
import com.bilibili.biligame.card2.GameCardButtonPresentV2;
import com.bilibili.biligame.detail.GameDetailHeightStyle;
import com.bilibili.biligame.detail.GameDetailParams;
import com.bilibili.biligame.videocard.GameRetUserCard;
import com.bilibili.biligame.videocard.GameVideoMentionCardData;
import com.bilibili.biligame.videocard.IGameVideoMentionCard;
import com.bilibili.biligame.widget.dialog.bottom.SlideListener;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameCenterTribeService.class */
public interface GameCenterTribeService {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ BottomSheetDialogFragment getGameDetailInfoFragment$default(GameCenterTribeService gameCenterTribeService, String str, String str2, Function0 function0, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGameDetailInfoFragment");
        }
        if ((i7 & 4) != 0) {
            function0 = null;
        }
        return gameCenterTribeService.getGameDetailInfoFragment(str, str2, function0);
    }

    boolean canHandleSteamWebUrl(@NotNull String str);

    @NotNull
    GameCardButton getGameButton(@NotNull Context context, @NotNull GameCardButtonAttribute gameCardButtonAttribute, @NotNull String str, @NotNull String str2);

    @NotNull
    GameCardButton getGameButton(@NotNull Context context, @NotNull GameCardButtonStyle gameCardButtonStyle, @NotNull String str, @NotNull String str2);

    @NotNull
    GameCardButtonPresent getGameCardButtonPresent(@NotNull Activity activity, @NotNull String str, @NotNull String str2);

    @NotNull
    GameCardButtonPresentV2 getGameCardButtonPresentV2(@NotNull Activity activity, @NotNull String str, @NotNull String str2);

    @Deprecated(level = DeprecationLevel.WARNING, message = "请优先使用 getGameDetailInfoFragment")
    @NotNull
    default BottomSheetDialogFragment getGameDetailBottomSheetFragment(@NotNull GameDetailParams gameDetailParams) {
        return getGameDetailBottomSheetFragment(gameDetailParams, GameDetailHeightStyle.LIVE);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "请优先使用 getGameDetailInfoFragment")
    @NotNull
    BottomSheetDialogFragment getGameDetailBottomSheetFragment(@NotNull GameDetailParams gameDetailParams, @NotNull GameDetailHeightStyle gameDetailHeightStyle);

    @Deprecated(level = DeprecationLevel.WARNING, message = "请优先使用 getGameDetailInfoFragment")
    @NotNull
    BottomSheetDialogFragment getGameDetailBottomSheetFragment(@NotNull GameDetailParams gameDetailParams, @NotNull GameDetailHeightStyle gameDetailHeightStyle, @NotNull SlideListener slideListener);

    @Deprecated(level = DeprecationLevel.WARNING, message = "请优先使用 getGameDetailInfoFragment")
    @NotNull
    default BottomSheetDialogFragment getGameDetailBottomSheetFragment(@NotNull GameDetailParams gameDetailParams, @NotNull SlideListener slideListener) {
        return getGameDetailBottomSheetFragment(gameDetailParams, GameDetailHeightStyle.LIVE, slideListener);
    }

    @NotNull
    Fragment getGameDetailFragmentNew(@NotNull GameDetailParams gameDetailParams);

    @NotNull
    BottomSheetDialogFragment getGameDetailInfoFragment(@NotNull String str, @NotNull String str2, @NotNull GameDetailHeightStyle gameDetailHeightStyle, @NotNull SlideListener slideListener, @Nullable Function0<Unit> function0);

    @NotNull
    BottomSheetDialogFragment getGameDetailInfoFragment(@NotNull String str, @NotNull String str2, @NotNull GameDetailHeightStyle gameDetailHeightStyle, @Nullable Function0<Unit> function0);

    @NotNull
    default BottomSheetDialogFragment getGameDetailInfoFragment(@NotNull String str, @NotNull String str2, @Nullable Function0<Unit> function0) {
        return getGameDetailInfoFragment(str, str2, GameDetailHeightStyle.VIDEO, function0);
    }

    @NotNull
    Dialog getGameDownloadDialog(@NotNull Context context, @NotNull String str, @NotNull String str2);

    @NotNull
    Fragment getSteamWebFragment(@NotNull String str, @Nullable Map<String, String> map, @NotNull String str2);

    @NotNull
    GameRetUserCard getVideoGameRetUserCard(@NotNull String str, @Nullable String str2, @NotNull String str3);

    @NotNull
    IGameVideoMentionCard getVideoMentionCard(@NotNull String str, @NotNull GameVideoMentionCardData gameVideoMentionCardData, @NotNull String str2, boolean z6);
}
