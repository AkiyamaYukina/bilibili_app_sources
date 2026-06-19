package com.bilibili.playerbizcommon.gesture;

import android.content.Context;
import com.bilibili.live.streaming.source.TextSource;
import java.lang.ref.WeakReference;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/MediaLevelController.class */
public abstract class MediaLevelController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final WeakReference<Context> f80040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f80041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f80042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public MoveDirection f80043d = MoveDirection.None;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/MediaLevelController$MoveDirection.class */
    public static final class MoveDirection {
        private static final EnumEntries $ENTRIES;
        private static final MoveDirection[] $VALUES;
        public static final MoveDirection None = new MoveDirection(TextSource.STR_SCROLL_NONE, 0);
        public static final MoveDirection Up = new MoveDirection("Up", 1);
        public static final MoveDirection Down = new MoveDirection("Down", 2);

        private static final /* synthetic */ MoveDirection[] $values() {
            return new MoveDirection[]{None, Up, Down};
        }

        static {
            MoveDirection[] moveDirectionArr$values = $values();
            $VALUES = moveDirectionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(moveDirectionArr$values);
        }

        private MoveDirection(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<MoveDirection> getEntries() {
            return $ENTRIES;
        }

        public static MoveDirection valueOf(String str) {
            return (MoveDirection) Enum.valueOf(MoveDirection.class, str);
        }

        public static MoveDirection[] values() {
            return (MoveDirection[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/MediaLevelController$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f80044a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            try {
                iArr[MoveDirection.Up.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[MoveDirection.Down.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f80044a = iArr;
        }
    }

    public MediaLevelController(@NotNull Context context) {
        this.f80040a = new WeakReference<>(context);
    }

    public boolean change(float f7) {
        float f8 = this.f80042c;
        this.f80042c = f7;
        MoveDirection moveDirection = f7 > f8 ? MoveDirection.Up : MoveDirection.Down;
        if (moveDirection == this.f80043d) {
            return true;
        }
        this.f80043d = moveDirection;
        int i7 = a.f80044a[moveDirection.ordinal()];
        if (i7 == 1) {
            this.f80041b = Math.min(f8, f7);
        } else if (i7 == 2) {
            this.f80041b = Math.max(f8, f7);
        }
        onChangeDirection(moveDirection, this.f80041b);
        return true;
    }

    @Nullable
    public final Context getContext() {
        WeakReference<Context> weakReference = this.f80040a;
        return weakReference != null ? weakReference.get() : null;
    }

    public final float getRelativeDiffFactor(float f7) {
        return f7 - this.f80041b;
    }

    public abstract void onChangeDirection(@NotNull MoveDirection moveDirection, float f7);

    public final void resetDiffFactorStart(float f7) {
        this.f80041b = f7;
    }

    public void startChange() {
        this.f80042c = 0.0f;
        this.f80041b = 0.0f;
    }
}
