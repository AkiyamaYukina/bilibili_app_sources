package com.bilibili.studio.editor.asr.cache;

import Ew0.b;
import F3.C1863x2;
import F3.C1870y2;
import G.f;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.studio.editor.asr.bean.AsrResultWrapper;
import com.bilibili.studio.editor.asr.core.bean.AsrUtterances;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/cache/AsrResultCacheV3.class */
public final class AsrResultCacheV3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AsrResultCacheV3 f105530a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f105531b = LazyKt.lazy(new C1863x2(6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f105532c = LazyKt.lazy(new C1870y2(9));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<String, Cache> f105533d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArrayList<String> f105534e = new CopyOnWriteArrayList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/cache/AsrResultCacheV3$Cache.class */
    @Keep
    public static final class Cache {

        @JSONField(name = "asr_label_result")
        @Nullable
        private String asrLabelResult;

        @JSONField(name = "asr_utterances")
        @Nullable
        private AsrUtterances asrUtterances;

        @Nullable
        public final String getAsrLabelResult() {
            return this.asrLabelResult;
        }

        @Nullable
        public final AsrUtterances getAsrUtterances() {
            return this.asrUtterances;
        }

        public final void setAsrLabelResult(@Nullable String str) {
            this.asrLabelResult = str;
        }

        public final void setAsrUtterances(@Nullable AsrUtterances asrUtterances) {
            this.asrUtterances = asrUtterances;
        }
    }

    public static final List a() {
        List list;
        if (c().size() > 200) {
            list = CollectionsKt.toList(c().subList(0, 100));
            List list2 = CollectionsKt.toList(c().subList(100, c().size()));
            c().clear();
            c().addAll(list2);
            g();
            b.f4798a.e("BiliEditorMultiAsrManager", f.a(list.size(), c().size(), "清除缓存数量：", ", 剩余缓存数量："));
        } else {
            list = null;
        }
        return list;
    }

    public static CopyOnWriteArrayList c() {
        return (CopyOnWriteArrayList) f105532c.getValue();
    }

    public static boolean d(Cache cache) {
        if (cache == null) {
            return false;
        }
        String asrLabelResult = cache.getAsrLabelResult();
        boolean z6 = false;
        if (asrLabelResult != null) {
            if (asrLabelResult.length() == 0) {
                z6 = false;
            } else {
                z6 = false;
                if (cache.getAsrUtterances() != null) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public static void e() {
        f105533d.clear();
        b.f4798a.i(f.a(c().size(), f105534e.size(), "缓存数量：", "， 分离音频数量："));
        BuildersKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), (CoroutineStart) null, new AsrResultCacheV3$release$1(null), 2, (Object) null);
    }

    public static void g() {
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        if (bLKVSharedPreference == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = bLKVSharedPreference.edit();
        editorEdit.putString("upper_asr_cache_id_list", CollectionsKt.p(c(), "-&&-", (CharSequence) null, (CharSequence) null, (Function1) null, 62));
        editorEdit.apply();
    }

    @Nullable
    public final File b(@Nullable String str) {
        synchronized (this) {
            if (str != null) {
                if (str.length() != 0) {
                    File file = new File((File) f105531b.getValue(), str);
                    File file2 = null;
                    if (file.exists()) {
                        file2 = file;
                    }
                    return file2;
                }
            }
            return null;
        }
    }

    public final void f(@NotNull String str, @NotNull AsrResultWrapper asrResultWrapper) {
        Object obj;
        synchronized (this) {
            ConcurrentHashMap<String, Cache> concurrentHashMap = f105533d;
            Cache cache = concurrentHashMap.get(str);
            Cache cache2 = cache;
            if (cache == null) {
                cache2 = new Cache();
                Cache cachePutIfAbsent = concurrentHashMap.putIfAbsent(str, cache2);
                if (cachePutIfAbsent != null) {
                    cache2 = cachePutIfAbsent;
                }
            }
            Cache cache3 = cache2;
            if (d(cache3)) {
                b.f4798a.i("当前已有缓存:" + str);
                return;
            }
            cache3.setAsrLabelResult(asrResultWrapper.getAsrLabelResult());
            cache3.setAsrUtterances(asrResultWrapper.getAsrUtterances());
            if (d(cache3)) {
                try {
                    Result.Companion companion = Result.Companion;
                    c().remove(str);
                    c().add(str);
                    g();
                    File file = new File((File) f105531b.getValue(), str);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FilesKt.l(file, JSON.toJSONString(cache3));
                    b.f4798a.i("缓存成功: " + str);
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    b.f4798a.e("BiliEditorMultiAsrManager", "缓存文件失败：" + th2);
                }
            }
        }
    }
}
