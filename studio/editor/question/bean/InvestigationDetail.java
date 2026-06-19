package com.bilibili.studio.editor.question.bean;

import I.E;
import androidx.annotation.Keep;
import androidx.fragment.app.A;
import bilibili.live.app.service.resolver.a;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/bean/InvestigationDetail.class */
@Keep
public final class InvestigationDetail {

    @NotNull
    private final String desc;
    private final int id;

    @NotNull
    private final String link;

    @NotNull
    private final String title;

    @JSONCreator
    public InvestigationDetail(@JSONField(name = "id") int i7, @JSONField(name = "title") @NotNull String str, @JSONField(name = "desc") @NotNull String str2, @JSONField(name = "link") @NotNull String str3) {
        this.id = i7;
        this.title = str;
        this.desc = str2;
        this.link = str3;
    }

    public static /* synthetic */ InvestigationDetail copy$default(InvestigationDetail investigationDetail, int i7, String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = investigationDetail.id;
        }
        if ((i8 & 2) != 0) {
            str = investigationDetail.title;
        }
        if ((i8 & 4) != 0) {
            str2 = investigationDetail.desc;
        }
        if ((i8 & 8) != 0) {
            str3 = investigationDetail.link;
        }
        return investigationDetail.copy(i7, str, str2, str3);
    }

    public final int component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.desc;
    }

    @NotNull
    public final String component4() {
        return this.link;
    }

    @NotNull
    public final InvestigationDetail copy(@JSONField(name = "id") int i7, @JSONField(name = "title") @NotNull String str, @JSONField(name = "desc") @NotNull String str2, @JSONField(name = "link") @NotNull String str3) {
        return new InvestigationDetail(i7, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestigationDetail)) {
            return false;
        }
        InvestigationDetail investigationDetail = (InvestigationDetail) obj;
        return this.id == investigationDetail.id && Intrinsics.areEqual(this.title, investigationDetail.title) && Intrinsics.areEqual(this.desc, investigationDetail.desc) && Intrinsics.areEqual(this.link, investigationDetail.link);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.link.hashCode() + E.a(E.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.desc);
    }

    @NotNull
    public String toString() {
        return A.a(this.desc, ", link=", this.link, ")", a.b(this.id, "InvestigationDetail(id=", ", title=", this.title, ", desc="));
    }
}
