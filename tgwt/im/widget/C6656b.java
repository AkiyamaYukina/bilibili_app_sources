package com.bilibili.tgwt.im.widget;

import G3.r1;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.chatroom.vo.ChatMessageVo;
import com.bilibili.chatroomsdk.QuickMsg;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.tgwt.im.widget.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/b.class */
@StabilityInferred(parameters = 0)
public final class C6656b extends Nj0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final QuickMsg f111403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6657c f111404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f111405d = new ExposureEntry(Pl0.b.f19035a, new r1(8));

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.widget.b$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/b$a.class */
    public static final class a extends TypeToken<ChatMessageVo> {
    }

    public C6656b(@NotNull QuickMsg quickMsg, @NotNull C6657c c6657c) {
        this.f111403b = quickMsg;
        this.f111404c = c6657c;
    }

    @Override // Nj0.c
    public final int m() {
        return 2131500170;
    }

    public final ChatMessageVo n() {
        ChatMessageVo chatMessageVo;
        try {
            chatMessageVo = (ChatMessageVo) JsonUtilKt.parseJson(this.f111403b.getShortMsg(), new a().getType());
        } catch (Exception e7) {
            com.bilibili.ogv.infra.util.e.b(e7);
            chatMessageVo = null;
        }
        return chatMessageVo;
    }
}
