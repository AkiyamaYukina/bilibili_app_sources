package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import Fo0.j;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseAgeUi;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseGenderUi;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseItemUi;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseSubItemUi;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/k.class */
@StabilityInferred(parameters = 1)
public final class k implements Co0.a<Actions.g> {
    @Override // Co0.a
    public final Co0.b a(StateFlow stateFlow, Actions actions) {
        Co0.b bVar;
        Object next;
        Object next2;
        Fo0.k kVar = (Fo0.k) stateFlow.getValue();
        Fo0.h hVar = kVar.f6370a;
        C7779b c7779bB = kVar.b();
        if (c7779bB.f122929c && c7779bB.f122928b) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = hVar.f6339e.iterator();
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (!it.hasNext()) {
                    break;
                }
                Object next3 = it.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((j.a) next3).f6360a.isSelected()) {
                    arrayList.add(Boxing.boxInt(i9));
                }
                i7 = i9;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            for (j.a aVar : hVar.f6339e) {
                boolean zIsDefaultSelected = aVar.f6360a.isDefaultSelected();
                InterestChooseItemUi interestChooseItemUi = aVar.f6360a;
                if (zIsDefaultSelected) {
                    arrayList2.add(aVar.a());
                    String name = interestChooseItemUi.getName();
                    String str = name;
                    if (name == null) {
                        str = "";
                    }
                    arrayList3.add(str);
                }
                List<InterestChooseSubItemUi> subItems = interestChooseItemUi.getSubItems();
                ArrayList<InterestChooseSubItemUi> arrayList8 = new ArrayList();
                for (Object obj : subItems) {
                    if (((InterestChooseSubItemUi) obj).isDefaultSelected()) {
                        arrayList8.add(obj);
                    }
                }
                for (InterestChooseSubItemUi interestChooseSubItemUi : arrayList8) {
                    arrayList4.add(Boxing.boxInt(interestChooseSubItemUi.getId()));
                    String name2 = interestChooseSubItemUi.getName();
                    String str2 = name2;
                    if (name2 == null) {
                        str2 = "";
                    }
                    arrayList5.add(str2);
                }
            }
            for (Fo0.j jVar : hVar.f6331B) {
                if (jVar.b()) {
                    if (jVar instanceof j.b) {
                        j.b bVar2 = (j.b) jVar;
                        InterestChooseItemUi interestChooseItemUi2 = bVar2.f6362b;
                        if (interestChooseItemUi2.isDefaultSelected()) {
                            arrayList6.add(bVar2.a());
                            String name3 = interestChooseItemUi2.getName();
                            String str3 = name3;
                            if (name3 == null) {
                                str3 = "";
                            }
                            arrayList7.add(str3);
                        }
                    } else if (jVar instanceof j.c) {
                        InterestChooseSubItemUi interestChooseSubItemUi2 = ((j.c) jVar).f6365b;
                        if (interestChooseSubItemUi2.isDefaultSelected()) {
                            arrayList6.add(Boxing.boxLong(interestChooseSubItemUi2.getId()));
                            String name4 = interestChooseSubItemUi2.getName();
                            String str4 = name4;
                            if (name4 == null) {
                                str4 = "";
                            }
                            arrayList7.add(str4);
                        }
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it2 = hVar.f6341g.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((InterestChooseAgeUi) next).isDefaultSelected()) {
                    break;
                }
            }
            InterestChooseAgeUi interestChooseAgeUi = (InterestChooseAgeUi) next;
            if (interestChooseAgeUi != null) {
                String str5 = hVar.f6345l;
                String str6 = str5;
                if (str5 == null) {
                    str6 = "";
                }
                String title = interestChooseAgeUi.getTitle();
                String str7 = title;
                if (title == null) {
                    str7 = "";
                }
                linkedHashMap.put(str6, str7);
            }
            Iterator<T> it3 = hVar.f6340f.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                if (((InterestChooseGenderUi) next2).isDefaultSelected()) {
                    break;
                }
            }
            InterestChooseGenderUi interestChooseGenderUi = (InterestChooseGenderUi) next2;
            if (interestChooseGenderUi != null) {
                String str8 = hVar.f6344k;
                String str9 = str8;
                if (str8 == null) {
                    str9 = "";
                }
                String title2 = interestChooseGenderUi.getTitle();
                String str10 = title2;
                if (title2 == null) {
                    str10 = "";
                }
                linkedHashMap.put(str9, str10);
            }
            JSONObject jSONObject = linkedHashMap.isEmpty() ? null : new JSONObject((Map<String, Object>) MapsKt.toMap(linkedHashMap));
            if (kVar.f6372c == 0) {
                List<j.a> list = hVar.f6339e;
                ArrayList arrayList9 = new ArrayList();
                for (Object obj2 : list) {
                    if (((j.a) obj2).f6360a.isSelected()) {
                        arrayList9.add(obj2);
                    }
                }
                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                Iterator it4 = arrayList9.iterator();
                while (it4.hasNext()) {
                    arrayList10.add(((j.a) it4.next()).f6360a);
                }
                com.bilibili.pegasus.components.interest.e.d(hVar.f6336b, hVar.f6337c, arrayList10, com.bilibili.pegasus.components.interest.d.b(hVar), com.bilibili.pegasus.components.interest.d.a(arrayList), null, null, null, 0, null, null, null, 0, jSONObject != null ? jSONObject.toString() : null, com.bilibili.pegasus.components.interest.d.a(arrayList2), com.bilibili.pegasus.components.interest.d.a(arrayList3), com.bilibili.pegasus.components.interest.d.a(arrayList4), com.bilibili.pegasus.components.interest.d.a(arrayList5), com.bilibili.pegasus.components.interest.d.a(arrayList6), com.bilibili.pegasus.components.interest.d.a(arrayList7), 65504);
            } else {
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                int i10 = 0;
                for (Object obj3 : hVar.f6339e) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    List<InterestChooseSubItemUi> subItems2 = ((j.a) obj3).f6360a.getSubItems();
                    ArrayList arrayList14 = new ArrayList();
                    for (Object obj4 : subItems2) {
                        if (((InterestChooseSubItemUi) obj4).isSelected()) {
                            arrayList14.add(obj4);
                        }
                    }
                    Iterator it5 = arrayList14.iterator();
                    int i12 = 0;
                    while (true) {
                        int i13 = i12;
                        if (it5.hasNext()) {
                            Object next4 = it5.next();
                            int i14 = i13 + 1;
                            if (i13 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            InterestChooseSubItemUi interestChooseSubItemUi3 = (InterestChooseSubItemUi) next4;
                            arrayList11.add(Boxing.boxInt(interestChooseSubItemUi3.getId()));
                            String name5 = interestChooseSubItemUi3.getName();
                            String str11 = name5;
                            if (name5 == null) {
                                str11 = "";
                            }
                            arrayList12.add(str11);
                            arrayList13.add(i11 + UtilsKt.DOT + i14);
                            i12 = i14;
                        }
                    }
                    i10 = i11;
                }
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                List<Fo0.j> list2 = hVar.f6331B;
                ArrayList arrayList18 = new ArrayList();
                for (Object obj5 : list2) {
                    Fo0.j jVar2 = (Fo0.j) obj5;
                    if ((jVar2 instanceof j.b) || (jVar2 instanceof j.c)) {
                        arrayList18.add(obj5);
                    }
                }
                int i15 = 0;
                for (Object obj6 : arrayList18) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Fo0.j jVar3 = (Fo0.j) obj6;
                    if (jVar3.b()) {
                        if (jVar3 instanceof j.b) {
                            j.b bVar3 = (j.b) jVar3;
                            arrayList15.add(bVar3.a());
                            String name6 = bVar3.f6362b.getName();
                            String str12 = name6;
                            if (name6 == null) {
                                str12 = "";
                            }
                            arrayList16.add(str12);
                            arrayList17.add(Boxing.boxInt(i16));
                        } else if (jVar3 instanceof j.c) {
                            InterestChooseSubItemUi interestChooseSubItemUi4 = ((j.c) jVar3).f6365b;
                            arrayList15.add(Boxing.boxLong(interestChooseSubItemUi4.getId()));
                            String name7 = interestChooseSubItemUi4.getName();
                            String str13 = name7;
                            if (name7 == null) {
                                str13 = "";
                            }
                            arrayList16.add(str13);
                            arrayList17.add(Boxing.boxInt(i16));
                        }
                    }
                    i15 = i16;
                }
                List<j.a> list3 = hVar.f6339e;
                ArrayList arrayList19 = new ArrayList();
                for (Object obj7 : list3) {
                    if (((j.a) obj7).f6360a.isSelected()) {
                        arrayList19.add(obj7);
                    }
                }
                ArrayList arrayList20 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList19, 10));
                Iterator it6 = arrayList19.iterator();
                while (it6.hasNext()) {
                    arrayList20.add(((j.a) it6.next()).f6360a);
                }
                String strA = com.bilibili.pegasus.components.interest.d.a(arrayList);
                String strA2 = com.bilibili.pegasus.components.interest.d.a(arrayList11);
                String strA3 = com.bilibili.pegasus.components.interest.d.a(arrayList12);
                String strA4 = com.bilibili.pegasus.components.interest.d.a(arrayList13);
                int size = arrayList11.size();
                int size2 = arrayList15.size();
                com.bilibili.pegasus.components.interest.e.d(hVar.f6336b, hVar.f6337c, arrayList20, com.bilibili.pegasus.components.interest.d.b(hVar), strA, strA2, strA3, strA4, size, arrayList15, arrayList16, arrayList17, size2, jSONObject != null ? jSONObject.toString() : null, com.bilibili.pegasus.components.interest.d.a(arrayList2), com.bilibili.pegasus.components.interest.d.a(arrayList3), com.bilibili.pegasus.components.interest.d.a(arrayList4), com.bilibili.pegasus.components.interest.d.a(arrayList5), com.bilibili.pegasus.components.interest.d.a(arrayList6), com.bilibili.pegasus.components.interest.d.a(arrayList7), 57344);
            }
            bVar = new Co0.b(null, null, FlowKt.flow(new SubmitHandler$reduce$12(null)), 3);
        } else {
            bVar = new Co0.b(null, null, null, 7);
        }
        return bVar;
    }
}
