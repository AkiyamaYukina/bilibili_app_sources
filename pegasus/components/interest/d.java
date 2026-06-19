package com.bilibili.pegasus.components.interest;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseAgeUi;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseGenderUi;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/d.class */
public final class d {
    @NotNull
    public static final String a(@Nullable List<? extends Object> list) {
        List<? extends Object> list2 = list;
        return (list2 == null || list2.isEmpty()) ? "" : CollectionsKt.p(list, ",", "[", "]", (Function1) null, 56);
    }

    @Nullable
    public static final JSONObject b(@NotNull Fo0.h hVar) {
        Object next;
        Object next2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = hVar.f6341g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterestChooseAgeUi) next).isSelected()) {
                break;
            }
        }
        InterestChooseAgeUi interestChooseAgeUi = (InterestChooseAgeUi) next;
        if (interestChooseAgeUi != null) {
            String str = hVar.f6345l;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            String title = interestChooseAgeUi.getTitle();
            String str3 = title;
            if (title == null) {
                str3 = "";
            }
            linkedHashMap.put(str2, str3);
        }
        Iterator<T> it2 = hVar.f6340f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((InterestChooseGenderUi) next2).isSelected()) {
                break;
            }
        }
        InterestChooseGenderUi interestChooseGenderUi = (InterestChooseGenderUi) next2;
        if (interestChooseGenderUi != null) {
            String str4 = hVar.f6344k;
            String str5 = str4;
            if (str4 == null) {
                str5 = "";
            }
            String title2 = interestChooseGenderUi.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            linkedHashMap.put(str5, title2);
        }
        return linkedHashMap.isEmpty() ? null : new JSONObject((Map<String, Object>) MapsKt.toMap(linkedHashMap));
    }

    @Nullable
    public static final JSONObject c(@NotNull InterestChoose interestChoose) {
        Object next;
        Object next2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<InterestChooseAge> listC = interestChoose.c();
        if (listC != null) {
            Iterator<T> it = listC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (((InterestChooseAge) next2).f77403e) {
                    break;
                }
            }
            InterestChooseAge interestChooseAge = (InterestChooseAge) next2;
            if (interestChooseAge != null) {
                String strB = interestChoose.b();
                String str = strB;
                if (strB == null) {
                    str = "";
                }
                String title = interestChooseAge.getTitle();
                String str2 = title;
                if (title == null) {
                    str2 = "";
                }
                linkedHashMap.put(str, str2);
            }
        }
        List<InterestChooseGender> listQ = interestChoose.q();
        if (listQ != null) {
            Iterator<T> it2 = listQ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((InterestChooseGender) next).f77411g) {
                    break;
                }
            }
            InterestChooseGender interestChooseGender = (InterestChooseGender) next;
            if (interestChooseGender != null) {
                String strO = interestChoose.o();
                String str3 = strO;
                if (strO == null) {
                    str3 = "";
                }
                String title2 = interestChooseGender.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                linkedHashMap.put(str3, title2);
            }
        }
        return linkedHashMap.isEmpty() ? null : new JSONObject((Map<String, Object>) MapsKt.toMap(linkedHashMap));
    }
}
