package com.bilibili.search2.discover;

import Ps0.F;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.alibaba.fastjson.JSON;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.search2.api.DefaultKeyword;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.provider.BiliSearchSuggestionProvider;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.utils.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/d.class */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f86431a;

    static {
        BiliSearchSuggestionProvider.Companion.getClass();
        f86431a = android.support.v4.media.a.a("content://", BiliSearchSuggestionProvider.AUTHORITY, "/search_suggest_query");
    }

    public static void a(@Nullable Context context, @NotNull k kVar) {
        Cursor cursorQuery;
        List<F> historyList;
        if (context == null || !kVar.d()) {
            return;
        }
        Uri uri = Uri.parse(f86431a);
        l.a aVar = com.bilibili.search2.utils.l.f88832a;
        try {
            cursorQuery = context.getContentResolver().query(uri, null, null, new String[]{""}, null);
        } catch (Exception e7) {
            cursorQuery = null;
        }
        ArrayList arrayList = new ArrayList();
        if (cursorQuery != null) {
            for (int i7 = 0; cursorQuery.moveToNext() && i7 < 50; i7++) {
                try {
                    try {
                        arrayList.add(new F(cursorQuery.getInt(0), cursorQuery.getString(1), 28));
                    } catch (Exception e8) {
                        BLog.e(e8.getMessage());
                    }
                } finally {
                    cursorQuery.close();
                }
            }
        }
        List<F> historyList2 = kVar.getHistoryList();
        if (historyList2 != null && arrayList.size() == historyList2.size()) {
            Iterator it = arrayList.iterator();
            int i8 = 0;
            while (true) {
                if (!it.hasNext()) {
                    historyList = kVar.getHistoryList();
                    break;
                }
                Object next = it.next();
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                F f7 = (F) next;
                F f8 = (F) CollectionsKt.getOrNull(historyList2, i8);
                historyList = arrayList;
                if (f8 == null) {
                    break;
                }
                historyList = arrayList;
                if (f7.f19116a != f8.f19116a) {
                    break;
                }
                if (!Intrinsics.areEqual(f7.f19117b, f8.f19117b)) {
                    historyList = arrayList;
                    break;
                }
                i8++;
            }
        } else {
            historyList = arrayList;
        }
        kVar.a(historyList);
        kVar.e(historyList);
    }

    public static void b(@NotNull LifecycleOwner lifecycleOwner, @Nullable String str, @Nullable final SearchPageStateModel.d dVar) {
        if (wD0.a.b()) {
            String strN = B.n(2131847794);
            if (dVar != null) {
                DefaultKeyword defaultKeyword = new DefaultKeyword();
                defaultKeyword.setShow(strN);
                defaultKeyword.setWord(strN);
                dVar.a(defaultKeyword);
                return;
            }
            return;
        }
        if (!StringsKt.isBlank(str)) {
            try {
                DefaultKeyword defaultKeyword2 = (DefaultKeyword) JSON.parseObject(str, DefaultKeyword.class);
                if (dVar != null) {
                    dVar.a(defaultKeyword2);
                    return;
                }
                return;
            } catch (Exception e7) {
                BLog.e("BiliMainSearchDiscoverDataLoader", "parse DefaultKeyword exp", e7);
            }
        }
        String str2 = (String) ConfigManager.Companion.config().get("main.search_zero_signal_default_word", (Object) null);
        if (str2 == null || StringsKt.isBlank(str2)) {
            com.bilibili.app.comm.list.common.api.c cVar = (com.bilibili.app.comm.list.common.api.c) w8.d.a(BLRouter.INSTANCE, com.bilibili.app.comm.list.common.api.c.class, "IDefaultKeywordService");
            if (cVar != null) {
                cVar.a((String) null, 0, 0, (String) null, false).observe(lifecycleOwner, new Observer(dVar) { // from class: com.bilibili.search2.discover.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final SearchPageStateModel.d f86426a;

                    {
                        this.f86426a = dVar;
                    }

                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        Resource resource = (Resource) obj;
                        Status status = resource.getStatus();
                        Status status2 = Status.SUCCESS;
                        SearchPageStateModel.d dVar2 = this.f86426a;
                        if (status == status2) {
                            Object data = resource.getData();
                            DefaultKeyword defaultKeyword3 = data instanceof DefaultKeyword ? (DefaultKeyword) data : null;
                            if (defaultKeyword3 == null || dVar2 == null) {
                                return;
                            }
                            dVar2.a(defaultKeyword3);
                            return;
                        }
                        String strN2 = B.n(2131847890);
                        if (dVar2 != null) {
                            DefaultKeyword defaultKeyword4 = new DefaultKeyword();
                            defaultKeyword4.setShow(strN2);
                            defaultKeyword4.setWord(strN2);
                            dVar2.a(defaultKeyword4);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (dVar != null) {
            DefaultKeyword defaultKeyword3 = new DefaultKeyword();
            defaultKeyword3.setShow(str2);
            defaultKeyword3.setWord(str2);
            dVar.a(defaultKeyword3);
        }
    }
}
