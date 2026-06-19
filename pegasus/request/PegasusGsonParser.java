package com.bilibili.pegasus.request;

import M3.F0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.common.utils.ListDeviceInfoKt;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.pegasus.PegasusDataParser;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.PegasusHolderInfo;
import com.bilibili.pegasus.data.base.PegasusResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.p;
import com.google.gson.reflect.TypeToken;
import fp0.u;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import np0.C8128a;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/PegasusGsonParser.class */
@StabilityInferred(parameters = 0)
public final class PegasusGsonParser extends TypeAdapter<PegasusHolderData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8128a f78797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f78798b = LazyKt.lazy(new F0(6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f78799c = LazyKt.lazy(new HS0.g(8));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78800d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Gson f78801e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/PegasusGsonParser$a.class */
    public static final class a extends TypeToken<GeneralResponse<PegasusResponse>> {
    }

    public PegasusGsonParser(@NotNull C8128a c8128a, @NotNull GsonBuilder gsonBuilder) {
        this.f78797a = c8128a;
        this.f78801e = gsonBuilder.registerTypeAdapter(PegasusHolderData.class, this).create();
    }

    public final Object e(fN0.a aVar) {
        PegasusHolderData pegasusHolderData;
        C8128a c8128a = this.f78797a;
        try {
            JsonElement jsonElementA = p.a(aVar);
            if (jsonElementA.isJsonNull()) {
                pegasusHolderData = null;
            } else {
                JsonObject asJsonObject = jsonElementA.getAsJsonObject();
                if (asJsonObject == null) {
                    pegasusHolderData = null;
                } else {
                    String asString = asJsonObject.get("card_type").getAsString();
                    PegasusHolderInfo<? extends PegasusHolderData, ?> pegasusHolderInfo = c8128a.f124348b.get(asString);
                    Class dataClass = pegasusHolderInfo != null ? pegasusHolderInfo.getDataClass() : null;
                    if (dataClass == null) {
                        pegasusHolderData = null;
                    } else {
                        PegasusHolderInfo<? extends PegasusHolderData, ?> pegasusHolderInfo2 = c8128a.f124348b.get(asString);
                        PegasusDataParser dataParser = pegasusHolderInfo2 != null ? pegasusHolderInfo2.getDataParser() : null;
                        PegasusHolderData pegasusHolderData2 = (PegasusHolderData) this.f78801e.fromJson(asJsonObject, dataClass);
                        pegasusHolderData = pegasusHolderData2;
                        if (pegasusHolderData2 != null) {
                            pegasusHolderData = pegasusHolderData2;
                            if (dataParser != null) {
                                pegasusHolderData = dataParser.parse(pegasusHolderData2);
                            }
                        }
                        if (!this.f78800d && ((Boolean) this.f78798b.getValue()).booleanValue() && (pegasusHolderData instanceof IInlineCardData)) {
                            ((IInlineCardData) pegasusHolderData).getInlinePlayerItem();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (!((Boolean) this.f78799c.getValue()).booleanValue()) {
                throw th;
            }
            pegasusHolderData = null;
        }
        return pegasusHolderData;
    }

    public final /* bridge */ /* synthetic */ void f(fN0.b bVar, Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final GeneralResponse<PegasusResponse> g(@NotNull ResponseBody responseBody) {
        GeneralResponse<PegasusResponse> generalResponse = (GeneralResponse) this.f78801e.fromJson(responseBody.charStream(), new a().getType());
        PegasusResponse pegasusResponse = generalResponse.data;
        PegasusResponse pegasusResponseCopy$default = PegasusResponse.copy$default(pegasusResponse, CollectionsKt.filterNotNull(pegasusResponse.getItems()), null, null, 6, null);
        Iterator<T> it = this.f78797a.f124347a.iterator();
        while (it.hasNext()) {
            pegasusResponseCopy$default = ((k) it.next()).a(pegasusResponseCopy$default);
        }
        generalResponse.data = pegasusResponseCopy$default;
        this.f78800d = false;
        return generalResponse;
    }

    public final void h() {
        Gson gson = this.f78801e;
        gson.getAdapter(gp0.c.class);
        if (PegasusStyleKt.currentIsDoubleColumn(PegasusStyle.INSTANCE) || ListDeviceInfoKt.isHdApp()) {
            gson.getAdapter(u.class);
        } else {
            gson.getAdapter(fp0.j.class);
        }
        Iterator<T> it = this.f78797a.f124348b.values().iterator();
        while (it.hasNext()) {
            gson.getAdapter(((PegasusHolderInfo) it.next()).getDataClass());
        }
    }
}
