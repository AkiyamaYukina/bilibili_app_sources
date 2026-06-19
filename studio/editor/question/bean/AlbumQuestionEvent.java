package com.bilibili.studio.editor.question.bean;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/bean/AlbumQuestionEvent.class */
public final class AlbumQuestionEvent {
    private static final EnumEntries $ENTRIES;
    private static final AlbumQuestionEvent[] $VALUES;
    public static final AlbumQuestionEvent CENTER_PICKER_CANCEL = new AlbumQuestionEvent("CENTER_PICKER_CANCEL", 0);
    public static final AlbumQuestionEvent PUBLISH_PICKER_CANCEL = new AlbumQuestionEvent("PUBLISH_PICKER_CANCEL", 1);
    public static final AlbumQuestionEvent PICKER_CANCEL = new AlbumQuestionEvent("PICKER_CANCEL", 2);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/bean/AlbumQuestionEvent$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108209a;

        static {
            int[] iArr = new int[AlbumQuestionEvent.values().length];
            try {
                iArr[AlbumQuestionEvent.CENTER_PICKER_CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[AlbumQuestionEvent.PUBLISH_PICKER_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[AlbumQuestionEvent.PICKER_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f108209a = iArr;
        }
    }

    private static final /* synthetic */ AlbumQuestionEvent[] $values() {
        return new AlbumQuestionEvent[]{CENTER_PICKER_CANCEL, PUBLISH_PICKER_CANCEL, PICKER_CANCEL};
    }

    static {
        AlbumQuestionEvent[] albumQuestionEventArr$values = $values();
        $VALUES = albumQuestionEventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(albumQuestionEventArr$values);
    }

    private AlbumQuestionEvent(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<AlbumQuestionEvent> getEntries() {
        return $ENTRIES;
    }

    public static AlbumQuestionEvent valueOf(String str) {
        return (AlbumQuestionEvent) Enum.valueOf(AlbumQuestionEvent.class, str);
    }

    public static AlbumQuestionEvent[] values() {
        return (AlbumQuestionEvent[]) $VALUES.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String getAlbumEventKey() throws NoWhenBranchMatchedException {
        String str;
        int i7 = a.f108209a[ordinal()];
        if (i7 == 1) {
            str = "center-plus-picker-close-click";
        } else if (i7 == 2) {
            str = "publish-picker-close-click";
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "picker-close-click";
        }
        return str;
    }
}
