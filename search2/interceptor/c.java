package com.bilibili.search2.interceptor;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.router.Router;
import com.bilibili.search2.api.Column;
import com.bilibili.search2.result.column.SearchResultColumnFragment;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/interceptor/c.class */
@StabilityInferred(parameters = 1)
public final class c implements d {
    @Override // com.bilibili.search2.interceptor.d
    public final boolean b(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        String strGroup;
        if (!com.bilibili.adcommon.utils.ext.d.a("^[Cc][Vv]([1-9]\\d*$)", str)) {
            return false;
        }
        Matcher matcher = Pattern.compile("^[Cc][Vv]([1-9]\\d*$)").matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            strGroup = matcher.group(1);
        } catch (Exception e7) {
        }
        long j7 = strGroup != null ? Long.parseLong(strGroup) : 0L;
        if (j7 <= 0) {
            return false;
        }
        Column column = new Column();
        column.setId(j7);
        String str2 = SearchResultColumnFragment.f87709I;
        String uri = TextUtils.isEmpty(column.getViewUrl()) ? column.getUri() : column.getViewUrl();
        if (uri != null) {
            if (uri.length() <= 0) {
                uri = null;
            }
            if (uri != null) {
                BLRouter.routeTo(new RouteRequest.Builder(uri).build(), fragmentActivity);
                return true;
            }
        }
        long id = column.getId();
        if (id <= 0) {
            return true;
        }
        Router.RouterProxy routerProxyWith = Router.Companion.global().with(fragmentActivity);
        routerProxyWith.with("sub_category", String.valueOf(0L));
        routerProxyWith.with("reply_id", String.valueOf(0L));
        routerProxyWith.with("from", "search");
        routerProxyWith.with("read_list_id", String.valueOf(column.getListId()));
        routerProxyWith.with("click_time", String.valueOf(System.currentTimeMillis()));
        routerProxyWith.forResult(100);
        routerProxyWith.open("bilibili://article/" + id);
        return true;
    }
}
