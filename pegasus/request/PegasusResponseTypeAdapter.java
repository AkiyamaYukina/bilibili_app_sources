package com.bilibili.pegasus.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.base.PegasusResponse;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import dp0.C6828a;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/PegasusResponseTypeAdapter.class */
@StabilityInferred(parameters = 0)
public final class PegasusResponseTypeAdapter extends TypeAdapter<PegasusResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public com.bilibili.bililive.room.ui.roomv3.gift.h f78802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Gson f78803b;

    public PegasusResponseTypeAdapter() {
        throw null;
    }

    public final Object e(fN0.a aVar) {
        PegasusResponse pegasusResponse = new PegasusResponse(null, null, null, 7, null);
        aVar.c();
        while (aVar.l()) {
            String strW = aVar.w();
            if (strW != null) {
                int iHashCode = strW.hashCode();
                if (iHashCode != -1354792126) {
                    if (iHashCode != -1331345204) {
                        if (iHashCode == 100526016 && strW.equals("items")) {
                            if (aVar.E() == JsonToken.NULL) {
                                aVar.y();
                            } else {
                                aVar.b();
                                ArrayList arrayList = new ArrayList();
                                while (aVar.l()) {
                                    PegasusHolderData pegasusHolderData = (PegasusHolderData) this.f78803b.fromJson(aVar, PegasusHolderData.class);
                                    if (pegasusHolderData != null) {
                                        arrayList.add(pegasusHolderData);
                                        if (arrayList.size() == 5) {
                                            this.f78802a.invoke(PegasusResponse.copy$default(pegasusResponse, new ArrayList(arrayList), null, null, 6, null));
                                        }
                                    }
                                }
                                aVar.f();
                                pegasusResponse = PegasusResponse.copy$default(pegasusResponse, arrayList, null, null, 6, null);
                            }
                        }
                    } else if (strW.equals("interest_choose")) {
                        if (aVar.E() == JsonToken.NULL) {
                            aVar.y();
                        } else {
                            pegasusResponse = PegasusResponse.copy$default(pegasusResponse, null, null, (InterestChoose) this.f78803b.fromJson(aVar, InterestChoose.class), 3, null);
                        }
                    }
                } else if (strW.equals("config")) {
                    if (aVar.E() == JsonToken.NULL) {
                        aVar.y();
                    } else {
                        pegasusResponse = PegasusResponse.copy$default(pegasusResponse, null, (C6828a) this.f78803b.fromJson(aVar, C6828a.class), null, 5, null);
                    }
                }
            }
            aVar.W();
        }
        aVar.g();
        return pegasusResponse;
    }

    public final /* bridge */ /* synthetic */ void f(fN0.b bVar, Object obj) {
    }
}
