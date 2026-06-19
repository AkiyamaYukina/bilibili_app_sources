package com.bilibili.ship.theseus.miniplayer.ui;

import I.E;
import com.bapis.bilibili.playershared.Dialog;
import com.bapis.bilibili.playershared.GuideStyle;
import com.bapis.bilibili.playershared.LimitActionType;
import com.bapis.bilibili.playershared.ViewInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f91182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f91183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final GuideStyle f91184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LimitActionType f91185d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/c$a.class */
    public static final class a {
        @Nullable
        public static c a(@NotNull ViewInfo viewInfo) {
            Map dialogMapMap = viewInfo.getDialogMapMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : dialogMapMap.entrySet()) {
                if (((Dialog) entry.getValue()).getStyleType() != GuideStyle.UNRECOGNIZED) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Dialog dialog = (Dialog) linkedHashMap.get("start_playing");
            if (dialog == null) {
                return null;
            }
            return new c(dialog.getTitle().getText(), dialog.getTitle().getTextColor(), dialog.getStyleType(), dialog.getLimitActionType());
        }
    }

    public c(@NotNull String str, @NotNull String str2, @NotNull GuideStyle guideStyle, @NotNull LimitActionType limitActionType) {
        this.f91182a = str;
        this.f91183b = str2;
        this.f91184c = guideStyle;
        this.f91185d = limitActionType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f91182a, cVar.f91182a) && Intrinsics.areEqual(this.f91183b, cVar.f91183b) && this.f91184c == cVar.f91184c && this.f91185d == cVar.f91185d;
    }

    public final int hashCode() {
        int iA = E.a(this.f91182a.hashCode() * 31, 31, this.f91183b);
        return this.f91185d.hashCode() + ((this.f91184c.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        return "MiniPlayerRestrictionInfo(text=" + this.f91182a + ", textColor=" + this.f91183b + ", guideStyle=" + this.f91184c + ", limitActionType=" + this.f91185d + ")";
    }
}
