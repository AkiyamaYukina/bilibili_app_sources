package com.bilibili.pegasus.components.interest;

import com.bilibili.pegasus.components.interest.ui.SubCategoryInterestChooseDialog;
import com.bilibili.pegasus.components.interest.ui.v26.InterestChooseMultiPageDialog;
import com.bilibili.pegasus.components.interest.ui.v27.page.InterestChooseV27Dialog;
import com.bilibili.pegasus.components.interest.ui.v28.page.InterestChooseV28Dialog;
import com.bilibili.pegasus.components.interest.ui.v29.page.InterestChooseV29Dialog;
import com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30Dialog;
import com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31Dialog;
import com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog;
import com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog;
import com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34Dialog;
import com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35Dialog;
import com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36Dialog;
import com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog;
import com.bilibili.pegasus.components.interest.ui.v38.page.InterestChooseV38Dialog;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/c.class */
public final class c {
    @Nullable
    public static final com.bilibili.pegasus.components.interest.ui.c a(@Nullable InterestChoose interestChoose, @NotNull m mVar) {
        com.bilibili.pegasus.components.interest.ui.c cVar = null;
        Integer numValueOf = interestChoose != null ? Integer.valueOf(interestChoose.D()) : null;
        com.bilibili.pegasus.components.interest.ui.c interestChoseDialogG = (numValueOf != null && numValueOf.intValue() == 17) ? new InterestChoseDialogG() : ((numValueOf != null && numValueOf.intValue() == 22) || (numValueOf != null && numValueOf.intValue() == 23) || (numValueOf != null && numValueOf.intValue() == 24)) ? new SubCategoryInterestChooseDialog() : (numValueOf != null && numValueOf.intValue() == 26) ? new InterestChooseMultiPageDialog() : (numValueOf != null && numValueOf.intValue() == 27) ? new InterestChooseV27Dialog() : (numValueOf != null && numValueOf.intValue() == 28) ? new InterestChooseV28Dialog() : (numValueOf != null && numValueOf.intValue() == 29) ? new InterestChooseV29Dialog() : (numValueOf != null && numValueOf.intValue() == 30) ? new InterestChooseV30Dialog() : (numValueOf != null && numValueOf.intValue() == 31) ? new InterestChooseV31Dialog() : (numValueOf != null && numValueOf.intValue() == 32) ? new InterestChooseV32Dialog() : (numValueOf != null && numValueOf.intValue() == 33) ? new InterestChooseV33Dialog() : (numValueOf != null && numValueOf.intValue() == 34) ? new InterestChooseV34Dialog() : (numValueOf != null && numValueOf.intValue() == 35) ? new InterestChooseV35Dialog() : (numValueOf != null && numValueOf.intValue() == 36) ? new InterestChooseV36Dialog() : (numValueOf != null && numValueOf.intValue() == 37) ? new InterestChooseV37Dialog() : (numValueOf != null && numValueOf.intValue() == 38) ? new InterestChooseV38Dialog() : null;
        if (interestChoseDialogG != null) {
            interestChoseDialogG.o9(mVar);
            cVar = interestChoseDialogG;
        }
        return cVar;
    }
}
