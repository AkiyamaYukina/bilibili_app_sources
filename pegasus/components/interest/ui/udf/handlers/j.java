package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import Fo0.j;
import Fo0.m;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import kp0.C7782e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/j.class */
@StabilityInferred(parameters = 1)
public final class j implements Co0.a<Actions.f> {
    @Override // Co0.a
    public final Co0.b a(StateFlow stateFlow, Actions actions) {
        Fo0.h hVarB;
        Co0.b bVar;
        Actions.f fVar = (Actions.f) actions;
        Fo0.k kVar = (Fo0.k) stateFlow.getValue();
        int cnt = kVar.f6371b.getCnt();
        if (cnt != fVar.f76423a) {
            bVar = new Co0.b(null, null, null, 7);
        } else {
            m mVar = kVar.f6371b;
            C7782e c7782e = fVar.f76424b;
            if (c7782e == null) {
                bVar = new Co0.b(Fo0.k.a(kVar, null, new m.a(mVar.a(), cnt), 0, false, null, 29), null, null, 6);
            } else {
                Fo0.k kVar2 = (Fo0.k) stateFlow.getValue();
                Fo0.h hVar = ((Fo0.k) stateFlow.getValue()).f6370a;
                InterestChoose interestChooseB = c7782e.b();
                Fo0.h hVarA = interestChooseB != null ? Fo0.i.a(interestChooseB) : null;
                hVar.getClass();
                if (hVarA == null) {
                    hVarB = hVar;
                } else {
                    List<j.a> list = hVarA.f6339e;
                    String str = hVarA.h;
                    String str2 = str;
                    if (str == null) {
                        str2 = hVar.h;
                    }
                    String str3 = hVarA.f6342i;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = hVar.f6342i;
                    }
                    String str5 = hVarA.f6343j;
                    String str6 = str5;
                    if (str5 == null) {
                        str6 = hVar.f6343j;
                    }
                    String str7 = hVarA.f6344k;
                    String str8 = str7;
                    if (str7 == null) {
                        str8 = hVar.f6344k;
                    }
                    String str9 = hVarA.f6345l;
                    String str10 = str9;
                    if (str9 == null) {
                        str10 = hVar.f6345l;
                    }
                    String str11 = hVarA.f6346m;
                    String str12 = str11;
                    if (str11 == null) {
                        str12 = hVar.f6346m;
                    }
                    String str13 = hVarA.f6347n;
                    String str14 = str13;
                    if (str13 == null) {
                        str14 = hVar.f6347n;
                    }
                    String str15 = hVarA.f6348o;
                    String str16 = str15;
                    if (str15 == null) {
                        str16 = hVar.f6348o;
                    }
                    String str17 = hVarA.f6349p;
                    String str18 = str17;
                    if (str17 == null) {
                        str18 = hVar.f6349p;
                    }
                    String str19 = hVarA.f6350q;
                    String str20 = str19;
                    if (str19 == null) {
                        str20 = hVar.f6350q;
                    }
                    String str21 = hVarA.f6351r;
                    String str22 = str21;
                    if (str21 == null) {
                        str22 = hVar.f6351r;
                    }
                    String str23 = hVarA.f6352s;
                    String str24 = str23;
                    if (str23 == null) {
                        str24 = hVar.f6352s;
                    }
                    String str25 = hVarA.f6353t;
                    String str26 = str25;
                    if (str25 == null) {
                        str26 = hVar.f6353t;
                    }
                    String str27 = hVarA.f6354u;
                    String str28 = str27;
                    if (str27 == null) {
                        str28 = hVar.f6354u;
                    }
                    String str29 = hVarA.f6355v;
                    String str30 = str29;
                    if (str29 == null) {
                        str30 = hVar.f6355v;
                    }
                    String str31 = hVarA.f6356w;
                    String str32 = str31;
                    if (str31 == null) {
                        str32 = hVar.f6356w;
                    }
                    hVarB = Fo0.h.b(hVar, hVarA.f6335a, hVarA.f6336b, hVarA.f6337c, hVarA.f6338d, list, null, null, str2, str4, str6, str8, str10, str12, str14, str16, str18, str20, str22, str24, str26, str28, str30, str32, hVarA.f6357x, hVarA.f6358y, hVarA.f6359z, hVarA.f6330A, hVarA.f6331B, hVarA.f6332C, 96);
                }
                bVar = new Co0.b(Fo0.k.a(kVar2, hVarB, new m.a(mVar.a(), cnt), 0, false, null, 28), null, null, 6);
            }
        }
        return bVar;
    }
}
