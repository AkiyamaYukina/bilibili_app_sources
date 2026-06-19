package com.bilibili.module.vip.combine;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentTipsVM.class */
@StabilityInferred(parameters = 1)
public final class VipPaymentTipsVM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bililive.biz.entryEffect.uam.d f66157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f66158b = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f66159c = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f66160d = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f66161e = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableState f66162f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentTipsVM$Button.class */
    @StabilityInferred(parameters = 0)
    public static final class Button {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f66163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f66164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public ButtonIndex f66165c = ButtonIndex.FIRST;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentTipsVM$Button$ButtonIndex.class */
        public static final class ButtonIndex {
            private static final EnumEntries $ENTRIES;
            private static final ButtonIndex[] $VALUES;
            public static final ButtonIndex FIRST = new ButtonIndex("FIRST", 0);
            public static final ButtonIndex LAST = new ButtonIndex("LAST", 1);

            private static final /* synthetic */ ButtonIndex[] $values() {
                return new ButtonIndex[]{FIRST, LAST};
            }

            static {
                ButtonIndex[] buttonIndexArr$values = $values();
                $VALUES = buttonIndexArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(buttonIndexArr$values);
            }

            private ButtonIndex(String str, int i7) {
            }

            @NotNull
            public static EnumEntries<ButtonIndex> getEntries() {
                return $ENTRIES;
            }

            public static ButtonIndex valueOf(String str) {
                return (ButtonIndex) Enum.valueOf(ButtonIndex.class, str);
            }

            public static ButtonIndex[] values() {
                return (ButtonIndex[]) $VALUES.clone();
            }
        }

        public Button(@NotNull String str, @NotNull Function0<Unit> function0) {
            this.f66163a = str;
            this.f66164b = function0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(this.f66163a, button.f66163a) && Intrinsics.areEqual(this.f66164b, button.f66164b);
        }

        public final int hashCode() {
            return this.f66164b.hashCode() + (this.f66163a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Button(text=" + this.f66163a + ", onClick=" + this.f66164b + ")";
        }
    }

    public VipPaymentTipsVM(@NotNull com.bilibili.bililive.biz.entryEffect.uam.d dVar) {
        this.f66157a = dVar;
    }
}
