package com.bilibili.search2.result.all;

import J81.T;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.adcommon.utils.ext.FastjsonExtKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.search2.api.BaseSearchItem;
import com.google.gson.Gson;
import dt0.AbstractC6843f;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/g.class */
@StabilityInferred(parameters = 0)
public final class C6053g extends AbstractC6843f<BaseSearchItem> implements Et0.a, Et0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f87282b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Bl.F f87283a;

    /* JADX INFO: renamed from: com.bilibili.search2.result.all.g$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/g$a.class */
    public static final class a {
        @NotNull
        public static C6053g a(@NotNull ViewGroup viewGroup) {
            return new C6053g(Bl.F.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    public C6053g(@NotNull Bl.F f7) {
        super(f7.a);
        this.f87283a = f7;
    }

    public static void q0(Object obj, Map map) {
        try {
            JSONObject jSONObject = FastjsonExtKt.toJSONObject(new Gson());
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                String name = field.getName();
                Object obj2 = field.get(obj);
                if (jSONObject != null) {
                    jSONObject.put(name, obj2);
                }
            }
            map.put("data", String.valueOf(jSONObject));
        } catch (Throwable th) {
            BLog.e("EmptyHolder", "printDetails error", th);
            map.put("data", obj.toString());
        }
    }

    @Override // dt0.AbstractC6839b
    public final void bind() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, 0);
        Bl.F f7 = this.f87283a;
        f7.a.setLayoutParams(layoutParams);
        ListExtentionsKt.gone(f7.a);
        BaseSearchItem baseSearchItem = (BaseSearchItem) getData();
        try {
            if (baseSearchItem.isExposed()) {
                return;
            }
            baseSearchItem.setExposed(true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("event_type", "main_search_empty_holder");
            String goTo = baseSearchItem.getGoTo();
            String str = goTo;
            if (goTo == null) {
                str = "";
            }
            linkedHashMap.put("type", str);
            q0(getData(), linkedHashMap);
            BLog.i("EmptyHolder", "report:" + linkedHashMap);
            Neurons.trackT$default(false, "list.main.search.empty.holder.track", linkedHashMap, 0, new T(9), 8, (Object) null);
        } catch (Throwable th) {
            BLog.e("EmptyHolder", "report error", th);
        }
    }

    @Override // Et0.a
    public final boolean isNeedDrawDivider() {
        return false;
    }

    @Override // Et0.d
    public final boolean needWideScreenMargin() {
        return false;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
    }
}
