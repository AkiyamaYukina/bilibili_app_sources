package com.bilibili.live.streaming.callback;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/callback/ILivePushEventCallback.class */
public interface ILivePushEventCallback {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/callback/ILivePushEventCallback$LivePushEventID.class */
    public static final class LivePushEventID {
        private static final EnumEntries $ENTRIES;
        private static final LivePushEventID[] $VALUES;
        public static final LivePushEventID CAPTURE_RENDER = new LivePushEventID("CAPTURE_RENDER", 0);

        private static final /* synthetic */ LivePushEventID[] $values() {
            return new LivePushEventID[]{CAPTURE_RENDER};
        }

        static {
            LivePushEventID[] livePushEventIDArr$values = $values();
            $VALUES = livePushEventIDArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(livePushEventIDArr$values);
        }

        private LivePushEventID(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<LivePushEventID> getEntries() {
            return $ENTRIES;
        }

        public static LivePushEventID valueOf(String str) {
            return (LivePushEventID) Enum.valueOf(LivePushEventID.class, str);
        }

        public static LivePushEventID[] values() {
            return (LivePushEventID[]) $VALUES.clone();
        }
    }

    void onEventMessage(@NotNull LivePushEventID livePushEventID, @NotNull Object obj);
}
