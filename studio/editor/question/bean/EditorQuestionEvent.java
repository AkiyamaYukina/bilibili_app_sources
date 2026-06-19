package com.bilibili.studio.editor.question.bean;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/bean/EditorQuestionEvent.class */
public final class EditorQuestionEvent {
    private static final EnumEntries $ENTRIES;
    private static final EditorQuestionEvent[] $VALUES;
    public static final EditorQuestionEvent CENTER_EDITOR_CANCEL = new EditorQuestionEvent("CENTER_EDITOR_CANCEL", 0);
    public static final EditorQuestionEvent CENTER_EDITOR_TEMPLATE_CANCEL = new EditorQuestionEvent("CENTER_EDITOR_TEMPLATE_CANCEL", 1);
    public static final EditorQuestionEvent CENTER_EDITOR_CLIP_CANCEL = new EditorQuestionEvent("CENTER_EDITOR_CLIP_CANCEL", 2);
    public static final EditorQuestionEvent CENTER_EDITOR_MUSIC_CANCEL = new EditorQuestionEvent("CENTER_EDITOR_MUSIC_CANCEL", 3);
    public static final EditorQuestionEvent CENTER_EDITOR_TEXT_CANCEL = new EditorQuestionEvent("CENTER_EDITOR_TEXT_CANCEL", 4);
    public static final EditorQuestionEvent CENTER_EDITOR_SMART_VIDEO_CANCEL = new EditorQuestionEvent("CENTER_EDITOR_SMART_VIDEO_CANCEL", 5);
    public static final EditorQuestionEvent CENTER_EDITOR_SELECT_TOPIC_CANCEL = new EditorQuestionEvent("CENTER_EDITOR_SELECT_TOPIC_CANCEL", 6);
    public static final EditorQuestionEvent PUBLISH_EDITOR_CANCEL = new EditorQuestionEvent("PUBLISH_EDITOR_CANCEL", 7);
    public static final EditorQuestionEvent PUBLISH_EDITOR_TEMPLATE_CANCEL = new EditorQuestionEvent("PUBLISH_EDITOR_TEMPLATE_CANCEL", 8);
    public static final EditorQuestionEvent PUBLISH_EDITOR_CLIP_CANCEL = new EditorQuestionEvent("PUBLISH_EDITOR_CLIP_CANCEL", 9);
    public static final EditorQuestionEvent PUBLISH_EDITOR_MUSIC_CANCEL = new EditorQuestionEvent("PUBLISH_EDITOR_MUSIC_CANCEL", 10);
    public static final EditorQuestionEvent PUBLISH_EDITOR_TEXT_CANCEL = new EditorQuestionEvent("PUBLISH_EDITOR_TEXT_CANCEL", 11);
    public static final EditorQuestionEvent PUBLISH_EDITOR_SMART_VIDEO_CANCEL = new EditorQuestionEvent("PUBLISH_EDITOR_SMART_VIDEO_CANCEL", 12);
    public static final EditorQuestionEvent PUBLISH_EDITOR_SELECT_TOPIC_CANCEL = new EditorQuestionEvent("PUBLISH_EDITOR_SELECT_TOPIC_CANCEL", 13);
    public static final EditorQuestionEvent EDITOR_CANCEL = new EditorQuestionEvent("EDITOR_CANCEL", 14);
    public static final EditorQuestionEvent EDITOR_TEMPLATE_CANCEL = new EditorQuestionEvent("EDITOR_TEMPLATE_CANCEL", 15);
    public static final EditorQuestionEvent EDITOR_CLIP_CANCEL = new EditorQuestionEvent("EDITOR_CLIP_CANCEL", 16);
    public static final EditorQuestionEvent EDITOR_MUSIC_CANCEL = new EditorQuestionEvent("EDITOR_MUSIC_CANCEL", 17);
    public static final EditorQuestionEvent EDITOR_TEXT_CANCEL = new EditorQuestionEvent("EDITOR_TEXT_CANCEL", 18);
    public static final EditorQuestionEvent EDITOR_SMART_VIDEO_CANCEL = new EditorQuestionEvent("EDITOR_SMART_VIDEO_CANCEL", 19);
    public static final EditorQuestionEvent EDITOR_SELECT_TOPIC_CANCEL = new EditorQuestionEvent("EDITOR_SELECT_TOPIC_CANCEL", 20);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/bean/EditorQuestionEvent$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108210a;

        static {
            int[] iArr = new int[EditorQuestionEvent.values().length];
            try {
                iArr[EditorQuestionEvent.CENTER_EDITOR_CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[EditorQuestionEvent.CENTER_EDITOR_TEMPLATE_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[EditorQuestionEvent.CENTER_EDITOR_CLIP_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[EditorQuestionEvent.CENTER_EDITOR_MUSIC_CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[EditorQuestionEvent.CENTER_EDITOR_TEXT_CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[EditorQuestionEvent.CENTER_EDITOR_SMART_VIDEO_CANCEL.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[EditorQuestionEvent.CENTER_EDITOR_SELECT_TOPIC_CANCEL.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[EditorQuestionEvent.PUBLISH_EDITOR_CANCEL.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[EditorQuestionEvent.PUBLISH_EDITOR_TEMPLATE_CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[EditorQuestionEvent.PUBLISH_EDITOR_CLIP_CANCEL.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[EditorQuestionEvent.PUBLISH_EDITOR_MUSIC_CANCEL.ordinal()] = 11;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[EditorQuestionEvent.PUBLISH_EDITOR_TEXT_CANCEL.ordinal()] = 12;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[EditorQuestionEvent.PUBLISH_EDITOR_SMART_VIDEO_CANCEL.ordinal()] = 13;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[EditorQuestionEvent.PUBLISH_EDITOR_SELECT_TOPIC_CANCEL.ordinal()] = 14;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[EditorQuestionEvent.EDITOR_CANCEL.ordinal()] = 15;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr[EditorQuestionEvent.EDITOR_TEMPLATE_CANCEL.ordinal()] = 16;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr[EditorQuestionEvent.EDITOR_CLIP_CANCEL.ordinal()] = 17;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr[EditorQuestionEvent.EDITOR_MUSIC_CANCEL.ordinal()] = 18;
            } catch (NoSuchFieldError e24) {
            }
            try {
                iArr[EditorQuestionEvent.EDITOR_TEXT_CANCEL.ordinal()] = 19;
            } catch (NoSuchFieldError e25) {
            }
            try {
                iArr[EditorQuestionEvent.EDITOR_SMART_VIDEO_CANCEL.ordinal()] = 20;
            } catch (NoSuchFieldError e26) {
            }
            try {
                iArr[EditorQuestionEvent.EDITOR_SELECT_TOPIC_CANCEL.ordinal()] = 21;
            } catch (NoSuchFieldError e27) {
            }
            f108210a = iArr;
        }
    }

    private static final /* synthetic */ EditorQuestionEvent[] $values() {
        return new EditorQuestionEvent[]{CENTER_EDITOR_CANCEL, CENTER_EDITOR_TEMPLATE_CANCEL, CENTER_EDITOR_CLIP_CANCEL, CENTER_EDITOR_MUSIC_CANCEL, CENTER_EDITOR_TEXT_CANCEL, CENTER_EDITOR_SMART_VIDEO_CANCEL, CENTER_EDITOR_SELECT_TOPIC_CANCEL, PUBLISH_EDITOR_CANCEL, PUBLISH_EDITOR_TEMPLATE_CANCEL, PUBLISH_EDITOR_CLIP_CANCEL, PUBLISH_EDITOR_MUSIC_CANCEL, PUBLISH_EDITOR_TEXT_CANCEL, PUBLISH_EDITOR_SMART_VIDEO_CANCEL, PUBLISH_EDITOR_SELECT_TOPIC_CANCEL, EDITOR_CANCEL, EDITOR_TEMPLATE_CANCEL, EDITOR_CLIP_CANCEL, EDITOR_MUSIC_CANCEL, EDITOR_TEXT_CANCEL, EDITOR_SMART_VIDEO_CANCEL, EDITOR_SELECT_TOPIC_CANCEL};
    }

    static {
        EditorQuestionEvent[] editorQuestionEventArr$values = $values();
        $VALUES = editorQuestionEventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(editorQuestionEventArr$values);
    }

    private EditorQuestionEvent(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<EditorQuestionEvent> getEntries() {
        return $ENTRIES;
    }

    public static EditorQuestionEvent valueOf(String str) {
        return (EditorQuestionEvent) Enum.valueOf(EditorQuestionEvent.class, str);
    }

    public static EditorQuestionEvent[] values() {
        return (EditorQuestionEvent[]) $VALUES.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String getEditorEventKey() throws NoWhenBranchMatchedException {
        String str;
        switch (a.f108210a[ordinal()]) {
            case 1:
                str = "center-plus-editor-close-click";
                break;
            case 2:
                str = "center-plus-editor-template-close-click";
                break;
            case 3:
                str = "center-plus-editor-clip-close-click";
                break;
            case 4:
                str = "center-plus-editor-music-close-click";
                break;
            case 5:
                str = "center-plus-editor-character-close-click";
                break;
            case 6:
                str = "center-plus-smart-video-close-click";
                break;
            case 7:
                str = "center-plus-select-topic-close-click";
                break;
            case 8:
                str = "publish-editor-close-click";
                break;
            case 9:
                str = "publish-editor-template-close-click";
                break;
            case 10:
                str = "publish-editor-clip-close-click";
                break;
            case 11:
                str = "publish-editor-music-close-click";
                break;
            case 12:
                str = "publish-editor-character-close-click";
                break;
            case 13:
                str = "publish-smart-video-close-click";
                break;
            case 14:
                str = "publish-select-topic-close-click";
                break;
            case 15:
                str = "editor-close-click";
                break;
            case 16:
                str = "editor-template-close-click";
                break;
            case 17:
                str = "editor-clip-close-click";
                break;
            case 18:
                str = "editor-music-close-click";
                break;
            case 19:
                str = "editor-character-close-click";
                break;
            case 20:
                str = "smart-video-close-click";
                break;
            case 21:
                str = "select-topic-close-click";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return str;
    }
}
