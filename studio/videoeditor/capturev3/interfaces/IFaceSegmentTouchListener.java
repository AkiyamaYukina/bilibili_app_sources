package com.bilibili.studio.videoeditor.capturev3.interfaces;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/interfaces/IFaceSegmentTouchListener.class */
public interface IFaceSegmentTouchListener {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/interfaces/IFaceSegmentTouchListener$TouchEventType.class */
    public static final class TouchEventType {
        private static final EnumEntries $ENTRIES;
        private static final TouchEventType[] $VALUES;
        public static final TouchEventType TOUCH_START = new TouchEventType("TOUCH_START", 0);
        public static final TouchEventType TOUCH_MOVE = new TouchEventType("TOUCH_MOVE", 1);
        public static final TouchEventType TOUCH_RELEASE = new TouchEventType("TOUCH_RELEASE", 2);

        private static final /* synthetic */ TouchEventType[] $values() {
            return new TouchEventType[]{TOUCH_START, TOUCH_MOVE, TOUCH_RELEASE};
        }

        static {
            TouchEventType[] touchEventTypeArr$values = $values();
            $VALUES = touchEventTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(touchEventTypeArr$values);
        }

        private TouchEventType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<TouchEventType> getEntries() {
            return $ENTRIES;
        }

        public static TouchEventType valueOf(String str) {
            return (TouchEventType) Enum.valueOf(TouchEventType.class, str);
        }

        public static TouchEventType[] values() {
            return (TouchEventType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/interfaces/IFaceSegmentTouchListener$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public TouchEventType f109181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f109182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public float[] f109183c;
    }

    void a(float f7);

    void c(float f7, float f8);

    boolean e();

    void f(float f7);

    boolean g();

    void h(@NotNull a aVar);
}
