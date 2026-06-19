package com.bilibili.ship.theseus.united.bean;

import android.os.Parcelable;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/VideoDimensionTypeAdapter.class */
final class VideoDimensionTypeAdapter extends TypeAdapter<VideoDimension> implements com.bilibili.bson.common.b<VideoDimension> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeAdapter<Integer> f98736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TypeAdapter<Boolean> f98737b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/VideoDimensionTypeAdapter$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f98738a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f98738a = iArr;
        }
    }

    public VideoDimensionTypeAdapter(@NotNull TypeAdapter<Integer> typeAdapter, @NotNull TypeAdapter<Boolean> typeAdapter2) {
        this.f98736a = typeAdapter;
        this.f98737b = typeAdapter2;
    }

    public final Object d() {
        return i.f98764a;
    }

    public final Object e(fN0.a aVar) {
        VideoDimension videoDimensionA;
        JsonToken jsonTokenE = aVar.E();
        int i7 = jsonTokenE == null ? -1 : a.f98738a[jsonTokenE.ordinal()];
        if (i7 == 1) {
            aVar.y();
            videoDimensionA = null;
        } else if (i7 != 2) {
            aVar.W();
            videoDimensionA = null;
        } else {
            aVar.c();
            int iIntValue = 0;
            int iIntValue2 = 0;
            boolean zBooleanValue = false;
            while (aVar.l()) {
                String strW = aVar.w();
                if (strW != null) {
                    int iHashCode = strW.hashCode();
                    TypeAdapter<Integer> typeAdapter = this.f98736a;
                    if (iHashCode != -1221029593) {
                        if (iHashCode != -925180581) {
                            if (iHashCode == 113126854 && strW.equals("width")) {
                                Integer num = (Integer) typeAdapter.e(aVar);
                                iIntValue = num != null ? num.intValue() : 0;
                            }
                        } else if (strW.equals("rotate")) {
                            Boolean bool = (Boolean) this.f98737b.e(aVar);
                            zBooleanValue = bool != null ? bool.booleanValue() : false;
                        }
                    } else if (strW.equals("height")) {
                        Integer num2 = (Integer) typeAdapter.e(aVar);
                        iIntValue2 = num2 != null ? num2.intValue() : 0;
                    }
                }
                aVar.W();
            }
            aVar.g();
            Parcelable.Creator<VideoDimension> creator = VideoDimension.CREATOR;
            videoDimensionA = i.a(iIntValue, iIntValue2, zBooleanValue);
        }
        return videoDimensionA;
    }

    public final void f(fN0.b bVar, Object obj) {
        VideoDimension videoDimension = (VideoDimension) obj;
        if (videoDimension == null) {
            bVar.n();
            return;
        }
        bVar.d();
        bVar.k("width").u(Integer.valueOf(videoDimension.f98734a));
        bVar.k("height").u(Integer.valueOf(videoDimension.f98735b));
        bVar.g();
    }
}
