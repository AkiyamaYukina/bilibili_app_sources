package com.bilibili.module.vip.mall;

import Eh0.C1659a;
import Eh0.C1660b;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.bilibili.framework.exposure.core.ExposureEntry;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipBuyResultDialogViewModel.class */
@StabilityInferred(parameters = 0)
public final class VipBuyResultDialogViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f66206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f66207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f66208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f66209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f66210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableState f66211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableState f66212g;

    @NotNull
    public final MutableState h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableState f66213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f66214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f66215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final SnapshotStateMap<String, String> f66216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableState f66217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableState f66218n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipBuyResultDialogViewModel$Button.class */
    @StabilityInferred(parameters = 0)
    public static final class Button {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f66219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f66220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f66221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public ButtonIndex f66222d = ButtonIndex.FIRST;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipBuyResultDialogViewModel$Button$ButtonIndex.class */
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

        public Button(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            this.f66219a = str;
            this.f66220b = str2;
            this.f66221c = str3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(this.f66219a, button.f66219a) && Intrinsics.areEqual(this.f66220b, button.f66220b) && Intrinsics.areEqual(this.f66221c, button.f66221c);
        }

        public final int hashCode() {
            int iHashCode = this.f66219a.hashCode();
            int iHashCode2 = 0;
            String str = this.f66220b;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.f66221c;
            if (str2 != null) {
                iHashCode2 = str2.hashCode();
            }
            return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Button(text=");
            sb.append(this.f66219a);
            sb.append(", link=");
            sb.append(this.f66220b);
            sb.append(", badge=");
            return C8770a.a(sb, this.f66221c, ")");
        }
    }

    public VipBuyResultDialogViewModel(@NotNull d dVar) {
        this.f66206a = dVar;
        Boolean bool = Boolean.FALSE;
        this.f66207b = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f66208c = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f66209d = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f66210e = SnapshotStateKt.mutableStateOf$default("https://i0.hdslb.com/bfs/activity-plat/static/20220906/a5480f18ac08c1e30876e3fde84db784/gl3on7z5DK.png", null, 2, null);
        this.f66211f = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.f66212g = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.h = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f66213i = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        com.bilibili.bililive.biz.interact.chatroom.widget.label.e eVar = new com.bilibili.bililive.biz.interact.chatroom.widget.label.e(this, 2);
        C1659a c1659a = C1660b.f4261a;
        this.f66214j = new ExposureEntry(c1659a, eVar);
        this.f66215k = new ExposureEntry(c1659a, new Cr.C(this, 3));
        this.f66216l = SnapshotStateKt.mutableStateMapOf();
        this.f66217m = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f66218n = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Button a() {
        return (Button) this.f66213i.getValue();
    }
}
