package com.bilibili.lib.projection;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.bilibili.lib.projection.datasource.ProjectionDataSource;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.selector.ProjectionSelectorContainer;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionClient.class */
public interface ProjectionClient {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionClient$ClientCallback.class */
    public interface ClientCallback {

        @NotNull
        public static final a DEFAULT = a.f62972a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionClient$ClientCallback$TopBarState.class */
        public static final class TopBarState {
            private static final EnumEntries $ENTRIES;
            private static final TopBarState[] $VALUES;
            public static final TopBarState SHOW_HELP_BUTTON = new TopBarState("SHOW_HELP_BUTTON", 0);
            public static final TopBarState DISMISS_HELP_BUTTON = new TopBarState("DISMISS_HELP_BUTTON", 1);

            private static final /* synthetic */ TopBarState[] $values() {
                return new TopBarState[]{SHOW_HELP_BUTTON, DISMISS_HELP_BUTTON};
            }

            static {
                TopBarState[] topBarStateArr$values = $values();
                $VALUES = topBarStateArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(topBarStateArr$values);
            }

            private TopBarState(String str, int i7) {
            }

            @NotNull
            public static EnumEntries<TopBarState> getEntries() {
                return $ENTRIES;
            }

            public static TopBarState valueOf(String str) {
                return (TopBarState) Enum.valueOf(TopBarState.class, str);
            }

            public static TopBarState[] values() {
                return (TopBarState[]) $VALUES.clone();
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionClient$ClientCallback$a.class */
        public static final class a implements ClientCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f62972a = new Object();
        }

        static /* synthetic */ void onItemChange$default(ClientCallback clientCallback, IProjectionItem iProjectionItem, int i7, boolean z6, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onItemChange");
            }
            if ((i8 & 4) != 0) {
                z6 = false;
            }
            clientCallback.onItemChange(iProjectionItem, i7, z6);
        }

        default void onDanmakuVisibleChanged(boolean z6) {
        }

        default void onEnableGlobalMode(boolean z6) {
        }

        default void onItemChange(@NotNull IProjectionItem iProjectionItem, int i7, boolean z6) {
        }

        default void onPanelShow(boolean z6, boolean z7, @NotNull ClientPanel clientPanel) {
        }

        default void onProjectionBackPressed() {
        }

        default void onProjectionCompleted(@NotNull IProjectionPlayableItem iProjectionPlayableItem, int i7) {
        }

        default void onProjectionEnd() {
        }

        default void onProjectionStart() {
        }

        default void onResolveFailed(@NotNull Throwable th) {
        }

        default void onShowSearchFragment(boolean z6, boolean z7) {
        }

        @Nullable
        default ProjectionSelectorContainer onShowSelector() {
            return null;
        }

        default void updateTopBarState(@NotNull TopBarState topBarState) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionClient$ClientPanel.class */
    public interface ClientPanel {
        boolean isFloat();

        boolean isRoot();

        boolean isShowing();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionClient$PlayEvent.class */
    public static final class PlayEvent {
        private static final EnumEntries $ENTRIES;
        private static final PlayEvent[] $VALUES;
        public static final PlayEvent PLAY = new PlayEvent("PLAY", 0);
        public static final PlayEvent PAUSE = new PlayEvent("PAUSE", 1);
        public static final PlayEvent REPLAY = new PlayEvent("REPLAY", 2);

        private static final /* synthetic */ PlayEvent[] $values() {
            return new PlayEvent[]{PLAY, PAUSE, REPLAY};
        }

        static {
            PlayEvent[] playEventArr$values = $values();
            $VALUES = playEventArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(playEventArr$values);
        }

        private PlayEvent(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<PlayEvent> getEntries() {
            return $ENTRIES;
        }

        public static PlayEvent valueOf(String str) {
            return (PlayEvent) Enum.valueOf(PlayEvent.class, str);
        }

        public static PlayEvent[] values() {
            return (PlayEvent[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionClient$a.class */
    public interface a {
        @Nullable
        IProjectionPlayableItem a();

        @Nullable
        ProjectionDataSource b();

        @Nullable
        ProjectionDeviceInternal c();

        int getCurrentIndex();

        @Nullable
        IProjectionItem getCurrentItem();

        long getCurrentProgress();
    }

    static /* synthetic */ void danmakuToggle$default(ProjectionClient projectionClient, boolean z6, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: danmakuToggle");
        }
        if ((i7 & 1) != 0) {
            z6 = !projectionClient.getDanmakuShow();
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        projectionClient.danmakuToggle(z6, z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void play$default(ProjectionClient projectionClient, int i7, long j7, boolean z6, boolean z7, boolean z8, Function0 function0, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            j7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = projectionClient.getDanmakuShow();
        }
        if ((i8 & 8) != 0) {
            z7 = false;
        }
        if ((i8 & 16) != 0) {
            z8 = false;
        }
        if ((i8 & 32) != 0) {
            function0 = null;
        }
        projectionClient.play(i7, j7, z6, z7, z8, function0);
    }

    static /* synthetic */ void resetSeekProgress$default(ProjectionClient projectionClient, long j7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetSeekProgress");
        }
        if ((i7 & 1) != 0) {
            j7 = 3000;
        }
        projectionClient.resetSeekProgress(j7);
    }

    static /* synthetic */ void setPlaySpeed$default(ProjectionClient projectionClient, float f7, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPlaySpeed");
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        projectionClient.setPlaySpeed(f7, z6);
    }

    static /* synthetic */ void stopGlobalLink$default(ProjectionClient projectionClient, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopGlobalLink");
        }
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        projectionClient.stopGlobalLink(z6);
    }

    void attach(@Nullable Activity activity);

    void attach(@NotNull ViewGroup viewGroup);

    void attach(@NotNull ViewGroup viewGroup, int i7);

    void danmakuToggle(boolean z6, boolean z7);

    void detach();

    void enableGlobalLink(boolean z6);

    void feedback(@NotNull Context context);

    @NotNull
    ClientCallback getCallback();

    int getCastableDeviceNum();

    int getClientId();

    @NotNull
    a getClientState();

    int getClientType();

    @NotNull
    ProjectionClientConfig getConfig();

    @NotNull
    ProjectionService getContext();

    boolean getDanmakuShow();

    int getDuration();

    @NotNull
    Flow<PlayEvent> getEventFlow();

    boolean getFromCastButton();

    float getPlaySpeed();

    int getPosition();

    boolean hasDevice();

    boolean isDanmakuForbidden();

    boolean isGlobalLinkEnable();

    boolean isGlobalLinkMode();

    boolean isPlaying();

    boolean onBackPressed();

    boolean onKeyEvent(@NotNull KeyEvent keyEvent);

    void play(int i7, long j7, boolean z6, boolean z7, boolean z8, @Nullable Function0<Unit> function0);

    void release();

    void reportStop();

    void resetPlaySpeed();

    void resetSeekProgress(long j7);

    void seeHelp(@NotNull Context context);

    default boolean sendDanmaku(@Nullable String str, int i7, int i8, int i9) {
        return false;
    }

    void setCallback(@NotNull ClientCallback clientCallback);

    void setConfig(@NotNull ProjectionClientConfig projectionClientConfig);

    void setDanmakuForbidden(boolean z6);

    void setDataSource(@NotNull ProjectionDataSource projectionDataSource);

    void setFromCastButton(boolean z6);

    void setLostByUser(boolean z6);

    void setPlaySpeed(float f7, boolean z6);

    void startGlobalLink();

    void stop();

    void stopGlobalLink(boolean z6);

    void tryDismissSearchPage();
}
