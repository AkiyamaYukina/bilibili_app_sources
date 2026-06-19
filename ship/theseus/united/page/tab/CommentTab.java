package com.bilibili.ship.theseus.united.page.tab;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTab.class */
@StabilityInferred(parameters = 1)
@Bson
public final class CommentTab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("reply_style")
    @Nullable
    private final CommentTabStyle f103112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private final String f103113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("control")
    @Nullable
    private final TabControl f103114c;

    public CommentTab(@Nullable CommentTabStyle commentTabStyle, @NotNull String str, @Nullable TabControl tabControl) {
        this.f103112a = commentTabStyle;
        this.f103113b = str;
        this.f103114c = tabControl;
    }

    @Nullable
    public final CommentTabStyle a() {
        return this.f103112a;
    }

    @Nullable
    public final TabControl b() {
        return this.f103114c;
    }

    @NotNull
    public final String c() {
        return this.f103113b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentTab)) {
            return false;
        }
        CommentTab commentTab = (CommentTab) obj;
        return Intrinsics.areEqual(this.f103112a, commentTab.f103112a) && Intrinsics.areEqual(this.f103113b, commentTab.f103113b) && Intrinsics.areEqual(this.f103114c, commentTab.f103114c);
    }

    public final int hashCode() {
        CommentTabStyle commentTabStyle = this.f103112a;
        int iA = E.a((commentTabStyle == null ? 0 : commentTabStyle.hashCode()) * 31, 31, this.f103113b);
        TabControl tabControl = this.f103114c;
        return iA + (tabControl == null ? 0 : tabControl.hashCode());
    }

    @NotNull
    public final String toString() {
        return "CommentTab(commentTabStyle=" + this.f103112a + ", title=" + this.f103113b + ", control=" + this.f103114c + ")";
    }
}
