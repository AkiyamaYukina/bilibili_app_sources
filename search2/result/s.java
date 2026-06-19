package com.bilibili.search2.result;

import android.os.SystemClock;
import com.bapis.bilibili.broadcast.message.main.ChatResult;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.moss.util.UtilRuntime;
import com.bilibili.lib.moss.util.common.ProtoKeyStyle;
import com.bilibili.lib.moss.util.exception.ProtoUtilException;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/s.class */
public final class s implements MossResponseHandler<ChatResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f88515a;

    public s(t tVar) {
        this.f88515a = tVar;
    }

    public final void onError(MossException mossException) {
        this.f88515a.getClass();
        M.b("chatResultPush onError: ", mossException != null ? mossException.toString() : null, "SearchLongConnectionManager");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.moss.util.exception.ProtoUtilException */
    public final void onNext(Object obj) throws ProtoUtilException {
        Function1 function1;
        ChatResult chatResult = (ChatResult) obj;
        t tVar = this.f88515a;
        tVar.getClass();
        BLog.i("SearchLongConnectionManager", "chatResultPush onNext: " + (chatResult != null ? chatResult.getSessionId() : null) + ", bubblesCount=" + (chatResult != null ? Integer.valueOf(chatResult.getBubblesCount()) : null));
        if (chatResult != null) {
            SearchChatResultItem searchChatResultItem = new SearchChatResultItem(chatResult);
            o oVar = tVar.f88518b;
            oVar.getClass();
            String sessionId = searchChatResultItem.getSessionId();
            if (sessionId != null) {
                searchChatResultItem.setReceivedUptime(Long.valueOf(SystemClock.uptimeMillis()));
                oVar.f88255a.put(sessionId, searchChatResultItem);
                if (oVar.f88257c.containsKey(sessionId) && (function1 = (Function1) ((LinkedHashMap) oVar.f88257c).get(sessionId)) != null) {
                    function1.invoke(searchChatResultItem);
                }
            }
            ProtoKeyStyle protoKeyStyle = ProtoKeyStyle.LOWER_SNAKE_CASE;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Xc0.b bVar = new Xc0.b(byteArrayOutputStream, protoKeyStyle);
                bVar.a((String) null, chatResult);
                bVar.b.close();
                defpackage.a.b("chatResultPush json: ", byteArrayOutputStream.toString("UTF-8"), "SearchLongConnectionManager");
            } catch (Throwable th) {
                UtilRuntime.INSTANCE.e("moss.util.json", th);
                throw new ProtoUtilException(th.getMessage(), th.getCause());
            }
        }
    }
}
