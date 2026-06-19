package com.bilibili.live;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/ILiveRoomAnswerAbilityProvider.class */
public interface ILiveRoomAnswerAbilityProvider {
    void followUp(@NotNull Function1<? super Void, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    void getFollowStatus(@NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    SharedFlow<PushRefreshDto> getPushRefreshState();

    void hidePanel();

    boolean isCurrentShowDialog();

    void showPanel(@NotNull Fragment fragment, @NotNull Function0<Unit> function0);

    void toast(@NotNull String str);

    void unFollowUp(@NotNull Function1<? super Void, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
