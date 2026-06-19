package com.bilibili.studio.editor.moudle.aistory.bean;

import G0.b;
import I.E;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/Message.class */
@Keep
public final class Message {

    @JSONField(name = TextSource.CFG_CONTENT)
    @NotNull
    private String content;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "role")
    @NotNull
    private String role;

    public Message(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this.role = str;
        this.content = str2;
        this.name = str3;
    }

    public /* synthetic */ Message(String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? "" : str3);
    }

    public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = message.role;
        }
        if ((i7 & 2) != 0) {
            str2 = message.content;
        }
        if ((i7 & 4) != 0) {
            str3 = message.name;
        }
        return message.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.role;
    }

    @NotNull
    public final String component2() {
        return this.content;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final Message copy(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        return new Message(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return Intrinsics.areEqual(this.role, message.role) && Intrinsics.areEqual(this.content, message.content) && Intrinsics.areEqual(this.name, message.name);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        int iA = E.a(this.role.hashCode() * 31, 31, this.content);
        String str = this.name;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final void setContent(@NotNull String str) {
        this.content = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRole(@NotNull String str) {
        this.role = str;
    }

    @NotNull
    public String toString() {
        String str = this.role;
        String str2 = this.content;
        return C8770a.a(b.a("Message(role=", str, ", content=", str2, ", name="), this.name, ")");
    }
}
