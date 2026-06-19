package com.bilibili.studio.editor.moudle.aistory.match;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/match/AIStoryMatchPolicy.class */
public final class AIStoryMatchPolicy {
    private static final EnumEntries $ENTRIES;
    private static final AIStoryMatchPolicy[] $VALUES;
    private final int value;
    public static final AIStoryMatchPolicy Image = new AIStoryMatchPolicy("Image", 0, 0);
    public static final AIStoryMatchPolicy Video = new AIStoryMatchPolicy("Video", 1, 1);
    public static final AIStoryMatchPolicy Mix = new AIStoryMatchPolicy("Mix", 2, 2);

    private static final /* synthetic */ AIStoryMatchPolicy[] $values() {
        return new AIStoryMatchPolicy[]{Image, Video, Mix};
    }

    static {
        AIStoryMatchPolicy[] aIStoryMatchPolicyArr$values = $values();
        $VALUES = aIStoryMatchPolicyArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(aIStoryMatchPolicyArr$values);
    }

    private AIStoryMatchPolicy(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<AIStoryMatchPolicy> getEntries() {
        return $ENTRIES;
    }

    public static AIStoryMatchPolicy valueOf(String str) {
        return (AIStoryMatchPolicy) Enum.valueOf(AIStoryMatchPolicy.class, str);
    }

    public static AIStoryMatchPolicy[] values() {
        return (AIStoryMatchPolicy[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
