package com.bilibili.ogv.operation3.module.operablecard;

import F3.U4;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/operablecard/BizType.class */
@Serializable
public final class BizType {
    private static final EnumEntries $ENTRIES;
    private static final BizType[] $VALUES;

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    @NotNull
    public static final a Companion;
    public static final BizType UGC = new BizType("UGC", 0);
    public static final BizType PGC = new BizType("PGC", 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/operablecard/BizType$a.class */
    public static final class a {
        @NotNull
        public final KSerializer<BizType> serializer() {
            return (KSerializer) BizType.$cachedSerializer$delegate.getValue();
        }
    }

    private static final /* synthetic */ BizType[] $values() {
        return new BizType[]{UGC, PGC};
    }

    static {
        BizType[] bizTypeArr$values = $values();
        $VALUES = bizTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bizTypeArr$values);
        Companion = new a();
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new U4(9));
    }

    private BizType(String str, int i7) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.bilibili.ogv.operation3.module.operablecard.BizType", values());
    }

    @NotNull
    public static EnumEntries<BizType> getEntries() {
        return $ENTRIES;
    }

    public static BizType valueOf(String str) {
        return (BizType) Enum.valueOf(BizType.class, str);
    }

    public static BizType[] values() {
        return (BizType[]) $VALUES.clone();
    }
}
