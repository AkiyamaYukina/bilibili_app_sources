package com.bilibili.opd.app.bizcommon.imageselector.page;

import Jm0.C2424a;
import Mm0.DialogC2679a;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.utils.FastJsonUtils;
import com.bilibili.app.comm.emoticon.emoji2.module.EmojiEnum;
import com.bilibili.app.comm.emoticon.model.EmoticonPackage;
import com.bilibili.boxing.model.entity.BaseMedia;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/g.class */
public final /* synthetic */ class C5554g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f73899b;

    public /* synthetic */ C5554g(Object obj, int i7) {
        this.f73898a = i7;
        this.f73899b = obj;
    }

    public final Object invoke(Object obj) {
        ArrayList<BaseMedia> arrayList;
        C5564q c5564q;
        EmojiEnum emojiEnum;
        int i7 = 0;
        switch (this.f73898a) {
            case 0:
                MallMediaFragment mallMediaFragment = (MallMediaFragment) this.f73899b;
                ConcurrentSkipListMap concurrentSkipListMap = (ConcurrentSkipListMap) obj;
                DialogC2679a dialogC2679a = mallMediaFragment.f73798u;
                if (dialogC2679a != null) {
                    dialogC2679a.dismiss();
                }
                if (concurrentSkipListMap != null) {
                    Jm0.f fVar = mallMediaFragment.f73797t;
                    if (fVar != null) {
                        synchronized (fVar) {
                            ArrayMap<String, C2424a> arrayMap = fVar.f11536c;
                            arrayMap.clear();
                            arrayMap.putAll(concurrentSkipListMap);
                            C2424a c2424a = (C2424a) concurrentSkipListMap.get(fVar.f11540g);
                            if (c2424a != null && (arrayList = c2424a.f11520a) != null && (c5564q = fVar.f11541i) != null) {
                                c5564q.a(arrayList);
                            }
                            fVar.notifyDataSetChanged();
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    Jm0.h hVar = mallMediaFragment.f73796s;
                    if (hVar != null) {
                        ArrayList<Pair<String, C2424a>> arrayList2 = hVar.f11546a;
                        arrayList2.clear();
                        arrayList2.addAll(MapsKt.toList(concurrentSkipListMap));
                        hVar.f11547b = (C2424a) hVar.f11546a.get(0).getSecond();
                        hVar.notifyDataSetChanged();
                    }
                }
                return Unit.INSTANCE;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                ((rh.b) this.f73899b).getClass();
                String string = jSONObject.getString("package_type");
                EmoticonPackage emoticonPackage = null;
                if (string != null) {
                    emoticonPackage = null;
                    if (string.length() > 0) {
                        EmojiEnum[] emojiEnumArrValues = EmojiEnum.values();
                        int length = emojiEnumArrValues.length;
                        while (true) {
                            if (i7 < length) {
                                emojiEnum = emojiEnumArrValues[i7];
                                if (!Intrinsics.areEqual(emojiEnum.getType(), string)) {
                                    i7++;
                                }
                            } else {
                                emojiEnum = null;
                            }
                        }
                        Class clazz = emojiEnum != null ? emojiEnum.getClazz() : null;
                        emoticonPackage = null;
                        if (clazz != null) {
                            try {
                                Object objCastToJavaBean = FastJsonUtils.castToJavaBean(jSONObject, clazz);
                                emoticonPackage = null;
                                if (objCastToJavaBean instanceof EmoticonPackage) {
                                    emoticonPackage = (EmoticonPackage) objCastToJavaBean;
                                }
                            } catch (JSONException e7) {
                                BLog.e("MyEmojiParser", "Fail to parse json obj: " + jSONObject);
                                emoticonPackage = null;
                            }
                        }
                    }
                    break;
                }
                return emoticonPackage;
        }
    }
}
