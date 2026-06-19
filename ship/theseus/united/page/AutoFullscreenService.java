package com.bilibili.ship.theseus.united.page;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import javax.inject.Inject;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoFullscreenService.class */
@StabilityInferred(parameters = 1)
public final class AutoFullscreenService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98785a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoFullscreenService$FullscreenMode.class */
    public static final class FullscreenMode {
        private static final EnumEntries $ENTRIES;
        private static final FullscreenMode[] $VALUES;
        private final int value;
        public static final FullscreenMode UserSpecified = new FullscreenMode("UserSpecified", 0, 0);
        public static final FullscreenMode ForcedInFullscreen = new FullscreenMode("ForcedInFullscreen", 1, 1);
        public static final FullscreenMode AutoFullscreen = new FullscreenMode("AutoFullscreen", 2, 2);
        public static final FullscreenMode InitHalfScreen = new FullscreenMode("InitHalfScreen", 3, 3);

        private static final /* synthetic */ FullscreenMode[] $values() {
            return new FullscreenMode[]{UserSpecified, ForcedInFullscreen, AutoFullscreen, InitHalfScreen};
        }

        static {
            FullscreenMode[] fullscreenModeArr$values = $values();
            $VALUES = fullscreenModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(fullscreenModeArr$values);
        }

        private FullscreenMode(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<FullscreenMode> getEntries() {
            return $ENTRIES;
        }

        public static FullscreenMode valueOf(String str) {
            return (FullscreenMode) Enum.valueOf(FullscreenMode.class, str);
        }

        public static FullscreenMode[] values() {
            return (FullscreenMode[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoFullscreenService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FullscreenMode f98786a;

        public a() {
            this(FullscreenMode.UserSpecified);
        }

        public a(@NotNull FullscreenMode fullscreenMode) {
            this.f98786a = fullscreenMode;
        }
    }

    @Inject
    public AutoFullscreenService(@NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull a aVar, @NotNull Activity activity, @NotNull DanmakuInputWindowService danmakuInputWindowService) {
        FullscreenMode fullscreenMode = aVar.f98786a;
        boolean z6 = false;
        if ((fullscreenMode == FullscreenMode.UserSpecified && PlayerSettingHelper.INSTANCE.shouldAutoFullscreenWhenEnterDetailPage()) || fullscreenMode == FullscreenMode.AutoFullscreen || fullscreenMode == FullscreenMode.ForcedInFullscreen) {
            cVar.e();
            activity.overridePendingTransition(0, 0);
        }
        FullscreenMode fullscreenMode2 = FullscreenMode.ForcedInFullscreen;
        if (fullscreenMode == fullscreenMode2) {
            cVar.j(this, true);
            danmakuInputWindowService.f81798i = false;
        }
        this.f98785a = fullscreenMode == fullscreenMode2 ? true : z6;
    }
}
