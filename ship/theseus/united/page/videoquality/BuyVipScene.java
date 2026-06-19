package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/BuyVipScene.class */
public final class BuyVipScene {
    private static final EnumEntries $ENTRIES;
    private static final BuyVipScene[] $VALUES;
    public static final BuyVipScene QUALITY_SWITCH_PANEL = new BuyVipScene("QUALITY_SWITCH_PANEL", 0);
    public static final BuyVipScene TRIAL_START_TOAST_ACTION = new BuyVipScene("TRIAL_START_TOAST_ACTION", 1);
    public static final BuyVipScene TRIAL_END_TOAST_ACTION = new BuyVipScene("TRIAL_END_TOAST_ACTION", 2);
    public static final BuyVipScene AI_ENHANCED_QUALITY_INFO = new BuyVipScene("AI_ENHANCED_QUALITY_INFO", 3);
    public static final BuyVipScene SPONSOR_TRIAL_END_TOAST_ACTION = new BuyVipScene("SPONSOR_TRIAL_END_TOAST_ACTION", 4);

    private static final /* synthetic */ BuyVipScene[] $values() {
        return new BuyVipScene[]{QUALITY_SWITCH_PANEL, TRIAL_START_TOAST_ACTION, TRIAL_END_TOAST_ACTION, AI_ENHANCED_QUALITY_INFO, SPONSOR_TRIAL_END_TOAST_ACTION};
    }

    static {
        BuyVipScene[] buyVipSceneArr$values = $values();
        $VALUES = buyVipSceneArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(buyVipSceneArr$values);
    }

    private BuyVipScene(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BuyVipScene> getEntries() {
        return $ENTRIES;
    }

    public static BuyVipScene valueOf(String str) {
        return (BuyVipScene) Enum.valueOf(BuyVipScene.class, str);
    }

    public static BuyVipScene[] values() {
        return (BuyVipScene[]) $VALUES.clone();
    }
}
