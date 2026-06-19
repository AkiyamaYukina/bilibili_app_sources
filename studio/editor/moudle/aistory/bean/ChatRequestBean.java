package com.bilibili.studio.editor.moudle.aistory.bean;

import I01.b;
import androidx.annotation.Keep;
import androidx.compose.ui.graphics.e0;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.card.GameCardButton;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/ChatRequestBean.class */
@Keep
public final class ChatRequestBean {

    @JSONField(name = "engine")
    @NotNull
    private String engine;

    @JSONField(name = "messages")
    @NotNull
    private List<Message> messages;

    @JSONField(name = GameCardButton.extraParamSource)
    @NotNull
    private String source;

    public ChatRequestBean(@NotNull String str, @NotNull List<Message> list, @NotNull String str2) {
        this.engine = str;
        this.messages = list;
        this.source = str2;
    }

    public /* synthetic */ ChatRequestBean(String str, List list, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i7 & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatRequestBean copy$default(ChatRequestBean chatRequestBean, String str, List list, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = chatRequestBean.engine;
        }
        if ((i7 & 2) != 0) {
            list = chatRequestBean.messages;
        }
        if ((i7 & 4) != 0) {
            str2 = chatRequestBean.source;
        }
        return chatRequestBean.copy(str, list, str2);
    }

    @NotNull
    public final String component1() {
        return this.engine;
    }

    @NotNull
    public final List<Message> component2() {
        return this.messages;
    }

    @NotNull
    public final String component3() {
        return this.source;
    }

    @NotNull
    public final ChatRequestBean copy(@NotNull String str, @NotNull List<Message> list, @NotNull String str2) {
        return new ChatRequestBean(str, list, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatRequestBean)) {
            return false;
        }
        ChatRequestBean chatRequestBean = (ChatRequestBean) obj;
        return Intrinsics.areEqual(this.engine, chatRequestBean.engine) && Intrinsics.areEqual(this.messages, chatRequestBean.messages) && Intrinsics.areEqual(this.source, chatRequestBean.source);
    }

    @NotNull
    public final String getEngine() {
        return this.engine;
    }

    @NotNull
    public final List<Message> getMessages() {
        return this.messages;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode() + e0.a(this.engine.hashCode() * 31, 31, this.messages);
    }

    public final void setEngine(@NotNull String str) {
        this.engine = str;
    }

    public final void setMessages(@NotNull List<Message> list) {
        this.messages = list;
    }

    public final void setSource(@NotNull String str) {
        this.source = str;
    }

    @NotNull
    public String toString() {
        String str = this.engine;
        List<Message> list = this.messages;
        return C8770a.a(b.b("ChatRequestBean(engine=", str, ", messages=", ", source=", list), this.source, ")");
    }
}
