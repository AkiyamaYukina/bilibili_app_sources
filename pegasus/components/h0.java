package com.bilibili.pegasus.components;

import ZS0.Q1;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tv.danmaku.bili.ui.personinfo.PersonInfoModifyNameActivityV2;
import tv.danmaku.bili.ui.personinfo.modifyNameV2.c;
import tv.danmaku.bili.ui.personinfo.modifyNameV2.dialog.ModifyNameConformDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/h0.class */
public final /* synthetic */ class h0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76267a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f76269c;

    public /* synthetic */ h0(RecyclerView recyclerView, RecommendGuidanceComponent recommendGuidanceComponent) {
        this.f76268b = recyclerView;
        this.f76269c = recommendGuidanceComponent;
    }

    public /* synthetic */ h0(PersonInfoModifyNameActivityV2 personInfoModifyNameActivityV2, ModifyNameConformDialog modifyNameConformDialog) {
        this.f76268b = personInfoModifyNameActivityV2;
        this.f76269c = modifyNameConformDialog;
    }

    public final Object invoke() {
        switch (this.f76267a) {
            case 0:
                ((RecyclerView) this.f76268b).postDelayed(new Q1((RecommendGuidanceComponent) this.f76269c, 3), 100L);
                break;
            default:
                PersonInfoModifyNameActivityV2 personInfoModifyNameActivityV2 = (PersonInfoModifyNameActivityV2) this.f76268b;
                tv.danmaku.bili.ui.personinfo.modifyNameV2.d dVar = personInfoModifyNameActivityV2.I;
                if (dVar != null) {
                    EditText editText = personInfoModifyNameActivityV2.D;
                    dVar.I0(new c.c(String.valueOf(editText != null ? editText.getText() : null), personInfoModifyNameActivityV2.J, personInfoModifyNameActivityV2.K));
                }
                ((ModifyNameConformDialog) this.f76269c).dismiss();
                break;
        }
        return Unit.INSTANCE;
    }
}
