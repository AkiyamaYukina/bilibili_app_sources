package com.bilibili.search2.result;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/o.class */
@StabilityInferred(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, SearchChatResultItem> f88255a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, Long> f88256b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, Function1<SearchChatResultItem, Unit>> f88257c = new LinkedHashMap();

    public final long a(@Nullable String str, @NotNull SearchChatResultItem searchChatResultItem) {
        long jLongValue = 0;
        if (str == null) {
            return 0L;
        }
        Long l7 = (Long) ((LinkedHashMap) this.f88256b).get(str);
        Long receivedUptime = searchChatResultItem.getReceivedUptime();
        BLog.i("SearchChatResultItemPool", "getAnimStartTime: " + str + ", bindTime: " + l7 + ", receiveTime: " + receivedUptime);
        if (receivedUptime != null) {
            if (l7 != null) {
                jLongValue = l7.longValue();
            }
            jLongValue = Long.max(jLongValue, receivedUptime.longValue());
        } else if (l7 != null) {
            jLongValue = l7.longValue();
        }
        return jLongValue;
    }
}
