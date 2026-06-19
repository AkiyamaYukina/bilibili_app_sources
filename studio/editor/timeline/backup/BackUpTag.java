package com.bilibili.studio.editor.timeline.backup;

import Yv0.d;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/backup/BackUpTag.class */
public final class BackUpTag {
    private static final EnumEntries $ENTRIES;
    private static final BackUpTag[] $VALUES;

    @NotNull
    private final String des;
    public static final BackUpTag EMPTY = new BackUpTag("EMPTY", 0, "");
    public static final BackUpTag MAIN_DEFAULT = new BackUpTag("MAIN_DEFAULT", 1, d.a(2131842276));
    public static final BackUpTag TEMPLATE_APPLY = new BackUpTag("TEMPLATE_APPLY", 2, d.a(2131849761));
    public static final BackUpTag PICTURE_RATIO = new BackUpTag("PICTURE_RATIO", 3, d.a(2131849661));
    public static final BackUpTag FILTER_ADD = new BackUpTag("FILTER_ADD", 4, d.a(2131849596));
    public static final BackUpTag FILTER_APPLY_ALL = new BackUpTag("FILTER_APPLY_ALL", 5, d.a(2131850217));
    public static final BackUpTag STICKER_ADD = new BackUpTag("STICKER_ADD", 6, d.a(2131850230));
    public static final BackUpTag STICKER_COPY = new BackUpTag("STICKER_COPY", 7, d.a(2131849528));
    public static final BackUpTag STICKER_DEL = new BackUpTag("STICKER_DEL", 8, d.a(2131849171));
    public static final BackUpTag STICKER_MOVE = new BackUpTag("STICKER_MOVE", 9, d.a(2131849986));
    public static final BackUpTag STICKER_CLIP = new BackUpTag("STICKER_CLIP", 10, d.a(2131850003));
    public static final BackUpTag STICKER_SPLIT = new BackUpTag("STICKER_SPLIT", 11, d.a(2131850515));
    public static final BackUpTag STICKER_CHANGE = new BackUpTag("STICKER_CHANGE", 12, d.a(2131850021));
    public static final BackUpTag CAPTION_ADD = new BackUpTag("CAPTION_ADD", 13, d.a(2131851415));
    public static final BackUpTag CAPTION_COPY = new BackUpTag("CAPTION_COPY", 14, d.a(2131849089));
    public static final BackUpTag CAPTION_DEL = new BackUpTag("CAPTION_DEL", 15, d.a(2131850184));
    public static final BackUpTag CAPTION_CLIP = new BackUpTag("CAPTION_CLIP", 16, d.a(2131842329));
    public static final BackUpTag CAPTION_MOVE = new BackUpTag("CAPTION_MOVE", 17, d.a(2131849267));
    public static final BackUpTag CAPTION_EDIT = new BackUpTag("CAPTION_EDIT", 18, d.a(2131849055));
    public static final BackUpTag CAPTION_MODIFY_TTS = new BackUpTag("CAPTION_MODIFY_TTS", 19, d.a(2131849493));
    public static final BackUpTag CAPTION_TTS = new BackUpTag("CAPTION_TTS", 20, d.a(2131849815));
    public static final BackUpTag CAPTION_ALL_TTS = new BackUpTag("CAPTION_ALL_TTS", 21, d.a(2131850268));
    public static final BackUpTag CAPTION_ASR = new BackUpTag("CAPTION_ASR", 22, d.a(2131850591));
    public static final BackUpTag CAPTION_SPLIT = new BackUpTag("CAPTION_SPLIT", 23, d.a(2131849938));
    public static final BackUpTag CAPTION_BATCH_DEL = new BackUpTag("CAPTION_BATCH_DEL", 24, d.a(2131851385));
    public static final BackUpTag RECORD_ADD = new BackUpTag("RECORD_ADD", 25, d.a(2131849452));
    public static final BackUpTag RECORD_DEL = new BackUpTag("RECORD_DEL", 26, d.a(2131850084));
    public static final BackUpTag RECORD_ALL_VOLUME = new BackUpTag("RECORD_ALL_VOLUME", 27, d.a(2131850019));
    public static final BackUpTag RECORD_ALL_VOICE = new BackUpTag("RECORD_ALL_VOICE", 28, d.a(2131850357));
    public static final BackUpTag RECORD_VOLUME = new BackUpTag("RECORD_VOLUME", 29, d.a(2131850568));
    public static final BackUpTag RECORD_VOICE = new BackUpTag("RECORD_VOICE", 30, d.a(2131849720));
    public static final BackUpTag RECORD_SPLIT = new BackUpTag("RECORD_SPLIT", 31, d.a(2131849711));
    public static final BackUpTag RECORD_TRIM = new BackUpTag("RECORD_TRIM", 32, d.a(2131842326));
    public static final BackUpTag RECORD_MOVE = new BackUpTag("RECORD_MOVE", 33, d.a(2131842383));
    public static final BackUpTag COMPOUND_CAPTION_MANUSCRIPT = new BackUpTag("COMPOUND_CAPTION_MANUSCRIPT", 34, d.a(2131849803));
    public static final BackUpTag COMPOUND_CAPTION_LIVE = new BackUpTag("COMPOUND_CAPTION_LIVE", 35, d.a(2131849958));
    public static final BackUpTag COMPOUND_CAPTION_COOPERATE = new BackUpTag("COMPOUND_CAPTION_COOPERATE", 36, d.a(2131850296));
    public static final BackUpTag COMPOUND_CAPTION_OTHER = new BackUpTag("COMPOUND_CAPTION_OTHER", 37, d.a(2131849376));
    public static final BackUpTag MUSIC_ADD = new BackUpTag("MUSIC_ADD", 38, d.a(2131850333));
    public static final BackUpTag MUSIC_REPLACE = new BackUpTag("MUSIC_REPLACE", 39, d.a(2131849750));
    public static final BackUpTag MUSIC_POINT_CHANGE = new BackUpTag("MUSIC_POINT_CHANGE", 40, d.a(2131850399));
    public static final BackUpTag MUSIC_LOOP = new BackUpTag("MUSIC_LOOP", 41, d.a(2131849056));
    public static final BackUpTag MUSIC_CANCEL_LOOP = new BackUpTag("MUSIC_CANCEL_LOOP", 42, d.a(2131849033));
    public static final BackUpTag MUSIC_VOLUME = new BackUpTag("MUSIC_VOLUME", 43, d.a(2131850568));
    public static final BackUpTag MUSIC_ALL_VOLUME = new BackUpTag("MUSIC_ALL_VOLUME", 44, d.a(2131850019));
    public static final BackUpTag MUSIC_DEL = new BackUpTag("MUSIC_DEL", 45, d.a(2131849604));
    public static final BackUpTag MUSIC_CLIP = new BackUpTag("MUSIC_CLIP", 46, d.a(2131849064));
    public static final BackUpTag MUSIC_COPY = new BackUpTag("MUSIC_COPY", 47, d.a(2131850239));
    public static final BackUpTag MUSIC_MOVE = new BackUpTag("MUSIC_MOVE", 48, d.a(2131842372));
    public static final BackUpTag MUSIC_SPLIT = new BackUpTag("MUSIC_SPLIT", 49, d.a(2131849476));
    public static final BackUpTag MUSIC_FADE = new BackUpTag("MUSIC_FADE", 50, d.a(2131850035));
    public static final BackUpTag CLIP_SORT = new BackUpTag("CLIP_SORT", 51, d.a(2131849644));
    public static final BackUpTag CLIP_DEL = new BackUpTag("CLIP_DEL", 52, d.a(2131850512));
    public static final BackUpTag CLIP_VIDEO = new BackUpTag("CLIP_VIDEO", 53, d.a(2131850131));
    public static final BackUpTag CLIP_ROTATE = new BackUpTag("CLIP_ROTATE", 54, d.a(2131850011));
    public static final BackUpTag CLIP_TRIM = new BackUpTag("CLIP_TRIM", 55, d.a(2131850521));
    public static final BackUpTag CLIP_SPEED = new BackUpTag("CLIP_SPEED", 56, d.a(2131850177));
    public static final BackUpTag TRANS_APPLY = new BackUpTag("TRANS_APPLY", 57, d.a(2131849547));
    public static final BackUpTag TRANS_APPLY_ALL = new BackUpTag("TRANS_APPLY_ALL", 58, d.a(2131849127));
    public static final BackUpTag ADD_MATERIAL = new BackUpTag("ADD_MATERIAL", 59, d.a(2131850916));
    public static final BackUpTag OPEN_NATIVE_VOLUME = new BackUpTag("OPEN_NATIVE_VOLUME", 60, d.a(2131849238));
    public static final BackUpTag CLOSE_NATIVE_VOLUME = new BackUpTag("CLOSE_NATIVE_VOLUME", 61, d.a(2131849187));
    public static final BackUpTag CLIP_TRANSFORM = new BackUpTag("CLIP_TRANSFORM", 62, d.a(2131849728));

    private static final /* synthetic */ BackUpTag[] $values() {
        return new BackUpTag[]{EMPTY, MAIN_DEFAULT, TEMPLATE_APPLY, PICTURE_RATIO, FILTER_ADD, FILTER_APPLY_ALL, STICKER_ADD, STICKER_COPY, STICKER_DEL, STICKER_MOVE, STICKER_CLIP, STICKER_SPLIT, STICKER_CHANGE, CAPTION_ADD, CAPTION_COPY, CAPTION_DEL, CAPTION_CLIP, CAPTION_MOVE, CAPTION_EDIT, CAPTION_MODIFY_TTS, CAPTION_TTS, CAPTION_ALL_TTS, CAPTION_ASR, CAPTION_SPLIT, CAPTION_BATCH_DEL, RECORD_ADD, RECORD_DEL, RECORD_ALL_VOLUME, RECORD_ALL_VOICE, RECORD_VOLUME, RECORD_VOICE, RECORD_SPLIT, RECORD_TRIM, RECORD_MOVE, COMPOUND_CAPTION_MANUSCRIPT, COMPOUND_CAPTION_LIVE, COMPOUND_CAPTION_COOPERATE, COMPOUND_CAPTION_OTHER, MUSIC_ADD, MUSIC_REPLACE, MUSIC_POINT_CHANGE, MUSIC_LOOP, MUSIC_CANCEL_LOOP, MUSIC_VOLUME, MUSIC_ALL_VOLUME, MUSIC_DEL, MUSIC_CLIP, MUSIC_COPY, MUSIC_MOVE, MUSIC_SPLIT, MUSIC_FADE, CLIP_SORT, CLIP_DEL, CLIP_VIDEO, CLIP_ROTATE, CLIP_TRIM, CLIP_SPEED, TRANS_APPLY, TRANS_APPLY_ALL, ADD_MATERIAL, OPEN_NATIVE_VOLUME, CLOSE_NATIVE_VOLUME, CLIP_TRANSFORM};
    }

    static {
        BackUpTag[] backUpTagArr$values = $values();
        $VALUES = backUpTagArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(backUpTagArr$values);
    }

    private BackUpTag(String str, int i7, String str2) {
        this.des = str2;
    }

    @NotNull
    public static EnumEntries<BackUpTag> getEntries() {
        return $ENTRIES;
    }

    public static BackUpTag valueOf(String str) {
        return (BackUpTag) Enum.valueOf(BackUpTag.class, str);
    }

    public static BackUpTag[] values() {
        return (BackUpTag[]) $VALUES.clone();
    }

    @NotNull
    public final String getDes() {
        return this.des;
    }
}
