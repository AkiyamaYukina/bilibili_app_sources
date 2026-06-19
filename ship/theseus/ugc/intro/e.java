package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.ProfessionApproval;
import com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldInfo;
import com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/e.class */
public final /* synthetic */ class e implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcProfessionalFieldService f97009a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        ProfessionApproval professionApproval = mVar.f124400a.getProfessionApproval();
        mVar.a(this.f97009a.b(new UgcProfessionalFieldInfo(professionApproval.getTitle(), professionApproval.getSubtitle(), professionApproval.getType() == 2 ? UgcProfessionalFieldInfo.ViewType.COMPONENT_TYPE_STAGE2 : UgcProfessionalFieldInfo.ViewType.COMPONENT_TYPE_STAGE1)));
    }
}
